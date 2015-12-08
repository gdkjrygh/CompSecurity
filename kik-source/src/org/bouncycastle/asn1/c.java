// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            DERSequence, DERSet, ASN1EncodableVector

final class c
{

    static final DERSequence a = new DERSequence();
    static final DERSet b = new DERSet();

    static DERSequence a(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.a.size() <= 0)
        {
            return a;
        } else
        {
            return new DERSequence(asn1encodablevector);
        }
    }

    static DERSet b(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.a.size() <= 0)
        {
            return b;
        } else
        {
            return new DERSet(asn1encodablevector, false);
        }
    }

}
