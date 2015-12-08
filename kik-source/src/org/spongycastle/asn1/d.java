// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.spongycastle.asn1:
//            DERSequence, DERSet, ASN1EncodableVector, DLSequence, 
//            DLSet, ASN1Sequence, ASN1Set

final class d
{

    static final ASN1Sequence a = new DERSequence();
    static final ASN1Set b = new DERSet();

    static ASN1Sequence a(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.a.size() <= 0)
        {
            return a;
        } else
        {
            return new DLSequence(asn1encodablevector);
        }
    }

    static ASN1Set b(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.a.size() <= 0)
        {
            return b;
        } else
        {
            return new DLSet(asn1encodablevector);
        }
    }

}
