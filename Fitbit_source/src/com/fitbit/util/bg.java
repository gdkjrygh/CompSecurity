// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.e.a;
import java.util.HashMap;
import java.util.Map;

public class bg
{
    private static class a
    {

        double a;
        int b;
        long c;

        private a()
        {
            a = 0.0D;
            b = 0;
            c = 0x7fffffffffffffffL;
        }

    }


    public static final String a = "Stopwatch";
    private static Map e = new HashMap();
    private final String b;
    private final boolean c;
    private long d;

    public bg()
    {
        this("Stopwatch", false);
    }

    public bg(String s, boolean flag)
    {
        b = s;
        c = flag;
        a();
    }

    public void a()
    {
        d = System.currentTimeMillis();
    }

    public void a(String s)
    {
        a(s, null);
    }

    public void a(String s, String s1)
    {
        a a1;
        Map map;
        long l;
        l = System.currentTimeMillis() - d;
        if (s1 == null)
        {
            s1 = "";
        } else
        {
            s1 = (new StringBuilder()).append(" [").append(s1).append("]").toString();
        }
        if (!c) goto _L2; else goto _L1
_L1:
        map = e;
        map;
        JVM INSTR monitorenter ;
        a1 = (a)e.get(s);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        a1 = new a();
        e.put(s, a1);
        map;
        JVM INSTR monitorexit ;
        a1;
        JVM INSTR monitorenter ;
        a1.a = a1.a + ((double)l - a1.a) / (double)(a1.b + 1);
        a1.b = a1.b + 1;
        a1.c = Math.min(a1.c, l);
        s = String.format("%s%s - %dms; avg = %.2fms; min = %dms; cnt = %d", new Object[] {
            s, s1, Long.valueOf(l), Double.valueOf(a1.a), Long.valueOf(a1.c), Integer.valueOf(a1.b)
        });
        a1;
        JVM INSTR monitorexit ;
        com.fitbit.e.a.a(b, s, new Object[0]);
_L4:
        d = System.currentTimeMillis();
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        s;
        a1;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        com.fitbit.e.a.a(b, "%s%s - %s ms", new Object[] {
            s, s1, Long.valueOf(l)
        });
        if (true) goto _L4; else goto _L3
_L3:
    }

}
