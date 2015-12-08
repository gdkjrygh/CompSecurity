// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric;

import java.util.HashMap;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric:
//            EC

public static class a extends HashMap
{

    private void a(String s, String s1, String s2, DERObjectIdentifier derobjectidentifier)
    {
        String s3 = (new StringBuilder()).append(s).append("WITH").append(s1).toString();
        String s4 = (new StringBuilder()).append(s).append("with").append(s1).toString();
        String s5 = (new StringBuilder()).append(s).append("With").append(s1).toString();
        s = (new StringBuilder()).append(s).append("/").append(s1).toString();
        put((new StringBuilder("Signature.")).append(s3).toString(), s2);
        put((new StringBuilder("Alg.Alias.Signature.")).append(s4).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.")).append(s5).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.")).append(s).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.")).append(derobjectidentifier).toString(), s3);
        put((new StringBuilder("Alg.Alias.Signature.OID.")).append(derobjectidentifier).toString(), s3);
    }

    public fiers()
    {
        put("KeyAgreement.ECDH", "org.bouncycastle.jce.provider.asymmetric.ec.KeyAgreement$DH");
        put("KeyAgreement.ECDHC", "org.bouncycastle.jce.provider.asymmetric.ec.KeyAgreement$DHC");
        put("KeyAgreement.ECMQV", "org.bouncycastle.jce.provider.asymmetric.ec.KeyAgreement$MQV");
        put((new StringBuilder("KeyAgreement.")).append(X9ObjectIdentifiers.X).toString(), "org.bouncycastle.jce.provider.asymmetric.ec.KeyAgreement$DHwithSHA1KDF");
        put((new StringBuilder("KeyAgreement.")).append(X9ObjectIdentifiers.Z).toString(), "org.bouncycastle.jce.provider.asymmetric.ec.KeyAgreement$MQVwithSHA1KDF");
        put("KeyFactory.EC", "org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$EC");
        put("KeyFactory.ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECDSA");
        put("KeyFactory.ECDH", "org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECDH");
        put("KeyFactory.ECDHC", "org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECDHC");
        put("KeyFactory.ECMQV", "org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECMQV");
        put((new StringBuilder("Alg.Alias.KeyFactory.")).append(X9ObjectIdentifiers.k).toString(), "EC");
        put((new StringBuilder("Alg.Alias.KeyFactory.")).append(X9ObjectIdentifiers.X).toString(), "EC");
        put((new StringBuilder("Alg.Alias.KeyFactory.")).append(X9ObjectIdentifiers.Z).toString(), "ECMQV");
        put("KeyFactory.ECGOST3410", "org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECGOST3410");
        put("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
        put("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
        put((new StringBuilder("Alg.Alias.KeyFactory.")).append(CryptoProObjectIdentifiers.d).toString(), "ECGOST3410");
        put("KeyPairGenerator.EC", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$EC");
        put("KeyPairGenerator.ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$ECDSA");
        put("KeyPairGenerator.ECDH", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$ECDH");
        put("KeyPairGenerator.ECDHC", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$ECDHC");
        put("KeyPairGenerator.ECIES", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$ECDH");
        put("KeyPairGenerator.ECMQV", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$ECMQV");
        put((new StringBuilder("Alg.Alias.KeyPairGenerator.")).append(X9ObjectIdentifiers.X).toString(), "EC");
        put((new StringBuilder("Alg.Alias.KeyPairGenerator.")).append(X9ObjectIdentifiers.Z).toString(), "ECMQV");
        put("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jce.provider.asymmetric.ec.KeyPairGenerator$ECGOST3410");
        put("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
        put("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
        put("Signature.ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSA");
        put("Signature.NONEwithECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSAnone");
        put("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
        put("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
        put("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
        put("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
        put("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
        put("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
        put("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
        put((new StringBuilder("Alg.Alias.Signature.")).append(TeleTrusTObjectIdentifiers.j).toString(), "ECDSA");
        a("SHA224", "ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSA224", X9ObjectIdentifiers.m);
        a("SHA256", "ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSA256", X9ObjectIdentifiers.n);
        a("SHA384", "ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSA384", X9ObjectIdentifiers.o);
        a("SHA512", "ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSA512", X9ObjectIdentifiers.p);
        a("RIPEMD160", "ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecDSARipeMD160", TeleTrusTObjectIdentifiers.k);
        put("Signature.SHA1WITHECNR", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecNR");
        put("Signature.SHA224WITHECNR", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecNR224");
        put("Signature.SHA256WITHECNR", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecNR256");
        put("Signature.SHA384WITHECNR", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecNR384");
        put("Signature.SHA512WITHECNR", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecNR512");
        a("SHA1", "CVC-ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecCVCDSA", EACObjectIdentifiers.q);
        a("SHA224", "CVC-ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecCVCDSA224", EACObjectIdentifiers.r);
        a("SHA256", "CVC-ECDSA", "org.bouncycastle.jce.provider.asymmetric.ec.Signature$ecCVCDSA256", EACObjectIdentifiers.s);
    }
}
