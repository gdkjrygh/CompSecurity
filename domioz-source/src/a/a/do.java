// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.database.sqlite.SQLiteDatabase;
import com.appboy.f.a;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package a.a:
//            dn, ki, c, cl, 
//            w, ko, de

public final class do
    implements Runnable
{

    final dn a;

    public do(dn dn1)
    {
        a = dn1;
        super();
    }

    public final void run()
    {
        w w1;
        ki ki1;
        ki1 = dn.b(a);
        w1 = a.a.dn.a(a);
        synchronized (ki1.d)
        {
            ki1.h = false;
            ki1.g.interrupt();
            ki1.g = null;
        }
        if (!ki1.c.a())
        {
            ki1.c.a(ki1.a());
        }
        ki1.b.b(ki1.c.b());
_L3:
        synchronized (w1.e)
        {
            w1.b.clear();
        }
        synchronized (w1.f)
        {
            w1.c.clear();
        }
        synchronized (w1.d)
        {
            w1.a.clear();
        }
_L1:
        Exception exception1;
        try
        {
            dn.c(a).b();
        }
        catch (Exception exception5)
        {
            com.appboy.f.a.b(a.a.dn.a(), "Exception while un-registering data refresh broadcast receivers. Continuing.", exception5);
        }
        try
        {
            dn.d(a).d().close();
            return;
        }
        catch (Exception exception6)
        {
            com.appboy.f.a.b(a.a.dn.a(), "Exception while closing database. Continuing.", exception6);
        }
        break; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        com.appboy.f.a.b(a.a.dn.a(), "Exception while shutting down dispatch manager. Continuing.", exception1);
          goto _L1
        obj;
        com.appboy.f.a.c(a.a.ki.a, "Self destruct sequence tried to perform its final flush, but was interrupted. This means that the previous user's data might not have all flushed to the server. Appboy will automatically flush any outstanding data the next time this user is switched to.");
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
