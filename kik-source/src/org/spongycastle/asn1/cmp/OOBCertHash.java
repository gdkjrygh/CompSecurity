// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.crmf.CertId;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

public class OOBCertHash extends ASN1Object
{

    private AlgorithmIdentifier a;
    private CertId b;
    private DERBitString c;

    private static void a(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        a(asn1encodablevector, 0, ((ASN1Encodable) (a)));
        a(asn1encodablevector, 1, ((ASN1Encodable) (b)));
        asn1encodablevector.a(c);
        return new DERSequence(asn1encodablevector);
    }
}
