// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class DHParameter extends ASN1Object
{

    ASN1Integer g;
    ASN1Integer l;
    ASN1Integer p;

    public DHParameter(BigInteger biginteger, BigInteger biginteger1, int i)
    {
        p = new ASN1Integer(biginteger);
        g = new ASN1Integer(biginteger1);
        if (i != 0)
        {
            l = new ASN1Integer(i);
            return;
        } else
        {
            l = null;
            return;
        }
    }

    private DHParameter(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        p = ASN1Integer.getInstance(asn1sequence.nextElement());
        g = ASN1Integer.getInstance(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            l = (ASN1Integer)asn1sequence.nextElement();
            return;
        } else
        {
            l = null;
            return;
        }
    }

    public static DHParameter getInstance(Object obj)
    {
        if (obj instanceof DHParameter)
        {
            return (DHParameter)obj;
        }
        if (obj != null)
        {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public BigInteger getG()
    {
        return g.getPositiveValue();
    }

    public BigInteger getL()
    {
        if (l == null)
        {
            return null;
        } else
        {
            return l.getPositiveValue();
        }
    }

    public BigInteger getP()
    {
        return p.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(p);
        asn1encodablevector.add(g);
        if (getL() != null)
        {
            asn1encodablevector.add(l);
        }
        return new DERSequence(asn1encodablevector);
    }
}
