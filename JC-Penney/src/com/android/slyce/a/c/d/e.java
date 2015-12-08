// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;


// Referenced classes of package com.android.slyce.a.c.d:
//            c, f

public final class e
    implements c
{

    long a;

    public e()
    {
        a = 0L;
    }

    private static int e(int i)
    {
        if (i < 0 || i > 63)
        {
            throw new IllegalArgumentException(String.format("input must be between 0 and 63: %s", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            return i;
        }
    }

    public void a()
    {
        a = 0L;
    }

    public void a(int i)
    {
        a = a | 1L << e(i);
    }

    public c b()
    {
        return new f(this, null);
    }

    public void b(int i)
    {
        a = a ^ 1L << e(i);
    }

    public boolean c(int i)
    {
        return (a >> e(i) & 1L) == 1L;
    }

    public void d(int i)
    {
        a = a << e(i);
    }

    public String toString()
    {
        return Long.toBinaryString(a);
    }
}
