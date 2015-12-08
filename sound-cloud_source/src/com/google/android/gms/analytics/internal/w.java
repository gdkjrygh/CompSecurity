// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            v, g

final class w
    implements Thread.UncaughtExceptionHandler
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = a.e;
        if (thread != null)
        {
            thread.d("Job execution failed", throwable);
        }
    }
}
