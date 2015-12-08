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
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.x509.CertificateList;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            OtherRevVals

public class RevocationValues extends ASN1Object
{

    private ASN1Sequence crlVals;
    private ASN1Sequence ocspVals;
    private OtherRevVals otherRevVals;

    private RevocationValues(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        asn1sequence = asn1sequence.getObjects();
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            Object obj = (DERTaggedObject)asn1sequence.nextElement();
            switch (((DERTaggedObject) (obj)).getTagNo())
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("invalid tag: ").append(((DERTaggedObject) (obj)).getTagNo()).toString());

            case 0: // '\0'
                obj = (ASN1Sequence)((DERTaggedObject) (obj)).getObject();
                for (Enumeration enumeration = ((ASN1Sequence) (obj)).getObjects(); enumeration.hasMoreElements(); CertificateList.getInstance(enumeration.nextElement())) { }
                crlVals = ((ASN1Sequence) (obj));
                break;

            case 1: // '\001'
                obj = (ASN1Sequence)((DERTaggedObject) (obj)).getObject();
                for (Enumeration enumeration1 = ((ASN1Sequence) (obj)).getObjects(); enumeration1.hasMoreElements(); BasicOCSPResponse.getInstance(enumeration1.nextElement())) { }
                ocspVals = ((ASN1Sequence) (obj));
                break;

            case 2: // '\002'
                otherRevVals = OtherRevVals.getInstance(((DERTaggedObject) (obj)).getObject());
                break;
            }
        } while (true);
    }

    public RevocationValues(CertificateList acertificatelist[], BasicOCSPResponse abasicocspresponse[], OtherRevVals otherrevvals)
    {
        if (acertificatelist != null)
        {
            crlVals = new DERSequence(acertificatelist);
        }
        if (abasicocspresponse != null)
        {
            ocspVals = new DERSequence(abasicocspresponse);
        }
        otherRevVals = otherrevvals;
    }

    public static RevocationValues getInstance(Object obj)
    {
        if (obj instanceof RevocationValues)
        {
            return (RevocationValues)obj;
        }
        if (obj != null)
        {
            return new RevocationValues(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertificateList[] getCrlVals()
    {
        int i = 0;
        if (crlVals == null)
        {
            return new CertificateList[0];
        }
        CertificateList acertificatelist[];
        for (acertificatelist = new CertificateList[crlVals.size()]; i < acertificatelist.length; i++)
        {
            acertificatelist[i] = CertificateList.getInstance(crlVals.getObjectAt(i));
        }

        return acertificatelist;
    }

    public BasicOCSPResponse[] getOcspVals()
    {
        int i = 0;
        if (ocspVals == null)
        {
            return new BasicOCSPResponse[0];
        }
        BasicOCSPResponse abasicocspresponse[];
        for (abasicocspresponse = new BasicOCSPResponse[ocspVals.size()]; i < abasicocspresponse.length; i++)
        {
            abasicocspresponse[i] = BasicOCSPResponse.getInstance(ocspVals.getObjectAt(i));
        }

        return abasicocspresponse;
    }

    public OtherRevVals getOtherRevVals()
    {
        return otherRevVals;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (crlVals != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, crlVals));
        }
        if (ocspVals != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, ocspVals));
        }
        if (otherRevVals != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, otherRevVals.toASN1Primitive()));
        }
        return new DERSequence(asn1encodablevector);
    }
}
