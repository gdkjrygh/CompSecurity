// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, RIPEMD128

public static class r extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/RIPEMD128.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.RIPEMD128", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(TeleTrusTObjectIdentifiers.c).toString(), "RIPEMD128");
        a(configurableprovider, "RIPEMD128", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
    }


    public r()
    {
    }
}
