// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            CAST6

public static class er extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/CAST6.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.CAST6", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("KeyGenerator.CAST6", (new StringBuilder()).append(a).append("$KeyGen").toString());
    }


    public er()
    {
    }
}
