// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bc;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package p.bc:
//            a

class .Object
    implements Runnable
{

    final a a;

    public void run()
    {
        if (!Thread.interrupted())
        {
            Looper.prepare();
            p.bc.a.a(a, Looper.myLooper());
            p.bc.a.a(a, new Handler());
            Log.d(p.bc.a.e(), "scheduling run()");
            p.bc.a.a(a, true);
            if (!p.bc.a.e(a).postDelayed(p.bc.a.g(a), p.bc.a.f(a)))
            {
                Log.e(p.bc.a.e(), "Couldn't schedule run()");
            }
            Log.d(p.bc.a.e(), "Starting looper");
            Looper.loop();
            Log.d(p.bc.a.e(), "Looper stopped, exiting thread");
            return;
        } else
        {
            Log.i(p.bc.a.e(), "HeartbeatThread is run, but already interrupted");
            return;
        }
    }

    til.Log(a a1)
    {
        a = a1;
        super();
    }
}
