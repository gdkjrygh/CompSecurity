// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, io

public final class be
{

    boolean a;
    private final List b = new LinkedList();
    private final Map c = new LinkedHashMap();
    private final Object d = new Object();
    private String e;
    private bd f;

    public be(boolean flag, String s, String s1)
    {
        a = flag;
        c.put("action", s);
        c.put("ad_format", s1);
    }

    private transient boolean a(bd bd1, long l, String as[])
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
        bd bd2 = new bd(l, as[i], bd1);
        b.add(bd2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        bd1;
        obj;
        JVM INSTR monitorexit ;
        throw bd1;
    }

    public final bd a()
    {
        return a(p.i().b());
    }

    public final bd a(long l)
    {
        if (!a)
        {
            return null;
        } else
        {
            return new bd(l, null, null);
        }
    }

    public final void a(String s)
    {
        if (!a)
        {
            return;
        }
        synchronized (d)
        {
            e = s;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, String s1)
    {
        if (!a)
        {
            return;
        }
        synchronized (d)
        {
            c.put(s, s1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final transient boolean a(bd bd1, String as[])
    {
        if (!a || bd1 == null)
        {
            return false;
        } else
        {
            return a(bd1, p.i().b(), as);
        }
    }

    public final void b()
    {
        synchronized (d)
        {
            f = a();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String c()
    {
        Object obj1 = new StringBuilder();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = b.iterator();
_L2:
        String s;
        bd bd1;
        long l;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            bd1 = (bd)iterator.next();
            l = bd1.a();
            s = bd1.b();
            bd1 = bd1.c();
        } while (bd1 == null || l <= 0L);
        long l1 = bd1.a();
        ((StringBuilder) (obj1)).append(s).append('.').append(l - l1).append(',');
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        b.clear();
        if (TextUtils.isEmpty(e)) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(e);
_L6:
        obj1 = ((StringBuilder) (obj1)).toString();
        obj;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
_L4:
        if (((StringBuilder) (obj1)).length() <= 0) goto _L6; else goto _L5
_L5:
        ((StringBuilder) (obj1)).setLength(((StringBuilder) (obj1)).length() - 1);
          goto _L6
    }

    final Map d()
    {
        Map map;
        synchronized (d)
        {
            map = c;
        }
        return map;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final bd e()
    {
        bd bd1;
        synchronized (d)
        {
            bd1 = f;
        }
        return bd1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
