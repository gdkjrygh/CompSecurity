// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

// Referenced classes of package org.bouncycastle.asn1.x500:
//            X500NameStyle, RDN, AttributeTypeAndValue

public class X500Name extends ASN1Object
    implements ASN1Choice
{

    private static X500NameStyle defaultStyle;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private RDN rdns[];
    private X500NameStyle style;

    public X500Name(String s)
    {
        this(defaultStyle, s);
    }

    private X500Name(ASN1Sequence asn1sequence)
    {
        this(defaultStyle, asn1sequence);
    }

    public X500Name(X500NameStyle x500namestyle, String s)
    {
        this(x500namestyle.fromString(s));
        style = x500namestyle;
    }

    private X500Name(X500NameStyle x500namestyle, ASN1Sequence asn1sequence)
    {
        style = x500namestyle;
        rdns = new RDN[asn1sequence.size()];
        int i = 0;
        for (x500namestyle = asn1sequence.getObjects(); x500namestyle.hasMoreElements();)
        {
            rdns[i] = RDN.getInstance(x500namestyle.nextElement());
            i++;
        }

    }

    public X500Name(X500NameStyle x500namestyle, X500Name x500name)
    {
        rdns = x500name.rdns;
        style = x500namestyle;
    }

    public X500Name(X500NameStyle x500namestyle, RDN ardn[])
    {
        rdns = ardn;
        style = x500namestyle;
    }

    public X500Name(RDN ardn[])
    {
        this(defaultStyle, ardn);
    }

    public static X500NameStyle getDefaultStyle()
    {
        return defaultStyle;
    }

    public static X500Name getInstance(Object obj)
    {
        if (obj instanceof X500Name)
        {
            return (X500Name)obj;
        }
        if (obj != null)
        {
            return new X500Name(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static X500Name getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, true));
    }

    public static X500Name getInstance(X500NameStyle x500namestyle, Object obj)
    {
        if (obj instanceof X500Name)
        {
            return getInstance(x500namestyle, ((X500Name)obj).toASN1Primitive());
        }
        if (obj != null)
        {
            return new X500Name(x500namestyle, ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static void setDefaultStyle(X500NameStyle x500namestyle)
    {
        if (x500namestyle == null)
        {
            throw new NullPointerException("cannot set style to null");
        } else
        {
            defaultStyle = x500namestyle;
            return;
        }
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
        ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
        if (toASN1Primitive().equals(asn1primitive))
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable)obj).toASN1Primitive())));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public ASN1ObjectIdentifier[] getAttributeTypes()
    {
        int i = 0;
        int j = 0;
        for (; i != rdns.length; i++)
        {
            j += rdns[i].size();
        }

        ASN1ObjectIdentifier aasn1objectidentifier[] = new ASN1ObjectIdentifier[j];
        int i1 = 0;
        i = 0;
        while (i1 != rdns.length) 
        {
            Object obj = rdns[i1];
            int l;
            if (((RDN) (obj)).isMultiValued())
            {
                obj = ((RDN) (obj)).getTypesAndValues();
                for (int k = 0; k != obj.length;)
                {
                    aasn1objectidentifier[i] = obj[k].getType();
                    k++;
                    i++;
                }

                l = i;
            } else
            {
                l = i;
                if (((RDN) (obj)).size() != 0)
                {
                    aasn1objectidentifier[i] = ((RDN) (obj)).getFirst().getType();
                    l = i + 1;
                }
            }
            i1++;
            i = l;
        }
        return aasn1objectidentifier;
    }

    public RDN[] getRDNs()
    {
        RDN ardn[] = new RDN[rdns.length];
        System.arraycopy(rdns, 0, ardn, 0, ardn.length);
        return ardn;
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier asn1objectidentifier)
    {
        RDN ardn[];
        int j;
        int k;
        ardn = new RDN[rdns.length];
        j = 0;
        k = 0;
_L7:
        RDN rdn;
        AttributeTypeAndValue aattributetypeandvalue[];
        int l;
        if (j == rdns.length)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        rdn = rdns[j];
        if (!rdn.isMultiValued())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        aattributetypeandvalue = rdn.getTypesAndValues();
        l = 0;
_L5:
        int i = k;
        if (l == aattributetypeandvalue.length) goto _L2; else goto _L1
_L1:
        if (!aattributetypeandvalue[l].getType().equals(asn1objectidentifier)) goto _L4; else goto _L3
_L3:
        ardn[k] = rdn;
        i = k + 1;
_L2:
        j++;
        k = i;
        continue; /* Loop/switch isn't completed */
_L4:
        l++;
          goto _L5
        i = k;
        if (rdn.getFirst().getType().equals(asn1objectidentifier))
        {
            ardn[k] = rdn;
            i = k + 1;
        }
          goto _L2
        asn1objectidentifier = new RDN[k];
        System.arraycopy(ardn, 0, asn1objectidentifier, 0, asn1objectidentifier.length);
        return asn1objectidentifier;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int hashCode()
    {
        if (isHashCodeCalculated)
        {
            return hashCodeValue;
        } else
        {
            isHashCodeCalculated = true;
            hashCodeValue = style.calculateHashCode(this);
            return hashCodeValue;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERSequence(rdns);
    }

    public String toString()
    {
        return style.toString(this);
    }

    static 
    {
        defaultStyle = BCStyle.INSTANCE;
    }
}
