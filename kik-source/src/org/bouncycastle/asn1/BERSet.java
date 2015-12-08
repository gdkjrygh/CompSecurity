// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            DERSet, ASN1OutputStream, BEROutputStream, DEROutputStream, 
//            ASN1EncodableVector

public class BERSet extends DERSet
{

    public BERSet()
    {
    }

    BERSet(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector, false);
    }

    final void a(DEROutputStream deroutputstream)
    {
        if ((deroutputstream instanceof ASN1OutputStream) || (deroutputstream instanceof BEROutputStream))
        {
            deroutputstream.write(49);
            deroutputstream.write(128);
            for (Enumeration enumeration = e(); enumeration.hasMoreElements(); deroutputstream.a(enumeration.nextElement())) { }
            deroutputstream.write(0);
            deroutputstream.write(0);
            return;
        } else
        {
            super.a(deroutputstream);
            return;
        }
    }
}
