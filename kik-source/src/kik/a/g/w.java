// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.g;

import com.kik.g.p;
import com.kik.g.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.e.f;

// Referenced classes of package kik.a.g:
//            v

final class w extends r
{

    final Set a;
    final v b;

    w(v v1, Set set)
    {
        b = v1;
        a = set;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (Set)obj;
        obj = v.a(b);
        obj;
        JVM INSTR monitorenter ;
        String s1;
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); v.a(b).remove(s1))
        {
            k k1 = (k)((Iterator) (obj1)).next();
            s1 = k1.a().a();
            ((p)v.a(b).get(s1)).a(k1);
        }

        break MISSING_BLOCK_LABEL_90;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = a.iterator();
_L1:
        String s;
        p p1;
        do
        {
            if (!exception.hasNext())
            {
                break MISSING_BLOCK_LABEL_169;
            }
            s = (String)exception.next();
            p1 = (p)v.a(b).get(s);
        } while (p1 == null);
        p1.a(new Throwable("failed user lookup"));
        v.a(b).remove(s);
          goto _L1
        v.b(b);
        obj;
        JVM INSTR monitorexit ;
        b.m();
        return;
    }

    public final void a(Throwable throwable)
    {
        LinkedHashMap linkedhashmap = v.a(b);
        linkedhashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if ((p)v.a(b).get(s) != null)
            {
                ((p)v.a(b).get(s)).a(throwable);
                v.a(b).remove(s);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_98;
        throwable;
        linkedhashmap;
        JVM INSTR monitorexit ;
        throw throwable;
        v.b(b);
        linkedhashmap;
        JVM INSTR monitorexit ;
        if (v.c(b).k())
        {
            b.m();
        }
        return;
    }
}
