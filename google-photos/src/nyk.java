// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class nyk
{

    private String a;
    private boolean b;
    public long c;
    public String d;
    private long e;
    private final ArrayList f = new ArrayList();
    private String g;
    private long h;
    private int i;
    private int j;
    private nxy k;

    public nyk()
    {
        d = "Account.SyncState";
    }

    private void a(int l, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        nyl nyl1 = new nyl();
        nyl1.a = g;
        nyl1.b = System.currentTimeMillis() - h;
        nyl1.c = l;
        nyl1.d = i1;
        nyl1.e = 0L;
        nyl1.f = k;
        k = null;
        f.add(nyl1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static void a(nyk nyk1)
    {
        nyk;
        JVM INSTR monitorenter ;
        String s = nyk1.d;
        if (!Log.isLoggable(s, 4)) goto _L2; else goto _L1
_L1:
        String s1 = nyk1.a;
        long l1 = System.currentTimeMillis();
        long l3 = nyk1.e;
        (new StringBuilder(String.valueOf(s1).length() + 47)).append(s1).append(" finished. Elapsed time: ").append(l1 - l3).append("ms");
        nyk1 = nyk1.f.iterator();
_L8:
        if (!nyk1.hasNext()) goto _L2; else goto _L3
_L3:
        nyl nyl1 = (nyl)nyk1.next();
        if (nyl1.c != 0) goto _L5; else goto _L4
_L4:
        long l2 = nyl1.b;
_L6:
        String s2 = nyl1.a;
        int l = nyl1.c;
        int j1 = nyl1.d;
        long l4 = nyl1.e;
        long l5 = nyl1.b;
        (new StringBuilder(String.valueOf(s2).length() + 139)).append("  [").append(s2).append("] items: ").append(l).append(", sub-items: ").append(j1).append(", bytes: ").append(l4).append(", duration: ").append(l5).append("ms, avg: ").append(l2).append("ms");
        if (nyl1.f != null)
        {
            nyl1.f.a(s, "    ");
        }
        continue; /* Loop/switch isn't completed */
        nyk1;
        throw nyk1;
_L5:
        double d1;
        int i1;
        d1 = nyl1.b;
        i1 = nyl1.c;
        l2 = (long)(d1 / (double)i1);
        if (true) goto _L6; else goto _L2
_L2:
        nyk;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
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
        if (Log.isLoggable(d, 4))
        {
            String.valueOf(s).concat(" started.");
        }
        a = s;
        b = false;
        e = System.currentTimeMillis();
        f.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        g = s;
        h = System.currentTimeMillis();
        i = 0;
        j = 0;
        c = 0L;
        k = new nxy();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a(0, 0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        a(this);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
