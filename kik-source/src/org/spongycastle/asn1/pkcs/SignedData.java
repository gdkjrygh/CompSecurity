// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PKCSObjectIdentifiers, ContentInfo

public class SignedData extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private ASN1Set bA;
    private ContentInfo bB;
    private ASN1Set bC;
    private ASN1Set bD;
    private ASN1Set bE;
    private ASN1Integer bz;

    public SignedData(ASN1Integer asn1integer, ASN1Set asn1set, ContentInfo contentinfo, ASN1Set asn1set1, ASN1Set asn1set2)
    {
        bz = asn1integer;
        bA = asn1set;
        bB = contentinfo;
        bC = asn1set1;
        bD = null;
        bE = asn1set2;
    }

    public SignedData(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.d();
        bz = (ASN1Integer)asn1sequence.nextElement();
        bA = (ASN1Set)asn1sequence.nextElement();
        bB = ContentInfo.a(asn1sequence.nextElement());
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
                switch (((DERTaggedObject) (obj)).c())
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder("unknown tag value ")).append(((DERTaggedObject) (obj)).c()).toString());

                case 0: // '\0'
                    bC = ASN1Set.a(((org.spongycastle.asn1.ASN1TaggedObject) (obj)));
                    break;

                case 1: // '\001'
                    bD = ASN1Set.a(((org.spongycastle.asn1.ASN1TaggedObject) (obj)));
                    break;
                }
            } else
            {
                bE = (ASN1Set)obj;
            }
        } while (true);
    }

    public static SignedData a(Object obj)
    {
        if (obj instanceof SignedData)
        {
            return (SignedData)obj;
        }
        if (obj != null)
        {
            return new SignedData(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(bz);
        asn1encodablevector.a(bA);
        asn1encodablevector.a(bB);
        if (bC != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, bC));
        }
        if (bD != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, bD));
        }
        asn1encodablevector.a(bE);
        return new BERSequence(asn1encodablevector);
    }

    public final ASN1Set c()
    {
        return bC;
    }

    public final ASN1Set d()
    {
        return bD;
    }
}
