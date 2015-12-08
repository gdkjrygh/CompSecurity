// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
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
//            CertID, CertStatus

public class SingleResponse extends ASN1Object
{

    private CertID certID;
    private CertStatus certStatus;
    private DERGeneralizedTime nextUpdate;
    private Extensions singleExtensions;
    private DERGeneralizedTime thisUpdate;

    private SingleResponse(ASN1Sequence asn1sequence)
    {
        certID = CertID.getInstance(asn1sequence.getObjectAt(0));
        certStatus = CertStatus.getInstance(asn1sequence.getObjectAt(1));
        thisUpdate = (DERGeneralizedTime)asn1sequence.getObjectAt(2);
        if (asn1sequence.size() > 4)
        {
            nextUpdate = DERGeneralizedTime.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(3), true);
            singleExtensions = Extensions.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(4), true);
        } else
        if (asn1sequence.size() > 3)
        {
            asn1sequence = (ASN1TaggedObject)asn1sequence.getObjectAt(3);
            if (asn1sequence.getTagNo() == 0)
            {
                nextUpdate = DERGeneralizedTime.getInstance(asn1sequence, true);
                return;
            } else
            {
                singleExtensions = Extensions.getInstance(asn1sequence, true);
                return;
            }
        }
    }

    public SingleResponse(CertID certid, CertStatus certstatus, DERGeneralizedTime dergeneralizedtime, DERGeneralizedTime dergeneralizedtime1, Extensions extensions)
    {
        certID = certid;
        certStatus = certstatus;
        thisUpdate = dergeneralizedtime;
        nextUpdate = dergeneralizedtime1;
        singleExtensions = extensions;
    }

    public SingleResponse(CertID certid, CertStatus certstatus, DERGeneralizedTime dergeneralizedtime, DERGeneralizedTime dergeneralizedtime1, X509Extensions x509extensions)
    {
        this(certid, certstatus, dergeneralizedtime, dergeneralizedtime1, Extensions.getInstance(x509extensions));
    }

    public static SingleResponse getInstance(Object obj)
    {
        if (obj instanceof SingleResponse)
        {
            return (SingleResponse)obj;
        }
        if (obj != null)
        {
            return new SingleResponse(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static SingleResponse getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public CertID getCertID()
    {
        return certID;
    }

    public CertStatus getCertStatus()
    {
        return certStatus;
    }

    public DERGeneralizedTime getNextUpdate()
    {
        return nextUpdate;
    }

    public Extensions getSingleExtensions()
    {
        return singleExtensions;
    }

    public DERGeneralizedTime getThisUpdate()
    {
        return thisUpdate;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(certID);
        asn1encodablevector.add(certStatus);
        asn1encodablevector.add(thisUpdate);
        if (nextUpdate != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, nextUpdate));
        }
        if (singleExtensions != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 1, singleExtensions));
        }
        return new DERSequence(asn1encodablevector);
    }
}
