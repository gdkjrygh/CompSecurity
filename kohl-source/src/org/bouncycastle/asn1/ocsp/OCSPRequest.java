// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.ocsp:
//            TBSRequest, Signature

public class OCSPRequest extends ASN1Object
{

    Signature optionalSignature;
    TBSRequest tbsRequest;

    private OCSPRequest(ASN1Sequence asn1sequence)
    {
        tbsRequest = TBSRequest.getInstance(asn1sequence.getObjectAt(0));
        if (asn1sequence.size() == 2)
        {
            optionalSignature = Signature.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(1), true);
        }
    }

    public OCSPRequest(TBSRequest tbsrequest, Signature signature)
    {
        tbsRequest = tbsrequest;
        optionalSignature = signature;
    }

    public static OCSPRequest getInstance(Object obj)
    {
        if (obj instanceof OCSPRequest)
        {
            return (OCSPRequest)obj;
        }
        if (obj != null)
        {
            return new OCSPRequest(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static OCSPRequest getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public Signature getOptionalSignature()
    {
        return optionalSignature;
    }

    public TBSRequest getTbsRequest()
    {
        return tbsRequest;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(tbsRequest);
        if (optionalSignature != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, optionalSignature));
        }
        return new DERSequence(asn1encodablevector);
    }
}
