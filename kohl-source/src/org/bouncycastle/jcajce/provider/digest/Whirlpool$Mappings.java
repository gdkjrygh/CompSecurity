// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            DigestAlgorithmProvider, Whirlpool

public static class r extends DigestAlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/Whirlpool.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("MessageDigest.WHIRLPOOL", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
        addHMACAlgorithm(configurableprovider, "WHIRLPOOL", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
    }


    public r()
    {
    }
}
