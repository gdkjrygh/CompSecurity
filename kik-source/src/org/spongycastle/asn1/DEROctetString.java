// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;


// Referenced classes of package org.spongycastle.asn1:
//            ASN1OctetString, ASN1OutputStream, j

public class DEROctetString extends ASN1OctetString
{

    public DEROctetString(byte abyte0[])
    {
        super(abyte0);
    }

    final void a(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.a(4, a);
    }

    final boolean h()
    {
        return false;
    }

    final int i()
    {
        return j.a(a.length) + 1 + a.length;
    }
}
