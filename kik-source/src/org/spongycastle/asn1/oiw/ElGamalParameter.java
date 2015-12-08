// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class ElGamalParameter extends ASN1Object
{

    ASN1Integer a;
    ASN1Integer b;

    public ElGamalParameter(BigInteger biginteger, BigInteger biginteger1)
    {
        a = new ASN1Integer(biginteger);
        b = new ASN1Integer(biginteger1);
    }

    public ElGamalParameter(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        a = (ASN1Integer)asn1sequence.nextElement();
        b = (ASN1Integer)asn1sequence.nextElement();
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
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
}
