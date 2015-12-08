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

public class RSAPrivateKeyStructure extends ASN1Encodable
{

    private int a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private ASN1Sequence j;

    public RSAPrivateKeyStructure(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, BigInteger biginteger5, BigInteger biginteger6, 
            BigInteger biginteger7)
    {
        j = null;
        a = 0;
        b = biginteger;
        c = biginteger1;
        d = biginteger2;
        e = biginteger3;
        f = biginteger4;
        g = biginteger5;
        h = biginteger6;
        i = biginteger7;
    }

    public RSAPrivateKeyStructure(ASN1Sequence asn1sequence)
    {
        j = null;
        asn1sequence = asn1sequence.e();
        BigInteger biginteger = ((DERInteger)asn1sequence.nextElement()).e();
        if (biginteger.intValue() != 0 && biginteger.intValue() != 1)
        {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        a = biginteger.intValue();
        b = ((DERInteger)asn1sequence.nextElement()).e();
        c = ((DERInteger)asn1sequence.nextElement()).e();
        d = ((DERInteger)asn1sequence.nextElement()).e();
        e = ((DERInteger)asn1sequence.nextElement()).e();
        f = ((DERInteger)asn1sequence.nextElement()).e();
        g = ((DERInteger)asn1sequence.nextElement()).e();
        h = ((DERInteger)asn1sequence.nextElement()).e();
        i = ((DERInteger)asn1sequence.nextElement()).e();
        if (asn1sequence.hasMoreElements())
        {
            j = (ASN1Sequence)asn1sequence.nextElement();
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(a));
        asn1encodablevector.a(new DERInteger(b));
        asn1encodablevector.a(new DERInteger(c));
        asn1encodablevector.a(new DERInteger(d));
        asn1encodablevector.a(new DERInteger(e));
        asn1encodablevector.a(new DERInteger(f));
        asn1encodablevector.a(new DERInteger(g));
        asn1encodablevector.a(new DERInteger(h));
        asn1encodablevector.a(new DERInteger(i));
        if (j != null)
        {
            asn1encodablevector.a(j);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger e()
    {
        return b;
    }

    public final BigInteger f()
    {
        return c;
    }

    public final BigInteger g()
    {
        return d;
    }

    public final BigInteger h()
    {
        return e;
    }

    public final BigInteger i()
    {
        return f;
    }

    public final BigInteger j()
    {
        return g;
    }

    public final BigInteger k()
    {
        return h;
    }

    public final BigInteger l()
    {
        return i;
    }
}
