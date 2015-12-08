// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Set, ASN1EncodableVector, DEROutputStream, DEREncodable

public class DERSet extends ASN1Set
{

    public DERSet()
    {
    }

    public DERSet(ASN1EncodableVector asn1encodablevector)
    {
        this(asn1encodablevector, true);
    }

    DERSet(ASN1EncodableVector asn1encodablevector, boolean flag)
    {
        for (int i = 0; i != asn1encodablevector.a.size(); i++)
        {
            a(asn1encodablevector.a(i));
        }

        if (flag)
        {
            g();
        }
    }

    public DERSet(DEREncodable derencodable)
    {
        a(derencodable);
    }

    void a(DEROutputStream deroutputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DEROutputStream deroutputstream1 = new DEROutputStream(bytearrayoutputstream);
        for (Enumeration enumeration = e(); enumeration.hasMoreElements(); deroutputstream1.a(enumeration.nextElement())) { }
        deroutputstream1.close();
        deroutputstream.a(49, bytearrayoutputstream.toByteArray());
    }
}
