// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class orc
{

    int a;
    public volatile boolean b;
    boolean c;
    private final Context d;
    private int e;
    private final HashMap f;
    private final HashMap g;
    private List h;

    orc(Context context)
    {
        List list;
        boolean flag;
        flag = false;
        super();
        f = new HashMap();
        g = new HashMap();
        h = new ArrayList();
        d = context.getApplicationContext();
        e = context.getResources().getConfiguration().orientation;
        list = olm.c(context, oqy);
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        oqy oqy1 = (oqy)list.get(i);
        f.put(oqy1.a(), oqy1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        obj = olm.c(context, oqz);
        context = g;
        context;
        JVM INSTR monitorenter ;
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= ((List) (obj)).size())
        {
            break; /* Loop/switch isn't completed */
        }
        oqz oqz1 = (oqz)((List) (obj)).get(i);
        g.put(oqz1.a(), oqz1);
        i++;
        if (true) goto _L4; else goto _L3
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
_L3:
        context;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void c(Context context)
    {
        HashMap hashmap = g;
        hashmap;
        JVM INSTR monitorenter ;
        for (Iterator iterator = g.values().iterator(); iterator.hasNext(); ((oqz)iterator.next()).b(context)) { }
        break MISSING_BLOCK_LABEL_53;
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
        hashmap;
        JVM INSTR monitorexit ;
    }

    private void d(Context context)
    {
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        for (Iterator iterator = f.values().iterator(); iterator.hasNext(); ((oqy)iterator.next()).a(context)) { }
        break MISSING_BLOCK_LABEL_53;
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
        hashmap;
        JVM INSTR monitorexit ;
    }

    final void a(Context context)
    {
        a("invisible");
        c = a();
        if (!c)
        {
            a = a - 1;
            b(String.format(Locale.US, "count=%d", new Object[] {
                Integer.valueOf(a)
            }));
            b(context);
        }
        b();
    }

    void a(String s)
    {
        if (Log.isLoggable("AppVisibilityMonitor", 3))
        {
            h.clear();
            b(s);
        }
    }

    boolean a()
    {
        boolean flag = false;
        int i = d.getResources().getConfiguration().orientation;
        if (e != i)
        {
            b("rotation");
            flag = true;
            e = i;
        }
        return flag;
    }

    void b()
    {
        if (Log.isLoggable("AppVisibilityMonitor", 3))
        {
            StringBuilder stringbuilder = new StringBuilder((String)h.get(0));
            for (int i = 1; i < h.size(); i++)
            {
                String s = (String)h.get(i);
                stringbuilder.append(" -> ");
                stringbuilder.append(s);
            }

        }
    }

    void b(Context context)
    {
        boolean flag;
        if (a > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != b)
        {
            String s;
            if (flag)
            {
                s = "foreground";
            } else
            {
                s = "background";
            }
            b(s);
            if (flag)
            {
                c(context);
            } else
            {
                d(context);
            }
            b = flag;
        }
    }

    void b(String s)
    {
        if (Log.isLoggable("AppVisibilityMonitor", 3))
        {
            h.add(s);
        }
    }
}
