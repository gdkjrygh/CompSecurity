// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;


// Referenced classes of package com.qihoo360.common.utils:
//            TLVBuilder

private class d extends d
{

    final TLVBuilder c;
    private byte d[];

    public taType b()
    {
        return taType.DT_BYTES;
    }

    public byte[] c()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d;
        }
    }

    public int d()
    {
        if (d == null)
        {
            return 0;
        } else
        {
            return d.length;
        }
    }

    public byte[] e()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder("TLVItemBytes [mBytes=")).append(d).append(", mId=").append(a).append("]").toString();
    }

    public taType(TLVBuilder tlvbuilder, int i, byte abyte0[])
    {
        c = tlvbuilder;
        super(tlvbuilder, null);
        d = null;
        a = i;
        d = abyte0;
    }
}
