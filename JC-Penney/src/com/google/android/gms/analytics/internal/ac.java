// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            ab, j

class ac
    implements Thread.UncaughtExceptionHandler
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = a.g();
        if (thread != null)
        {
            thread.e("Job execution failed", throwable);
        }
    }
}
