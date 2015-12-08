// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            GOST28147

public static class  extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/GOST28147.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.GOST28147", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("Alg.Alias.Cipher.GOST", "GOST28147");
        configurableprovider.a("Alg.Alias.Cipher.GOST-28147", "GOST28147");
        configurableprovider.a((new StringBuilder("Cipher.")).append(CryptoProObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("KeyGenerator.GOST28147", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("Alg.Alias.KeyGenerator.GOST", "GOST28147");
        configurableprovider.a("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
        configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.")).append(CryptoProObjectIdentifiers.b).toString(), "GOST28147");
        configurableprovider.a("Mac.GOST28147MAC", (new StringBuilder()).append(a).append("$Mac").toString());
        configurableprovider.a("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
    }


    public ()
    {
    }
}
