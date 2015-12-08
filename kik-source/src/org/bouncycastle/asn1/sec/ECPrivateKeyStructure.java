// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.BigIntegers;

public class ECPrivateKeyStructure extends ASN1Encodable
{

    private ASN1Sequence a;

    public ECPrivateKeyStructure(BigInteger biginteger, ASN1Encodable asn1encodable)
    {
        this(biginteger, null, asn1encodable);
    }

    public ECPrivateKeyStructure(BigInteger biginteger, DERBitString derbitstring, ASN1Encodable asn1encodable)
    {
        biginteger = BigIntegers.a(biginteger);
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new DERInteger(1));
        asn1encodablevector.a(new DEROctetString(biginteger));
        if (asn1encodable != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, asn1encodable));
        }
        if (derbitstring != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, derbitstring));
        }
        a = new DERSequence(asn1encodablevector);
    }

    public ECPrivateKeyStructure(ASN1Sequence asn1sequence)
    {
        a = asn1sequence;
    }

    public final DERObject d()
    {
        return a;
    }

    public final BigInteger e()
    {
        return new BigInteger(1, ((ASN1OctetString)a.a(1)).f());
    }

    public final DERBitString f()
    {
        Object obj = a.e();
_L4:
        if (!((Enumeration) (obj)).hasMoreElements()) goto _L2; else goto _L1
_L1:
        Object obj1 = (DEREncodable)((Enumeration) (obj)).nextElement();
        if (!(obj1 instanceof ASN1TaggedObject)) goto _L4; else goto _L3
_L3:
        obj1 = (ASN1TaggedObject)obj1;
        if (((ASN1TaggedObject) (obj1)).e() != 1) goto _L4; else goto _L5
_L5:
        obj = (ASN1Object)((ASN1TaggedObject) (obj1)).i().c();
_L7:
        return (DERBitString)obj;
_L2:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
