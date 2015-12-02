// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.HandlerThread;

// Referenced classes of package com.facebook.common.executors:
//            b

class c
    implements Runnable
{

    final Runnable a;
    final HandlerThread b;
    final b c;

    c(b b1, Runnable runnable, HandlerThread handlerthread)
    {
        c = b1;
        a = runnable;
        b = handlerthread;
        super();
    }

    public void run()
    {
        a.run();
        b.quit();
        return;
        Exception exception;
        exception;
        b.quit();
        throw exception;
    }
}
