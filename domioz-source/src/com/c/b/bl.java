// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.os.Process;

final class bl extends Thread
{

    public bl(Runnable runnable)
    {
        super(runnable);
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }
}
