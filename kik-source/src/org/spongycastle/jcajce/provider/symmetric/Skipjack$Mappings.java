// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Skipjack

public static class  extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/Skipjack.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.SKIPJACK", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("KeyGenerator.SKIPJACK", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("AlgorithmParameters.SKIPJACK", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Mac.SKIPJACKMAC", (new StringBuilder()).append(a).append("$Mac").toString());
        configurableprovider.a("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
        configurableprovider.a("Mac.SKIPJACKMAC/CFB8", (new StringBuilder()).append(a).append("$MacCFB8").toString());
        configurableprovider.a("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
    }


    public ()
    {
    }
}
