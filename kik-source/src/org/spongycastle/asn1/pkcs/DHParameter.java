// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class DHParameter extends ASN1Object
{

    ASN1Integer a;
    ASN1Integer b;
    ASN1Integer c;

    public DHParameter(BigInteger biginteger, BigInteger biginteger1, int i)
    {
        a = new ASN1Integer(biginteger);
        b = new ASN1Integer(biginteger1);
        if (i != 0)
        {
            c = new ASN1Integer(i);
            return;
        } else
        {
            c = null;
            return;
        }
    }

    private DHParameter(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        a = ASN1Integer.a(asn1sequence.nextElement());
        b = ASN1Integer.a(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            c = (ASN1Integer)asn1sequence.nextElement();
            return;
        } else
        {
            c = null;
            return;
        }
    }

    public static DHParameter a(Object obj)
    {
        if (obj instanceof DHParameter)
        {
            return (DHParameter)obj;
        }
        if (obj != null)
        {
            return new DHParameter(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (e() != null)
        {
            asn1encodablevector.a(c);
        }
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
        if (c == null)
        {
            return null;
        } else
        {
            return c.d();
        }
    }
}
