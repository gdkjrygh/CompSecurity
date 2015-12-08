// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            kc

public class lb
{

    private static final List b = new ArrayList();
    private final String a;
    private final Map c;

    public lb()
    {
        a = com/flurry/sdk/lb.getSimpleName();
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
        Object obj1 = class1.newInstance();
        synchronized (c)
        {
            c.put(class1, obj1);
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
            kc.a(5, a, (new StringBuilder("Module data ")).append(class1).append(" is not available:").toString(), exception1);
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

    public Object c(Class class1)
    {
        if (class1 == null)
        {
            return null;
        }
        synchronized (c)
        {
            class1 = ((Class) (c.get(class1)));
        }
        return class1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

}
