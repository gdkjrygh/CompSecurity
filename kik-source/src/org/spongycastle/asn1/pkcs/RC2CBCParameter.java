// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

public class RC2CBCParameter extends ASN1Object
{

    ASN1Integer a;
    ASN1OctetString b;

    public RC2CBCParameter(int i, byte abyte0[])
    {
        a = new ASN1Integer(i);
        b = new DEROctetString(abyte0);
    }

    private RC2CBCParameter(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() == 1)
        {
            a = null;
            b = (ASN1OctetString)asn1sequence.a(0);
            return;
        } else
        {
            a = (ASN1Integer)asn1sequence.a(0);
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
        if (obj instanceof RC2CBCParameter)
        {
            return (RC2CBCParameter)obj;
        }
        if (obj != null)
        {
            return new RC2CBCParameter(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(a);
        }
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final BigInteger c()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.c();
        }
    }

    public final byte[] d()
    {
        return b.d();
    }
}
