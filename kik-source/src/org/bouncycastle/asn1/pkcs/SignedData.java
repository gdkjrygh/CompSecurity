// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, ContentInfo

public class SignedData extends ASN1Encodable
    implements PKCSObjectIdentifiers
{

    private ContentInfo bA;
    private ASN1Set bB;
    private ASN1Set bC;
    private ASN1Set bD;
    private DERInteger by;
    private ASN1Set bz;

    public SignedData(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.e();
        by = (DERInteger)asn1sequence.nextElement();
        bz = (ASN1Set)asn1sequence.nextElement();
        bA = ContentInfo.a(asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            Object obj = (DERObject)asn1sequence.nextElement();
            if (obj instanceof DERTaggedObject)
            {
                obj = (DERTaggedObject)obj;
                switch (((DERTaggedObject) (obj)).e())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder("unknown tag value ")).append(((DERTaggedObject) (obj)).e()).toString());

                case 0: // '\0'
                    bB = ASN1Set.a(((org.bouncycastle.asn1.ASN1TaggedObject) (obj)));
                    break;

                case 1: // '\001'
                    bC = ASN1Set.a(((org.bouncycastle.asn1.ASN1TaggedObject) (obj)));
                    break;
                }
            } else
            {
                bD = (ASN1Set)obj;
            }
        } while (true);
    }

    public SignedData(DERInteger derinteger, ASN1Set asn1set, ContentInfo contentinfo, ASN1Set asn1set1, ASN1Set asn1set2)
    {
        by = derinteger;
        bz = asn1set;
        bA = contentinfo;
        bB = asn1set1;
        bC = null;
        bD = asn1set2;
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(by);
        asn1encodablevector.a(bz);
        asn1encodablevector.a(bA);
        if (bB != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, bB));
        }
        if (bC != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, bC));
        }
        asn1encodablevector.a(bD);
        return new BERSequence(asn1encodablevector);
    }

    public final ASN1Set e()
    {
        return bB;
    }

    public final ASN1Set f()
    {
        return bC;
    }
}
