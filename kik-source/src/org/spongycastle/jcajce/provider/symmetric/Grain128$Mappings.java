// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Grain128

public static class  extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/Grain128.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.Grain128", (new StringBuilder()).append(a).append("$Base").toString());
        configurableprovider.a("KeyGenerator.Grain128", (new StringBuilder()).append(a).append("$KeyGen").toString());
    }


    public ()
    {
    }
}
