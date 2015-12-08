// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric:
//            ElGamal

public static class ySpi extends AsymmetricAlgorithmProvider
{

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameterGenerator.ELGAMAL", "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
        configurableprovider.a("AlgorithmParameterGenerator.ElGamal", "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
        configurableprovider.a("AlgorithmParameters.ELGAMAL", "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
        configurableprovider.a("AlgorithmParameters.ElGamal", "org.spongycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
        configurableprovider.a("Cipher.ELGAMAL", "org.spongycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
        configurableprovider.a("Cipher.ElGamal", "org.spongycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
        configurableprovider.a("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
        configurableprovider.a("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
        configurableprovider.a("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
        configurableprovider.a("Cipher.ELGAMAL/PKCS1", "org.spongycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding");
        configurableprovider.a("KeyFactory.ELGAMAL", "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
        configurableprovider.a("KeyFactory.ElGamal", "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
        configurableprovider.a("KeyPairGenerator.ELGAMAL", "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
        configurableprovider.a("KeyPairGenerator.ElGamal", "org.spongycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
        KeyFactorySpi keyfactoryspi = new KeyFactorySpi();
        a(configurableprovider, OIWObjectIdentifiers.l, "ELGAMAL", ((org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) (keyfactoryspi)));
        a(configurableprovider, OIWObjectIdentifiers.l, "ELGAMAL");
    }

    public ySpi()
    {
    }
}
