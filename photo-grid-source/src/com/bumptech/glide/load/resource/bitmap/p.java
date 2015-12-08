// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class p
{

    private final ByteBuffer a;

    public p(byte abyte0[])
    {
        a = ByteBuffer.wrap(abyte0);
        a.order(ByteOrder.BIG_ENDIAN);
    }

    public final int a()
    {
        return a.array().length;
    }

    public final int a(int i)
    {
        return a.getInt(i);
    }

    public final void a(ByteOrder byteorder)
    {
        a.order(byteorder);
    }

    public final short b(int i)
    {
        return a.getShort(i);
    }
}
