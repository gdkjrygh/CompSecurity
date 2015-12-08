// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            RC5

public static class ider extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/RC5.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.RC5", (new StringBuilder()).append(a).append("$ECB32").toString());
        configurableprovider.a("Alg.Alias.Cipher.RC5-32", "RC5");
        configurableprovider.a("Cipher.RC5-64", (new StringBuilder()).append(a).append("$ECB64").toString());
        configurableprovider.a("KeyGenerator.RC5", (new StringBuilder()).append(a).append("$KeyGen32").toString());
        configurableprovider.a("Alg.Alias.KeyGenerator.RC5-32", "RC5");
        configurableprovider.a("KeyGenerator.RC5-64", (new StringBuilder()).append(a).append("$KeyGen64").toString());
        configurableprovider.a("AlgorithmParameters.RC5", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("AlgorithmParameters.RC5-64", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Mac.RC5MAC", (new StringBuilder()).append(a).append("$Mac32").toString());
        configurableprovider.a("Alg.Alias.Mac.RC5", "RC5MAC");
        configurableprovider.a("Mac.RC5MAC/CFB8", (new StringBuilder()).append(a).append("$CFB8Mac32").toString());
        configurableprovider.a("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
    }


    public ider()
    {
    }
}
