// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bq.d;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bq.l;
import com.google.android.m4b.maps.bw.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.m4b.maps.az:
//            c, a, b

public final class k
    implements b.b, c
{

    final Map b = ax.b();
    final e c = new e(48);
    private final j d;
    private final d e;
    private final com.google.android.m4b.maps.bq.j.a f;
    private final Set g = new CopyOnWriteArraySet();
    private volatile int h;
    private volatile int i;
    private volatile int j;

    public k()
    {
        if (!l.a(ah.a))
        {
            d = null;
            e = null;
            f = null;
            return;
        } else
        {
            d = l.b(ah.a);
            e = com.google.android.m4b.maps.bq.d.a();
            f = new com.google.android.m4b.maps.bq.j.a() {

                private k a;

                public final void a()
                {
                    k k1 = a;
                    synchronized (k1.b)
                    {
                        k1.b.clear();
                    }
                    synchronized (k1.c)
                    {
                        k1.c.a(0);
                    }
                    k1.a();
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                    exception1;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception1;
                }

                public final void a(aa aa1)
                {
                    b b1;
                    synchronized (com.google.android.m4b.maps.az.k.a(a))
                    {
                        b1 = (b)com.google.android.m4b.maps.az.k.a(a).remove(aa1.a());
                    }
                    Collection collection;
                    synchronized (k.b(a))
                    {
                        collection = (Collection)k.b(a).d(aa1.a());
                    }
                    if (b1 != null || collection != null)
                    {
                        if (ab.a("TileBasedBuildingBoundProvider", 3))
                        {
                            aa1 = String.valueOf(aa1.a());
                            Log.d("TileBasedBuildingBoundProvider", (new StringBuilder(String.valueOf(aa1).length() + 33)).append("Removed data for ").append(aa1).append(" from the cache ").toString());
                        }
                        k.c(a);
                    }
                    return;
                    aa1;
                    obj;
                    JVM INSTR monitorexit ;
                    throw aa1;
                    aa1;
                    obj;
                    JVM INSTR monitorexit ;
                    throw aa1;
                }

            
            {
                a = k.this;
                super();
            }
            };
            d.a(f);
            return;
        }
    }

    static Map a(k k1)
    {
        return k1.b;
    }

    static e b(k k1)
    {
        return k1.c;
    }

    static void c(k k1)
    {
        k1.a();
    }

    public final Collection a(ac ac1)
    {
        h = h + 1;
        ac ac2;
        Map map;
        Collection collection;
        boolean flag;
        if (ac1.a > 14)
        {
            ac2 = ac1.a(14);
        } else
        {
            ac2 = ac1;
        }
        synchronized (c)
        {
            collection = (Collection)c.c(ac2);
        }
        if (collection != null)
        {
            i = i + 1;
            return com.google.android.m4b.maps.az.a.a(collection, ac1.d());
        }
        break MISSING_BLOCK_LABEL_78;
        ac1;
        e1;
        JVM INSTR monitorexit ;
        throw ac1;
        map = b;
        map;
        JVM INSTR monitorenter ;
        if ((b)b.get(ac2) != null) goto _L2; else goto _L1
_L1:
        ac1 = new b(d, e, ac2);
        b.put(ac2, ac1);
        flag = true;
_L4:
        map;
        JVM INSTR monitorexit ;
        if (flag)
        {
            ac1.c = this;
            ((b) (ac1)).a.a(((b) (ac1)).b, ac1);
            j = j + 1;
        }
        return com.google.android.m4b.maps.az.c.a;
        ac1;
        map;
        JVM INSTR monitorexit ;
        throw ac1;
_L2:
        ac1 = null;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a()
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((c.a)iterator.next()).a()) { }
    }

    public final void a(b b1, Collection collection)
    {
label0:
        {
            synchronized (b)
            {
                if ((b)b.get(b1.b) == b1)
                {
                    break label0;
                }
            }
            return;
        }
        b.remove(b1.b);
        obj;
        JVM INSTR monitorexit ;
        if (collection != null)
        {
            synchronized (c)
            {
                c.b(b1.b, collection);
            }
            a();
            return;
        } else
        {
            return;
        }
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(c.a a1)
    {
        g.add(a1);
    }

    public final boolean a(a a1)
    {
        return false;
    }

    public final void b(c.a a1)
    {
        g.remove(a1);
    }
}
