// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.LinkedList;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            az, dx, dg, dq, 
//            dw, bk, dj, cu, 
//            bq, dc, db, bb, 
//            cp, bg, br, bn, 
//            df

public final class ay
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private final az b;

    public ay(az az1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        b = az1;
        a = uncaughtexceptionhandler;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        az az1 = b;
        if (az1.r != null) goto _L2; else goto _L1
_L1:
        dx.b("Crittercism", "Unable to handle application crash. Crittercism not yet initialized");
_L3:
        if (a != null && !(a instanceof ay))
        {
            a.uncaughtException(Thread.currentThread(), throwable);
        }
_L4:
        return;
_L2:
        az1.r.b();
        dq.a(az1.c, true);
        if (!az1.f.b())
        {
            if (!az1.u)
            {
                break MISSING_BLOCK_LABEL_206;
            }
            thread = new bk(throwable, Thread.currentThread().getId());
            thread = (new JSONArray()).put(thread.b());
            (new dj((new cu(az1)).a(bq.e.f(), thread), new dc((new db(az1.v.b(), "/android_v2/handle_crashes")).a()), null)).run();
        }
          goto _L3
        thread;
        throw thread;
        thread;
        if (a != null && !(a instanceof ay))
        {
            a.uncaughtException(Thread.currentThread(), throwable);
        }
        throw thread;
        thread = new LinkedList();
        if (!(throwable instanceof cp))
        {
            thread = bg.b(az1);
        }
        bk bk1 = new bk(throwable, Thread.currentThread().getId());
        bk1.a("crashed_session", az1.k);
        if (az1.l.b() > 0)
        {
            bk1.a("previous_session", az1.l);
        }
        bk1.a(az1.m);
        bk1.a = (new bn(az1.n)).a;
        bk1.a();
        bk1.a(thread);
        az1.j.a(bk1);
        thread = new df(az1.c);
        thread.a(az1.g, new da.a(), az1.v.e(), "/v0/appload/", null, az1, new cs.b());
        thread.a(az1.h, new da.a(), az1.v.b(), "/android_v2/handle_exceptions", null, az1, new cu.a());
        thread.a(az1.i, new da.a(), az1.v.b(), "/android_v2/handle_ndk_crashes", null, az1, new cu.a());
        thread.a(az1.j, new da.a(), az1.v.b(), "/android_v2/handle_crashes", null, az1, new cu.a());
        thread.a();
          goto _L3
        thread;
        (new StringBuilder("InterruptedException in logCrashException: ")).append(thread.getMessage());
        dx.b();
        dx.c();
          goto _L3
        thread;
        dx.a("Crittercism", "Unable to send crash", thread);
        if (a != null && !(a instanceof ay))
        {
            a.uncaughtException(Thread.currentThread(), throwable);
            return;
        }
          goto _L4
        thread;
        (new StringBuilder("Unexpected throwable in logCrashException: ")).append(thread.getMessage());
        dx.b();
        dx.c();
          goto _L3
    }
}
