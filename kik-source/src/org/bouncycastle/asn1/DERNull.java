// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Null, DEROutputStream

public class DERNull extends ASN1Null
{

    public static final DERNull b = new DERNull();
    byte c[];

    public DERNull()
    {
        c = new byte[0];
    }

    void a(DEROutputStream deroutputstream)
    {
        deroutputstream.a(5, c);
    }

}
