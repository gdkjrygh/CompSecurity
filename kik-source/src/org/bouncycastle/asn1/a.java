// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            BERSequence, BERSet, ASN1EncodableVector

final class a
{

    static final BERSequence a = new BERSequence();
    static final BERSet b = new BERSet();

    static BERSequence a(ASN1EncodableVector asn1encodablevector)
    {
        if (asn1encodablevector.a.size() <= 0)
        {
            return a;
        } else
        {
            return new BERSequence(asn1encodablevector);
        }
    }

}
