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
//            kd, kf, js, ld, 
//            kc

public final class ke
{

    private static final String a = com/flurry/sdk/ke.getSimpleName();
    private static final Map b = new LinkedHashMap();
    private final Map c = new LinkedHashMap();

    public ke()
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
            b.put(class1, new kd(class1, i));
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

    public final kf a(Class class1)
    {
        if (class1 != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((kf) (obj));
_L2:
        kf kf1;
        synchronized (c)
        {
            kf1 = (kf)c.get(class1);
        }
        obj = kf1;
        if (kf1 != null) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException((new StringBuilder("Module was not registered/initialized. ")).append(class1).toString());
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        int i;
        js.b();
        ld.b();
        list = b();
        i = list.size();
        i--;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((kf)c.remove(((kf)list.get(i)).getClass())).b();
_L3:
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception1;
        break MISSING_BLOCK_LABEL_85;
        exception1;
        kc.a(5, a, "Error destroying module:", exception1);
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (context != null) goto _L2; else goto _L1
_L1:
        kc.a(5, a, "Null context.");
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj1;
        synchronized (b)
        {
            obj1 = new ArrayList(b.values());
        }
        obj = ((List) (obj1)).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        obj1 = (kd)((Iterator) (obj)).next();
        if (!((kd) (obj1)).b()) goto _L4; else goto _L3
_L3:
        kf kf1 = (kf)((kd) (obj1)).a().newInstance();
        kf1.a(context);
        c.put(((kd) (obj1)).a(), kf1);
          goto _L4
        Exception exception;
        exception;
        kc.a(5, a, (new StringBuilder("Flurry Module for class ")).append(((kd) (obj1)).a()).append(" is not available:").toString(), exception);
          goto _L4
        context;
        throw context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        ld.a().a(context);
        js.a();
          goto _L5
    }

}
