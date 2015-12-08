// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;

import com.bumptech.glide.i.h;
import java.util.Queue;

final class r
{

    private static final Queue a = h.a(0);
    private int b;
    private int c;
    private Object d;

    private r()
    {
    }

    static r a(Object obj)
    {
        r r2 = (r)a.poll();
        r r1 = r2;
        if (r2 == null)
        {
            r1 = new r();
        }
        r1.d = obj;
        r1.c = 0;
        r1.b = 0;
        return r1;
    }

    public final void a()
    {
        a.offer(this);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof r)
        {
            obj = (r)obj;
            flag = flag1;
            if (c == ((r) (obj)).c)
            {
                flag = flag1;
                if (b == ((r) (obj)).b)
                {
                    flag = flag1;
                    if (d.equals(((r) (obj)).d))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (b * 31 + c) * 31 + d.hashCode();
    }

}
