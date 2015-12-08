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
//            ge, gg, ft, hc, 
//            gd

public final class gf
{

    private static final String a = com/flurry/sdk/gf.getSimpleName();
    private static final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();

    public gf()
    {
    }

    public static void a(Class class1, int i)
    {
        if (class1 == null)
        {
            return;
        }
        synchronized (b)
        {
            b.put(class1, new ge(class1, i));
        }
        return;
        class1;
        map;
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

    public gg a(Class class1)
    {
        if (class1 != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((gg) (obj));
_L2:
        gg gg1;
        synchronized (c)
        {
            gg1 = (gg)c.get(class1);
        }
        obj = gg1;
        if (gg1 != null) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException((new StringBuilder()).append("Module was not registered/initialized. ").append(class1).toString());
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        int i;
        ft.b();
        hc.b();
        list = b();
        i = list.size();
        i--;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((gg)c.remove(((gg)list.get(i)).getClass())).b();
_L3:
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception1;
        break MISSING_BLOCK_LABEL_85;
        exception1;
        gd.a(5, a, "Error destroying module:", exception1);
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1;
        synchronized (b)
        {
            obj1 = new ArrayList(b.values());
        }
        obj = ((List) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj1 = (ge)((Iterator) (obj)).next();
        if (!((ge) (obj1)).b()) goto _L2; else goto _L1
_L1:
        gg gg1 = (gg)((ge) (obj1)).a().newInstance();
        gg1.a(context);
        c.put(((ge) (obj1)).a(), gg1);
          goto _L2
        Exception exception;
        exception;
        gd.a(5, a, (new StringBuilder()).append("Flurry Module for class ").append(((ge) (obj1)).a()).append(" is not available:").toString(), exception);
          goto _L2
        context;
        throw context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        hc.a().a(context);
        ft.a();
        this;
        JVM INSTR monitorexit ;
    }

}
