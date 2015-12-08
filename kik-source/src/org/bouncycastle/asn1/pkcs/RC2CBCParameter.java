// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class RC2CBCParameter extends ASN1Encodable
{

    DERInteger a;
    ASN1OctetString b;

    public RC2CBCParameter(int i, byte abyte0[])
    {
        a = new DERInteger(i);
        b = new DEROctetString(abyte0);
    }

    private RC2CBCParameter(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.f() == 1)
        {
            a = null;
            b = (ASN1OctetString)asn1sequence.a(0);
            return;
        } else
        {
            a = (DERInteger)asn1sequence.a(0);
            b = (ASN1OctetString)asn1sequence.a(1);
            return;
        }
    }

    public RC2CBCParameter(byte abyte0[])
    {
        a = null;
        b = new DEROctetString(abyte0);
    }

    public static RC2CBCParameter a(Object obj)
    {
        if (obj instanceof ASN1Sequence)
        {
            return new RC2CBCParameter((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException("unknown object in RC2CBCParameter factory");
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger e()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.e();
        }
    }

    public final byte[] f()
    {
        return b.f();
    }
}
