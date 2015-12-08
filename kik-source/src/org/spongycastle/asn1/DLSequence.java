// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Sequence, ASN1Encodable, ASN1Primitive, ASN1OutputStream, 
//            j, ASN1EncodableVector

public class DLSequence extends ASN1Sequence
{

    private int b;

    public DLSequence()
    {
        b = -1;
    }

    public DLSequence(ASN1Encodable asn1encodable)
    {
        super(asn1encodable);
        b = -1;
    }

    public DLSequence(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector);
        b = -1;
    }

    private int j()
    {
        if (b < 0)
        {
            Enumeration enumeration = d();
            int k;
            for (k = 0; enumeration.hasMoreElements(); k = ((ASN1Encodable)enumeration.nextElement()).a().g().i() + k) { }
            b = k;
        }
        return b;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        ASN1OutputStream asn1outputstream1 = asn1outputstream.b();
        int k = j();
        asn1outputstream.b(48);
        asn1outputstream.a(k);
        for (asn1outputstream = d(); asn1outputstream.hasMoreElements(); asn1outputstream1.a((ASN1Encodable)asn1outputstream.nextElement())) { }
    }

    final int i()
    {
        int k = j();
        return k + (org.spongycastle.asn1.j.a(k) + 1);
    }
}
