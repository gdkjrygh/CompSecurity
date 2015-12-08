// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class GOST3410ParamSetParameters extends ASN1Encodable
{

    int a;
    DERInteger b;
    DERInteger c;
    DERInteger d;

    public GOST3410ParamSetParameters(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2)
    {
        a = 1024;
        b = new DERInteger(biginteger);
        c = new DERInteger(biginteger1);
        d = new DERInteger(biginteger2);
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(a));
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        asn1encodablevector.a(d);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger e()
    {
        return b.f();
    }

    public final BigInteger f()
    {
        return c.f();
    }

    public final BigInteger g()
    {
        return d.f();
    }
}
