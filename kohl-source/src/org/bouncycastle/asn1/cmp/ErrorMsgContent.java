// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo, PKIFreeText

public class ErrorMsgContent extends ASN1Object
{

    private ASN1Integer errorCode;
    private PKIFreeText errorDetails;
    private PKIStatusInfo pkiStatusInfo;

    private ErrorMsgContent(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        pkiStatusInfo = PKIStatusInfo.getInstance(asn1sequence.nextElement());
        while (asn1sequence.hasMoreElements()) 
        {
            Object obj = asn1sequence.nextElement();
            if (obj instanceof ASN1Integer)
            {
                errorCode = ASN1Integer.getInstance(obj);
            } else
            {
                errorDetails = PKIFreeText.getInstance(obj);
            }
        }
    }

    public ErrorMsgContent(PKIStatusInfo pkistatusinfo)
    {
        this(pkistatusinfo, null, null);
    }

    public ErrorMsgContent(PKIStatusInfo pkistatusinfo, ASN1Integer asn1integer, PKIFreeText pkifreetext)
    {
        if (pkistatusinfo == null)
        {
            throw new IllegalArgumentException("'pkiStatusInfo' cannot be null");
        } else
        {
            pkiStatusInfo = pkistatusinfo;
            errorCode = asn1integer;
            errorDetails = pkifreetext;
            return;
        }
    }

    private void addOptional(ASN1EncodableVector asn1encodablevector, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.add(asn1encodable);
        }
    }

    public static ErrorMsgContent getInstance(Object obj)
    {
        if (obj instanceof ErrorMsgContent)
        {
            return (ErrorMsgContent)obj;
        }
        if (obj != null)
        {
            return new ErrorMsgContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer getErrorCode()
    {
        return errorCode;
    }

    public PKIFreeText getErrorDetails()
    {
        return errorDetails;
    }

    public PKIStatusInfo getPKIStatusInfo()
    {
        return pkiStatusInfo;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(pkiStatusInfo);
        addOptional(asn1encodablevector, errorCode);
        addOptional(asn1encodablevector, errorDetails);
        return new DERSequence(asn1encodablevector);
    }
}
