// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import android.os.Process;

// Referenced classes of package com.aviary.android.feather.common.threading:
//            ThreadPool

class a extends Thread
{

    final a a;

    public void run()
    {
        Process.setThreadPriority(a(a));
        super.run();
    }

    ( , Runnable runnable, String s)
    {
        a = ;
        super(runnable, s);
    }
}
