// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric:
//            ECGOST

public static class  extends AsymmetricAlgorithmProvider
{

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("KeyFactory.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
        configurableprovider.addAlgorithm("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
        registerOid(configurableprovider, CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410", new KeyFactorySpi());
        registerOidAlgorithmParameters(configurableprovider, CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
        configurableprovider.addAlgorithm("KeyPairGenerator.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
        configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
        configurableprovider.addAlgorithm("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
        configurableprovider.addAlgorithm("Signature.ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
        configurableprovider.addAlgorithm("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
        addSignatureAlgorithm(configurableprovider, "GOST3411", "ECGOST3410", "org.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
    }

    public ()
    {
    }
}
