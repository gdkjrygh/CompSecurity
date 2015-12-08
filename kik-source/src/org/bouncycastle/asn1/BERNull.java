// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            DERNull, ASN1OutputStream, BEROutputStream, DEROutputStream

public class BERNull extends DERNull
{

    public static final BERNull a = new BERNull();

    public BERNull()
    {
    }

    final void a(DEROutputStream deroutputstream)
    {
        if ((deroutputstream instanceof ASN1OutputStream) || (deroutputstream instanceof BEROutputStream))
        {
            deroutputstream.write(5);
            return;
        } else
        {
            super.a(deroutputstream);
            return;
        }
    }

}
