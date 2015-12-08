// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            PKIStatusInfo, CMPCertificate

public class KeyRecRepContent extends ASN1Encodable
{

    private PKIStatusInfo a;
    private CMPCertificate b;
    private ASN1Sequence c;
    private ASN1Sequence d;

    private static void a(ASN1EncodableVector asn1encodablevector, int i, ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, i, asn1encodable));
        }
    }

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        a(asn1encodablevector, 0, b);
        a(asn1encodablevector, 1, c);
        a(asn1encodablevector, 2, d);
        return new DERSequence(asn1encodablevector);
    }
}
