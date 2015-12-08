// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import android.os.Process;

final class k extends Thread
{

    k(Runnable runnable, String s)
    {
        super(runnable, s);
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }
}
