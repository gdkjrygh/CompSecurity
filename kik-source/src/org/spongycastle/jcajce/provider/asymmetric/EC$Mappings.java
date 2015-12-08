// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric:
//            EC

public static class ider extends AsymmetricAlgorithmProvider
{

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("KeyAgreement.ECDH", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH");
        configurableprovider.a("KeyAgreement.ECDHC", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
        configurableprovider.a("KeyAgreement.ECMQV", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQV");
        configurableprovider.a((new StringBuilder("KeyAgreement.")).append(X9ObjectIdentifiers.X).toString(), "org.spongycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDF");
        configurableprovider.a((new StringBuilder("KeyAgreement.")).append(X9ObjectIdentifiers.Z).toString(), "org.spongycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDF");
        a(configurableprovider, X9ObjectIdentifiers.k, "EC", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (new org.spongycastle.jcajce.provider.asymmetric.ec.i.EC())));
        a(configurableprovider, X9ObjectIdentifiers.X, "EC", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (new org.spongycastle.jcajce.provider.asymmetric.ec.i.EC())));
        a(configurableprovider, X9ObjectIdentifiers.Z, "ECMQV", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (new org.spongycastle.jcajce.provider.asymmetric.ec.i.ECMQV())));
        a(configurableprovider, X9ObjectIdentifiers.k, "EC");
        a(configurableprovider, X9ObjectIdentifiers.X, "EC");
        a(configurableprovider, X9ObjectIdentifiers.Z, "EC");
        configurableprovider.a("KeyFactory.EC", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC");
        configurableprovider.a("KeyFactory.ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDSA");
        configurableprovider.a("KeyFactory.ECDH", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDH");
        configurableprovider.a("KeyFactory.ECDHC", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDHC");
        configurableprovider.a("KeyFactory.ECMQV", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECMQV");
        configurableprovider.a("KeyPairGenerator.EC", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC");
        configurableprovider.a("KeyPairGenerator.ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDSA");
        configurableprovider.a("KeyPairGenerator.ECDH", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
        configurableprovider.a("KeyPairGenerator.ECDHC", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDHC");
        configurableprovider.a("KeyPairGenerator.ECIES", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
        configurableprovider.a("KeyPairGenerator.ECMQV", "org.spongycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECMQV");
        configurableprovider.a("Signature.ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA");
        configurableprovider.a("Signature.NONEwithECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone");
        configurableprovider.a("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
        configurableprovider.a("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
        configurableprovider.a("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
        configurableprovider.a("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
        configurableprovider.a("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
        configurableprovider.a("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
        configurableprovider.a("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(TeleTrusTObjectIdentifiers.j).toString(), "ECDSA");
        a(configurableprovider, "SHA224", "ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224", X9ObjectIdentifiers.m);
        a(configurableprovider, "SHA256", "ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256", X9ObjectIdentifiers.n);
        a(configurableprovider, "SHA384", "ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384", X9ObjectIdentifiers.o);
        a(configurableprovider, "SHA512", "ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512", X9ObjectIdentifiers.p);
        a(configurableprovider, "RIPEMD160", "ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160", TeleTrusTObjectIdentifiers.k);
        configurableprovider.a("Signature.SHA1WITHECNR", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR");
        configurableprovider.a("Signature.SHA224WITHECNR", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224");
        configurableprovider.a("Signature.SHA256WITHECNR", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256");
        configurableprovider.a("Signature.SHA384WITHECNR", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384");
        configurableprovider.a("Signature.SHA512WITHECNR", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512");
        a(configurableprovider, "SHA1", "CVC-ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", EACObjectIdentifiers.s);
        a(configurableprovider, "SHA224", "CVC-ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", EACObjectIdentifiers.t);
        a(configurableprovider, "SHA256", "CVC-ECDSA", "org.spongycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", EACObjectIdentifiers.u);
    }

    public ider()
    {
    }
}
