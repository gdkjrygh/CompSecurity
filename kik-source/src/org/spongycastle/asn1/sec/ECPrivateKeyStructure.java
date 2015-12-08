// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.util.BigIntegers;

public class ECPrivateKeyStructure extends ASN1Object
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
        asn1encodablevector.a(new ASN1Integer(1));
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

    public final ASN1Primitive a()
    {
        return a;
    }
}
