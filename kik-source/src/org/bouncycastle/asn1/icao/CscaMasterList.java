// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.x509.X509CertificateStructure;

public class CscaMasterList extends ASN1Encodable
{

    private DERInteger a;
    private X509CertificateStructure b[];

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (int i = 0; i < b.length; i++)
        {
            asn1encodablevector1.a(b[i]);
        }

        asn1encodablevector.a(new DERSet(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }
}
