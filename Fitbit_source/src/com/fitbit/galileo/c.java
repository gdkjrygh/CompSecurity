// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo;

import com.fitbit.galileo.a.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.galileo:
//            GalileoTracker

public class c
{

    private Map a;

    public c()
    {
        a = new HashMap(5);
    }

    public static c a()
    {
    /* block-local class not found */
    class a {}

        return a.a;
    }

    public GalileoTracker a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        GalileoTracker galileotracker1 = (GalileoTracker)a.get(s);
        GalileoTracker galileotracker;
        galileotracker = galileotracker1;
        if (galileotracker1 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        galileotracker = (GalileoTracker)a.get(f.a(s));
        this;
        JVM INSTR monitorexit ;
        return galileotracker;
        s;
        throw s;
    }

    public void a(GalileoTracker galileotracker)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(galileotracker.e(), galileotracker);
        this;
        JVM INSTR monitorexit ;
        return;
        galileotracker;
        throw galileotracker;
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        GalileoTracker galileotracker;
        for (list = list.iterator(); list.hasNext(); a.put(galileotracker.e(), galileotracker))
        {
            galileotracker = (GalileoTracker)list.next();
        }

        break MISSING_BLOCK_LABEL_51;
        list;
        throw list;
        this;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.containsKey(s)) goto _L2; else goto _L1
_L1:
        boolean flag = a.containsKey(f.a(s));
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        throw s;
    }
}
