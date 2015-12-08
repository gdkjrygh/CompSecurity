// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.ar;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.cc.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            w, ab, v, ad, 
//            ah

public final class ak extends w
{
    public static interface a
    {

        public abstract void c(m m1);

        public abstract void d(m m1);

        public abstract void e(m m1);
    }


    public final HashMap a = new HashMap();
    public a b;
    private final LinkedList c = new LinkedList();
    private boolean f;
    private final HashMap g = new HashMap();
    private aq h;
    private List i;
    private final r.a j;
    private int k;
    private boolean l;
    private m m;

    public ak(r.a a1, ah ah1)
    {
        super(ah1);
        i = new ArrayList();
        k = 0;
        l = false;
        j = a1;
    }

    private void a(b b1)
    {
        aq aq1 = b1.h();
        if (!f && aq1.equals(h))
        {
            return;
        }
        ar ar1;
        Object obj;
        Iterator iterator;
        if (i == null)
        {
            i = new ArrayList();
        } else
        {
            i.clear();
        }
        ar1 = aq1.c;
        obj = com.google.android.m4b.maps.bo.g.a(b1.d);
        obj = aq.a(com.google.android.m4b.maps.bo.g.a(aq1.a[0], ((g) (obj))), com.google.android.m4b.maps.bo.g.a(aq1.a[1], ((g) (obj))), com.google.android.m4b.maps.bo.g.a(aq1.a[3], ((g) (obj))), com.google.android.m4b.maps.bo.g.a(aq1.a[2], ((g) (obj))));
        iterator = c.iterator();
        do
        {
            try
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                m m1 = (m)iterator.next();
                if (m1.a() && m1.a != null)
                {
                    g g1 = new g();
                    m1.f().h(g1);
                    if (ar1.a(g1) && aq1.a(g1) || ((aq) (obj)).a(g1) && m1.a(b1))
                    {
                        i.add(m1);
                    }
                }
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (b b1) { }
            break;
        } while (true);
        h = aq1;
        f = false;
    }

    private void d(m m1)
    {
        if (m1.e() == 0)
        {
            a.remove(m1.a);
        }
        if (m1.g() == 0)
        {
            a.remove(m1.b);
        }
    }

    private void e(float f1, float f2, b b1)
    {
        b1 = b1.b(f1, f2 - 70F);
        m.a(b1);
    }

    private void k()
    {
        i.clear();
        f = true;
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        m m1;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); m1.g())
        {
            m1 = (m)iterator.next();
            m1.e();
        }

        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        throw exception;
        a.clear();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(d d1)
    {
        d1 = e;
        d1;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        l();
        this;
        JVM INSTR monitorexit ;
        d1;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        if (ab1.b != 0 || c.size() <= 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        a(b1);
        com.google.android.m4b.maps.az.i.a();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_65;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
        for (Iterator iterator1 = i.iterator(); iterator1.hasNext(); ((m)iterator1.next()).b(b1)) { }
        if (i.size() > 1)
        {
            Collections.sort(i);
        }
        if (i.size() != 0)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ab ab2;
        GL10 gl10 = d1.a;
        d1.c();
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvx(8960, 8704, 7681);
        d1.s.d(d1);
        ab2 = new ab(ab1);
        ab2.b = 0;
        ab1 = i.iterator();
        do
        {
            if (!ab1.hasNext())
            {
                break;
            }
            m m1 = (m)ab1.next();
            if (m1.b != null)
            {
                m1.a(d1, b1, ab2);
            }
        } while (true);
        Iterator iterator2;
        ab2.b = 1;
        iterator2 = i.iterator();
        ab1 = null;
_L4:
        m m2;
        if (!iterator2.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        m2 = (m)iterator2.next();
        if (m2.i)
        {
            ab1 = m2;
            continue; /* Loop/switch isn't completed */
        }
        m2.a(d1, b1, ab2);
        if (true) goto _L4; else goto _L3
_L3:
        if (ab1 == null)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        ab1.a(d1, b1, ab2);
        this;
        JVM INSTR monitorexit ;
_L2:
    }

    public final void a(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!g.containsKey(m1))
        {
            m1.h = this;
            c.add(m1);
            g.put(m1, m1);
            k();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        m1;
        throw m1;
    }

    public final void a(List list, float f1, float f2, b b1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        a(b1);
        iterator = i.iterator();
_L2:
        v v1;
        int j1;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_98;
                }
                v1 = (v)iterator.next();
            } while (!v1.l());
            j1 = v1.a(f1, f2, b1);
        } while (j1 >= i1);
        list.add(new ad(v1, this, j1));
        if (true) goto _L2; else goto _L1
_L1:
        list;
        throw list;
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean a(b b1, d d1)
    {
        return true;
    }

    public final void b(m m1)
    {
        ah ah1 = e;
        ah1;
        JVM INSTR monitorenter ;
        this;
        JVM INSTR monitorenter ;
        if (g.containsKey(m1))
        {
            g.remove(m1);
            c.remove(m1);
            if (m1.i)
            {
                m1.j = false;
                e.c();
            }
            d(m1);
            k();
        }
        this;
        JVM INSTR monitorexit ;
        ah1;
        JVM INSTR monitorexit ;
        return;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
        m1;
        ah1;
        JVM INSTR monitorexit ;
        throw m1;
    }

    public final boolean b(float f1, float f2, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = i.iterator();
        m m1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            m1 = (m)iterator.next();
        } while (!m1.k || !m1.b(f1, f2, b1));
        l = true;
        m = m1;
        e(f1, f2, b1);
        if (b != null)
        {
            b.c(m);
        }
        this;
        JVM INSTR monitorexit ;
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final boolean b(float f1, float f2, g g1, b b1)
    {
        boolean flag = false;
        if (l)
        {
            e(f1, f2, b1);
            if (b != null)
            {
                b.e(m);
            }
            m = null;
            l = false;
            flag = true;
        }
        return flag;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        k();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        if (g.containsKey(m1))
        {
            g.remove(m1);
            c.remove(m1);
            d(m1);
            k();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        m1;
        throw m1;
    }

    public final r.a d()
    {
        return j;
    }

    public final boolean d(float f1, float f2, b b1)
    {
        if (l)
        {
            e(f1, f2, b1);
            if (b != null)
            {
                b.d(m);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final List j()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ArrayList();
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((List) (obj)).add(((m)iterator.next()).n)) { }
        break MISSING_BLOCK_LABEL_56;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public final boolean m_()
    {
        return l;
    }
}
