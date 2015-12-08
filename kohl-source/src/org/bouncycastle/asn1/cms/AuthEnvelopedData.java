// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            OriginatorInfo, EncryptedContentInfo

public class AuthEnvelopedData extends ASN1Object
{

    private ASN1Set authAttrs;
    private EncryptedContentInfo authEncryptedContentInfo;
    private ASN1OctetString mac;
    private OriginatorInfo originatorInfo;
    private ASN1Set recipientInfos;
    private ASN1Set unauthAttrs;
    private ASN1Integer version;

    public AuthEnvelopedData(ASN1Sequence asn1sequence)
    {
        version = (ASN1Integer)asn1sequence.getObjectAt(0).toASN1Primitive();
        ASN1Primitive asn1primitive = asn1sequence.getObjectAt(1).toASN1Primitive();
        int i;
        int j;
        if (asn1primitive instanceof ASN1TaggedObject)
        {
            originatorInfo = OriginatorInfo.getInstance((ASN1TaggedObject)asn1primitive, false);
            i = 3;
            asn1primitive = asn1sequence.getObjectAt(2).toASN1Primitive();
        } else
        {
            i = 2;
        }
        recipientInfos = ASN1Set.getInstance(asn1primitive);
        j = i + 1;
        authEncryptedContentInfo = EncryptedContentInfo.getInstance(asn1sequence.getObjectAt(i).toASN1Primitive());
        i = j + 1;
        asn1primitive = asn1sequence.getObjectAt(j).toASN1Primitive();
        if (asn1primitive instanceof ASN1TaggedObject)
        {
            authAttrs = ASN1Set.getInstance((ASN1TaggedObject)asn1primitive, false);
            int k = i + 1;
            asn1primitive = asn1sequence.getObjectAt(i).toASN1Primitive();
            i = k;
        }
        mac = ASN1OctetString.getInstance(asn1primitive);
        if (asn1sequence.size() > i)
        {
            unauthAttrs = ASN1Set.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(i).toASN1Primitive(), false);
        }
    }

    public AuthEnvelopedData(OriginatorInfo originatorinfo, ASN1Set asn1set, EncryptedContentInfo encryptedcontentinfo, ASN1Set asn1set1, ASN1OctetString asn1octetstring, ASN1Set asn1set2)
    {
        version = new ASN1Integer(0);
        originatorInfo = originatorinfo;
        recipientInfos = asn1set;
        authEncryptedContentInfo = encryptedcontentinfo;
        authAttrs = asn1set1;
        mac = asn1octetstring;
        unauthAttrs = asn1set2;
    }

    public static AuthEnvelopedData getInstance(Object obj)
    {
        if (obj == null || (obj instanceof AuthEnvelopedData))
        {
            return (AuthEnvelopedData)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new AuthEnvelopedData((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid AuthEnvelopedData: ").append(obj.getClass().getName()).toString());
        }
    }

    public static AuthEnvelopedData getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Set getAuthAttrs()
    {
        return authAttrs;
    }

    public EncryptedContentInfo getAuthEncryptedContentInfo()
    {
        return authEncryptedContentInfo;
    }

    public ASN1OctetString getMac()
    {
        return mac;
    }

    public OriginatorInfo getOriginatorInfo()
    {
        return originatorInfo;
    }

    public ASN1Set getRecipientInfos()
    {
        return recipientInfos;
    }

    public ASN1Set getUnauthAttrs()
    {
        return unauthAttrs;
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
        asn1encodablevector.add(authEncryptedContentInfo);
        if (authAttrs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, authAttrs));
        }
        asn1encodablevector.add(mac);
        if (unauthAttrs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 2, unauthAttrs));
        }
        return new BERSequence(asn1encodablevector);
    }
}
