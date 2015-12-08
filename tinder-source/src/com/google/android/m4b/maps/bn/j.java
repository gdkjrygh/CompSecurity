// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public final class j
{

    private ByteBuffer a;
    private ShortBuffer b;
    private IntBuffer c;

    public j()
    {
    }

    public final ByteBuffer a()
    {
        if (a == null)
        {
            a = ByteBuffer.allocateDirect(0x30000);
            a.order(ByteOrder.nativeOrder());
        }
        a.position(0);
        a.limit(0x30000);
        return a;
    }

    public final ShortBuffer b()
    {
        if (b == null)
        {
            b = a().asShortBuffer();
        }
        b.position(0);
        b.limit(0x18000);
        return b;
    }

    public final IntBuffer c()
    {
        if (c == null)
        {
            c = a().asIntBuffer();
        }
        c.position(0);
        c.limit(49152);
        return c;
    }
}
