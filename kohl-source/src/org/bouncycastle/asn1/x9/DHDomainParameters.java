// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            DHValidationParms

public class DHDomainParameters extends ASN1Object
{

    private ASN1Integer g;
    private ASN1Integer j;
    private ASN1Integer p;
    private ASN1Integer q;
    private DHValidationParms validationParms;

    public DHDomainParameters(ASN1Integer asn1integer, ASN1Integer asn1integer1, ASN1Integer asn1integer2, ASN1Integer asn1integer3, DHValidationParms dhvalidationparms)
    {
        if (asn1integer == null)
        {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (asn1integer1 == null)
        {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (asn1integer2 == null)
        {
            throw new IllegalArgumentException("'q' cannot be null");
        } else
        {
            p = asn1integer;
            g = asn1integer1;
            q = asn1integer2;
            j = asn1integer3;
            validationParms = dhvalidationparms;
            return;
        }
    }

    private DHDomainParameters(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 3 || asn1sequence.size() > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        Enumeration enumeration = asn1sequence.getObjects();
        p = ASN1Integer.getInstance(enumeration.nextElement());
        g = ASN1Integer.getInstance(enumeration.nextElement());
        q = ASN1Integer.getInstance(enumeration.nextElement());
        ASN1Encodable asn1encodable = getNext(enumeration);
        asn1sequence = asn1encodable;
        if (asn1encodable != null)
        {
            asn1sequence = asn1encodable;
            if (asn1encodable instanceof ASN1Integer)
            {
                j = ASN1Integer.getInstance(asn1encodable);
                asn1sequence = getNext(enumeration);
            }
        }
        if (asn1sequence != null)
        {
            validationParms = DHValidationParms.getInstance(asn1sequence.toASN1Primitive());
        }
    }

    public static DHDomainParameters getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DHDomainParameters))
        {
            return (DHDomainParameters)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DHDomainParameters((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid DHDomainParameters: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DHDomainParameters getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    private static ASN1Encodable getNext(Enumeration enumeration)
    {
        if (enumeration.hasMoreElements())
        {
            return (ASN1Encodable)enumeration.nextElement();
        } else
        {
            return null;
        }
    }

    public ASN1Integer getG()
    {
        return g;
    }

    public ASN1Integer getJ()
    {
        return j;
    }

    public ASN1Integer getP()
    {
        return p;
    }

    public ASN1Integer getQ()
    {
        return q;
    }

    public DHValidationParms getValidationParms()
    {
        return validationParms;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(p);
        asn1encodablevector.add(g);
        asn1encodablevector.add(q);
        if (j != null)
        {
            asn1encodablevector.add(j);
        }
        if (validationParms != null)
        {
            asn1encodablevector.add(validationParms);
        }
        return new DERSequence(asn1encodablevector);
    }
}
