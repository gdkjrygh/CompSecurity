// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.X509Name;

// Referenced classes of package org.bouncycastle.asn1.x500:
//            RDN, X500NameStyle

public class X500Name extends ASN1Encodable
    implements ASN1Choice
{

    private static X500NameStyle a;
    private boolean b;
    private int c;
    private X500NameStyle d;
    private RDN e[];

    private X500Name(ASN1Sequence asn1sequence)
    {
        this(a, asn1sequence);
    }

    private X500Name(X500NameStyle x500namestyle, ASN1Sequence asn1sequence)
    {
        d = x500namestyle;
        e = new RDN[asn1sequence.f()];
        int i = 0;
        for (x500namestyle = asn1sequence.e(); x500namestyle.hasMoreElements();)
        {
            e[i] = RDN.a(x500namestyle.nextElement());
            i++;
        }

    }

    public static X500Name a(Object obj)
    {
        if (obj instanceof X500Name)
        {
            return (X500Name)obj;
        }
        if (obj instanceof X509Name)
        {
            return new X500Name(ASN1Sequence.a(((X509Name)obj).c()));
        }
        if (obj != null)
        {
            return new X500Name(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final DERObject d()
    {
        return new DERSequence(e);
    }

    public final RDN[] e()
    {
        RDN ardn[] = new RDN[e.length];
        System.arraycopy(e, 0, ardn, 0, ardn.length);
        return ardn;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence))
        {
            return false;
        }
        DERObject derobject = ((DEREncodable)obj).c();
        if (c().equals(derobject))
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = d.a(this, new X500Name(ASN1Sequence.a(((DEREncodable)obj).c())));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public int hashCode()
    {
        if (b)
        {
            return c;
        } else
        {
            b = true;
            c = d.a(this);
            return c;
        }
    }

    public String toString()
    {
        return d.b(this);
    }

    static 
    {
        a = BCStyle.a;
    }
}
