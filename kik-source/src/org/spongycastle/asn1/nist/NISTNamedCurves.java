// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.nist;

import java.util.Hashtable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.sec.SECObjectIdentifiers;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.util.Strings;

public class NISTNamedCurves
{

    static final Hashtable a = new Hashtable();
    static final Hashtable b = new Hashtable();

    public NISTNamedCurves()
    {
    }

    public static X9ECParameters a(String s)
    {
        s = (ASN1ObjectIdentifier)a.get(Strings.b(s));
        if (s != null)
        {
            return SECNamedCurves.a(s);
        } else
        {
            return null;
        }
    }

    public static X9ECParameters a(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return SECNamedCurves.a(asn1objectidentifier);
    }

    private static void a(String s, ASN1ObjectIdentifier asn1objectidentifier)
    {
        a.put(s, asn1objectidentifier);
        b.put(asn1objectidentifier, s);
    }

    public static String b(ASN1ObjectIdentifier asn1objectidentifier)
    {
        return (String)b.get(asn1objectidentifier);
    }

    public static ASN1ObjectIdentifier b(String s)
    {
        return (ASN1ObjectIdentifier)a.get(Strings.b(s));
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
