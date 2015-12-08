// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.RIPEMD320Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jce.provider.JCEMac;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, a

public class RIPEMD320
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            Digest digest = (Digest)super.clone();
            digest.a = new RIPEMD320Digest((RIPEMD320Digest)a);
            return digest;
        }

        public Digest()
        {
            super(new RIPEMD320Digest());
        }
    }

    public static class HashMac extends JCEMac
    {

        public HashMac()
        {
            super(new HMac(new RIPEMD320Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("HMACRIPEMD320", 320, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a
    {

        private static final String a = org/spongycastle/jcajce/provider/digest/RIPEMD320.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("MessageDigest.RIPEMD320", (new StringBuilder()).append(a).append("$Digest").toString());
            a(configurableprovider, "RIPEMD320", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        }


        public Mappings()
        {
        }
    }


    public RIPEMD320()
    {
    }
}
