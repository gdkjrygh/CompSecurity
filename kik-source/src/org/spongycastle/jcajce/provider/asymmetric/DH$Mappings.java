// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric:
//            DH

public static class ider extends AsymmetricAlgorithmProvider
{

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("KeyPairGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
        configurableprovider.a("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        configurableprovider.a("KeyAgreement.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
        configurableprovider.a("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        configurableprovider.a("KeyFactory.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
        configurableprovider.a("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        configurableprovider.a("AlgorithmParameters.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        configurableprovider.a("AlgorithmParameterGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
    }

    public ider()
    {
    }
}
