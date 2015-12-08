// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.os.Process;

class ai extends Thread
{

    ai(Runnable runnable, String s)
    {
        super(runnable, s);
    }

    public void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }
}
