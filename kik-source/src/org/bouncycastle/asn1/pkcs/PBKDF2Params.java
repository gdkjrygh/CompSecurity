// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class PBKDF2Params extends ASN1Encodable
{

    ASN1OctetString a;
    DERInteger b;
    DERInteger c;

    private PBKDF2Params(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        a = (ASN1OctetString)asn1sequence.nextElement();
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

    public PBKDF2Params(byte abyte0[], int i)
    {
        a = new DEROctetString(abyte0);
        b = new DERInteger(i);
    }

    public static PBKDF2Params a(Object obj)
    {
        if (obj instanceof PBKDF2Params)
        {
            return (PBKDF2Params)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new PBKDF2Params((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown object in factory: ")).append(obj.getClass().getName()).toString());
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        return new DERSequence(asn1encodablevector);
    }

    public final byte[] e()
    {
        return a.f();
    }

    public final BigInteger f()
    {
        return b.e();
    }
}
