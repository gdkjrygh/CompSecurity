// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Sequence, ASN1OutputStream, ASN1Encodable, ASN1Primitive, 
//            ASN1EncodableVector

public class BERSequence extends ASN1Sequence
{

    public BERSequence()
    {
    }

    public BERSequence(ASN1Encodable asn1encodable)
    {
        super(asn1encodable);
    }

    public BERSequence(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector);
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.b(48);
        asn1outputstream.b(128);
        for (Enumeration enumeration = d(); enumeration.hasMoreElements(); asn1outputstream.a((ASN1Encodable)enumeration.nextElement())) { }
        asn1outputstream.b(0);
        asn1outputstream.b(0);
    }

    final int i()
    {
        Enumeration enumeration = d();
        int j;
        for (j = 0; enumeration.hasMoreElements(); j = ((ASN1Encodable)enumeration.nextElement()).a().i() + j) { }
        return j + 2 + 2;
    }
}
