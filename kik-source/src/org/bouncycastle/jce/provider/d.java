// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERObjectIdentifier;
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

final class d
{

    private static Set a;
    private static Set b;
    private static Set c;
    private static Set d;
    private static Set e;
    private static Set f;
    private static Map g;

    static Digest a(String s)
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

    static boolean a(String s, String s1)
    {
        return b.contains(s) && b.contains(s1) || c.contains(s) && c.contains(s1) || d.contains(s) && d.contains(s1) || e.contains(s) && e.contains(s1) || f.contains(s) && f.contains(s1) || a.contains(s) && a.contains(s1);
    }

    static DERObjectIdentifier b(String s)
    {
        return (DERObjectIdentifier)g.get(s);
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
        a.add(PKCSObjectIdentifiers.G.e());
        b.add("SHA1");
        b.add("SHA-1");
        b.add(OIWObjectIdentifiers.i.e());
        c.add("SHA224");
        c.add("SHA-224");
        c.add(NISTObjectIdentifiers.e.e());
        d.add("SHA256");
        d.add("SHA-256");
        d.add(NISTObjectIdentifiers.b.e());
        e.add("SHA384");
        e.add("SHA-384");
        e.add(NISTObjectIdentifiers.c.e());
        f.add("SHA512");
        f.add("SHA-512");
        f.add(NISTObjectIdentifiers.d.e());
        g.put("MD5", PKCSObjectIdentifiers.G);
        g.put(PKCSObjectIdentifiers.G.e(), PKCSObjectIdentifiers.G);
        g.put("SHA1", OIWObjectIdentifiers.i);
        g.put("SHA-1", OIWObjectIdentifiers.i);
        g.put(OIWObjectIdentifiers.i.e(), OIWObjectIdentifiers.i);
        g.put("SHA224", NISTObjectIdentifiers.e);
        g.put("SHA-224", NISTObjectIdentifiers.e);
        g.put(NISTObjectIdentifiers.e.e(), NISTObjectIdentifiers.e);
        g.put("SHA256", NISTObjectIdentifiers.b);
        g.put("SHA-256", NISTObjectIdentifiers.b);
        g.put(NISTObjectIdentifiers.b.e(), NISTObjectIdentifiers.b);
        g.put("SHA384", NISTObjectIdentifiers.c);
        g.put("SHA-384", NISTObjectIdentifiers.c);
        g.put(NISTObjectIdentifiers.c.e(), NISTObjectIdentifiers.c);
        g.put("SHA512", NISTObjectIdentifiers.d);
        g.put("SHA-512", NISTObjectIdentifiers.d);
        g.put(NISTObjectIdentifiers.d.e(), NISTObjectIdentifiers.d);
    }
}
