// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            BCMessageDigest, DigestAlgorithmProvider

public class SHA256
{
    public static class Digest extends BCMessageDigest
        implements Cloneable
    {

        public Object clone()
            throws CloneNotSupportedException
        {
            Digest digest = (Digest)super.clone();
            digest.digest = new SHA256Digest((SHA256Digest)this.digest);
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

    public static class Mappings extends DigestAlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/digest/SHA256.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("MessageDigest.SHA-256", (new StringBuilder()).append(PREFIX).append("$Digest").toString());
            configurableprovider.addAlgorithm("Alg.Alias.MessageDigest.SHA256", "SHA-256");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.MessageDigest.").append(NISTObjectIdentifiers.id_sha256).toString(), "SHA-256");
            addHMACAlgorithm(configurableprovider, "SHA256", (new StringBuilder()).append(PREFIX).append("$HashMac").toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
            addHMACAlias(configurableprovider, "SHA256", PKCSObjectIdentifiers.id_hmacWithSHA256);
        }


        public Mappings()
        {
        }
    }


    public SHA256()
    {
    }
}
