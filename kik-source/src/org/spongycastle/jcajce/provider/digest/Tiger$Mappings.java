// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, Tiger

public static class vider extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/Tiger.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.TIGER", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a("MessageDigest.Tiger", (new StringBuilder()).append(a).append("$Digest").toString());
        a(configurableprovider, "TIGER", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        a(configurableprovider, "TIGER", IANAObjectIdentifiers.d);
    }


    public vider()
    {
    }
}
