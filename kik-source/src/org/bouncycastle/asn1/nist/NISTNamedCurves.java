// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.nist;

import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.util.Strings;

public class NISTNamedCurves
{

    static final Hashtable a = new Hashtable();
    static final Hashtable b = new Hashtable();

    public NISTNamedCurves()
    {
    }

    public static X9ECParameters a(String s)
    {
        s = (DERObjectIdentifier)a.get(Strings.b(s));
        if (s != null)
        {
            return SECNamedCurves.a(s);
        } else
        {
            return null;
        }
    }

    public static X9ECParameters a(DERObjectIdentifier derobjectidentifier)
    {
        return SECNamedCurves.a(derobjectidentifier);
    }

    private static void a(String s, DERObjectIdentifier derobjectidentifier)
    {
        a.put(s, derobjectidentifier);
        b.put(derobjectidentifier, s);
    }

    public static String b(DERObjectIdentifier derobjectidentifier)
    {
        return (String)b.get(derobjectidentifier);
    }

    public static DERObjectIdentifier b(String s)
    {
        return (DERObjectIdentifier)a.get(Strings.b(s));
    }

    static 
    {
        a("B-571", SECObjectIdentifiers.F);
        a("B-409", SECObjectIdentifiers.D);
        a("B-283", SECObjectIdentifiers.n);
        a("B-233", SECObjectIdentifiers.t);
        a("B-163", SECObjectIdentifiers.l);
        a("P-521", SECObjectIdentifiers.B);
        a("P-384", SECObjectIdentifiers.A);
        a("P-256", SECObjectIdentifiers.H);
        a("P-224", SECObjectIdentifiers.z);
        a("P-192", SECObjectIdentifiers.G);
    }
}
