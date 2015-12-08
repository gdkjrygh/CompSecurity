// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.cmp:
//            PKIStatusInfo, CMPCertificate

public class KeyRecRepContent extends ASN1Object
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

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(a);
        a(asn1encodablevector, 0, ((ASN1Encodable) (b)));
        a(asn1encodablevector, 1, ((ASN1Encodable) (c)));
        a(asn1encodablevector, 2, ((ASN1Encodable) (d)));
        return new DERSequence(asn1encodablevector);
    }
}
