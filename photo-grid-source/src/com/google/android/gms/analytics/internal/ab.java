// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            aa, j

final class ab
    implements Thread.UncaughtExceptionHandler
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = a.f();
        if (thread != null)
        {
            thread.e("Job execution failed", throwable);
        }
    }
}
