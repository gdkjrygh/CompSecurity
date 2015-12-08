// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x500;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.style.BCStyle;

// Referenced classes of package org.spongycastle.asn1.x500:
//            RDN, X500NameStyle

public class X500Name extends ASN1Object
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
        e = new RDN[asn1sequence.e()];
        int i = 0;
        for (x500namestyle = asn1sequence.d(); x500namestyle.hasMoreElements();)
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
        if (obj != null)
        {
            return new X500Name(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public static X500Name a(ASN1TaggedObject asn1taggedobject)
    {
        return a(ASN1Sequence.a(asn1taggedobject, true));
    }

    public final ASN1Primitive a()
    {
        return new DERSequence(e);
    }

    public final RDN[] c()
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
        ASN1Primitive asn1primitive = ((ASN1Encodable)obj).a();
        if (a().equals(asn1primitive))
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = d.a(this, new X500Name(ASN1Sequence.a(((ASN1Encodable)obj).a())));
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
