// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.e.a;
import com.fitbit.util.format.e;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ez
{

    private static final long a = 0x1d4c0L;
    private final String b = "operation";
    private Map c;
    private Map d;

    public ez()
    {
        c = new HashMap();
        d = new HashMap();
    }

    public long a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (Long)c.get(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        long l = 0x1d4c0L;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = s.longValue();
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            d.clear();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Long long1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        c.put(s, long1);
        this;
        JVM INSTR monitorexit ;
        return;
        long1;
        throw long1;
    }

    public Set b()
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset = new HashSet(d.entrySet());
        this;
        JVM INSTR monitorexit ;
        return hashset;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l = System.currentTimeMillis();
        d.put(s, Long.valueOf(l));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public long c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (Long)d.get(s);
        if (s == null) goto _L2; else goto _L1
_L1:
        long l = s.longValue();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("SyncTimePreference", "Reset last operation time for %s", new Object[] {
            s
        });
        if (d != null)
        {
            d.remove(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void e(String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("SyncTimePreference", "Will reset last operation time for prefix %s", new Object[] {
            s
        });
        if (d != null)
        {
            Iterator iterator = (new HashSet(d.keySet())).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                if (s1.indexOf(s) == 0)
                {
                    com.fitbit.e.a.a("SyncTimePreference", "Reset last operation time for key %s", new Object[] {
                        s1
                    });
                    d.remove(s1);
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_107;
        s;
        throw s;
        this;
        JVM INSTR monitorexit ;
    }

    public boolean f(String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        long l2;
        l = c(s);
        l1 = a(s);
        l2 = System.currentTimeMillis() - l;
        if (l2 < 0L || l2 >= l1)
        {
            flag = true;
        }
        com.fitbit.e.a.a("SyncTimePreference", "Should perform operation :%s: %s. Last operation time = %s, throttle: %s", new Object[] {
            s, Boolean.valueOf(flag), com.fitbit.util.format.e.g(new Date(l)), Long.valueOf(l1)
        });
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }
}
