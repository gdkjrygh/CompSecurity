// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OriginatorInfo, EncryptedContentInfo, RecipientInfo

public class EnvelopedData extends ASN1Object
{

    private EncryptedContentInfo encryptedContentInfo;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unprotectedAttrs;
    private ASN1Integer version;

    public EnvelopedData(ASN1Sequence asn1sequence)
    {
        version = (ASN1Integer)asn1sequence.getObjectAt(0);
        org.bouncycastle.asn1.ASN1Encodable asn1encodable = asn1sequence.getObjectAt(1);
        byte byte0;
        int i;
        if (asn1encodable instanceof ASN1TaggedObject)
        {
            originatorInfo = OriginatorInfo.getInstance((ASN1TaggedObject)asn1encodable, false);
            byte0 = 3;
            asn1encodable = asn1sequence.getObjectAt(2);
        } else
        {
            byte0 = 2;
        }
        recipientInfos = ASN1Set.getInstance(asn1encodable);
        i = byte0 + 1;
        encryptedContentInfo = EncryptedContentInfo.getInstance(asn1sequence.getObjectAt(byte0));
        if (asn1sequence.size() > i)
        {
            unprotectedAttrs = ASN1Set.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(i), false);
        }
    }

    public EnvelopedData(OriginatorInfo originatorinfo, ASN1Set asn1set, EncryptedContentInfo encryptedcontentinfo, ASN1Set asn1set1)
    {
        version = new ASN1Integer(calculateVersion(originatorinfo, asn1set, asn1set1));
        originatorInfo = originatorinfo;
        recipientInfos = asn1set;
        encryptedContentInfo = encryptedcontentinfo;
        unprotectedAttrs = asn1set1;
    }

    public static int calculateVersion(OriginatorInfo originatorinfo, ASN1Set asn1set, ASN1Set asn1set1)
    {
        if (originatorinfo != null || asn1set1 != null)
        {
            return 2;
        }
        for (originatorinfo = asn1set.getObjects(); originatorinfo.hasMoreElements();)
        {
            if (RecipientInfo.getInstance(originatorinfo.nextElement()).getVersion().getValue().intValue() != 0)
            {
                return 2;
            }
        }

        return 0;
    }

    public static EnvelopedData getInstance(Object obj)
    {
        if (obj instanceof EnvelopedData)
        {
            return (EnvelopedData)obj;
        }
        if (obj != null)
        {
            return new EnvelopedData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static EnvelopedData getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public EncryptedContentInfo getEncryptedContentInfo()
    {
        return encryptedContentInfo;
    }

    public OriginatorInfo getOriginatorInfo()
    {
        return originatorInfo;
    }

    public ASN1Set getRecipientInfos()
    {
        return recipientInfos;
    }

    public ASN1Set getUnprotectedAttrs()
    {
        return unprotectedAttrs;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        if (originatorInfo != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, originatorInfo));
        }
        asn1encodablevector.add(recipientInfos);
        asn1encodablevector.add(encryptedContentInfo);
        if (unprotectedAttrs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, unprotectedAttrs));
        }
        return new BERSequence(asn1encodablevector);
    }
}
