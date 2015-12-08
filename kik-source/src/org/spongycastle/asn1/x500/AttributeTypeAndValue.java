// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x500;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

public class AttributeTypeAndValue extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1Encodable b;

    private AttributeTypeAndValue(ASN1Sequence asn1sequence)
    {
        a = (ASN1ObjectIdentifier)asn1sequence.a(0);
        b = asn1sequence.a(1);
    }

    public static AttributeTypeAndValue a(Object obj)
    {
        if (obj instanceof AttributeTypeAndValue)
        {
            return (AttributeTypeAndValue)obj;
        }
        if (obj != null)
        {
            return new AttributeTypeAndValue(ASN1Sequence.a(obj));
        } else
        {
            throw new IllegalArgumentException("null value in getInstance()");
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier c()
    {
        return a;
    }

    public final ASN1Encodable d()
    {
        return b;
    }
}
