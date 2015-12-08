// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.util.Strings;

public class DigestFactory
{

    private static Set md5;
    private static Map oids;
    private static Set sha1;
    private static Set sha224;
    private static Set sha256;
    private static Set sha384;
    private static Set sha512;

    public DigestFactory()
    {
    }

    public static Digest getDigest(String s)
    {
        s = Strings.toUpperCase(s);
        if (sha1.contains(s))
        {
            return new SHA1Digest();
        }
        if (md5.contains(s))
        {
            return new MD5Digest();
        }
        if (sha224.contains(s))
        {
            return new SHA224Digest();
        }
        if (sha256.contains(s))
        {
            return new SHA256Digest();
        }
        if (sha384.contains(s))
        {
            return new SHA384Digest();
        }
        if (sha512.contains(s))
        {
            return new SHA512Digest();
        } else
        {
            return null;
        }
    }

    public static ASN1ObjectIdentifier getOID(String s)
    {
        return (ASN1ObjectIdentifier)oids.get(s);
    }

    public static boolean isSameDigest(String s, String s1)
    {
        return sha1.contains(s) && sha1.contains(s1) || sha224.contains(s) && sha224.contains(s1) || sha256.contains(s) && sha256.contains(s1) || sha384.contains(s) && sha384.contains(s1) || sha512.contains(s) && sha512.contains(s1) || md5.contains(s) && md5.contains(s1);
    }

    static 
    {
        md5 = new HashSet();
        sha1 = new HashSet();
        sha224 = new HashSet();
        sha256 = new HashSet();
        sha384 = new HashSet();
        sha512 = new HashSet();
        oids = new HashMap();
        md5.add("MD5");
        md5.add(PKCSObjectIdentifiers.md5.getId());
        sha1.add("SHA1");
        sha1.add("SHA-1");
        sha1.add(OIWObjectIdentifiers.idSHA1.getId());
        sha224.add("SHA224");
        sha224.add("SHA-224");
        sha224.add(NISTObjectIdentifiers.id_sha224.getId());
        sha256.add("SHA256");
        sha256.add("SHA-256");
        sha256.add(NISTObjectIdentifiers.id_sha256.getId());
        sha384.add("SHA384");
        sha384.add("SHA-384");
        sha384.add(NISTObjectIdentifiers.id_sha384.getId());
        sha512.add("SHA512");
        sha512.add("SHA-512");
        sha512.add(NISTObjectIdentifiers.id_sha512.getId());
        oids.put("MD5", PKCSObjectIdentifiers.md5);
        oids.put(PKCSObjectIdentifiers.md5.getId(), PKCSObjectIdentifiers.md5);
        oids.put("SHA1", OIWObjectIdentifiers.idSHA1);
        oids.put("SHA-1", OIWObjectIdentifiers.idSHA1);
        oids.put(OIWObjectIdentifiers.idSHA1.getId(), OIWObjectIdentifiers.idSHA1);
        oids.put("SHA224", NISTObjectIdentifiers.id_sha224);
        oids.put("SHA-224", NISTObjectIdentifiers.id_sha224);
        oids.put(NISTObjectIdentifiers.id_sha224.getId(), NISTObjectIdentifiers.id_sha224);
        oids.put("SHA256", NISTObjectIdentifiers.id_sha256);
        oids.put("SHA-256", NISTObjectIdentifiers.id_sha256);
        oids.put(NISTObjectIdentifiers.id_sha256.getId(), NISTObjectIdentifiers.id_sha256);
        oids.put("SHA384", NISTObjectIdentifiers.id_sha384);
        oids.put("SHA-384", NISTObjectIdentifiers.id_sha384);
        oids.put(NISTObjectIdentifiers.id_sha384.getId(), NISTObjectIdentifiers.id_sha384);
        oids.put("SHA512", NISTObjectIdentifiers.id_sha512);
        oids.put("SHA-512", NISTObjectIdentifiers.id_sha512);
        oids.put(NISTObjectIdentifiers.id_sha512.getId(), NISTObjectIdentifiers.id_sha512);
    }
}
