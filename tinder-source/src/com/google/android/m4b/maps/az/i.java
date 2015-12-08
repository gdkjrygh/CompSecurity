// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ak.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bd.b;
import com.google.android.m4b.maps.be.g;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bi;
import com.google.android.m4b.maps.bq.d;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cg.cg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.m4b.maps.az:
//            d, f, c

public final class i
    implements b
{
    public static interface a
    {

        public abstract void a(i i1);

        public abstract void a(cg cg1);

        public abstract void c();
    }


    public static final c g = new c(new com.google.android.m4b.maps.ak.a.c(0L, 0L), 0);
    private static i j;
    public final Map a = Collections.synchronizedMap(new WeakHashMap());
    public final Map b = Collections.synchronizedMap(new WeakHashMap());
    public final e c = new e(100);
    public c d;
    public final Object e = new Object();
    public final com.google.android.m4b.maps.az.c f;
    public volatile c h;
    public volatile c i;
    private final e k = new e(100);
    private com.google.android.m4b.maps.ak.a.c l;
    private bh m;
    private final Set n = new HashSet();
    private final List o = new ArrayList();
    private final Set p = new HashSet();
    private final d q;
    private final Map r = ax.b();
    private final Map s = Collections.synchronizedMap(new HashMap());

    private i(d d1, com.google.android.m4b.maps.bw.g g1)
    {
        q = d1;
        f = new com.google.android.m4b.maps.az.d(g1);
    }

    private c a(bh bh1)
    {
        boolean flag = false;
        e e1 = c;
        e1;
        JVM INSTR monitorenter ;
        Object obj = (c)c.c(bh1.a);
        Object obj1;
        int i1;
        obj1 = obj;
        i1 = ((flag) ? 1 : 0);
        if (obj != null) goto _L2; else goto _L1
_L1:
        i1 = bh1.c;
        if (i1 < 0) goto _L4; else goto _L3
_L3:
        if (i1 < bh1.b.size()) goto _L5; else goto _L4
_L10:
        if (obj != null) goto _L7; else goto _L6
_L6:
        obj = g;
_L8:
        c.b(bh1.a, obj);
        obj1 = obj;
        i1 = ((flag) ? 1 : 0);
        if (obj != g)
        {
            i1 = 1;
            obj1 = obj;
        }
_L2:
        e1;
        JVM INSTR monitorexit ;
        if (i1 != 0)
        {
            d(bh1);
        }
        return ((c) (obj1));
_L5:
        obj = (bi)bh1.b.get(i1);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = ((bi) (obj)).c;
          goto _L8
        bh1;
        e1;
        JVM INSTR monitorexit ;
        throw bh1;
_L4:
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static i a()
    {
        return j;
    }

    public static i a(d d1, com.google.android.m4b.maps.bw.g g1)
    {
        if (j == null)
        {
            j = new i(d1, g1);
        }
        return j;
    }

    static void a(i i1, cg cg1)
    {
        i1.d(cg1);
    }

    private void a(bh bh1, c c1)
    {
        bi bi1 = bh1.a(c1);
        if (bi1 != null)
        {
            bh1 = bi1.a.iterator();
            do
            {
                if (!bh1.hasNext())
                {
                    break;
                }
                c1 = (com.google.android.m4b.maps.ak.a.c)bh1.next();
                if (a(((com.google.android.m4b.maps.ak.a.c) (c1)), bi1.c))
                {
                    a(((com.google.android.m4b.maps.ak.a.c) (c1)), new b() {

                        private i a;

                        public final void a(com.google.android.m4b.maps.ak.a.c c2, int i1, bh bh2)
                        {
                            if (i1 == 2)
                            {
                                if (ab.a("IndoorState", 3))
                                {
                                    c2 = String.valueOf(c2);
                                    Log.d("IndoorState", (new StringBuilder(String.valueOf(c2).length() + 22)).append("Building id ").append(c2).append(" not found").toString());
                                }
                            } else
                            if (i1 == 0)
                            {
                                i.a(a, bh2);
                                return;
                            }
                        }

            
            {
                a = i.this;
                super();
            }
                    });
                }
            } while (true);
        } else
        if (ab.a("IndoorState", 3))
        {
            c1 = String.valueOf(c1);
            bh1 = String.valueOf(bh1.a);
            Log.d("IndoorState", (new StringBuilder(String.valueOf(c1).length() + 37 + String.valueOf(bh1).length())).append("Failed to look up level ").append(c1).append(" in building ").append(bh1).toString());
        }
    }

    public static int b(cg cg1)
    {
        return cg1.c();
    }

    public static boolean c(cg cg1)
    {
        return cg1.d();
    }

    private void g()
    {
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); ((a)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        for (Iterator iterator1 = b.keySet().iterator(); iterator1.hasNext(); ((com.google.android.m4b.maps.cg.e)iterator1.next()).a()) { }
        map;
        JVM INSTR monitorexit ;
    }

    private void h()
    {
        f();
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); ((a)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
    }

    public final c a(com.google.android.m4b.maps.ak.a.c c1)
    {
        c c2;
        synchronized (c)
        {
            c2 = (c)c.c(c1);
        }
        obj = c2;
        if (c2 == null)
        {
            obj = q.a(c1);
            if (obj != null)
            {
                obj = a(((bh) (obj)));
            } else
            {
                a(c1, ((b) (this)));
                obj = c2;
            }
        }
        c1 = ((com.google.android.m4b.maps.ak.a.c) (obj));
        if (obj == g)
        {
            c1 = null;
        }
        return c1;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final f a(com.google.android.m4b.maps.ak.a.c c1, boolean flag, boolean flag1)
    {
        Map map = s;
        map;
        JVM INSTR monitorenter ;
        Object obj1 = (f)s.get(c1);
        if (!flag || obj1 == null) goto _L2; else goto _L1
_L1:
        if (((f) (obj1)).d().size() <= 1) goto _L2; else goto _L3
_L3:
        Object obj;
        obj = obj1;
        obj1 = null;
_L9:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        map;
        JVM INSTR monitorexit ;
        return ((f) (obj1));
        obj1 = q.a(c1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        a(c1, ((b) (null)));
        map;
        JVM INSTR monitorexit ;
        return null;
        obj1 = ((bh) (obj1)).a(c1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        f f1 = new f(((com.google.android.m4b.maps.cg.c) (obj1)));
        if (!flag1) goto _L5; else goto _L4
_L4:
        s.put(c1, f1);
        if (obj == null) goto _L5; else goto _L6
_L6:
        if (((f) (obj)).a.containsKey(c1)) goto _L8; else goto _L7
_L7:
        for (c1 = ((f) (obj)).d().iterator(); c1.hasNext(); s.put(obj1, obj))
        {
            obj1 = (com.google.android.m4b.maps.ak.a.c)c1.next();
        }

          goto _L5
        c1;
        map;
        JVM INSTR monitorexit ;
        throw c1;
_L8:
        obj1 = new f(((com.google.android.m4b.maps.cg.c)((f) (obj)).a.get(c1)).e());
        obj = ((f) (obj)).a.values().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.cg.c c2 = (com.google.android.m4b.maps.cg.c)((Iterator) (obj)).next();
            if (!c2.b().equals(c1))
            {
                ((f) (obj1)).a(c2);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_315;
_L5:
        map;
        JVM INSTR monitorexit ;
        return f1;
_L2:
        obj = null;
          goto _L9
        obj = obj1;
          goto _L7
    }

    public final com.google.android.m4b.maps.cg.c a(cg cg1)
    {
        c c1 = a(cg1.a());
        if (c1 != null)
        {
            return cg1.c(c1);
        } else
        {
            return null;
        }
    }

    public final void a(com.google.android.m4b.maps.ak.a.c c1, int i1, bh bh1)
    {
        Object obj1;
        boolean flag;
        flag = true;
        obj1 = null;
        if (i1 != 2) goto _L2; else goto _L1
_L1:
        if (ab.a("IndoorState", 3))
        {
            c1 = String.valueOf(c1);
            Log.d("IndoorState", (new StringBuilder(String.valueOf(c1).length() + 22)).append("Building id ").append(c1).append(" not found").toString());
        }
_L4:
        return;
_L2:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        Object obj2 = e;
        obj2;
        JVM INSTR monitorenter ;
        Object obj = obj1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = obj1;
        if (d.a.equals(c1))
        {
            obj = d;
            d = null;
        }
        obj2;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            a(bh1, ((c) (obj)));
        }
        a(bh1);
        obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (!c1.equals(l))
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (m != null && bh1.a.equals(m.a)) goto _L6; else goto _L5
_L5:
        if (!bh1.b.isEmpty()) goto _L8; else goto _L7
_L7:
        if (m == null) goto _L6; else goto _L9
_L9:
        m = null;
        i1 = 1;
_L13:
        l = null;
_L15:
        obj;
        JVM INSTR monitorexit ;
        if (i1 != 0)
        {
            g();
        }
        obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (!n.contains(c1)) goto _L11; else goto _L10
_L10:
        n.remove(c1);
        o.add(bh1);
        i1 = ((flag) ? 1 : 0);
_L14:
        obj;
        JVM INSTR monitorexit ;
        if (i1 == 0) goto _L4; else goto _L12
_L12:
        h();
        return;
        c1;
        obj2;
        JVM INSTR monitorexit ;
        throw c1;
_L8:
        m = bh1;
        i1 = 1;
          goto _L13
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
_L11:
        i1 = 0;
          goto _L14
_L6:
        i1 = 0;
          goto _L13
        i1 = 0;
          goto _L15
    }

    public final void a(com.google.android.m4b.maps.ak.a.c c1, b b1)
    {
        if (com.google.android.m4b.maps.be.g.a(q.b.a(c1, false)))
        {
            return;
        } else
        {
            q.a(c1, b1);
            return;
        }
    }

    public final void a(Set set)
    {
        Object obj1 = e;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        obj = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        obj = al.f();
        if (!((Set) (obj)).equals(p))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        obj1;
        JVM INSTR monitorexit ;
        return;
        p.clear();
        p.addAll(((Collection) (obj)));
        n.clear();
        n.addAll(((Collection) (obj)));
        o.clear();
        set = p.iterator();
_L1:
        bh bh1;
        if (!set.hasNext())
        {
            break MISSING_BLOCK_LABEL_166;
        }
        obj = (com.google.android.m4b.maps.ak.a.c)set.next();
        bh1 = q.a(((com.google.android.m4b.maps.ak.a.c) (obj)));
        if (bh1 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        o.add(bh1);
        n.remove(obj);
          goto _L1
        set;
        obj1;
        JVM INSTR monitorexit ;
        throw set;
        a(((com.google.android.m4b.maps.ak.a.c) (obj)), ((b) (this)));
          goto _L1
        obj1;
        JVM INSTR monitorexit ;
        h();
        return;
    }

    public final boolean a(com.google.android.m4b.maps.ak.a.c c1, c c2)
    {
        Object obj;
label0:
        {
            synchronized (c)
            {
                obj = (c)c.c(c1);
                if (!c2.equals(obj))
                {
                    break label0;
                }
            }
            return false;
        }
        c.b(c1, c2);
        if (obj == null) goto _L2; else goto _L1
_L1:
        e e2 = c;
        e2;
        JVM INSTR monitorenter ;
        k.b(c1, obj);
        obj = q.b(((c) (obj)).a);
        if (obj != null) goto _L4; else goto _L3
_L3:
        e2;
        JVM INSTR monitorexit ;
_L2:
        e1;
        JVM INSTR monitorexit ;
        return true;
_L4:
        if (c2 != g) goto _L6; else goto _L5
_L5:
        c2 = ae.e();
_L9:
        obj = ((bi) (obj)).a.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.ak.a.c c3 = (com.google.android.m4b.maps.ak.a.c)((Iterator) (obj)).next();
            if (!c3.equals(c1) && !c2.contains(c3))
            {
                k.b(c3, c.c(c3));
                c.b(c3, g);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_231;
        c1;
        e2;
        JVM INSTR monitorexit ;
        throw c1;
        c1;
        e1;
        JVM INSTR monitorexit ;
        throw c1;
_L6:
        c2 = q.b(c2.a);
        if (c2 != null) goto _L8; else goto _L7
_L7:
        e2;
        JVM INSTR monitorexit ;
          goto _L2
_L8:
        c2 = ((bi) (c2)).a;
          goto _L9
        e2;
        JVM INSTR monitorexit ;
          goto _L2
    }

    public final c b(com.google.android.m4b.maps.ak.a.c c1)
    {
        e e1 = c;
        e1;
        JVM INSTR monitorenter ;
        c c2 = (c)k.c(c1);
        c1 = c2;
        if (c2 == g)
        {
            c1 = null;
        }
        e1;
        JVM INSTR monitorexit ;
        return c1;
        c1;
        e1;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final bh b()
    {
        bh bh1;
        synchronized (e)
        {
            bh1 = m;
        }
        return bh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List c()
    {
        ae ae1;
        synchronized (e)
        {
            ae1 = ae.a(o);
        }
        return ae1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c(com.google.android.m4b.maps.ak.a.c c1)
    {
        boolean flag;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        flag = false;
        c1 = ((com.google.android.m4b.maps.ak.a.c) (e));
        c1;
        JVM INSTR monitorenter ;
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        l = null;
        m = null;
        flag = true;
        c1;
        JVM INSTR monitorexit ;
        if (flag)
        {
            g();
        }
        return;
        Exception exception;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
        synchronized (e)
        {
            if (!c1.equals(l) && (m == null || !m.a.equals(c1)))
            {
                break MISSING_BLOCK_LABEL_95;
            }
        }
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
        l = c1;
        obj;
        JVM INSTR monitorexit ;
        a(c1, this);
        return;
    }

    public final Set d()
    {
        Object obj = c();
        HashSet hashset = new HashSet();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.cg.c c1 = a((cg)((Iterator) (obj)).next());
            if (c1 != null)
            {
                hashset.add(c1);
            }
        } while (true);
        return hashset;
    }

    public final void d(cg cg1)
    {
        f();
        Map map = b;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); ((a)iterator.next()).a(cg1)) { }
        break MISSING_BLOCK_LABEL_58;
        cg1;
        map;
        JVM INSTR monitorexit ;
        throw cg1;
        for (Iterator iterator1 = b.keySet().iterator(); iterator1.hasNext(); ((com.google.android.m4b.maps.cg.e)iterator1.next()).a(cg1)) { }
        map;
        JVM INSTR monitorexit ;
    }

    public final Set e()
    {
        al al1;
        synchronized (s)
        {
            al1 = al.a(s.values());
        }
        return al1;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void f()
    {
        Map map = s;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator;
        r.clear();
        s.clear();
        iterator = d().iterator();
_L6:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        com.google.android.m4b.maps.cg.c c1;
        c1 = (com.google.android.m4b.maps.cg.c)iterator.next();
        obj = c1.a();
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((c) (obj)).equals(h) || ((c) (obj)).equals(i))
        {
            break MISSING_BLOCK_LABEL_200;
        }
          goto _L4
_L9:
        boolean flag;
        if (flag) goto _L6; else goto _L5
_L5:
        obj = (f)r.get(Integer.valueOf(c1.e()));
        if (obj != null) goto _L8; else goto _L7
_L7:
        obj = new f(c1);
        r.put(Integer.valueOf(c1.e()), obj);
_L10:
        s.put(c1.b(), obj);
          goto _L6
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        flag = false;
          goto _L9
_L8:
        ((f) (obj)).a(c1);
          goto _L10
_L2:
        map;
        JVM INSTR monitorexit ;
        return;
        flag = true;
          goto _L9
    }

}
