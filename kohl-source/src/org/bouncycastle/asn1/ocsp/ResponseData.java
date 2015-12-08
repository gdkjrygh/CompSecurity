// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.X509Extensions;

// Referenced classes of package org.bouncycastle.asn1.ocsp:
//            ResponderID

public class ResponseData extends ASN1Object
{

    private static final ASN1Integer V1 = new ASN1Integer(0);
    private DERGeneralizedTime producedAt;
    private ResponderID responderID;
    private Extensions responseExtensions;
    private ASN1Sequence responses;
    private ASN1Integer version;
    private boolean versionPresent;

    public ResponseData(ASN1Integer asn1integer, ResponderID responderid, DERGeneralizedTime dergeneralizedtime, ASN1Sequence asn1sequence, Extensions extensions)
    {
        version = asn1integer;
        responderID = responderid;
        producedAt = dergeneralizedtime;
        responses = asn1sequence;
        responseExtensions = extensions;
    }

    private ResponseData(ASN1Sequence asn1sequence)
    {
        if (!(asn1sequence.getObjectAt(0) instanceof ASN1TaggedObject)) goto _L2; else goto _L1
_L1:
        if (((ASN1TaggedObject)asn1sequence.getObjectAt(0)).getTagNo() != 0) goto _L4; else goto _L3
_L3:
        int i;
        versionPresent = true;
        version = ASN1Integer.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(0), true);
        i = 1;
_L5:
        int j = i + 1;
        responderID = ResponderID.getInstance(asn1sequence.getObjectAt(i));
        i = j + 1;
        producedAt = (DERGeneralizedTime)asn1sequence.getObjectAt(j);
        j = i + 1;
        responses = (ASN1Sequence)asn1sequence.getObjectAt(i);
        if (asn1sequence.size() > j)
        {
            responseExtensions = Extensions.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(j), true);
        }
        return;
_L4:
        version = V1;
_L6:
        i = 0;
        if (true) goto _L5; else goto _L2
_L2:
        version = V1;
          goto _L6
    }

    public ResponseData(ResponderID responderid, DERGeneralizedTime dergeneralizedtime, ASN1Sequence asn1sequence, Extensions extensions)
    {
        this(V1, responderid, dergeneralizedtime, asn1sequence, extensions);
    }

    public ResponseData(ResponderID responderid, DERGeneralizedTime dergeneralizedtime, ASN1Sequence asn1sequence, X509Extensions x509extensions)
    {
        this(V1, responderid, dergeneralizedtime, asn1sequence, Extensions.getInstance(x509extensions));
    }

    public static ResponseData getInstance(Object obj)
    {
        if (obj instanceof ResponseData)
        {
            return (ResponseData)obj;
        }
        if (obj != null)
        {
            return new ResponseData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static ResponseData getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public DERGeneralizedTime getProducedAt()
    {
        return producedAt;
    }

    public ResponderID getResponderID()
    {
        return responderID;
    }

    public Extensions getResponseExtensions()
    {
        return responseExtensions;
    }

    public ASN1Sequence getResponses()
    {
        return responses;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (versionPresent || !version.equals(V1))
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, version));
        }
        asn1encodablevector.add(responderID);
        asn1encodablevector.add(producedAt);
        asn1encodablevector.add(responses);
        if (responseExtensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, responseExtensions));
        }
        return new DERSequence(asn1encodablevector);
    }

}
