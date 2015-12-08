// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.DERBitString;

public class KeyUsage extends DERBitString
{

    public KeyUsage(int i)
    {
        super(b(i), a(i));
    }

    public KeyUsage(DERBitString derbitstring)
    {
        super(derbitstring.c(), derbitstring.d());
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
