// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            ba

final class b
    implements Executor
{

    private boolean a;
    private Handler b;

    public final void execute(Runnable runnable)
    {
        if (a && Looper.myLooper() == b.getLooper())
        {
            runnable.run();
        } else
        if (!b.post(runnable))
        {
            throw new RuntimeException("Operation could not be posted on handler. Looper may be exiting.");
        }
    }

    (Handler handler)
    {
        a = false;
        b = handler;
        super();
    }
}
