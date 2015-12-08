// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, GOST3411

public static class er extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/GOST3411.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.GOST3411", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a("Alg.Alias.MessageDigest.GOST", "GOST3411");
        configurableprovider.a("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(CryptoProObjectIdentifiers.a).toString(), "GOST3411");
        a(configurableprovider, "GOST3411", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
    }


    public er()
    {
    }
}
