// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.util.BigIntegers;

public class ECPrivateKey extends ASN1Object
{

    private ASN1Sequence a;

    public ECPrivateKey(BigInteger biginteger, ASN1Object asn1object)
    {
        this(biginteger, null, asn1object);
    }

    public ECPrivateKey(BigInteger biginteger, DERBitString derbitstring, ASN1Object asn1object)
    {
        biginteger = BigIntegers.a(biginteger);
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new ASN1Integer(1));
        asn1encodablevector.a(new DEROctetString(biginteger));
        if (asn1object != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, asn1object));
        }
        if (derbitstring != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, derbitstring));
        }
        a = new DERSequence(asn1encodablevector);
    }

    private ECPrivateKey(ASN1Sequence asn1sequence)
    {
        a = asn1sequence;
    }

    public static ECPrivateKey a(Object obj)
    {
        if (obj instanceof ECPrivateKey)
        {
            return (ECPrivateKey)obj;
        }
        if (obj != null)
        {
            return new ECPrivateKey(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        return a;
    }

    public final BigInteger c()
    {
        return new BigInteger(1, ((ASN1OctetString)a.a(1)).d());
    }

    public final DERBitString d()
    {
        Object obj = a.d();
_L4:
        if (!((Enumeration) (obj)).hasMoreElements()) goto _L2; else goto _L1
_L1:
        Object obj1 = (ASN1Encodable)((Enumeration) (obj)).nextElement();
        if (!(obj1 instanceof ASN1TaggedObject)) goto _L4; else goto _L3
_L3:
        obj1 = (ASN1TaggedObject)obj1;
        if (((ASN1TaggedObject) (obj1)).c() != 1) goto _L4; else goto _L5
_L5:
        obj = ((ASN1TaggedObject) (obj1)).k().a();
_L7:
        return (DERBitString)obj;
_L2:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
