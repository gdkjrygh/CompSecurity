// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            wg, dk, pe, dc, 
//            dg

public final class dm
{

    boolean a;
    private final List b = new LinkedList();
    private final Map c = new LinkedHashMap();
    private final Object d = new Object();
    private String e;
    private dk f;
    private dm g;

    public dm(boolean flag, String s, String s1)
    {
        a = flag;
        c.put("action", s);
        c.put("ad_format", s1);
    }

    public final dk a()
    {
        return a(zzp.zzbz().b());
    }

    public final dk a(long l)
    {
        if (!a)
        {
            return null;
        } else
        {
            return new dk(l, null, null);
        }
    }

    public final void a(dm dm1)
    {
        synchronized (d)
        {
            g = dm1;
        }
        return;
        dm1;
        obj;
        JVM INSTR monitorexit ;
        throw dm1;
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
        Object obj1;
        while (!a || TextUtils.isEmpty(s1) || (obj1 = zzp.zzby().d()) == null) 
        {
            return;
        }
        synchronized (d)
        {
            obj1 = ((dc) (obj1)).a(s);
            Map map = c;
            map.put(s, ((dg) (obj1)).a((String)map.get(s), s1));
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final transient boolean a(dk dk1, long l, String as[])
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
        dk dk2 = new dk(l, as[i], dk1);
        b.add(dk2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        dk1;
        obj;
        JVM INSTR monitorexit ;
        throw dk1;
    }

    public final transient boolean a(dk dk1, String as[])
    {
        if (!a || dk1 == null)
        {
            return false;
        } else
        {
            return a(dk1, zzp.zzbz().b(), as);
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
        dk dk1;
        long l;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            dk1 = (dk)iterator.next();
            l = dk1.a();
            s = dk1.b();
            dk1 = dk1.c();
        } while (dk1 == null || l <= 0L);
        long l1 = dk1.a();
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
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = zzp.zzby().d();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj1 = c;
        obj;
        JVM INSTR monitorexit ;
        return ((Map) (obj1));
        obj1 = ((dc) (obj1)).a(c, g.d());
        obj;
        JVM INSTR monitorexit ;
        return ((Map) (obj1));
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final dk e()
    {
        dk dk1;
        synchronized (d)
        {
            dk1 = f;
        }
        return dk1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
