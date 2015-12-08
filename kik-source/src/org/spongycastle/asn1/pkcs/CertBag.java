// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

public class CertBag extends ASN1Object
{

    private ASN1ObjectIdentifier a;
    private ASN1Encodable b;

    public CertBag(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        a = asn1objectidentifier;
        b = asn1encodable;
    }

    private CertBag(ASN1Sequence asn1sequence)
    {
        a = (ASN1ObjectIdentifier)asn1sequence.a(0);
        b = ((DERTaggedObject)asn1sequence.a(1)).k();
    }

    public static CertBag a(Object obj)
    {
        if (obj instanceof CertBag)
        {
            return (CertBag)obj;
        }
        if (obj != null)
        {
            return new CertBag(ASN1Sequence.a(obj));
        } else
        {
            return null;
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(new DERTaggedObject(0, b));
        return new DERSequence(asn1encodablevector);
    }

    public final ASN1ObjectIdentifier c()
    {
        return a;
    }

    public final ASN1Encodable d()
    {
        return b;
    }
}
