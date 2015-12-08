// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.az.c;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bi;
import com.google.android.m4b.maps.bo.bj;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bq.d;
import com.google.android.m4b.maps.bw.e;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ax:
//            f

public final class a
    implements com.google.android.m4b.maps.ax.f
{

    public volatile boolean a;
    private final com.google.android.m4b.maps.ax.f b;
    private final c c;
    private final d d;
    private List e;
    private List f;
    private Set g;
    private Set h;
    private com.google.android.m4b.maps.ak.c i;
    private bj j;
    private final e k;
    private final i l;
    private long m;

    public a(com.google.android.m4b.maps.ax.f f1, c c1, d d1, int i1, i j1)
    {
        a = false;
        i = null;
        j = null;
        m = 0L;
        b = f1;
        c = c1;
        d = d1;
        k = new e(i1);
        l = j1;
    }

    private void e(b b1)
    {
        Object obj;
        List list;
        HashSet hashset;
        HashSet hashset1;
        HashSet hashset2;
        list = b.a(b1);
        if (!a && list != null && list.equals(e))
        {
            return;
        }
        m = m + 1L;
        a = false;
        bh bh1 = l.b();
        com.google.android.m4b.maps.ak.c c1;
        Object obj1;
        Iterator iterator;
        ac ac2;
        Iterator iterator1;
        Object obj2;
        int i1;
        int j1;
        int k1;
        if (bh1 != null)
        {
            c1 = bh1.a;
        } else
        {
            c1 = null;
        }
        hashset = new HashSet();
        hashset1 = new HashSet();
        hashset2 = new HashSet();
        iterator = list.iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ac2 = (ac)iterator.next();
        obj1 = (Collection)k.c(ac2);
        obj = obj1;
        if (obj1 == null)
        {
            obj1 = c.a(ac2);
            obj = obj1;
            if (obj1 != c.a)
            {
                k.b(ac2, obj1);
                obj = obj1;
            }
        }
        iterator1 = ((Collection) (obj)).iterator();
_L6:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        obj1 = (com.google.android.m4b.maps.az.a)iterator1.next();
        hashset2.add(((com.google.android.m4b.maps.az.a) (obj1)).a);
        obj = l.a(((com.google.android.m4b.maps.az.a) (obj1)).a);
        if (obj == null)
        {
            obj = null;
        } else
        {
            com.google.android.m4b.maps.bo.bj.a a1 = new com.google.android.m4b.maps.bo.bj.a();
            a1.a = ((com.google.android.m4b.maps.ak.c) (obj));
            obj = a1.a();
        }
        if (obj != null)
        {
            obj2 = new af();
            ((af) (obj2)).a(((com.google.android.m4b.maps.bo.bd) (obj)));
            hashset.add(ac2.a(((af) (obj2))));
        }
        this;
        JVM INSTR monitorenter ;
        if (((com.google.android.m4b.maps.az.a) (obj1)).a.equals(i))
        {
            obj2 = new af();
            ((af) (obj2)).a(j);
            hashset.add(ac2.a(((af) (obj2))));
        }
        this;
        JVM INSTR monitorexit ;
        if (obj != null && ((com.google.android.m4b.maps.az.a) (obj1)).a.equals(c1))
        {
            j1 = bh1.b(((bj) (obj)).a);
            if (j1 != -1)
            {
                obj2 = bh1.b;
                i1 = Math.max(j1 - 1, 0);
                k1 = Math.min(j1 + 1 + 1, ((List) (obj2)).size());
                while (i1 < k1) 
                {
                    if (i1 != j1)
                    {
                        obj = new af();
                        ((af) (obj)).a(bj.a(((bi)((List) (obj2)).get(i1)).c));
                        obj = ac2.a(((af) (obj)));
                        ac ac1 = a(((ac) (obj)), com.google.android.m4b.maps.bo.g.a(b1.d));
                        if (ac1 != null)
                        {
                            obj = ac1;
                        }
                        hashset1.add(obj);
                    }
                    i1++;
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
          goto _L7
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
_L2:
        e = list;
        f = com.google.android.m4b.maps.aa.f.a(hashset);
        g = hashset1;
        h = hashset2;
        return;
_L4:
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final float a(g g1)
    {
        return b.a(g1);
    }

    public final long a()
    {
        return m;
    }

    public final ac a(ac ac1, g g1)
    {
        return b.a(ac1, g1);
    }

    public final List a(b b1)
    {
        e(b1);
        return f;
    }

    public final void a(com.google.android.m4b.maps.ak.c c1, com.google.android.m4b.maps.ak.c c2)
    {
        this;
        JVM INSTR monitorenter ;
        i = c1;
        c1 = new com.google.android.m4b.maps.bo.bj.a();
        c1.a = c2;
        j = c1.a();
        a = true;
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    public final List b(g g1)
    {
        return ae.e();
    }

    public final Set b(b b1)
    {
        e(b1);
        return g;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        i = null;
        j = null;
        a = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Set c(b b1)
    {
        e(b1);
        return h;
    }

    public final com.google.android.m4b.maps.ak.c d(b b1)
    {
        double d1;
        Object obj1;
        Object obj2;
        Iterator iterator;
        d1 = 8D;
        obj2 = null;
        obj1 = null;
        e(b1);
        iterator = e.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (ac)iterator.next();
        if (!((ac) (obj)).d().a(com.google.android.m4b.maps.bo.g.a(b1.b.a))) goto _L4; else goto _L3
_L3:
        Object obj3 = (Collection)k.c(obj);
        obj = obj2;
        if (obj3 != null)
        {
            g g1 = com.google.android.m4b.maps.bo.g.a(b1.b.a);
            double d2 = b1.b.b;
            if (d2 > 19D)
            {
                d1 = 8D / Math.pow(2D, d2 - 19D);
            }
            m m1 = com.google.android.m4b.maps.bo.m.a(g1, (int)(d1 * com.google.android.m4b.maps.bo.g.a(g1.b())));
            obj3 = ((Collection) (obj3)).iterator();
            float f1 = 0.0F;
            b1 = obj1;
            do
            {
                obj = b1;
                if (!((Iterator) (obj3)).hasNext())
                {
                    break;
                }
                obj = (com.google.android.m4b.maps.az.a)((Iterator) (obj3)).next();
                if (((com.google.android.m4b.maps.az.a) (obj)).a(m1))
                {
                    float f2 = ((com.google.android.m4b.maps.az.a) (obj)).b.d(g1);
                    if (b1 == null || f2 < f1)
                    {
                        b1 = ((com.google.android.m4b.maps.az.a) (obj)).a;
                        f1 = f2;
                    }
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
        return ((com.google.android.m4b.maps.ak.c) (obj));
    }
}
