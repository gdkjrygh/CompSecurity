// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

// Referenced classes of package org.bouncycastle.asn1.pkcs:
//            IssuerAndSerialNumber

public class SignerInfo extends ASN1Encodable
{

    private DERInteger a;
    private IssuerAndSerialNumber b;
    private AlgorithmIdentifier c;
    private ASN1Set d;
    private AlgorithmIdentifier e;
    private ASN1OctetString f;
    private ASN1Set g;

    public final DERObject d()
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
