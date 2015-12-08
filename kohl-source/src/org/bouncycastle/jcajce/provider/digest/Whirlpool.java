// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest, DigestAlgorithmProvider

public class Whirlpool
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
            throws CloneNotSupportedException
        {
            Digest digest = (Digest)super.clone();
            digest.digest = new WhirlpoolDigest((WhirlpoolDigest)this.digest);
            return digest;
        }

        public Digest()
        {
            super(new WhirlpoolDigest());
        }
    }

    public static class HashMac extends JCEMac
    {

        public HashMac()
        {
            super(new HMac(new WhirlpoolDigest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("HMACWHIRLPOOL", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/Whirlpool.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("MessageDigest.WHIRLPOOL", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
            addHMACAlgorithm(configurableprovider, "WHIRLPOOL", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        }


        public Mappings()
        {
        }
    }


    public Whirlpool()
    {
    }
}
