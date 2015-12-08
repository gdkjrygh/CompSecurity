// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.flurry.sdk:
//            dj, el, do, es, 
//            dz

public class dl
{

    private static final String a = com/flurry/sdk/dl.getSimpleName();
    private static dl b;
    private final Map c = new HashMap();
    private final Map d = new WeakHashMap();
    private final Object e = new Object();
    private dj f;

    private dl()
    {
    }

    public static dl a()
    {
        com/flurry/sdk/dl;
        JVM INSTR monitorenter ;
        dl dl1;
        if (b == null)
        {
            b = new dl();
        }
        dl1 = b;
        com/flurry/sdk/dl;
        JVM INSTR monitorexit ;
        return dl1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        dj dj1 = (dj)d.remove(context);
        if (dj1 != null) goto _L2; else goto _L1
_L1:
        el.d(a, (new StringBuilder("Session cannot be ended, session not found for context: ")).append(context).toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        dj1.c(context);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public void a(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        dj dj1;
        com.flurry.sdk.do.a(context);
        es.a().b();
        dz.a().b();
        dj1 = (dj)d.get(context);
        if (dj1 == null) goto _L2; else goto _L1
_L1:
        el.d(a, (new StringBuilder("Session already started with context: ")).append(context).append(" count:").append(dj1.g()).toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!c.containsKey(s))
        {
            break; /* Loop/switch isn't completed */
        }
        s = (dj)c.get(s);
_L5:
        d.put(context, s);
        a(((dj) (s)));
        s.b(context);
        if (true) goto _L4; else goto _L3
        context;
        throw context;
_L3:
        dj1 = new dj(s);
        c.put(s, dj1);
        dj1.a(context);
        s = dj1;
          goto _L5
    }

    public void a(dj dj1)
    {
        synchronized (e)
        {
            f = dj1;
        }
        return;
        dj1;
        obj;
        JVM INSTR monitorexit ;
        throw dj1;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (c.containsKey(s)) goto _L2; else goto _L1
_L1:
        el.a(6, a, "Ended session is not in the session map! Maybe it was already destroyed.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        dj dj1 = c();
        if (dj1 == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (TextUtils.equals(dj1.j(), s))
        {
            a(((dj) (null)));
        }
        c.remove(s);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public dj c()
    {
        dj dj1;
        synchronized (e)
        {
            dj1 = f;
        }
        return dj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = d.entrySet().iterator(); iterator.hasNext(); ((dj)entry.getValue()).c((Context)entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_65;
        Exception exception;
        exception;
        throw exception;
        d.clear();
        for (Iterator iterator1 = (new ArrayList(c.values())).iterator(); iterator1.hasNext(); ((dj)iterator1.next()).c()) { }
        c.clear();
        a(((dj) (null)));
        this;
        JVM INSTR monitorexit ;
    }

}
