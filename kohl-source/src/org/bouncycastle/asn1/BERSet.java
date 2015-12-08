// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Set, ASN1OutputStream, ASN1Encodable, ASN1Primitive, 
//            ASN1EncodableVector

public class BERSet extends ASN1Set
{

    public BERSet()
    {
    }

    public BERSet(ASN1Encodable asn1encodable)
    {
        super(asn1encodable);
    }

    public BERSet(ASN1EncodableVector asn1encodablevector)
    {
        super(asn1encodablevector, false);
    }

    public BERSet(ASN1Encodable aasn1encodable[])
    {
        super(aasn1encodable, false);
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.write(49);
        asn1outputstream.write(128);
        for (Enumeration enumeration = getObjects(); enumeration.hasMoreElements(); asn1outputstream.writeObject((ASN1Encodable)enumeration.nextElement())) { }
        asn1outputstream.write(0);
        asn1outputstream.write(0);
    }

    int encodedLength()
        throws IOException
    {
        Enumeration enumeration = getObjects();
        int i;
        for (i = 0; enumeration.hasMoreElements(); i = ((ASN1Encodable)enumeration.nextElement()).toASN1Primitive().encodedLength() + i) { }
        return i + 2 + 2;
    }
}
