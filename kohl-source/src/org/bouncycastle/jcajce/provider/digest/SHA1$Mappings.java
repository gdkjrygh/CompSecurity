// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, SHA1

public static class ovider extends DigestAlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/SHA1.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("MessageDigest.SHA-1", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
        configurableprovider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", "SHA-1");
        configurableprovider.addAlgorithm("Alg.Alias.MessageDigest.SHA", "SHA-1");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.MessageDigest.").append(OIWObjectIdentifiers.idSHA1).toString(), "SHA-1");
        addHMACAlgorithm(configurableprovider, "SHA1", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        addHMACAlias(configurableprovider, "SHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
        addHMACAlias(configurableprovider, "SHA1", IANAObjectIdentifiers.hmacSHA1);
    }


    public ovider()
    {
    }
}
