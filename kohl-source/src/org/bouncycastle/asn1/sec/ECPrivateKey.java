// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.BigIntegers;

public class ECPrivateKey extends ASN1Object
{

    private ASN1Sequence seq;

    public ECPrivateKey(BigInteger biginteger)
    {
        biginteger = BigIntegers.asUnsignedByteArray(biginteger);
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(1));
        asn1encodablevector.add(new DEROctetString(biginteger));
        seq = new DERSequence(asn1encodablevector);
    }

    public ECPrivateKey(BigInteger biginteger, ASN1Object asn1object)
    {
        this(biginteger, null, asn1object);
    }

    public ECPrivateKey(BigInteger biginteger, DERBitString derbitstring, ASN1Object asn1object)
    {
        biginteger = BigIntegers.asUnsignedByteArray(biginteger);
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(1));
        asn1encodablevector.add(new DEROctetString(biginteger));
        if (asn1object != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, asn1object));
        }
        if (derbitstring != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, derbitstring));
        }
        seq = new DERSequence(asn1encodablevector);
    }

    private ECPrivateKey(ASN1Sequence asn1sequence)
    {
        seq = asn1sequence;
    }

    public static ECPrivateKey getInstance(Object obj)
    {
        if (obj instanceof ECPrivateKey)
        {
            return (ECPrivateKey)obj;
        }
        if (obj != null)
        {
            return new ECPrivateKey(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    private ASN1Primitive getObjectInTag(int i)
    {
        for (Enumeration enumeration = seq.getObjects(); enumeration.hasMoreElements();)
        {
            Object obj = (ASN1Encodable)enumeration.nextElement();
            if (obj instanceof ASN1TaggedObject)
            {
                obj = (ASN1TaggedObject)obj;
                if (((ASN1TaggedObject) (obj)).getTagNo() == i)
                {
                    return ((ASN1TaggedObject) (obj)).getObject().toASN1Primitive();
                }
            }
        }

        return null;
    }

    public BigInteger getKey()
    {
        return new BigInteger(1, ((ASN1OctetString)seq.getObjectAt(1)).getOctets());
    }

    public ASN1Primitive getParameters()
    {
        return getObjectInTag(0);
    }

    public DERBitString getPublicKey()
    {
        return (DERBitString)getObjectInTag(1);
    }

    public ASN1Primitive toASN1Primitive()
    {
        return seq;
    }
}
