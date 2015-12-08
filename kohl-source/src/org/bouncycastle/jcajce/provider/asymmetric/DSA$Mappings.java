// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric:
//            DSA

public static class der extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameters.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi");
        configurableprovider.addAlgorithm("KeyPairGenerator.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi");
        configurableprovider.addAlgorithm("KeyFactory.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi");
        configurableprovider.addAlgorithm("Signature.DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA");
        configurableprovider.addAlgorithm("Signature.NONEWITHDSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
        addSignatureAlgorithm(configurableprovider, "SHA224", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", NISTObjectIdentifiers.dsa_with_sha224);
        addSignatureAlgorithm(configurableprovider, "SHA256", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", NISTObjectIdentifiers.dsa_with_sha256);
        addSignatureAlgorithm(configurableprovider, "SHA384", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", NISTObjectIdentifiers.dsa_with_sha384);
        addSignatureAlgorithm(configurableprovider, "SHA512", "DSA", "org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", NISTObjectIdentifiers.dsa_with_sha512);
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA/DSA", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1withDSA", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.DSAwithSHA1", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.SHA1WithDSA", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.DSAWithSHA1", "DSA");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.1.2.840.10040.4.3", "DSA");
        KeyFactorySpi keyfactoryspi = new KeyFactorySpi();
        for (int i = 0; i != DSAUtil.dsaOids.length; i++)
        {
            registerOid(configurableprovider, DSAUtil.dsaOids[i], "DSA", keyfactoryspi);
            registerOidAlgorithmParameters(configurableprovider, DSAUtil.dsaOids[i], "DSA");
        }

    }

    public der()
    {
    }
}
