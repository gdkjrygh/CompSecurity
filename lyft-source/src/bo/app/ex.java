// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.database.sqlite.SQLiteDatabase;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package bo.app:
//            ew, o, ab, dt, 
//            bb, u, el

public final class ex
    implements Runnable
{

    final ew a;

    public ex(ew ew1)
    {
        a = ew1;
        super();
    }

    public final void run()
    {
        bb bb1;
        o o1;
        o1 = ew.b(a);
        bb1 = ew.a(a);
        synchronized (o1.d)
        {
            o1.h = false;
            o1.g.interrupt();
            o1.g = null;
        }
        if (!o1.c.a())
        {
            o1.c.a(o1.a());
        }
        o1.b.b(o1.c.b());
_L3:
        synchronized (bb1.e)
        {
            bb1.b.clear();
        }
        synchronized (bb1.f)
        {
            bb1.c.clear();
        }
        synchronized (bb1.d)
        {
            bb1.a.clear();
        }
_L1:
        Exception exception1;
        try
        {
            ew.c(a).b();
        }
        catch (Exception exception5)
        {
            AppboyLogger.w(ew.a(), "Exception while un-registering data refresh broadcast receivers. Continuing.", exception5);
        }
        try
        {
            ew.d(a).d().close();
            return;
        }
        catch (Exception exception6)
        {
            AppboyLogger.w(ew.a(), "Exception while closing database. Continuing.", exception6);
        }
        break; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        AppboyLogger.w(ew.a(), "Exception while shutting down dispatch manager. Continuing.", exception1);
          goto _L1
        obj;
        AppboyLogger.w(o.a, "Self destruct sequence tried to perform its final flush, but was interrupted. This means that the previous user's data might not have all flushed to the server. Appboy will automatically flush any outstanding data the next time this user is switched to.");
        if (true) goto _L3; else goto _L2
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
        exception3;
        obj;
        JVM INSTR monitorexit ;
        throw exception3;
        exception4;
        obj;
        JVM INSTR monitorexit ;
        throw exception4;
_L2:
    }
}
