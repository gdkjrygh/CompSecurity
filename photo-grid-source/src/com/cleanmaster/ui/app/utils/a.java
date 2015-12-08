// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.utils;

import android.text.TextUtils;
import com.cleanmaster.ui.app.market.d;
import com.cleanmaster.ui.app.market.i;
import com.cleanmaster.ui.app.market.k;
import com.cleanmaster.util.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

// Referenced classes of package com.cleanmaster.ui.app.utils:
//            c, b

public class a
{

    private static volatile a a;
    private LinkedList b;
    private HashMap c;
    private Object d;
    private n e;

    protected a()
    {
        d = new Object();
        c = new HashMap();
        b = new LinkedList();
        e = new n(100);
    }

    public static a a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/cleanmaster/ui/app/utils/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a();
        }
        com/cleanmaster/ui/app/utils/a;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/cleanmaster/ui/app/utils/a;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static HashMap a(a a1)
    {
        return a1.c;
    }

    static void a(a a1, String s, String s1)
    {
        a1.a(s, s1);
    }

    private void a(String s, String s1)
    {
        synchronized (d)
        {
            e.b(s, s1);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void b()
    {
        c c1;
        String s;
        i j;
        for (; c.size() < 2 && !b.isEmpty(); j.a(s, c1.c, c1.d, c1.e))
        {
            c1 = (c)b.removeFirst();
            s = c1.b;
            j = new i();
            j.a(new b(this, s));
            c.put(s, j);
        }

    }

    static void b(a a1)
    {
        a1.b();
    }

    private boolean b(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((c)iterator.next()).b.equals(s))
            {
                return true;
            }
        }

        return false;
    }

    private c c(String s)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            c c1 = (c)iterator.next();
            if (c1.b.equals(s))
            {
                return c1;
            }
        }

        return null;
    }

    private boolean d(String s)
    {
        while (e.a(s) != null || c.containsKey(s)) 
        {
            return true;
        }
        return false;
    }

    public String a(String s)
    {
        synchronized (d)
        {
            s = (String)e.a(s);
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(int j)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new LinkedList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c1.a == j)
            {
                ((LinkedList) (obj1)).add(c1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_70;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (!((LinkedList) (obj1)).isEmpty())
        {
            b.removeAll(((java.util.Collection) (obj1)));
        }
        if (c == null || c.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj1 = c.keySet().iterator();
_L2:
        Object obj2;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_187;
            }
            obj2 = ((Iterator) (obj1)).next();
            obj2 = ((i)c.get((String)obj2)).a();
        } while (obj2 == null);
        if (((k) (obj2)).c() != com.cleanmaster.ui.app.market.loader.AsyncTaskEx.Status.RUNNING || ((k) (obj2)).f()) goto _L2; else goto _L1
_L1:
        ((k) (obj2)).a(true);
          goto _L2
        c.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(int j, String s, String s1, String s2, String s3)
    {
        while (j < 0 || TextUtils.isEmpty(s) || android.os.Build.VERSION.SDK_INT <= 10 || com.cleanmaster.ui.app.market.d.a(s)) 
        {
            return;
        }
        synchronized (d)
        {
            if (!d(s))
            {
                break MISSING_BLOCK_LABEL_54;
            }
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        if (!b(s))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s = c(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b.remove(s);
        b.addFirst(s);
_L2:
        b();
        obj;
        JVM INSTR monitorexit ;
        return;
        if (b.size() >= 50)
        {
            b.removeLast();
        }
        b.addFirst(new c(this, j, s, s1, s2, s3));
        if (true) goto _L2; else goto _L1
_L1:
    }
}
