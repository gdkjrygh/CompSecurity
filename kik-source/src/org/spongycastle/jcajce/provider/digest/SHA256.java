// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jce.provider.JCEMac;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, a

public class SHA256
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            Digest digest = (Digest)super.clone();
            digest.a = new SHA256Digest((SHA256Digest)a);
            return digest;
        }

        public Digest()
        {
            super(new SHA256Digest());
        }
    }

    public static class HashMac extends JCEMac
    {

        public HashMac()
        {
            super(new HMac(new SHA256Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("HMACSHA256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a
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


        public Mappings()
        {
        }
    }


    public SHA256()
    {
    }
}
