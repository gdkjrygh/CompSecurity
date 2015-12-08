// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.util.Strings;

public class DigestFactory
{

    private static Set a;
    private static Set b;
    private static Set c;
    private static Set d;
    private static Set e;
    private static Set f;
    private static Map g;

    public DigestFactory()
    {
    }

    public static Digest a(String s)
    {
        s = Strings.b(s);
        if (b.contains(s))
        {
            return new SHA1Digest();
        }
        if (a.contains(s))
        {
            return new MD5Digest();
        }
        if (c.contains(s))
        {
            return new SHA224Digest();
        }
        if (d.contains(s))
        {
            return new SHA256Digest();
        }
        if (e.contains(s))
        {
            return new SHA384Digest();
        }
        if (f.contains(s))
        {
            return new SHA512Digest();
        } else
        {
            return null;
        }
    }

    public static boolean a(String s, String s1)
    {
        return b.contains(s) && b.contains(s1) || c.contains(s) && c.contains(s1) || d.contains(s) && d.contains(s1) || e.contains(s) && e.contains(s1) || f.contains(s) && f.contains(s1) || a.contains(s) && a.contains(s1);
    }

    public static ASN1ObjectIdentifier b(String s)
    {
        return (ASN1ObjectIdentifier)g.get(s);
    }

    static 
    {
        a = new HashSet();
        b = new HashSet();
        c = new HashSet();
        d = new HashSet();
        e = new HashSet();
        f = new HashSet();
        g = new HashMap();
        a.add("MD5");
        a.add(PKCSObjectIdentifiers.G.c());
        b.add("SHA1");
        b.add("SHA-1");
        b.add(OIWObjectIdentifiers.i.c());
        c.add("SHA224");
        c.add("SHA-224");
        c.add(NISTObjectIdentifiers.e.c());
        d.add("SHA256");
        d.add("SHA-256");
        d.add(NISTObjectIdentifiers.b.c());
        e.add("SHA384");
        e.add("SHA-384");
        e.add(NISTObjectIdentifiers.c.c());
        f.add("SHA512");
        f.add("SHA-512");
        f.add(NISTObjectIdentifiers.d.c());
        g.put("MD5", PKCSObjectIdentifiers.G);
        g.put(PKCSObjectIdentifiers.G.c(), PKCSObjectIdentifiers.G);
        g.put("SHA1", OIWObjectIdentifiers.i);
        g.put("SHA-1", OIWObjectIdentifiers.i);
        g.put(OIWObjectIdentifiers.i.c(), OIWObjectIdentifiers.i);
        g.put("SHA224", NISTObjectIdentifiers.e);
        g.put("SHA-224", NISTObjectIdentifiers.e);
        g.put(NISTObjectIdentifiers.e.c(), NISTObjectIdentifiers.e);
        g.put("SHA256", NISTObjectIdentifiers.b);
        g.put("SHA-256", NISTObjectIdentifiers.b);
        g.put(NISTObjectIdentifiers.b.c(), NISTObjectIdentifiers.b);
        g.put("SHA384", NISTObjectIdentifiers.c);
        g.put("SHA-384", NISTObjectIdentifiers.c);
        g.put(NISTObjectIdentifiers.c.c(), NISTObjectIdentifiers.c);
        g.put("SHA512", NISTObjectIdentifiers.d);
        g.put("SHA-512", NISTObjectIdentifiers.d);
        g.put(NISTObjectIdentifiers.d.c(), NISTObjectIdentifiers.d);
    }
}
