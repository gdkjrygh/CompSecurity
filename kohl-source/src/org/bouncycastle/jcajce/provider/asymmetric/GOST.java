// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class GOST
{
    public static class Mappings extends AsymmetricAlgorithmProvider
    {

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("KeyPairGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyPairGeneratorSpi");
            configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
            configurableprovider.addAlgorithm("KeyFactory.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi");
            configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
            configurableprovider.addAlgorithm("AlgorithmParameters.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParametersSpi");
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParameterGeneratorSpi");
            registerOid(configurableprovider, CryptoProObjectIdentifiers.gostR3410_94, "GOST3410", new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableprovider, CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
            configurableprovider.addAlgorithm("Signature.GOST3410", "org.bouncycastle.jcajce.provider.asymmetric.gost.SignatureSpi");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.GOST-3410", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Signature.").append(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94).toString(), "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
        }

        public Mappings()
        {
        }
    }


    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.gost.";

    public GOST()
    {
    }
}
