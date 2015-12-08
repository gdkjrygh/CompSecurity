// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.g;

import com.kik.m.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.e.r;
import kik.a.e.v;
import kik.android.util.bx;

// Referenced classes of package kik.android.g:
//            a

public final class b
{

    private final HashMap a = new HashMap();
    private final HashSet b = new HashSet();
    private final Object c = new Object();
    private final r d;
    private final v e;

    public b(r r1, v v1)
    {
        d = r1;
        e = v1;
        f();
    }

    private List d(List list)
    {
        HashSet hashset;
        boolean flag;
        hashset = new HashSet(a.keySet());
        for (list = list.iterator(); list.hasNext(); hashset.remove((Integer)list.next())) { }
        flag = false;
        list = ((List) (c));
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = hashset.iterator();
_L1:
        Integer integer;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        integer = (Integer)iterator.next();
        a.remove(integer);
        if (b.remove(integer))
        {
            flag = true;
        }
          goto _L1
        list;
        JVM INSTR monitorexit ;
        if (flag)
        {
            e();
        }
        return new ArrayList(hashset);
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void e()
    {
        int i = 0;
        Integer ainteger[] = (Integer[])b.toArray(new Integer[0]);
        ByteBuffer bytebuffer = ByteBuffer.allocate(ainteger.length * 4);
        IntBuffer intbuffer = bytebuffer.asIntBuffer();
        for (; i < ainteger.length; i++)
        {
            intbuffer.put(ainteger[i].intValue());
        }

        String s = com.kik.m.e.a(bytebuffer.array());
        e.c("kik.android.notifications.NotificationTracker.dismissed.ids", s);
    }

    private void f()
    {
        String s = e.n("kik.android.notifications.NotificationTracker.dismissed.ids");
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int ai[] = new byte[0];
        byte abyte0[] = com.kik.m.e.a(s);
        ai = abyte0;
_L4:
        IntBuffer intbuffer = ByteBuffer.wrap(ai).asIntBuffer();
        ai = new int[ai.length / 4];
        intbuffer.get(ai);
        int i = 0;
        while (i < ai.length) 
        {
            b.add(Integer.valueOf(ai[i]));
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        bx.a(ioexception);
          goto _L4
    }

    public final int a(f f1)
    {
        return d.a(f1.b(), true).b().hashCode();
    }

    public final void a()
    {
        synchronized (c)
        {
            a.clear();
            b.clear();
        }
        e();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            f f1 = (f)list.next();
            if (f1 != null)
            {
                k k1 = d.a(f1.b(), true);
                int i = a(f1);
                a(k1, i, b.contains(Integer.valueOf(i)));
            }
        } while (true);
    }

    public final void a(k k1, int i)
    {
        synchronized (c)
        {
            a.put(Integer.valueOf(i), new a(k1, i, false));
            e();
        }
        return;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final void a(k k1, int i, boolean flag)
    {
        synchronized (c)
        {
            if (!a.containsKey(Integer.valueOf(i)))
            {
                a.put(Integer.valueOf(i), new a(k1, i, flag));
            }
        }
        return;
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final boolean a(int i)
    {
        boolean flag;
        synchronized (c)
        {
            flag = a.containsKey(Integer.valueOf(i));
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List b()
    {
        Object obj1 = new ArrayList();
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = a.values().iterator();
_L2:
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_76;
            }
            a1 = (a)iterator.next();
        } while (a1 == null);
        if (a1.a) goto _L2; else goto _L1
_L1:
        ((ArrayList) (obj1)).add(a1);
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
    }

    public final List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(Integer.valueOf(a((f)list.next())))) { }
        return d(arraylist);
    }

    public final int c()
    {
        return b().size();
    }

    public final List c(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null)
        {
            return arraylist;
        }
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            f f1 = (f)list.next();
            int i = a(f1);
            a a1 = (a)a.get(Integer.valueOf(i));
            if (a1 == null || !a1.a)
            {
                arraylist.add(f1);
            }
        } while (true);
        return arraylist;
    }

    public final void d()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
        {
            ((a)iterator.next()).a = true;
        }

        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        b.addAll(a.keySet());
        e();
        obj;
        JVM INSTR monitorexit ;
    }
}
