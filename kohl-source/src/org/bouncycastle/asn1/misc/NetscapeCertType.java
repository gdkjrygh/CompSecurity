// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.DERBitString;

public class NetscapeCertType extends DERBitString
{

    public static final int objectSigning = 16;
    public static final int objectSigningCA = 1;
    public static final int reserved = 8;
    public static final int smime = 32;
    public static final int smimeCA = 2;
    public static final int sslCA = 4;
    public static final int sslClient = 128;
    public static final int sslServer = 64;

    public NetscapeCertType(int i)
    {
        super(getBytes(i), getPadBits(i));
    }

    public NetscapeCertType(DERBitString derbitstring)
    {
        super(derbitstring.getBytes(), derbitstring.getPadBits());
    }

    public String toString()
    {
        return (new StringBuilder()).append("NetscapeCertType: 0x").append(Integer.toHexString(data[0] & 0xff)).toString();
    }
}
