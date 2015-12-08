// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.crmf:
//            AttributeTypeAndValue

public class Controls extends ASN1Object
{

    private ASN1Sequence content;

    private Controls(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public Controls(AttributeTypeAndValue attributetypeandvalue)
    {
        content = new DERSequence(attributetypeandvalue);
    }

    public Controls(AttributeTypeAndValue aattributetypeandvalue[])
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i < aattributetypeandvalue.length; i++)
        {
            asn1encodablevector.add(aattributetypeandvalue[i]);
        }

        content = new DERSequence(asn1encodablevector);
    }

    public static Controls getInstance(Object obj)
    {
        if (obj instanceof Controls)
        {
            return (Controls)obj;
        }
        if (obj != null)
        {
            return new Controls(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }

    public AttributeTypeAndValue[] toAttributeTypeAndValueArray()
    {
        AttributeTypeAndValue aattributetypeandvalue[] = new AttributeTypeAndValue[content.size()];
        for (int i = 0; i != aattributetypeandvalue.length; i++)
        {
            aattributetypeandvalue[i] = AttributeTypeAndValue.getInstance(content.getObjectAt(i));
        }

        return aattributetypeandvalue;
    }
}
