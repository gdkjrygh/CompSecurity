// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//            FifoPriorityThreadPoolExecutor

class a extends Thread
{

    final a a;

    public void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }

    ( , Runnable runnable, String s)
    {
        a = ;
        super(runnable, s);
    }
}
