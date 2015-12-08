// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cms:
//            ContentInfo, CMSObjectIdentifiers, SignerInfo

public class SignedData extends ASN1Object
{

    private ASN1Set certificates;
    private boolean certsBer;
    private ContentInfo contentInfo;
    private ASN1Set crls;
    private boolean crlsBer;
    private ASN1Set digestAlgorithms;
    private ASN1Set signerInfos;
    private ASN1Integer version;

    private SignedData(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        version = ASN1Integer.getInstance(asn1sequence.nextElement());
        digestAlgorithms = (ASN1Set)asn1sequence.nextElement();
        contentInfo = ContentInfo.getInstance(asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            Object obj = (ASN1Primitive)asn1sequence.nextElement();
            if (obj instanceof ASN1TaggedObject)
            {
                obj = (ASN1TaggedObject)obj;
                switch (((ASN1TaggedObject) (obj)).getTagNo())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("unknown tag value ").append(((ASN1TaggedObject) (obj)).getTagNo()).toString());

                case 0: // '\0'
                    certsBer = obj instanceof BERTaggedObject;
                    certificates = ASN1Set.getInstance(((ASN1TaggedObject) (obj)), false);
                    break;

                case 1: // '\001'
                    crlsBer = obj instanceof BERTaggedObject;
                    crls = ASN1Set.getInstance(((ASN1TaggedObject) (obj)), false);
                    break;
                }
            } else
            {
                signerInfos = (ASN1Set)obj;
            }
        } while (true);
    }

    public SignedData(ASN1Set asn1set, ContentInfo contentinfo, ASN1Set asn1set1, ASN1Set asn1set2, ASN1Set asn1set3)
    {
        version = calculateVersion(contentinfo.getContentType(), asn1set1, asn1set2, asn1set3);
        digestAlgorithms = asn1set;
        contentInfo = contentinfo;
        certificates = asn1set1;
        crls = asn1set2;
        signerInfos = asn1set3;
        crlsBer = asn1set2 instanceof BERSet;
        certsBer = asn1set1 instanceof BERSet;
    }

    private ASN1Integer calculateVersion(ASN1ObjectIdentifier asn1objectidentifier, ASN1Set asn1set, ASN1Set asn1set1, ASN1Set asn1set2)
    {
        boolean flag9 = false;
        boolean flag8 = false;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (asn1set != null)
        {
            asn1set = asn1set.getObjects();
            boolean flag4 = false;
            boolean flag2 = false;
            boolean flag = false;
            do
            {
                flag6 = flag4;
                flag5 = flag2;
                flag7 = flag;
                if (!asn1set.hasMoreElements())
                {
                    break;
                }
                Object obj = asn1set.nextElement();
                if (obj instanceof ASN1TaggedObject)
                {
                    obj = ASN1TaggedObject.getInstance(obj);
                    if (((ASN1TaggedObject) (obj)).getTagNo() == 1)
                    {
                        flag2 = true;
                    } else
                    if (((ASN1TaggedObject) (obj)).getTagNo() == 2)
                    {
                        flag4 = true;
                    } else
                    if (((ASN1TaggedObject) (obj)).getTagNo() == 3)
                    {
                        flag = true;
                    }
                }
            } while (true);
        } else
        {
            flag6 = false;
            flag5 = false;
            flag7 = false;
        }
        if (flag7)
        {
            return new ASN1Integer(5);
        }
        boolean flag3 = flag9;
        if (asn1set1 != null)
        {
            asn1set = asn1set1.getObjects();
            boolean flag1 = flag8;
            do
            {
                flag3 = flag1;
                if (!asn1set.hasMoreElements())
                {
                    break;
                }
                if (asn1set.nextElement() instanceof ASN1TaggedObject)
                {
                    flag1 = true;
                }
            } while (true);
        }
        if (flag3)
        {
            return new ASN1Integer(5);
        }
        if (flag6)
        {
            return new ASN1Integer(4);
        }
        if (flag5)
        {
            return new ASN1Integer(3);
        }
        if (checkForVersion3(asn1set2))
        {
            return new ASN1Integer(3);
        }
        if (!CMSObjectIdentifiers.data.equals(asn1objectidentifier))
        {
            return new ASN1Integer(3);
        } else
        {
            return new ASN1Integer(1);
        }
    }

    private boolean checkForVersion3(ASN1Set asn1set)
    {
        for (asn1set = asn1set.getObjects(); asn1set.hasMoreElements();)
        {
            if (SignerInfo.getInstance(asn1set.nextElement()).getVersion().getValue().intValue() == 3)
            {
                return true;
            }
        }

        return false;
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

    public ASN1Set getDigestAlgorithms()
    {
        return digestAlgorithms;
    }

    public ContentInfo getEncapContentInfo()
    {
        return contentInfo;
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
            if (certsBer)
            {
                asn1encodablevector.add(new BERTaggedObject(false, 0, certificates));
            } else
            {
                asn1encodablevector.add(new DERTaggedObject(false, 0, certificates));
            }
        }
        if (crls != null)
        {
            if (crlsBer)
            {
                asn1encodablevector.add(new BERTaggedObject(false, 1, crls));
            } else
            {
                asn1encodablevector.add(new DERTaggedObject(false, 1, crls));
            }
        }
        asn1encodablevector.add(signerInfos);
        return new BERSequence(asn1encodablevector);
    }
}
