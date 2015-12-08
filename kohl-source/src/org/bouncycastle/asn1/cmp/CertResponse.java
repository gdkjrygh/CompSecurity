// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo, CertifiedKeyPair

public class CertResponse extends ASN1Object
{

    private ASN1Integer certReqId;
    private CertifiedKeyPair certifiedKeyPair;
    private ASN1OctetString rspInfo;
    private PKIStatusInfo status;

    public CertResponse(ASN1Integer asn1integer, PKIStatusInfo pkistatusinfo)
    {
        this(asn1integer, pkistatusinfo, null, null);
    }

    public CertResponse(ASN1Integer asn1integer, PKIStatusInfo pkistatusinfo, CertifiedKeyPair certifiedkeypair, ASN1OctetString asn1octetstring)
    {
        if (asn1integer == null)
        {
            throw new IllegalArgumentException("'certReqId' cannot be null");
        }
        if (pkistatusinfo == null)
        {
            throw new IllegalArgumentException("'status' cannot be null");
        } else
        {
            certReqId = asn1integer;
            status = pkistatusinfo;
            certifiedKeyPair = certifiedkeypair;
            rspInfo = asn1octetstring;
            return;
        }
    }

    private CertResponse(ASN1Sequence asn1sequence)
    {
label0:
        {
label1:
            {
                super();
                certReqId = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
                status = PKIStatusInfo.getInstance(asn1sequence.getObjectAt(1));
                if (asn1sequence.size() >= 3)
                {
                    if (asn1sequence.size() != 3)
                    {
                        break label0;
                    }
                    asn1sequence = asn1sequence.getObjectAt(2);
                    if (!(asn1sequence instanceof ASN1OctetString))
                    {
                        break label1;
                    }
                    rspInfo = ASN1OctetString.getInstance(asn1sequence);
                }
                return;
            }
            certifiedKeyPair = CertifiedKeyPair.getInstance(asn1sequence);
            return;
        }
        certifiedKeyPair = CertifiedKeyPair.getInstance(asn1sequence.getObjectAt(2));
        rspInfo = ASN1OctetString.getInstance(asn1sequence.getObjectAt(3));
    }

    public static CertResponse getInstance(Object obj)
    {
        if (obj instanceof CertResponse)
        {
            return (CertResponse)obj;
        }
        if (obj != null)
        {
            return new CertResponse(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getCertReqId()
    {
        return certReqId;
    }

    public CertifiedKeyPair getCertifiedKeyPair()
    {
        return certifiedKeyPair;
    }

    public PKIStatusInfo getStatus()
    {
        return status;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certReqId);
        asn1encodablevector.add(status);
        if (certifiedKeyPair != null)
        {
            asn1encodablevector.add(certifiedKeyPair);
        }
        if (rspInfo != null)
        {
            asn1encodablevector.add(rspInfo);
        }
        return new DERSequence(asn1encodablevector);
    }
}
