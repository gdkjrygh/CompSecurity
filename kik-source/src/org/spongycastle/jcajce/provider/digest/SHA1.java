// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jce.provider.JCEMac;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, a

public class SHA1
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            Digest digest = (Digest)super.clone();
            digest.a = new SHA1Digest((SHA1Digest)a);
            return digest;
        }

        public Digest()
        {
            super(new SHA1Digest());
        }
    }

    public static class HashMac extends JCEMac
    {

        public HashMac()
        {
            super(new HMac(new SHA1Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("HMACSHA1", 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a
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


        public Mappings()
        {
        }
    }


    public SHA1()
    {
    }
}
