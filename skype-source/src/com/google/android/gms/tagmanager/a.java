// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bg, as, bu, c, 
//            ak, cl, ba

public final class com.google.android.gms.tagmanager.a
{
    public static interface a
    {

        public abstract Object a();
    }

    public static interface b
    {
    }

    private final class c
        implements df.a
    {

        final com.google.android.gms.tagmanager.a a;

        public final Object a(String s)
        {
            s = a.c(s);
            if (s == null)
            {
                return null;
            } else
            {
                return s.a();
            }
        }

        private c()
        {
            a = com.google.android.gms.tagmanager.a.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    private final class d
        implements df.a
    {

        final com.google.android.gms.tagmanager.a a;

        public final Object a(String s)
        {
            a.d(s);
            return cl.e();
        }

        private d()
        {
            a = com.google.android.gms.tagmanager.a.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private final Context a;
    private final String b;
    private final com.google.android.gms.tagmanager.c c;
    private bu d;
    private Map e;
    private Map f;
    private volatile long g;
    private volatile String h;

    com.google.android.gms.tagmanager.a(Context context, com.google.android.gms.tagmanager.c c1, String s, long l, com.google.android.gms.internal.ke.c c2)
    {
        e = new HashMap();
        f = new HashMap();
        h = "";
        a = context;
        c = c1;
        b = s;
        g = l;
        h = c2.b();
        context = h;
        bg.a().b().equals(bg.a.c);
        context = new as();
        a(new bu(a, c2, c, new c((byte)0), new d((byte)0), context));
        if (a("_gtm.loadEventEnabled"))
        {
            context = c;
            c1 = new HashMap(com.google.android.gms.tagmanager.c.a(new Object[] {
                "gtm.id", b
            }));
            c1.put("event", "gtm.load");
            context.a(c1);
        }
    }

    private void a(bu bu1)
    {
        this;
        JVM INSTR monitorenter ;
        d = bu1;
        this;
        JVM INSTR monitorexit ;
        return;
        bu1;
        throw bu1;
    }

    private bu d()
    {
        this;
        JVM INSTR monitorenter ;
        bu bu1 = d;
        this;
        JVM INSTR monitorexit ;
        return bu1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        return b;
    }

    public final boolean a(String s)
    {
        bu bu1 = d();
        if (bu1 == null)
        {
            ak.a("getBoolean called for closed container.");
            return cl.c().booleanValue();
        }
        boolean flag;
        try
        {
            flag = cl.d((com.google.android.gms.internal.h.a)bu1.b(s).a()).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ak.a((new StringBuilder("Calling getBoolean() threw an exception: ")).append(s.getMessage()).append(" Returning default value.").toString());
            return cl.c().booleanValue();
        }
        return flag;
    }

    public final long b()
    {
        return g;
    }

    public final String b(String s)
    {
        bu bu1 = d();
        if (bu1 == null)
        {
            ak.a("getString called for closed container.");
            return cl.e();
        }
        try
        {
            s = cl.a((com.google.android.gms.internal.h.a)bu1.b(s).a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ak.a((new StringBuilder("Calling getString() threw an exception: ")).append(s.getMessage()).append(" Returning default value.").toString());
            return cl.e();
        }
        return s;
    }

    final a c(String s)
    {
        synchronized (e)
        {
            s = (a)e.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    final void c()
    {
        d = null;
    }

    final b d(String s)
    {
        synchronized (f)
        {
            s = (b)f.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    final void e(String s)
    {
        d().a(s);
    }
}
