// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVBuilder, ByteConvertor

private class .toInt extends .toInt
{

    final TLVBuilder c;
    private int d;

    public taType b()
    {
        return taType.DT_INT;
    }

    public byte[] c()
    {
        return ByteConvertor.toBytes(d);
    }

    public int d()
    {
        return 4;
    }

    public int e()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder("TLVItemInt [mInt=")).append(d).append(", mId=").append(a).append("]").toString();
    }

    public taType(TLVBuilder tlvbuilder, int i, int j)
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = 0;
        a = i;
        d = j;
    }

    public d(TLVBuilder tlvbuilder, int i, byte abyte0[])
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = 0;
        a = i;
        d = ByteConvertor.toInt(abyte0);
    }
}
