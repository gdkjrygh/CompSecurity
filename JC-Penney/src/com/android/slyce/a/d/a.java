// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.d;

import com.android.slyce.a.aj;
import java.nio.ByteBuffer;

public class a
{

    final int a;
    int b;
    int c;

    public a()
    {
        b = 0;
        c = 4096;
        a = aj.d;
    }

    public ByteBuffer a()
    {
        return a(b);
    }

    public ByteBuffer a(int i)
    {
        return aj.c(Math.min(Math.max(i, c), a));
    }

    public void a(long l)
    {
        b = (int)l * 2;
    }

    public int b()
    {
        return c;
    }

    public a b(int i)
    {
        c = i;
        return this;
    }
}
