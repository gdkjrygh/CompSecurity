// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

public class AttributeTypeAndValue extends ASN1Encodable
{

    private ASN1ObjectIdentifier a;
    private ASN1Encodable b;

    private AttributeTypeAndValue(ASN1Sequence asn1sequence)
    {
        a = (ASN1ObjectIdentifier)asn1sequence.a(0);
        b = (ASN1Encodable)asn1sequence.a(1);
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

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier e()
    {
        return a;
    }

    public final ASN1Encodable f()
    {
        return b;
    }
}
