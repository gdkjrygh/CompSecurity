// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Null, ASN1OutputStream

public class DERNull extends ASN1Null
{

    public static final DERNull INSTANCE = new DERNull();
    private static final byte zeroBytes[] = new byte[0];

    public DERNull()
    {
    }

    void encode(ASN1OutputStream asn1outputstream)
        throws IOException
    {
        asn1outputstream.writeEncoded(5, zeroBytes);
    }

    int encodedLength()
    {
        return 2;
    }

    boolean isConstructed()
    {
        return false;
    }

}
