// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            CrlListID, OcspListID, OtherRevRefs

public class CrlOcspRef extends ASN1Object
{

    private CrlListID crlids;
    private OcspListID ocspids;
    private OtherRevRefs otherRev;

    private CrlOcspRef(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            DERTaggedObject dertaggedobject = (DERTaggedObject)asn1sequence.nextElement();
            switch (dertaggedobject.getTagNo())
            {
            default:
                throw new IllegalArgumentException("illegal tag");

            case 0: // '\0'
                crlids = CrlListID.getInstance(dertaggedobject.getObject());
                break;

            case 1: // '\001'
                ocspids = OcspListID.getInstance(dertaggedobject.getObject());
                break;

            case 2: // '\002'
                otherRev = OtherRevRefs.getInstance(dertaggedobject.getObject());
                break;
            }
        } while (true);
    }

    public CrlOcspRef(CrlListID crllistid, OcspListID ocsplistid, OtherRevRefs otherrevrefs)
    {
        crlids = crllistid;
        ocspids = ocsplistid;
        otherRev = otherrevrefs;
    }

    public static CrlOcspRef getInstance(Object obj)
    {
        if (obj instanceof CrlOcspRef)
        {
            return (CrlOcspRef)obj;
        }
        if (obj != null)
        {
            return new CrlOcspRef(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CrlListID getCrlids()
    {
        return crlids;
    }

    public OcspListID getOcspids()
    {
        return ocspids;
    }

    public OtherRevRefs getOtherRev()
    {
        return otherRev;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (crlids != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, crlids.toASN1Primitive()));
        }
        if (ocspids != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, ocspids.toASN1Primitive()));
        }
        if (otherRev != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, otherRev.toASN1Primitive()));
        }
        return new DERSequence(asn1encodablevector);
    }
}
