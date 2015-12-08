// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

static final class lang.Runnable extends Thread
{

    public final void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }

    public >(Runnable runnable)
    {
        super(runnable);
    }
}
