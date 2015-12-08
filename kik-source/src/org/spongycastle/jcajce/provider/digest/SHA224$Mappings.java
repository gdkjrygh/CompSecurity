// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            a, SHA224

public static class ider extends a
{

    private static final String a = org/spongycastle/jcajce/provider/digest/SHA224.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("MessageDigest.SHA-224", (new StringBuilder()).append(a).append("$Digest").toString());
        configurableprovider.a("Alg.Alias.MessageDigest.SHA224", "SHA-224");
        configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(NISTObjectIdentifiers.e).toString(), "SHA-224");
        a(configurableprovider, "SHA224", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        a(configurableprovider, "SHA224", PKCSObjectIdentifiers.I);
    }


    public ider()
    {
    }
}
