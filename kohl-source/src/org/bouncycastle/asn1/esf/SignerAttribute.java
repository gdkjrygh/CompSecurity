// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.AttributeCertificate;

public class SignerAttribute extends ASN1Object
{

    private Object values[];

    private SignerAttribute(ASN1Sequence asn1sequence)
    {
        values = new Object[asn1sequence.size()];
        asn1sequence = asn1sequence.getObjects();
        int i = 0;
        while (asn1sequence.hasMoreElements()) 
        {
            Object obj = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
            if (((ASN1TaggedObject) (obj)).getTagNo() == 0)
            {
                obj = ASN1Sequence.getInstance(((ASN1TaggedObject) (obj)), true);
                Attribute aattribute[] = new Attribute[((ASN1Sequence) (obj)).size()];
                for (int j = 0; j != aattribute.length; j++)
                {
                    aattribute[j] = Attribute.getInstance(((ASN1Sequence) (obj)).getObjectAt(j));
                }

                values[i] = aattribute;
            } else
            if (((ASN1TaggedObject) (obj)).getTagNo() == 1)
            {
                values[i] = AttributeCertificate.getInstance(ASN1Sequence.getInstance(((ASN1TaggedObject) (obj)), true));
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("illegal tag: ").append(((ASN1TaggedObject) (obj)).getTagNo()).toString());
            }
            i++;
        }
    }

    public SignerAttribute(AttributeCertificate attributecertificate)
    {
        values = new Object[1];
        values[0] = attributecertificate;
    }

    public SignerAttribute(Attribute aattribute[])
    {
        values = new Object[1];
        values[0] = aattribute;
    }

    public static SignerAttribute getInstance(Object obj)
    {
        if (obj instanceof SignerAttribute)
        {
            return (SignerAttribute)obj;
        }
        if (obj != null)
        {
            return new SignerAttribute(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public Object[] getValues()
    {
        return values;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        int i = 0;
        while (i != values.length) 
        {
            if (values[i] instanceof Attribute[])
            {
                asn1encodablevector.add(new DERTaggedObject(0, new DERSequence((Attribute[])(Attribute[])values[i])));
            } else
            {
                asn1encodablevector.add(new DERTaggedObject(1, (AttributeCertificate)values[i]));
            }
            i++;
        }
        return new DERSequence(asn1encodablevector);
    }
}
