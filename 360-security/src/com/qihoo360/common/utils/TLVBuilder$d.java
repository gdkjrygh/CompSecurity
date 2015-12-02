// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVBuilder, ByteConvertor

private class .toLong extends .toLong
{

    final TLVBuilder c;
    private long d;

    public taType b()
    {
        return taType.DT_LONG;
    }

    public byte[] c()
    {
        return ByteConvertor.toBytes(d);
    }

    public int d()
    {
        return 8;
    }

    public long e()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder("TLVItemLong [mLong=")).append(d).append(", mId=").append(a).append("]").toString();
    }

    public taType(TLVBuilder tlvbuilder, int i, long l)
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = 0L;
        a = i;
        d = l;
    }

    public d(TLVBuilder tlvbuilder, int i, byte abyte0[])
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = 0L;
        a = i;
        d = ByteConvertor.toLong(abyte0);
    }
}
