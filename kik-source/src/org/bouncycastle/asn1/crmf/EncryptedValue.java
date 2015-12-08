// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedValue extends ASN1Encodable
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

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        a(asn1encodablevector, 0, a);
        a(asn1encodablevector, 1, b);
        a(asn1encodablevector, 2, c);
        a(asn1encodablevector, 3, d);
        a(asn1encodablevector, 4, e);
        asn1encodablevector.a(f);
        return new DERSequence(asn1encodablevector);
    }
}
