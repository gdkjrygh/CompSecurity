// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.BERSequence;
import org.spongycastle.asn1.BERTaggedObject;
import org.spongycastle.asn1.DLSequence;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            PKCSObjectIdentifiers

public class ContentInfo extends ASN1Object
    implements PKCSObjectIdentifiers
{

    private ASN1Encodable bA;
    private boolean bB;
    private ASN1ObjectIdentifier bz;

    public ContentInfo(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        bB = true;
        bz = asn1objectidentifier;
        bA = asn1encodable;
    }

    private ContentInfo(ASN1Sequence asn1sequence)
    {
        bB = true;
        Enumeration enumeration = asn1sequence.d();
        bz = (ASN1ObjectIdentifier)enumeration.nextElement();
        if (enumeration.hasMoreElements())
        {
            bA = ((ASN1TaggedObject)enumeration.nextElement()).k();
        }
        bB = asn1sequence instanceof BERSequence;
    }

    public static ContentInfo a(Object obj)
    {
        if (obj instanceof ContentInfo)
        {
            return (ContentInfo)obj;
        }
        if (obj != null)
        {
            return new ContentInfo(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(bz);
        if (bA != null)
        {
            asn1encodablevector.a(new BERTaggedObject(true, 0, bA));
        }
        if (bB)
        {
            return new BERSequence(asn1encodablevector);
        } else
        {
            return new DLSequence(asn1encodablevector);
        }
    }

    public final ASN1ObjectIdentifier c()
    {
        return bz;
    }

    public final ASN1Encodable d()
    {
        return bA;
    }
}
