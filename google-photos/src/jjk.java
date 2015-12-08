// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class jjk
{

    public final jic a = new jic();
    public ByteBuffer b;
    public int c;
    public int d;
    public long e;
    private final int f = 0;

    public jjk(int i)
    {
    }

    public ByteBuffer a(int i)
    {
        if (f == 1)
        {
            return ByteBuffer.allocate(i);
        }
        if (f == 2)
        {
            return ByteBuffer.allocateDirect(i);
        }
        int j;
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.capacity();
        }
        throw new IllegalStateException((new StringBuilder(44)).append("Buffer too small (").append(j).append(" < ").append(i).append(")").toString());
    }

    public final boolean a()
    {
        return (d & 2) != 0;
    }

    public final boolean b()
    {
        return (d & 1) != 0;
    }

    public final void c()
    {
        if (b != null)
        {
            b.clear();
        }
    }
}
