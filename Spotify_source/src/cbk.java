// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class cbk
{

    public boolean a;
    public final Object b = new Object();
    public String c;
    cbk d;
    private final List e = new LinkedList();
    private final Map f = new LinkedHashMap();
    private cbi g;

    public cbk(boolean flag, String s, String s1)
    {
        a = flag;
        f.put("action", s);
        f.put("ad_format", s1);
    }

    public final cbi a()
    {
        return a(bkv.i().b());
    }

    public final cbi a(long l)
    {
        if (!a)
        {
            return null;
        } else
        {
            return new cbi(l, null, null);
        }
    }

    public final void a(String s, String s1)
    {
        Object obj1;
        while (!a || TextUtils.isEmpty(s1) || (obj1 = bkv.h().c()) == null) 
        {
            return;
        }
        synchronized (b)
        {
            obj1 = ((cbe) (obj1)).a(s);
            Map map = f;
            map.put(s, ((cbh) (obj1)).a((String)map.get(s), s1));
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final transient boolean a(cbi cbi1, long l, String as[])
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        cbi cbi2 = new cbi(l, as[i], cbi1);
        e.add(cbi2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        cbi1;
        obj;
        JVM INSTR monitorexit ;
        throw cbi1;
    }

    public final transient boolean a(cbi cbi1, String as[])
    {
        if (!a || cbi1 == null)
        {
            return false;
        } else
        {
            return a(cbi1, bkv.i().b(), as);
        }
    }

    public final void b()
    {
        synchronized (b)
        {
            g = a();
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
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = e.iterator();
_L2:
        String s;
        cbi cbi1;
        long l;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            cbi1 = (cbi)iterator.next();
            l = cbi1.a;
            s = cbi1.b;
            cbi1 = cbi1.c;
        } while (cbi1 == null || l <= 0L);
        long l1 = cbi1.a;
        ((StringBuilder) (obj1)).append(s).append('.').append(l - l1).append(',');
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        e.clear();
        if (TextUtils.isEmpty(c)) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj1)).append(c);
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
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = bkv.h().c();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj1 = f;
        obj;
        JVM INSTR monitorexit ;
        return ((Map) (obj1));
        obj1 = ((cbe) (obj1)).a(f, d.d());
        obj;
        JVM INSTR monitorexit ;
        return ((Map) (obj1));
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final cbi e()
    {
        cbi cbi1;
        synchronized (b)
        {
            cbi1 = g;
        }
        return cbi1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
