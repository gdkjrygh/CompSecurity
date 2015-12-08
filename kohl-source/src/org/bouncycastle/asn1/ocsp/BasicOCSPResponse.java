// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.ocsp:
//            ResponseData

public class BasicOCSPResponse extends ASN1Object
{

    private ASN1Sequence certs;
    private DERBitString signature;
    private AlgorithmIdentifier signatureAlgorithm;
    private ResponseData tbsResponseData;

    private BasicOCSPResponse(ASN1Sequence asn1sequence)
    {
        tbsResponseData = ResponseData.getInstance(asn1sequence.getObjectAt(0));
        signatureAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
        signature = (DERBitString)asn1sequence.getObjectAt(2);
        if (asn1sequence.size() > 3)
        {
            certs = ASN1Sequence.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(3), true);
        }
    }

    public BasicOCSPResponse(ResponseData responsedata, AlgorithmIdentifier algorithmidentifier, DERBitString derbitstring, ASN1Sequence asn1sequence)
    {
        tbsResponseData = responsedata;
        signatureAlgorithm = algorithmidentifier;
        signature = derbitstring;
        certs = asn1sequence;
    }

    public static BasicOCSPResponse getInstance(Object obj)
    {
        if (obj instanceof BasicOCSPResponse)
        {
            return (BasicOCSPResponse)obj;
        }
        if (obj != null)
        {
            return new BasicOCSPResponse(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static BasicOCSPResponse getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Sequence getCerts()
    {
        return certs;
    }

    public DERBitString getSignature()
    {
        return signature;
    }

    public AlgorithmIdentifier getSignatureAlgorithm()
    {
        return signatureAlgorithm;
    }

    public ResponseData getTbsResponseData()
    {
        return tbsResponseData;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(tbsResponseData);
        asn1encodablevector.add(signatureAlgorithm);
        asn1encodablevector.add(signature);
        if (certs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, certs));
        }
        return new DERSequence(asn1encodablevector);
    }
}
