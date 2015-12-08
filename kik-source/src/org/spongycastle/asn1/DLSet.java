// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.util.Enumeration;

// Referenced classes of package org.spongycastle.asn1:
//            ASN1Set, ASN1Encodable, ASN1Primitive, ASN1OutputStream, 
//            j, ASN1EncodableVector

public class DLSet extends ASN1Set
{

    private int a;

    public DLSet()
    {
        a = -1;
    }

    public DLSet(ASN1Encodable asn1encodable)
    {
        super(asn1encodable);
        a = -1;
    }

    public DLSet(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector, false);
        a = -1;
    }

    public DLSet(ASN1Encodable aasn1encodable[])
    {
        super(aasn1encodable);
        a = -1;
    }

    private int e()
    {
        if (a < 0)
        {
            Enumeration enumeration = c();
            int k;
            for (k = 0; enumeration.hasMoreElements(); k = ((ASN1Encodable)enumeration.nextElement()).a().g().i() + k) { }
            a = k;
        }
        return a;
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        ASN1OutputStream asn1outputstream1 = asn1outputstream.b();
        int k = e();
        asn1outputstream.b(49);
        asn1outputstream.a(k);
        for (asn1outputstream = c(); asn1outputstream.hasMoreElements(); asn1outputstream1.a((ASN1Encodable)asn1outputstream.nextElement())) { }
    }

    final int i()
    {
        int k = e();
        return k + (j.a(k) + 1);
    }
}
