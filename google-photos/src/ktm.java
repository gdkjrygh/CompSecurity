// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class ktm
{

    public boolean a;
    private final List b = new LinkedList();
    private final Map c = new LinkedHashMap();
    private final Object d = new Object();

    public ktm(boolean flag, String s, String s1)
    {
        a = flag;
        c.put("action", s);
        c.put("ad_format", s1);
    }

    public final ktl a()
    {
        long l = jqc.g().b();
        if (!a)
        {
            return null;
        } else
        {
            return new ktl(l, null, null);
        }
    }

    public transient boolean a(ktl ktl1, long l, String as[])
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ktl ktl2 = new ktl(l, as[i], ktl1);
        b.add(ktl2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        ktl1;
        obj;
        JVM INSTR monitorexit ;
        throw ktl1;
    }
}
