// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class DSAParameter extends ASN1Object
{

    ASN1Integer a;
    ASN1Integer b;
    ASN1Integer c;

    public DSAParameter(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = new ASN1Integer(biginteger);
        b = new ASN1Integer(biginteger1);
        c = new ASN1Integer(biginteger2);
    }

    public DSAParameter(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            asn1sequence = asn1sequence.d();
            a = ASN1Integer.a(asn1sequence.nextElement());
            b = ASN1Integer.a(asn1sequence.nextElement());
            c = ASN1Integer.a(asn1sequence.nextElement());
            return;
        }
    }

    public static DSAParameter a(Object obj)
    {
        if (obj == null || (obj instanceof DSAParameter))
        {
            return (DSAParameter)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new DSAParameter((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid DSAParameter: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger c()
    {
        return a.d();
    }

    public final BigInteger d()
    {
        return b.d();
    }

    public final BigInteger e()
    {
        return c.d();
    }
}
