// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIHeader, PKIBody, CMPCertificate

public class PKIMessage extends ASN1Object
{

    private PKIBody body;
    private ASN1Sequence extraCerts;
    private PKIHeader header;
    private DERBitString protection;

    private PKIMessage(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        header = PKIHeader.getInstance(asn1sequence.nextElement());
        body = PKIBody.getInstance(asn1sequence.nextElement());
        while (asn1sequence.hasMoreElements()) 
        {
            ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.nextElement();
            if (asn1taggedobject.getTagNo() == 0)
            {
                protection = DERBitString.getInstance(asn1taggedobject, true);
            } else
            {
                extraCerts = ASN1Sequence.getInstance(asn1taggedobject, true);
            }
        }
    }

    public PKIMessage(PKIHeader pkiheader, PKIBody pkibody)
    {
        this(pkiheader, pkibody, null, null);
    }

    public PKIMessage(PKIHeader pkiheader, PKIBody pkibody, DERBitString derbitstring)
    {
        this(pkiheader, pkibody, derbitstring, null);
    }

    public PKIMessage(PKIHeader pkiheader, PKIBody pkibody, DERBitString derbitstring, CMPCertificate acmpcertificate[])
    {
        header = pkiheader;
        body = pkibody;
        protection = derbitstring;
        if (acmpcertificate != null)
        {
            pkiheader = new ASN1EncodableVector();
            for (int i = 0; i < acmpcertificate.length; i++)
            {
                pkiheader.add(acmpcertificate[i]);
            }

            extraCerts = new DERSequence(pkiheader);
        }
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public static PKIMessage getInstance(Object obj)
    {
        if (obj instanceof PKIMessage)
        {
            return (PKIMessage)obj;
        }
        if (obj != null)
        {
            return new PKIMessage(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public PKIBody getBody()
    {
        return body;
    }

    public CMPCertificate[] getExtraCerts()
    {
        if (extraCerts == null)
        {
            return null;
        }
        CMPCertificate acmpcertificate[] = new CMPCertificate[extraCerts.size()];
        for (int i = 0; i < acmpcertificate.length; i++)
        {
            acmpcertificate[i] = CMPCertificate.getInstance(extraCerts.getObjectAt(i));
        }

        return acmpcertificate;
    }

    public PKIHeader getHeader()
    {
        return header;
    }

    public DERBitString getProtection()
    {
        return protection;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(header);
        asn1encodablevector.add(body);
        addOptional(asn1encodablevector, 0, protection);
        addOptional(asn1encodablevector, 1, extraCerts);
        return new DERSequence(asn1encodablevector);
    }
}
