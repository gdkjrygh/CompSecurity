// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, MD4

public static class rovider extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/MD4.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.MD4", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(PKCSObjectIdentifiers.F).toString(), "MD4");
        a(configurableprovider, "MD4", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
    }


    public rovider()
    {
    }
}
