// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.DERBitString;

public class NetscapeCertType extends DERBitString
{

    public NetscapeCertType(DERBitString derbitstring)
    {
        super(derbitstring.e(), derbitstring.f());
    }

    public String toString()
    {
        return (new StringBuilder("NetscapeCertType: 0x")).append(Integer.toHexString(a[0] & 0xff)).toString();
    }
}
