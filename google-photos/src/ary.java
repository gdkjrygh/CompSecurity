// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

final class ary extends Thread
{

    private arx a;

    ary(arx arx1, Runnable runnable, String s)
    {
        a = arx1;
        super(runnable, s);
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        try
        {
            super.run();
            return;
        }
        catch (Throwable throwable)
        {
            arx.a(a).a(throwable);
        }
    }
}
