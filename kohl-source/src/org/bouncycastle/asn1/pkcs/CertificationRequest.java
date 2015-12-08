// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            CertificationRequestInfo

public class CertificationRequest extends ASN1Object
{

    protected CertificationRequestInfo reqInfo;
    protected AlgorithmIdentifier sigAlgId;
    protected DERBitString sigBits;

    protected CertificationRequest()
    {
        reqInfo = null;
        sigAlgId = null;
        sigBits = null;
    }

    public CertificationRequest(ASN1Sequence asn1sequence)
    {
        reqInfo = null;
        sigAlgId = null;
        sigBits = null;
        reqInfo = CertificationRequestInfo.getInstance(asn1sequence.getObjectAt(0));
        sigAlgId = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
        sigBits = (DERBitString)asn1sequence.getObjectAt(2);
    }

    public CertificationRequest(CertificationRequestInfo certificationrequestinfo, AlgorithmIdentifier algorithmidentifier, DERBitString derbitstring)
    {
        reqInfo = null;
        sigAlgId = null;
        sigBits = null;
        reqInfo = certificationrequestinfo;
        sigAlgId = algorithmidentifier;
        sigBits = derbitstring;
    }

    public static CertificationRequest getInstance(Object obj)
    {
        if (obj instanceof CertificationRequest)
        {
            return (CertificationRequest)obj;
        }
        if (obj != null)
        {
            return new CertificationRequest(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public CertificationRequestInfo getCertificationRequestInfo()
    {
        return reqInfo;
    }

    public DERBitString getSignature()
    {
        return sigBits;
    }

    public AlgorithmIdentifier getSignatureAlgorithm()
    {
        return sigAlgId;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(reqInfo);
        asn1encodablevector.add(sigAlgId);
        asn1encodablevector.add(sigBits);
        return new DERSequence(asn1encodablevector);
    }
}
