// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class DSAParameter extends ASN1Encodable
{

    DERInteger a;
    DERInteger b;
    DERInteger c;

    public DSAParameter(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = new DERInteger(biginteger);
        b = new DERInteger(biginteger1);
        c = new DERInteger(biginteger2);
    }

    public DSAParameter(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.f()).toString());
        } else
        {
            asn1sequence = asn1sequence.e();
            a = DERInteger.a(asn1sequence.nextElement());
            b = DERInteger.a(asn1sequence.nextElement());
            c = DERInteger.a(asn1sequence.nextElement());
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

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger e()
    {
        return a.f();
    }

    public final BigInteger f()
    {
        return b.f();
    }

    public final BigInteger g()
    {
        return c.f();
    }
}
