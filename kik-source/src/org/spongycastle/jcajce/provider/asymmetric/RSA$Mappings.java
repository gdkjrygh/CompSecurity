// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric:
//            RSA

public static class der extends AsymmetricAlgorithmProvider
{

    private static void a(ConfigurableProvider configurableprovider, String s, String s1, ASN1ObjectIdentifier asn1objectidentifier)
    {
        String s2 = (new StringBuilder()).append(s).append("WITHRSA").toString();
        String s3 = (new StringBuilder()).append(s).append("withRSA").toString();
        String s4 = (new StringBuilder()).append(s).append("WithRSA").toString();
        String s5 = (new StringBuilder()).append(s).append("/RSA").toString();
        String s6 = (new StringBuilder()).append(s).append("WITHRSAENCRYPTION").toString();
        String s7 = (new StringBuilder()).append(s).append("withRSAEncryption").toString();
        s = (new StringBuilder()).append(s).append("WithRSAEncryption").toString();
        configurableprovider.a((new StringBuilder("Signature.")).append(s2).toString(), s1);
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(s3).toString(), s2);
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(s4).toString(), s2);
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(s6).toString(), s2);
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(s7).toString(), s2);
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(s).toString(), s2);
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(s5).toString(), s2);
        if (asn1objectidentifier != null)
        {
            configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(asn1objectidentifier).toString(), s2);
            configurableprovider.a((new StringBuilder("Alg.Alias.Signature.OID.")).append(asn1objectidentifier).toString(), s2);
        }
    }

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameters.OAEP", "org.spongycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
        configurableprovider.a("AlgorithmParameters.PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
        configurableprovider.a("Cipher.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        configurableprovider.a("Cipher.RSA/RAW", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
        configurableprovider.a("Cipher.RSA/PKCS1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.a("Cipher.1.2.840.113549.1.1.1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.a("Cipher.2.5.8.1.1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.a("Cipher.RSA/1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
        configurableprovider.a("Cipher.RSA/2", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
        configurableprovider.a("Cipher.RSA/OAEP", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        configurableprovider.a((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.h).toString(), "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
        configurableprovider.a("Cipher.RSA/ISO9796-1", "org.spongycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
        configurableprovider.a("Alg.Alias.Cipher.RSA//RAW", "RSA");
        configurableprovider.a("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
        configurableprovider.a("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
        configurableprovider.a("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
        configurableprovider.a("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
        configurableprovider.a("KeyFactory.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
        configurableprovider.a("KeyPairGenerator.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
        KeyFactorySpi keyfactoryspi = new KeyFactorySpi();
        a(configurableprovider, PKCSObjectIdentifiers.D_, "RSA", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (keyfactoryspi)));
        a(configurableprovider, X509ObjectIdentifiers.l, "RSA", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (keyfactoryspi)));
        a(configurableprovider, PKCSObjectIdentifiers.h, "RSA", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (keyfactoryspi)));
        a(configurableprovider, PKCSObjectIdentifiers.k, "RSA", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (keyfactoryspi)));
        a(configurableprovider, PKCSObjectIdentifiers.D_, "RSA");
        a(configurableprovider, X509ObjectIdentifiers.l, "RSA");
        a(configurableprovider, PKCSObjectIdentifiers.h, "OAEP");
        a(configurableprovider, PKCSObjectIdentifiers.k, "PSS");
        configurableprovider.a("Signature.RSASSA-PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableprovider.a((new StringBuilder("Signature.")).append(PKCSObjectIdentifiers.k).toString(), "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableprovider.a((new StringBuilder("Signature.OID.")).append(PKCSObjectIdentifiers.k).toString(), "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
        configurableprovider.a("Signature.SHA224withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
        configurableprovider.a("Signature.SHA256withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
        configurableprovider.a("Signature.SHA384withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
        configurableprovider.a("Signature.SHA512withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
        configurableprovider.a("Signature.RSA", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
        configurableprovider.a("Signature.RAWRSASSA-PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
        configurableprovider.a("Alg.Alias.Signature.RAWRSA", "RSA");
        configurableprovider.a("Alg.Alias.Signature.NONEWITHRSA", "RSA");
        configurableprovider.a("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
        configurableprovider.a("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
        configurableprovider.a("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
        configurableprovider.a("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
        configurableprovider.a("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA224withRSAandMGF1", "SHA224withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA256withRSAandMGF1", "SHA256withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA384withRSAandMGF1", "SHA384withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA512withRSAandMGF1", "SHA512withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA224WITHRSAANDMGF1", "SHA224withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA256WITHRSAANDMGF1", "SHA256withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA384WITHRSAANDMGF1", "SHA384withRSA/PSS");
        configurableprovider.a("Alg.Alias.Signature.SHA512WITHRSAANDMGF1", "SHA512withRSA/PSS");
        if (configurableprovider.b("MessageDigest", "MD2"))
        {
            a(configurableprovider, "MD2", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", PKCSObjectIdentifiers.E_);
        }
        if (configurableprovider.b("MessageDigest", "MD2"))
        {
            a(configurableprovider, "MD4", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", PKCSObjectIdentifiers.d);
        }
        if (configurableprovider.b("MessageDigest", "MD2"))
        {
            a(configurableprovider, "MD5", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", PKCSObjectIdentifiers.e);
            configurableprovider.a("Signature.MD5withRSA/ISO9796-2", "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            configurableprovider.a("Alg.Alias.Signature.MD5WithRSA/ISO9796-2", "MD5withRSA/ISO9796-2");
        }
        if (configurableprovider.b("MessageDigest", "SHA1"))
        {
            configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
            configurableprovider.a("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
            configurableprovider.a("Signature.SHA1withRSA/PSS", "org.spongycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
            configurableprovider.a("Alg.Alias.Signature.SHA1withRSAandMGF1", "SHA1withRSA/PSS");
            configurableprovider.a("Alg.Alias.Signature.SHA1WITHRSAANDMGF1", "SHA1withRSA/PSS");
            a(configurableprovider, "SHA1", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", PKCSObjectIdentifiers.F_);
            configurableprovider.a("Alg.Alias.Signature.SHA1WithRSA/ISO9796-2", "SHA1withRSA/ISO9796-2");
            configurableprovider.a("Signature.SHA1withRSA/ISO9796-2", "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
            configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(OIWObjectIdentifiers.k).toString(), "SHA1WITHRSA");
            configurableprovider.a((new StringBuilder("Alg.Alias.Signature.OID.")).append(OIWObjectIdentifiers.k).toString(), "SHA1WITHRSA");
        }
        a(configurableprovider, "SHA224", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", PKCSObjectIdentifiers.L_);
        a(configurableprovider, "SHA256", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", PKCSObjectIdentifiers.I_);
        a(configurableprovider, "SHA384", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", PKCSObjectIdentifiers.J_);
        a(configurableprovider, "SHA512", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", PKCSObjectIdentifiers.K_);
        if (configurableprovider.b("MessageDigest", "RIPEMD128"))
        {
            a(configurableprovider, "RIPEMD128", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", TeleTrusTObjectIdentifiers.g);
            a(configurableprovider, "RMD128", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", null);
        }
        if (configurableprovider.b("MessageDigest", "RIPEMD160"))
        {
            a(configurableprovider, "RIPEMD160", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", TeleTrusTObjectIdentifiers.f);
            a(configurableprovider, "RMD160", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", null);
            configurableprovider.a("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
            configurableprovider.a("Signature.RIPEMD160withRSA/ISO9796-2", "org.spongycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
        }
        if (configurableprovider.b("MessageDigest", "RIPEMD256"))
        {
            a(configurableprovider, "RIPEMD256", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", TeleTrusTObjectIdentifiers.h);
            a(configurableprovider, "RMD256", "org.spongycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", null);
        }
    }

    public der()
    {
    }
}
