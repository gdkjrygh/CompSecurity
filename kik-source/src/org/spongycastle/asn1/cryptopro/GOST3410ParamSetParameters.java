// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cryptopro;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;

public class GOST3410ParamSetParameters extends ASN1Object
{

    int a;
    ASN1Integer b;
    ASN1Integer c;
    ASN1Integer d;

    public GOST3410ParamSetParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = 1024;
        b = new ASN1Integer(biginteger);
        c = new ASN1Integer(biginteger1);
        d = new ASN1Integer(biginteger2);
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(a));
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger c()
    {
        return b.d();
    }

    public final BigInteger d()
    {
        return c.d();
    }

    public final BigInteger e()
    {
        return d.d();
    }
}
