// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

public class TBSRequest extends ASN1Encodable
{

    private static final DERInteger f = new DERInteger(0);
    DERInteger a;
    GeneralName b;
    ASN1Sequence c;
    X509Extensions d;
    boolean e;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!a.equals(f) || e)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, b));
        }
        asn1encodablevector.a(c);
        if (d != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, d));
        }
        return new DERSequence(asn1encodablevector);
    }

    public final X509Extensions e()
    {
        return d;
    }

}
