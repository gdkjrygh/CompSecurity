// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.service.SpotifyService;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class dwo
    implements ServiceConnection
{

    private final AtomicInteger a = new AtomicInteger(0);
    private final Object b = new Object();
    private final Context c;
    private final Semaphore d = new Semaphore(1);
    private Set e;
    private eaa f;
    private dvm g;

    public dwo(Context context)
    {
        e = new LinkedHashSet();
        g = new dvm() {

        };
        c = context;
    }

    private void e()
    {
        dvk.a(c, this, dwo.getSimpleName());
        f = null;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((dwp)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((dwp)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a.getAndIncrement() == 0)
        {
            d.acquireUninterruptibly();
            if (d())
            {
                break MISSING_BLOCK_LABEL_82;
            }
            Intent intent = new Intent(c, com/spotify/mobile/android/service/SpotifyService);
            dvk.a(c, intent, this, dwo.getSimpleName());
            geh.a("You're screwed since the service can't be bound when you're querying from the main thread");
            d.acquireUninterruptibly();
            d.release();
        }
_L2:
        return;
        f();
        d.release();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(dwp dwp1)
    {
        this;
        JVM INSTR monitorenter ;
        e.add(dwp1);
        this;
        JVM INSTR monitorexit ;
        return;
        dwp1;
        throw dwp1;
    }

    public final void b()
    {
        synchronized (b)
        {
            if (a.decrementAndGet() == 0 && d())
            {
                e();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(dwp dwp1)
    {
        this;
        JVM INSTR monitorenter ;
        e.remove(dwp1);
        this;
        JVM INSTR monitorexit ;
        return;
        dwp1;
        throw dwp1;
    }

    public final eaa c()
    {
        return (eaa)ctz.a(f);
    }

    public final boolean d()
    {
        return f != null;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        f = SpotifyService.f(((dvt)ibinder).a);
        f.a(g);
        f();
        d.release();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        e();
        g();
        d.release();
    }
}
