// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;


// Referenced classes of package org.spongycastle.asn1:
//            ASN1Null, ASN1OutputStream

public class DERNull extends ASN1Null
{

    public static final DERNull a = new DERNull();
    private static final byte b[] = new byte[0];

    public DERNull()
    {
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(5, b);
    }

    final boolean h()
    {
        return false;
    }

    final int i()
    {
        return 2;
    }

}
