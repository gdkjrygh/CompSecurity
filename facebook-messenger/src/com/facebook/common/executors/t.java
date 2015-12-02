// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.Process;

// Referenced classes of package com.facebook.common.executors:
//            s

class t
    implements Runnable
{

    final Runnable a;
    final s b;

    t(s s1, Runnable runnable)
    {
        b = s1;
        a = runnable;
        super();
    }

    public void run()
    {
        try
        {
            Process.setThreadPriority(s.a(b));
        }
        catch (Throwable throwable) { }
        a.run();
    }
}
