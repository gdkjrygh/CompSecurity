// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric:
//            GOST

public static class er extends AsymmetricAlgorithmProvider
{

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("KeyPairGenerator.GOST3410", "org.spongycastle.jcajce.provider.asymmetric.gost.KeyPairGeneratorSpi");
        configurableprovider.a("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
        configurableprovider.a("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
        configurableprovider.a("KeyFactory.GOST3410", "org.spongycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi");
        configurableprovider.a("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
        configurableprovider.a("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
        configurableprovider.a("AlgorithmParameters.GOST3410", "org.spongycastle.jcajce.provider.asymmetric.gost.AlgorithmParametersSpi");
        configurableprovider.a("AlgorithmParameterGenerator.GOST3410", "org.spongycastle.jcajce.provider.asymmetric.gost.AlgorithmParameterGeneratorSpi");
        a(configurableprovider, CryptoProObjectIdentifiers.c, "GOST3410", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (new KeyFactorySpi())));
        a(configurableprovider, CryptoProObjectIdentifiers.c, "GOST3410");
        configurableprovider.a("Signature.GOST3410", "org.spongycastle.jcajce.provider.asymmetric.gost.SignatureSpi");
        configurableprovider.a("Alg.Alias.Signature.GOST-3410", "GOST3410");
        configurableprovider.a("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
        configurableprovider.a("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
        configurableprovider.a("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
        configurableprovider.a("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
        configurableprovider.a((new StringBuilder("Alg.Alias.Signature.")).append(CryptoProObjectIdentifiers.e).toString(), "GOST3410");
        configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
    }

    public er()
    {
    }
}
