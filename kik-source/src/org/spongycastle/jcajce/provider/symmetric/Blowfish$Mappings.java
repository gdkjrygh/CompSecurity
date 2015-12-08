// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Blowfish

public static class  extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/Blowfish.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.BLOWFISH", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("Cipher.1.3.6.1.4.1.3029.1.2", (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("KeyGenerator.BLOWFISH", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("Alg.Alias.KeyGenerator.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
        configurableprovider.a("AlgorithmParameters.BLOWFISH", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Alg.Alias.AlgorithmParameters.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
    }


    public ()
    {
    }
}
