// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.database.sqlite.SQLiteDatabase;
import com.appboy.configuration.XmlAppConfigurationProvider;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package bo.app:
//            eq, o, x, dj, 
//            ac, dn, aw, s, 
//            ef

public final class er
    implements Runnable
{

    final eq a;

    public er(eq eq1)
    {
        a = eq1;
        super();
    }

    public final void run()
    {
        boolean flag = false;
        aw aw1;
        o o1;
        o1 = eq.b(a);
        aw1 = eq.a(a);
        synchronized (o1.e)
        {
            o1.h = false;
            o1.g.interrupt();
            o1.g = null;
        }
        if (!o1.d.a.isEmpty())
        {
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        o1.d.a(new dj(o1.b.getBaseUrlForRequests(), ac.d));
        o1.c.b(o1.d.a());
_L3:
        synchronized (aw1.e)
        {
            aw1.b.clear();
        }
        synchronized (aw1.f)
        {
            aw1.c.clear();
        }
        synchronized (aw1.d)
        {
            aw1.a.clear();
        }
_L1:
        Exception exception1;
        try
        {
            eq.c(a).b();
        }
        catch (Exception exception5)
        {
            AppboyLogger.w(eq.a(), "Exception while un-registering data refresh broadcast receivers. Continuing.", exception5);
        }
        try
        {
            eq.d(a).d().close();
            return;
        }
        catch (Exception exception6)
        {
            AppboyLogger.w(eq.a(), "Exception while closing database. Continuing.", exception6);
        }
        break; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        AppboyLogger.w(eq.a(), "Exception while shutting down dispatch manager. Continuing.", exception1);
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
