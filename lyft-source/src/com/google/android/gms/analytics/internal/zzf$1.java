// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf

class a
    implements .UncaughtExceptionHandler
{

    final zzf a;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        thread = a.g();
        if (thread != null)
        {
            thread.e("Job execution failed", throwable);
        }
    }

    (zzf zzf1)
    {
        a = zzf1;
        super();
    }
}
