// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.common.w.m;
import java.util.Random;

// Referenced classes of package com.facebook.push.mqtt:
//            h

public class c
    implements h
{

    private final int a;
    private final int b;
    private final Random c = new Random();
    private int d;
    private int e;

    public c(int i, int j)
    {
        a = i;
        b = j;
        c();
    }

    private void c()
    {
        d = 0;
        e = a;
    }

    public int a()
    {
        d = d + 1;
        int i = Math.min(e * 2, b);
        e = (int)((0.5D + (double)c.nextFloat()) * (double)i);
        return e;
    }

    public boolean b()
    {
        return d < 0x7fffffff;
    }

    public String toString()
    {
        return m.a("BackoffRetryStrategy: attempt:%d/Infinite, delay:%d seconds", new Object[] {
            Integer.valueOf(d), Integer.valueOf(e)
        });
    }
}
