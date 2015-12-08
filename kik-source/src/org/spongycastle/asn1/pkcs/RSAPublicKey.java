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

public class RSAPublicKey extends ASN1Object
{

    private BigInteger a;
    private BigInteger b;

    public RSAPublicKey(BigInteger biginteger, BigInteger biginteger1)
    {
        a = biginteger;
        b = biginteger1;
    }

    private RSAPublicKey(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            asn1sequence = asn1sequence.d();
            a = ASN1Integer.a(asn1sequence.nextElement()).d();
            b = ASN1Integer.a(asn1sequence.nextElement()).d();
            return;
        }
    }

    public static RSAPublicKey a(Object obj)
    {
        if (obj instanceof RSAPublicKey)
        {
            return (RSAPublicKey)obj;
        }
        if (obj != null)
        {
            return new RSAPublicKey(ASN1Sequence.a(obj));
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
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger c()
    {
        return a;
    }

    public final BigInteger d()
    {
        return b;
    }
}
