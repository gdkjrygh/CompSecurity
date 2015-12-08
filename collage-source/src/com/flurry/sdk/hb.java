// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            hf, gd

public class hb
{

    private static final List b = new ArrayList();
    private final String a;
    private final Map c;

    public hb()
    {
        a = com/flurry/sdk/hb.getSimpleName();
        c = new LinkedHashMap();
        ArrayList arraylist;
        synchronized (b)
        {
            arraylist = new ArrayList(b);
        }
        obj = arraylist.iterator();
_L2:
        Class class1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = (Class)((Iterator) (obj)).next();
        hf hf1 = (hf)class1.newInstance();
        synchronized (c)
        {
            c.put(class1, hf1);
        }
        continue; /* Loop/switch isn't completed */
        exception2;
        map;
        JVM INSTR monitorexit ;
        try
        {
            throw exception2;
        }
        catch (Exception exception1)
        {
            gd.a(5, a, (new StringBuilder()).append("Module session ").append(class1).append(" is not available:").toString(), exception1);
        }
        if (true) goto _L2; else goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
    }

    public static void a(Class class1)
    {
        if (class1 == null)
        {
            return;
        }
        synchronized (b)
        {
            b.add(class1);
        }
        return;
        class1;
        list;
        JVM INSTR monitorexit ;
        throw class1;
    }

    private List b()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (c)
        {
            arraylist.addAll(c.values());
        }
        return arraylist;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(Class class1)
    {
        if (class1 == null)
        {
            return;
        }
        synchronized (b)
        {
            b.remove(class1);
        }
        return;
        class1;
        list;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b().iterator(); iterator.hasNext(); ((hf)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b().iterator(); iterator.hasNext(); ((hf)iterator.next()).a(context)) { }
        break MISSING_BLOCK_LABEL_44;
        context;
        throw context;
        this;
        JVM INSTR monitorexit ;
    }

    public void b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b().iterator(); iterator.hasNext(); ((hf)iterator.next()).b(context)) { }
        break MISSING_BLOCK_LABEL_44;
        context;
        throw context;
        this;
        JVM INSTR monitorexit ;
    }

    public hf c(Class class1)
    {
        if (class1 == null)
        {
            return null;
        }
        synchronized (c)
        {
            class1 = (hf)c.get(class1);
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public void c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = b().iterator(); iterator.hasNext(); ((hf)iterator.next()).c(context)) { }
        break MISSING_BLOCK_LABEL_44;
        context;
        throw context;
        this;
        JVM INSTR monitorexit ;
    }

}
