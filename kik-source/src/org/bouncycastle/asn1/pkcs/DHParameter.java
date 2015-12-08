// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class DHParameter extends ASN1Encodable
{

    DERInteger a;
    DERInteger b;
    DERInteger c;

    public DHParameter(BigInteger biginteger, BigInteger biginteger1, int i)
    {
        a = new DERInteger(biginteger);
        b = new DERInteger(biginteger1);
        if (i != 0)
        {
            c = new DERInteger(i);
            return;
        } else
        {
            c = null;
            return;
        }
    }

    public DHParameter(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        a = (DERInteger)asn1sequence.nextElement();
        b = (DERInteger)asn1sequence.nextElement();
        if (asn1sequence.hasMoreElements())
        {
            c = (DERInteger)asn1sequence.nextElement();
            return;
        } else
        {
            c = null;
            return;
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (g() != null)
        {
            asn1encodablevector.a(c);
        }
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
        if (c == null)
        {
            return null;
        } else
        {
            return c.f();
        }
    }
}
