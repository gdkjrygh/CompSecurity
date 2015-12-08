// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, RIPEMD160

public static class r extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/RIPEMD160.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.RIPEMD160", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(TeleTrusTObjectIdentifiers.b).toString(), "RIPEMD160");
        a(configurableprovider, "RIPEMD160", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        a(configurableprovider, "RIPEMD160", IANAObjectIdentifiers.e);
    }


    public r()
    {
    }
}
