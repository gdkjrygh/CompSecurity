// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import com.a.a.b.a.a.c;
import com.a.a.b.a.h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.a.a.b:
//            b

public final class a
{

    public static Executor a(int i, int j, h h1)
    {
        boolean flag;
        if (h1 == h.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            h1 = new c();
        } else
        {
            h1 = new LinkedBlockingQueue();
        }
        h1 = (BlockingQueue)h1;
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, h1, new b(j));
    }
}
