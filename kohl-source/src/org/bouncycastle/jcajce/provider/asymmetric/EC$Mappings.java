// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric:
//            EC

public static class ider extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyAgreement.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH");
        configurableprovider.addAlgorithm("KeyAgreement.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
        configurableprovider.addAlgorithm("KeyAgreement.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQV");
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyAgreement.").append(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme).toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDF");
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyAgreement.").append(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme).toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDF");
        registerOid(configurableprovider, X9ObjectIdentifiers.id_ecPublicKey, "EC", new org.bouncycastle.jcajce.provider.asymmetric.ec.i.EC());
        registerOid(configurableprovider, X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme, "EC", new org.bouncycastle.jcajce.provider.asymmetric.ec.i.EC());
        registerOid(configurableprovider, X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme, "ECMQV", new org.bouncycastle.jcajce.provider.asymmetric.ec.i.ECMQV());
        registerOidAlgorithmParameters(configurableprovider, X9ObjectIdentifiers.id_ecPublicKey, "EC");
        registerOidAlgorithmParameters(configurableprovider, X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme, "EC");
        registerOidAlgorithmParameters(configurableprovider, X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme, "EC");
        configurableprovider.addAlgorithm("KeyFactory.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC");
        configurableprovider.addAlgorithm("KeyFactory.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDSA");
        configurableprovider.addAlgorithm("KeyFactory.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDH");
        configurableprovider.addAlgorithm("KeyFactory.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDHC");
        configurableprovider.addAlgorithm("KeyFactory.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECMQV");
        configurableprovider.addAlgorithm("KeyPairGenerator.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC");
        configurableprovider.addAlgorithm("KeyPairGenerator.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDSA");
        configurableprovider.addAlgorithm("KeyPairGenerator.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
        configurableprovider.addAlgorithm("KeyPairGenerator.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDHC");
        configurableprovider.addAlgorithm("KeyPairGenerator.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
        configurableprovider.addAlgorithm("KeyPairGenerator.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECMQV");
        configurableprovider.addAlgorithm("Signature.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA");
        configurableprovider.addAlgorithm("Signature.NONEwithECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(TeleTrusTObjectIdentifiers.ecSignWithSha1).toString(), "ECDSA");
        addSignatureAlgorithm(configurableprovider, "SHA224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224", X9ObjectIdentifiers.ecdsa_with_SHA224);
        addSignatureAlgorithm(configurableprovider, "SHA256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256", X9ObjectIdentifiers.ecdsa_with_SHA256);
        addSignatureAlgorithm(configurableprovider, "SHA384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384", X9ObjectIdentifiers.ecdsa_with_SHA384);
        addSignatureAlgorithm(configurableprovider, "SHA512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512", X9ObjectIdentifiers.ecdsa_with_SHA512);
        addSignatureAlgorithm(configurableprovider, "RIPEMD160", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160", TeleTrusTObjectIdentifiers.ecSignWithRipemd160);
        configurableprovider.addAlgorithm("Signature.SHA1WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR");
        configurableprovider.addAlgorithm("Signature.SHA224WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224");
        configurableprovider.addAlgorithm("Signature.SHA256WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256");
        configurableprovider.addAlgorithm("Signature.SHA384WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384");
        configurableprovider.addAlgorithm("Signature.SHA512WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512");
        addSignatureAlgorithm(configurableprovider, "SHA1", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        addSignatureAlgorithm(configurableprovider, "SHA224", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        addSignatureAlgorithm(configurableprovider, "SHA256", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
    }

    public ider()
    {
    }
}
