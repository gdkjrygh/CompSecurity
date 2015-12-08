// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.DERBitString;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            X509Extension

public class KeyUsage extends DERBitString
{

    public KeyUsage(int i)
    {
        super(b(i), a(i));
    }

    public KeyUsage(DERBitString derbitstring)
    {
        super(derbitstring.e(), derbitstring.f());
    }

    public static DERBitString b(Object obj)
    {
        if (obj instanceof KeyUsage)
        {
            return (KeyUsage)obj;
        }
        if (obj instanceof X509Extension)
        {
            return new KeyUsage(DERBitString.a(X509Extension.a((X509Extension)obj)));
        } else
        {
            return new KeyUsage(DERBitString.a(obj));
        }
    }

    public String toString()
    {
        if (a.length == 1)
        {
            return (new StringBuilder("KeyUsage: 0x")).append(Integer.toHexString(a[0] & 0xff)).toString();
        } else
        {
            return (new StringBuilder("KeyUsage: 0x")).append(Integer.toHexString((a[1] & 0xff) << 8 | a[0] & 0xff)).toString();
        }
    }
}
