// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetString, DEROutputStream, DEREncodable

public class DEROctetString extends ASN1OctetString
{

    public DEROctetString(DEREncodable derencodable)
    {
        super(derencodable);
    }

    public DEROctetString(byte abyte0[])
    {
        super(abyte0);
    }

    void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(4, a);
    }
}
