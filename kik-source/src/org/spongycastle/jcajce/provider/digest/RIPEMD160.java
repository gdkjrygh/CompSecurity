// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.asn1.iana.IANAObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jce.provider.JCEMac;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            BCMessageDigest, a

public class RIPEMD160
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
        {
            Digest digest = (Digest)super.clone();
            digest.a = new RIPEMD160Digest((RIPEMD160Digest)a);
            return digest;
        }

        public Digest()
        {
            super(new RIPEMD160Digest());
        }
    }

    public static class HashMac extends JCEMac
    {

        public HashMac()
        {
            super(new HMac(new RIPEMD160Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("HMACRIPEMD160", 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends a
    {

        private static final String a = org/spongycastle/jcajce/provider/digest/RIPEMD160.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("MessageDigest.RIPEMD160", (new StringBuilder()).append(a).append("$Digest").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.MessageDigest.")).append(TeleTrusTObjectIdentifiers.b).toString(), "RIPEMD160");
            a(configurableprovider, "RIPEMD160", (new StringBuilder()).append(a).append("$HashMac").toString(), (new StringBuilder()).append(a).append("$KeyGenerator").toString());
            a(configurableprovider, "RIPEMD160", IANAObjectIdentifiers.e);
        }


        public Mappings()
        {
        }
    }


    public RIPEMD160()
    {
    }
}
