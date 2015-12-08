// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

final class gwn extends Thread
{

    public gwn(Runnable runnable)
    {
        super(runnable);
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }
}
