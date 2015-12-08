// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class lpk
{

    ltb a;
    public volatile long b;
    private final Context c;
    private final String d;
    private final lpu e;
    private Map f;
    private Map g;
    private volatile String h;

    lpk(Context context, lpu lpu1, String s, long l, lfv lfv1)
    {
        f = new HashMap();
        g = new HashMap();
        h = "";
        c = context;
        e = lpu1;
        d = s;
        b = l;
        h = lfv1.c;
        context = h;
        lqk.a().a.equals(lql.c);
        context = new lri();
        a(new ltb(c, lfv1, e, new lpl(this), new lpm(this), context));
        if (a("_gtm.loadEventEnabled"))
        {
            context = e;
            lpu1 = new HashMap(lpu.a(new Object[] {
                "gtm.id", d
            }));
            lpu1.put("event", "gtm.load");
            context.a(lpu1);
        }
    }

    private void a(ltb ltb1)
    {
        this;
        JVM INSTR monitorenter ;
        a = ltb1;
        this;
        JVM INSTR monitorexit ;
        return;
        ltb1;
        throw ltb1;
    }

    ltb a()
    {
        this;
        JVM INSTR monitorenter ;
        ltb ltb1 = a;
        this;
        JVM INSTR monitorexit ;
        return ltb1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean a(String s)
    {
        ltb ltb1 = a();
        if (ltb1 == null)
        {
            lqh.a("getBoolean called for closed container.");
            return ltw.c().booleanValue();
        }
        boolean flag;
        try
        {
            flag = ltw.d((ksp)ltb1.b(s).a).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            lqh.a((new StringBuilder("Calling getBoolean() threw an exception: ")).append(s.getMessage()).append(" Returning default value.").toString());
            return ltw.c().booleanValue();
        }
        return flag;
    }

    public final String b(String s)
    {
        ltb ltb1 = a();
        if (ltb1 == null)
        {
            lqh.a("getString called for closed container.");
            return ltw.e();
        }
        try
        {
            s = ltw.a((ksp)ltb1.b(s).a);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            lqh.a((new StringBuilder("Calling getString() threw an exception: ")).append(s.getMessage()).append(" Returning default value.").toString());
            return ltw.e();
        }
        return s;
    }

    final k c(String s)
    {
        synchronized (f)
        {
            s = (k)f.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    final k d(String s)
    {
        synchronized (g)
        {
            s = (k)g.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }
}
