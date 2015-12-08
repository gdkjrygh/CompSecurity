// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d.b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package com.ford.syncV4.d.b:
//            a

final class c
    implements Runnable
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        if (!Thread.interrupted())
        {
            Looper.prepare();
            com.ford.syncV4.d.b.a.a(a, Looper.myLooper());
            com.ford.syncV4.d.b.a.a(a, new Handler());
            Log.d(com.ford.syncV4.d.b.a.e(), "scheduling run()");
            com.ford.syncV4.d.b.a.a(a, true);
            if (!com.ford.syncV4.d.b.a.e(a).postDelayed(com.ford.syncV4.d.b.a.g(a), com.ford.syncV4.d.b.a.f(a)))
            {
                Log.e(com.ford.syncV4.d.b.a.e(), "Couldn't schedule run()");
            }
            Log.d(com.ford.syncV4.d.b.a.e(), "Starting looper");
            Looper.loop();
            Log.d(com.ford.syncV4.d.b.a.e(), "Looper stopped, exiting thread");
            return;
        } else
        {
            Log.i(com.ford.syncV4.d.b.a.e(), "HeartbeatThread is run, but already interrupted");
            return;
        }
    }
}
