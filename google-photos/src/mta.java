// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;

public final class mta
    implements msz
{

    private final Context a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private long h;
    private oby i;
    private oby j;
    private oby k;

    public mta(Context context)
    {
        a = context;
    }

    private void a()
    {
        i = null;
        j = null;
        d = true;
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        f = f + 1;
        if (!c)
        {
            i = new oby(2, l);
            c = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int l;
        if (d || !b)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        l = g - 1;
        g = l;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        if (!e)
        {
            oby oby1 = i;
            oby1.b = s;
            oby1.b(a);
        }
        oby oby2 = j;
        oby2.b = s;
        oby2.b(a);
        oby2 = new oby(1, SystemClock.elapsedRealtime() - j.b() - i.b());
        oby2.a();
        oby2.b = s;
        oby2.b(a);
        if (Log.isLoggable("AppLaunch", 3))
        {
            s = String.valueOf("recordMainActivityCreatePeriod() appCreateStartEvent duration (ms): ");
            long l1 = i.b();
            long l2 = j.b();
            long l3 = oby2.b();
            (new StringBuilder(String.valueOf(s).length() + 141)).append(s).append(l1).append(", mainActivityCreateStartEvent duration (ms): ").append(l2).append(", appColdStartEvent duration (ms): ").append(l3);
        }
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int l;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        l = f - 1;
        f = l;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        i.a();
        i.b(a);
        e = true;
        if (Log.isLoggable("AppLaunch", 3))
        {
            long l1 = i.b();
            (new StringBuilder(77)).append("stopAppCreatePeriod() appCreateStartEvent duration (ms): ").append(l1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(long l)
    {
        this;
        JVM INSTR monitorenter ;
        g = g + 1;
        if (!b && c)
        {
            j = new oby(3, l);
            (new oce(113)).b(a);
            b = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        boolean flag;
        if (!d && b && g - 1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = i;
        obj.b = s;
        ((oby) (obj)).b(a);
        s = new obt(10);
        obj = a;
        ((mrv)olm.a(((Context) (obj)), mrv)).a(((Context) (obj)), s);
        k = null;
        h = 0L;
        a();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
