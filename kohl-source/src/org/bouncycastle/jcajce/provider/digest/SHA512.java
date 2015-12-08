// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest, DigestAlgorithmProvider

public class SHA512
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
            throws CloneNotSupportedException
        {
            Digest digest = (Digest)super.clone();
            digest.digest = new SHA512Digest((SHA512Digest)this.digest);
            return digest;
        }

        public Digest()
        {
            super(new SHA512Digest());
        }
    }

    public static class HashMac extends JCEMac
    {

        public HashMac()
        {
            super(new HMac(new SHA512Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("HMACSHA512", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/SHA512.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("MessageDigest.SHA-512", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
            configurableprovider.addAlgorithm("Alg.Alias.MessageDigest.SHA512", "SHA-512");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.MessageDigest.").append(NISTObjectIdentifiers.id_sha512).toString(), "SHA-512");
            addHMACAlgorithm(configurableprovider, "SHA512", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
            addHMACAlias(configurableprovider, "SHA512", PKCSObjectIdentifiers.id_hmacWithSHA512);
        }


        public Mappings()
        {
        }
    }


    public SHA512()
    {
    }
}
