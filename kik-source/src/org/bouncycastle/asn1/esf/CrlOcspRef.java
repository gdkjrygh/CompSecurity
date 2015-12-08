// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

// Referenced classes of package org.bouncycastle.asn1.esf:
//            CrlListID, OcspListID, OtherRevRefs

public class CrlOcspRef extends ASN1Encodable
{

    private CrlListID a;
    private OcspListID b;
    private OtherRevRefs c;

    public final DERObject d()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 0, a.d()));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 1, b.d()));
        }
        if (c != null)
        {
            asn1encodablevector.a(new DERTaggedObject(true, 2, c.d()));
        }
        return new DERSequence(asn1encodablevector);
    }
}
