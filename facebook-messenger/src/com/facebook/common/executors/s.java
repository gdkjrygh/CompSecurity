// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import com.google.common.base.Preconditions;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.common.executors:
//            t

public class s
    implements ThreadFactory
{

    private final String a;
    private final int b;
    private final AtomicInteger c;

    public s(String s1)
    {
        this(s1, 0);
    }

    public s(String s1, int i)
    {
        boolean flag = true;
        super();
        c = new AtomicInteger(1);
        if (i > 19 || i < -19)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = s1;
        b = i;
    }

    static int a(s s1)
    {
        return s1.b;
    }

    public Thread newThread(Runnable runnable)
    {
        return new Thread(new t(this, runnable), (new StringBuilder()).append(a).append(c.getAndIncrement()).toString());
    }
}
