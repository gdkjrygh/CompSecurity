// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.common.w.m;

// Referenced classes of package com.facebook.push.mqtt:
//            h

public class b
    implements h
{

    private final int a;
    private final int b;
    private int c;

    public b(int i, int j)
    {
        a = i;
        b = j;
        c = 0;
    }

    public int a()
    {
        if (b())
        {
            c = c + 1;
            return b;
        } else
        {
            return -1;
        }
    }

    public boolean b()
    {
        return c < a;
    }

    public String toString()
    {
        return m.a("BackToBackRetryStrategy: attempt:%d/%d, delay:%d seconds", new Object[] {
            Integer.valueOf(c), Integer.valueOf(a), Integer.valueOf(b)
        });
    }
}
