// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

public class ECGOST
{
    public static class Mappings extends AsymmetricAlgorithmProvider
    {

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("KeyFactory.ECGOST3410", "org.spongycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
            configurableprovider.a("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
            configurableprovider.a("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
            a(configurableprovider, CryptoProObjectIdentifiers.d, "ECGOST3410", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (new KeyFactorySpi())));
            a(configurableprovider, CryptoProObjectIdentifiers.d, "ECGOST3410");
            configurableprovider.a("KeyPairGenerator.ECGOST3410", "org.spongycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
            configurableprovider.a("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
            configurableprovider.a("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
            configurableprovider.a("Signature.ECGOST3410", "org.spongycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
            configurableprovider.a("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
            configurableprovider.a("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
            a(configurableprovider, "GOST3411", "ECGOST3410", "org.spongycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", CryptoProObjectIdentifiers.f);
        }

        public Mappings()
        {
        }
    }


    public ECGOST()
    {
    }
}
