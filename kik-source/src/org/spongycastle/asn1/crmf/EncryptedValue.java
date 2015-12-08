// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.crmf;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedValue extends ASN1Object
{

    private AlgorithmIdentifier a;
    private AlgorithmIdentifier b;
    private DERBitString c;
    private AlgorithmIdentifier d;
    private ASN1OctetString e;
    private DERBitString f;

    private static void a(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, i, asn1encodable));
        }
    }

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        a(asn1encodablevector, 0, ((ASN1Encodable) (a)));
        a(asn1encodablevector, 1, ((ASN1Encodable) (b)));
        a(asn1encodablevector, 2, ((ASN1Encodable) (c)));
        a(asn1encodablevector, 3, ((ASN1Encodable) (d)));
        a(asn1encodablevector, 4, ((ASN1Encodable) (e)));
        asn1encodablevector.a(f);
        return new DERSequence(asn1encodablevector);
    }
}
