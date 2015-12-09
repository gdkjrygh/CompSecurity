// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.os.Process;

class br extends Thread
{

    public br(Runnable runnable)
    {
        super(runnable);
    }

    public void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }
}
