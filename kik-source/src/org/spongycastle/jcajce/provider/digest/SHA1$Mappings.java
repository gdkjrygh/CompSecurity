// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, SHA1

public static class ovider extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/SHA1.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.SHA-1", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a("Alg.Alias.MessageDigest.SHA1", "SHA-1");
        configurableprovider.a("Alg.Alias.MessageDigest.SHA", "SHA-1");
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(OIWObjectIdentifiers.i).toString(), "SHA-1");
        a(configurableprovider, "SHA1", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        a(configurableprovider, "SHA1", PKCSObjectIdentifiers.H);
        a(configurableprovider, "SHA1", IANAObjectIdentifiers.c);
    }


    public ovider()
    {
    }
}
