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

public class RSAPrivateKey extends ASN1Object
{

    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private ASN1Sequence j;

    public RSAPrivateKey(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3, BigInteger biginteger4, BigInteger biginteger5, BigInteger biginteger6, 
            BigInteger biginteger7)
    {
        j = null;
        a = BigInteger.valueOf(0L);
        b = biginteger;
        c = biginteger1;
        d = biginteger2;
        e = biginteger3;
        f = biginteger4;
        g = biginteger5;
        h = biginteger6;
        i = biginteger7;
    }

    private RSAPrivateKey(ASN1Sequence asn1sequence)
    {
        j = null;
        asn1sequence = asn1sequence.d();
        BigInteger biginteger = ((ASN1Integer)asn1sequence.nextElement()).c();
        if (biginteger.intValue() != 0 && biginteger.intValue() != 1)
        {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        a = biginteger;
        b = ((ASN1Integer)asn1sequence.nextElement()).c();
        c = ((ASN1Integer)asn1sequence.nextElement()).c();
        d = ((ASN1Integer)asn1sequence.nextElement()).c();
        e = ((ASN1Integer)asn1sequence.nextElement()).c();
        f = ((ASN1Integer)asn1sequence.nextElement()).c();
        g = ((ASN1Integer)asn1sequence.nextElement()).c();
        h = ((ASN1Integer)asn1sequence.nextElement()).c();
        i = ((ASN1Integer)asn1sequence.nextElement()).c();
        if (asn1sequence.hasMoreElements())
        {
            j = (ASN1Sequence)asn1sequence.nextElement();
        }
    }

    public static RSAPrivateKey a(Object obj)
    {
        if (obj instanceof RSAPrivateKey)
        {
            return (RSAPrivateKey)obj;
        }
        if (obj != null)
        {
            return new RSAPrivateKey(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(a));
        asn1encodablevector.a(new ASN1Integer(b));
        asn1encodablevector.a(new ASN1Integer(c));
        asn1encodablevector.a(new ASN1Integer(d));
        asn1encodablevector.a(new ASN1Integer(e));
        asn1encodablevector.a(new ASN1Integer(f));
        asn1encodablevector.a(new ASN1Integer(g));
        asn1encodablevector.a(new ASN1Integer(h));
        asn1encodablevector.a(new ASN1Integer(i));
        if (j != null)
        {
            asn1encodablevector.a(j);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger c()
    {
        return b;
    }

    public final BigInteger d()
    {
        return c;
    }

    public final BigInteger e()
    {
        return d;
    }

    public final BigInteger f()
    {
        return e;
    }

    public final BigInteger g()
    {
        return f;
    }

    public final BigInteger h()
    {
        return g;
    }

    public final BigInteger i()
    {
        return h;
    }

    public final BigInteger j()
    {
        return i;
    }
}
