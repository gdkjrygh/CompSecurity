// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Sequence, ASN1EncodableVector, DEROutputStream, DEREncodable, 
//            ASN1Encodable

public class DERSequence extends ASN1Sequence
{

    public DERSequence()
    {
    }

    public DERSequence(ASN1EncodableVector asn1encodablevector)
    {
        for (int i = 0; i != asn1encodablevector.a.size(); i++)
        {
            a(asn1encodablevector.a(i));
        }

    }

    public DERSequence(DEREncodable derencodable)
    {
        a(derencodable);
    }

    public DERSequence(ASN1Encodable aasn1encodable[])
    {
        for (int i = 0; i != aasn1encodable.length; i++)
        {
            a(aasn1encodable[i]);
        }

    }

    void a(DEROutputStream deroutputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DEROutputStream deroutputstream1 = new DEROutputStream(bytearrayoutputstream);
        for (Enumeration enumeration = e(); enumeration.hasMoreElements(); deroutputstream1.a(enumeration.nextElement())) { }
        deroutputstream1.close();
        deroutputstream.a(48, bytearrayoutputstream.toByteArray());
    }
}
