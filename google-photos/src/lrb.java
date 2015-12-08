// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lrb
{

    private static lrb e;
    public lqz a;
    public final Set b = new HashSet();
    public lqr c;
    public boolean d;
    private Context f;

    private lrb(Context context, lqr lqr1)
    {
        c = null;
        f = context;
        c = lqr1;
    }

    static Context a(lrb lrb1)
    {
        return lrb1.f;
    }

    static lqz a(lrb lrb1, lqz lqz1)
    {
        lrb1.a = lqz1;
        return lqz1;
    }

    public static lrb a(Context context)
    {
        b.d(context);
        if (e != null) goto _L2; else goto _L1
_L1:
        lrb;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new lrb(context, lqr.a(context.getApplicationContext()));
        }
        lrb;
        JVM INSTR monitorexit ;
_L2:
        return e;
        context;
        lrb;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void b(lrb lrb1)
    {
        lrb1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = lrb1.b.iterator(); iterator.hasNext(); ((lrd)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        lrb1;
        JVM INSTR monitorexit ;
        throw exception;
        lrb1;
        JVM INSTR monitorexit ;
    }

    public final lqz a()
    {
        this;
        JVM INSTR monitorenter ;
        lqz lqz1 = a;
        this;
        JVM INSTR monitorexit ;
        return lqz1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(lqz lqz1)
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        }
        break MISSING_BLOCK_LABEL_24;
        lqz1;
        this;
        JVM INSTR monitorexit ;
        throw lqz1;
        a = lqz1;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(lrd lrd1)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(lrd1);
        this;
        JVM INSTR monitorexit ;
        return;
        lrd1;
        this;
        JVM INSTR monitorexit ;
        throw lrd1;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IllegalStateException("Method start() has already been called");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (a == null)
        {
            throw new IllegalStateException("No settings configured");
        }
        d = true;
        c.a(a.d, -1, "admob").a(new lrc(this));
        this;
        JVM INSTR monitorexit ;
    }
}
