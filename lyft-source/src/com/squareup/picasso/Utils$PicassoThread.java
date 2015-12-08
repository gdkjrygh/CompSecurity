// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Process;

class  extends Thread
{

    public void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }

    public (Runnable runnable)
    {
        super(runnable);
    }
}
