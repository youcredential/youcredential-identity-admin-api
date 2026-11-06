/*
 * \extensions\api\identity-api\validators\keypair-validators
 */ 
 
plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api(project(":spi:did-spi"))
    api(libs.edc.spi.validator)
    implementation(libs.edc.lib.util)

    testImplementation(libs.edc.junit)
}
