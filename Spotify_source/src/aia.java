// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class aia
{

    private static final aid f = aid.a("kju.remoting");
    private static Map g = new HashMap();
    private static String h;
    final Context a;
    String b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    private volatile boolean i;

    private aia(Context context)
    {
        i = false;
        a = context;
    }

    public static final aia a()
    {
        return (aia)g.get(h);
    }

    public static final aia a(String s)
    {
        return (aia)g.get(s);
    }

    public static final void a(Context context, String s)
    {
        aia;
        JVM INSTR monitorenter ;
        h = s;
        if (a(s) != null)
        {
            a(s).c();
        }
        context = new aia(context);
        context.b = null;
        g.put(h, context);
        aia;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public final aib a(Type type)
    {
        return (aib)d.get(type);
    }

    public final Object b(Type type)
    {
        return e.get(type);
    }

    public final void b()
    {
        if (!i)
        {
            for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((ahz)iterator.next()).m()) { }
            i = true;
        }
    }

    public final void c()
    {
        if (i)
        {
            f.a("stop()...", new Object[0]);
            for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((ahz)iterator.next()).n()) { }
            f.a("stop() OK!", new Object[0]);
            i = false;
        }
    }

}
