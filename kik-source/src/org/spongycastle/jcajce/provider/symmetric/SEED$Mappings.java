// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.kisa.KISAObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            SEED

public static class der extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/SEED.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameters.SEED", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(KISAObjectIdentifiers.a).toString(), "SEED");
        configurableprovider.a("AlgorithmParameterGenerator.SEED", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(KISAObjectIdentifiers.a).toString(), "SEED");
        configurableprovider.a("Cipher.SEED", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(KISAObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("Cipher.SEEDWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(KISAObjectIdentifiers.b).toString(), "SEEDWRAP");
        configurableprovider.a("KeyGenerator.SEED", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(KISAObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(KISAObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$KeyGen").toString());
    }


    public der()
    {
    }
}
