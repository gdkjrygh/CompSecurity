// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.pkcs;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.spongycastle.asn1.pkcs:
//            IssuerAndSerialNumber

public class SignerInfo extends ASN1Object
{

    private ASN1Integer a;
    private IssuerAndSerialNumber b;
    private AlgorithmIdentifier c;
    private ASN1Set d;
    private AlgorithmIdentifier e;
    private ASN1OctetString f;
    private ASN1Set g;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        asn1encodablevector.a(c);
        if (d != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, d));
        }
        asn1encodablevector.a(e);
        asn1encodablevector.a(f);
        if (g != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, g));
        }
        return new DERSequence(asn1encodablevector);
    }
}
