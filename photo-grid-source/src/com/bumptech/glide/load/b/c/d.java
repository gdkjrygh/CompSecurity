// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.c;

import java.util.concurrent.FutureTask;

// Referenced classes of package com.bumptech.glide.load.b.c:
//            h

final class d extends FutureTask
    implements Comparable
{

    private final int a;
    private final int b;

    public d(Runnable runnable, Object obj, int i)
    {
        super(runnable, obj);
        if (!(runnable instanceof h))
        {
            throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
        } else
        {
            a = ((h)runnable).b();
            b = i;
            return;
        }
    }

    public final volatile int compareTo(Object obj)
    {
        obj = (d)obj;
        int j = a - ((d) (obj)).a;
        int i = j;
        if (j == 0)
        {
            i = b - ((d) (obj)).b;
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof d)
        {
            obj = (d)obj;
            flag = flag1;
            if (b == ((d) (obj)).b)
            {
                flag = flag1;
                if (a == ((d) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a * 31 + b;
    }
}
