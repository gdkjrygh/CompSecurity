// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import android.os.Process;

// Referenced classes of package com.aviary.android.feather.common.threading:
//            c

class a extends Thread
{

    final c a;

    public void run()
    {
        Process.setThreadPriority(c.a(a));
        super.run();
    }

    I(c c1, Runnable runnable, String s)
    {
        a = c1;
        super(runnable, s);
    }
}
