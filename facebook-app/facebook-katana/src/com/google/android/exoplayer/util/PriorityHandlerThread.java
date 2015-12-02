// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import android.os.HandlerThread;
import android.os.Process;

public final class PriorityHandlerThread extends HandlerThread
{

    private final int a;

    public PriorityHandlerThread(String s, int i)
    {
        super(s);
        a = i;
    }

    public final void run()
    {
        Process.setThreadPriority(a);
        super.run();
    }
}
