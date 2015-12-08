// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


// Referenced classes of package com.google.b.g.a:
//            t

public final class u
{

    private final int a;
    private final t b[];

    transient u(int i, t at[])
    {
        a = i;
        b = at;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        int i = 0;
        t at[] = b;
        int k = at.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += at[i].a();
        }

        return j;
    }

    public int c()
    {
        return a * b();
    }

    public t[] d()
    {
        return b;
    }
}
