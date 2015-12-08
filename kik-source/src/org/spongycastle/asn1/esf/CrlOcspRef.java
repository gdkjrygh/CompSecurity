// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.esf:
//            CrlListID, OcspListID, OtherRevRefs

public class CrlOcspRef extends ASN1Object
{

    private CrlListID a;
    private OcspListID b;
    private OtherRevRefs c;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, a.a()));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, b.a()));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, c.a()));
        }
        return new DERSequence(asn1encodablevector);
    }
}
