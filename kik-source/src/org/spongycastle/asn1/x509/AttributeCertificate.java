// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;

// Referenced classes of package org.spongycastle.asn1.x509:
//            AttributeCertificateInfo, AlgorithmIdentifier

public class AttributeCertificate extends ASN1Object
{

    AttributeCertificateInfo a;
    AlgorithmIdentifier b;
    DERBitString c;

    private AttributeCertificate(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.e() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad sequence size: ")).append(asn1sequence.e()).toString());
        } else
        {
            a = AttributeCertificateInfo.a(asn1sequence.a(0));
            b = AlgorithmIdentifier.a(asn1sequence.a(1));
            c = DERBitString.a(asn1sequence.a(2));
            return;
        }
    }

    public static AttributeCertificate a(Object obj)
    {
        if (obj instanceof AttributeCertificate)
        {
            return (AttributeCertificate)obj;
        }
        if (obj != null)
        {
            return new AttributeCertificate(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }

    public final AttributeCertificateInfo c()
    {
        return a;
    }
}
