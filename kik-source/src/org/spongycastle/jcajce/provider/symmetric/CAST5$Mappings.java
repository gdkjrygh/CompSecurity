// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            CAST5

public static class er extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/CAST5.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameters.CAST5", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
        configurableprovider.a("AlgorithmParameterGenerator.CAST5", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
        configurableprovider.a("Cipher.CAST5", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("Cipher.1.2.840.113533.7.66.10", (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("KeyGenerator.CAST5", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("Alg.Alias.KeyGenerator.1.2.840.113533.7.66.10", "CAST5");
    }


    public er()
    {
    }
}
