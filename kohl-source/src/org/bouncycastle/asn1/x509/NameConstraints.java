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
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralSubtree

public class NameConstraints extends ASN1Object
{

    private ASN1Sequence excluded;
    private ASN1Sequence permitted;

    public NameConstraints(Vector vector, Vector vector1)
    {
        if (vector != null)
        {
            permitted = createSequence(vector);
        }
        if (vector1 != null)
        {
            excluded = createSequence(vector1);
        }
    }

    private NameConstraints(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
            switch (asn1taggedobject.getTagNo())
            {
            case 0: // '\0'
                permitted = ASN1Sequence.getInstance(asn1taggedobject, false);
                break;

            case 1: // '\001'
                excluded = ASN1Sequence.getInstance(asn1taggedobject, false);
                break;
            }
        } while (true);
    }

    private DERSequence createSequence(Vector vector)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (vector = vector.elements(); vector.hasMoreElements(); asn1encodablevector.add((GeneralSubtree)vector.nextElement())) { }
        return new DERSequence(asn1encodablevector);
    }

    public static NameConstraints getInstance(Object obj)
    {
        if (obj instanceof NameConstraints)
        {
            return (NameConstraints)obj;
        }
        if (obj != null)
        {
            return new NameConstraints(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Sequence getExcludedSubtrees()
    {
        return excluded;
    }

    public ASN1Sequence getPermittedSubtrees()
    {
        return permitted;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (permitted != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, permitted));
        }
        if (excluded != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, excluded));
        }
        return new DERSequence(asn1encodablevector);
    }
}
