// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetString, ASN1Encodable, ASN1Primitive, DEROutputStream, 
//            ASN1OutputStream, StreamUtil

public class DEROctetString extends ASN1OctetString
{

    public DEROctetString(ASN1Encodable asn1encodable)
        throws IOException
    {
        super(asn1encodable.toASN1Primitive().getEncoded("DER"));
    }

    public DEROctetString(byte abyte0[])
    {
        super(abyte0);
    }

    static void encode(DEROutputStream deroutputstream, byte abyte0[])
        throws IOException
    {
        deroutputstream.writeEncoded(4, abyte0);
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.writeEncoded(4, string);
    }

    int encodedLength()
    {
        return StreamUtil.calculateBodyLength(string.length) + 1 + string.length;
    }

    boolean isConstructed()
    {
        return false;
    }
}
