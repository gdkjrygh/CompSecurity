// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo, CertifiedKeyPair

public class CertResponse extends ASN1Encodable
{

    private DERInteger a;
    private PKIStatusInfo b;
    private CertifiedKeyPair c;
    private ASN1OctetString d;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        asn1encodablevector.a(b);
        if (c != null)
        {
            asn1encodablevector.a(c);
        }
        if (d != null)
        {
            asn1encodablevector.a(d);
        }
        return new DERSequence(asn1encodablevector);
    }
}
