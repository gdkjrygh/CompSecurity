// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            Attribute

public class SubjectDirectoryAttributes extends ASN1Object
{

    private Vector attributes;

    public SubjectDirectoryAttributes(Vector vector)
    {
        attributes = new Vector();
        for (vector = vector.elements(); vector.hasMoreElements(); attributes.addElement(vector.nextElement())) { }
    }

    private SubjectDirectoryAttributes(ASN1Sequence asn1sequence)
    {
        attributes = new Vector();
        ASN1Sequence asn1sequence1;
        for (asn1sequence = asn1sequence.getObjects(); asn1sequence.hasMoreElements(); attributes.addElement(Attribute.getInstance(asn1sequence1)))
        {
            asn1sequence1 = ASN1Sequence.getInstance(asn1sequence.nextElement());
        }

    }

    public static SubjectDirectoryAttributes getInstance(Object obj)
    {
        if (obj instanceof SubjectDirectoryAttributes)
        {
            return (SubjectDirectoryAttributes)obj;
        }
        if (obj != null)
        {
            return new SubjectDirectoryAttributes(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public Vector getAttributes()
    {
        return attributes;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (Enumeration enumeration = attributes.elements(); enumeration.hasMoreElements(); asn1encodablevector.add((Attribute)enumeration.nextElement())) { }
        return new DERSequence(asn1encodablevector);
    }
}
