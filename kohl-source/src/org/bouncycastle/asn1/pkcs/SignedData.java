// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, ContentInfo

public class SignedData extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private ASN1Set certificates;
    private ContentInfo contentInfo;
    private ASN1Set crls;
    private ASN1Set digestAlgorithms;
    private ASN1Set signerInfos;
    private ASN1Integer version;

    public SignedData(ASN1Integer asn1integer, ASN1Set asn1set, ContentInfo contentinfo, ASN1Set asn1set1, ASN1Set asn1set2, ASN1Set asn1set3)
    {
        version = asn1integer;
        digestAlgorithms = asn1set;
        contentInfo = contentinfo;
        certificates = asn1set1;
        crls = asn1set2;
        signerInfos = asn1set3;
    }

    public SignedData(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        version = (ASN1Integer)asn1sequence.nextElement();
        digestAlgorithms = (ASN1Set)asn1sequence.nextElement();
        contentInfo = ContentInfo.getInstance(asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            Object obj = (ASN1Primitive)asn1sequence.nextElement();
            if (obj instanceof DERTaggedObject)
            {
                obj = (DERTaggedObject)obj;
                switch (((DERTaggedObject) (obj)).getTagNo())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("unknown tag value ").append(((DERTaggedObject) (obj)).getTagNo()).toString());

                case 0: // '\0'
                    certificates = ASN1Set.getInstance(((org.bouncycastle.asn1.ASN1TaggedObject) (obj)), false);
                    break;

                case 1: // '\001'
                    crls = ASN1Set.getInstance(((org.bouncycastle.asn1.ASN1TaggedObject) (obj)), false);
                    break;
                }
            } else
            {
                signerInfos = (ASN1Set)obj;
            }
        } while (true);
    }

    public static SignedData getInstance(Object obj)
    {
        if (obj instanceof SignedData)
        {
            return (SignedData)obj;
        }
        if (obj != null)
        {
            return new SignedData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Set getCRLs()
    {
        return crls;
    }

    public ASN1Set getCertificates()
    {
        return certificates;
    }

    public ContentInfo getContentInfo()
    {
        return contentInfo;
    }

    public ASN1Set getDigestAlgorithms()
    {
        return digestAlgorithms;
    }

    public ASN1Set getSignerInfos()
    {
        return signerInfos;
    }

    public ASN1Integer getVersion()
    {
        return version;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(version);
        asn1encodablevector.add(digestAlgorithms);
        asn1encodablevector.add(contentInfo);
        if (certificates != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, certificates));
        }
        if (crls != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, crls));
        }
        asn1encodablevector.add(signerInfos);
        return new BERSequence(asn1encodablevector);
    }
}
