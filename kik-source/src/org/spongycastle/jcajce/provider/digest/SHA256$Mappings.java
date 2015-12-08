// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, SHA256

public static class ider extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/SHA256.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.SHA-256", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a("Alg.Alias.MessageDigest.SHA256", "SHA-256");
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(NISTObjectIdentifiers.b).toString(), "SHA-256");
        a(configurableprovider, "SHA256", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        a(configurableprovider, "SHA256", PKCSObjectIdentifiers.J);
    }


    public ider()
    {
    }
}
