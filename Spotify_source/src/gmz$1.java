// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

final class 
    implements .UncaughtExceptionHandler
{

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    ()
    {
    }
}
