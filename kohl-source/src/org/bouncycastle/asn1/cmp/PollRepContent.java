// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIFreeText

public class PollRepContent extends ASN1Object
{

    private ASN1Integer certReqId;
    private ASN1Integer checkAfter;
    private PKIFreeText reason;

    private PollRepContent(ASN1Sequence asn1sequence)
    {
        certReqId = ASN1Integer.getInstance(asn1sequence.getObjectAt(0));
        checkAfter = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() > 2)
        {
            reason = PKIFreeText.getInstance(asn1sequence.getObjectAt(2));
        }
    }

    public static PollRepContent getInstance(Object obj)
    {
        if (obj instanceof PollRepContent)
        {
            return (PollRepContent)obj;
        }
        if (obj != null)
        {
            return new PollRepContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getCertReqId()
    {
        return certReqId;
    }

    public ASN1Integer getCheckAfter()
    {
        return checkAfter;
    }

    public PKIFreeText getReason()
    {
        return reason;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certReqId);
        asn1encodablevector.add(checkAfter);
        if (reason != null)
        {
            asn1encodablevector.add(reason);
        }
        return new DERSequence(asn1encodablevector);
    }
}
