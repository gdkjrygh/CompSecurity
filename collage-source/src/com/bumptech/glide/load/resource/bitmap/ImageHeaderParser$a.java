// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            ImageHeaderParser

private static class a
{

    private final ByteBuffer a;

    public int a()
    {
        return a.array().length;
    }

    public int a(int i)
    {
        return a.getInt(i);
    }

    public void a(ByteOrder byteorder)
    {
        a.order(byteorder);
    }

    public short b(int i)
    {
        return a.getShort(i);
    }

    public A(byte abyte0[])
    {
        a = ByteBuffer.wrap(abyte0);
        a.order(ByteOrder.BIG_ENDIAN);
    }
}
