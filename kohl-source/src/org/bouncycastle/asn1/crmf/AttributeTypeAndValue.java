// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class AttributeTypeAndValue extends ASN1Object
{

    private ASN1ObjectIdentifier type;
    private ASN1Encodable value;

    public AttributeTypeAndValue(String s, ASN1Encodable asn1encodable)
    {
        this(new ASN1ObjectIdentifier(s), asn1encodable);
    }

    public AttributeTypeAndValue(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        type = asn1objectidentifier;
        value = asn1encodable;
    }

    private AttributeTypeAndValue(ASN1Sequence asn1sequence)
    {
        type = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        value = asn1sequence.getObjectAt(1);
    }

    public static AttributeTypeAndValue getInstance(Object obj)
    {
        if (obj instanceof AttributeTypeAndValue)
        {
            return (AttributeTypeAndValue)obj;
        }
        if (obj != null)
        {
            return new AttributeTypeAndValue(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getType()
    {
        return type;
    }

    public ASN1Encodable getValue()
    {
        return value;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(type);
        asn1encodablevector.add(value);
        return new DERSequence(asn1encodablevector);
    }
}
