// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.ag;
import com.android.slyce.a.ah;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.bp;
import com.android.slyce.a.c.bn;
import java.io.IOException;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.slyce.a.c.d:
//            j, ab, ac, av, 
//            s, b, k, aa, 
//            h, o, i, g

public class a
    implements j
{

    ag a;
    ah b;
    i c;
    k d;
    av e;
    Hashtable f;
    bn g;
    boolean h;
    int i;
    final ab j;
    long k;
    ab l;
    boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private Map r;

    public a(ag ag1, bn bn1)
    {
        f = new Hashtable();
        h = true;
        j = new ab();
        l = new ab();
        q = false;
        g = bn1;
        a = ag1;
        b = new ah(ag1);
        if (bn1 != bn.c) goto _L2; else goto _L1
_L1:
        e = new ac();
_L4:
        c = e.a(ag1, this, true);
        d = e.a(b, true);
        p = 1;
        if (bn1 == bn.d)
        {
            p = p + 2;
        }
        n = 1;
        j.a(7, 0, 0x1000000);
        return;
_L2:
        if (bn1 == bn.d)
        {
            e = new s();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private b a(int i1, List list, boolean flag, boolean flag1)
    {
        b b1;
        int j1;
        boolean flag2 = true;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (m)
        {
            return null;
        }
        j1 = p;
        p = p + 2;
        b1 = new b(this, j1, flag, flag1, list);
        if (b1.i())
        {
            f.put(Integer.valueOf(j1), b1);
        }
        if (i1 == 0)
        {
            try
            {
                d.a(flag, flag1, j1, i1, list);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new AssertionError(list);
            }
            return b1;
        }
        if (h)
        {
            throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
        }
        d.a(i1, j1, list);
        return b1;
    }

    private void a(boolean flag, int i1, int j1, aa aa1)
    {
        if (aa1 != null)
        {
            aa1.a();
        }
        d.a(flag, i1, j1);
    }

    private boolean b(int i1)
    {
        return g == bn.d && i1 != 0 && (i1 & 1) == 0;
    }

    private aa c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (r == null) goto _L2; else goto _L1
_L1:
        aa aa1 = (aa)r.remove(Integer.valueOf(i1));
_L4:
        this;
        JVM INSTR monitorexit ;
        return aa1;
_L2:
        aa1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public b a(List list, boolean flag, boolean flag1)
    {
        return a(0, list, flag, flag1);
    }

    public void a()
    {
        d.a();
        d.a(j);
        int i1 = j.d(0x10000);
        if (i1 != 0x10000)
        {
            d.a(0, i1 - 0x10000);
        }
    }

    void a(int i1)
    {
        i = i + i1;
        if (i >= j.d(0x10000) / 2)
        {
            try
            {
                d.a(0, i);
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
            i = 0;
        }
    }

    public void a(int i1, int j1, int k1, boolean flag)
    {
    }

    public void a(int i1, int j1, List list)
    {
        throw new AssertionError("pushPromise");
    }

    public void a(int i1, long l1)
    {
        if (i1 == 0)
        {
            a(l1);
        } else
        {
            b b1 = (b)f.get(Integer.valueOf(i1));
            if (b1 != null)
            {
                b1.a(l1);
                return;
            }
        }
    }

    public void a(int i1, h h1)
    {
        if (b(i1))
        {
            throw new AssertionError("push");
        }
        b b1 = (b)f.remove(Integer.valueOf(i1));
        if (b1 != null)
        {
            bp.a(b1, new IOException(h1.toString()));
        }
    }

    public void a(int i1, h h1, g g1)
    {
        m = true;
        h1 = f.entrySet().iterator();
        do
        {
            if (!h1.hasNext())
            {
                break;
            }
            g1 = (java.util.Map.Entry)h1.next();
            if (((Integer)g1.getKey()).intValue() > i1 && ((b)g1.getValue()).e())
            {
                bp.a((am)g1.getValue(), new IOException(h.k.toString()));
                h1.remove();
            }
        } while (true);
    }

    void a(long l1)
    {
        k = k + l1;
        for (Iterator iterator = f.values().iterator(); iterator.hasNext(); bp.a((b)iterator.next())) { }
    }

    public void a(Exception exception)
    {
        a.d();
        for (Iterator iterator = f.entrySet().iterator(); iterator.hasNext(); iterator.remove())
        {
            bp.a((am)((java.util.Map.Entry)iterator.next()).getValue(), exception);
        }

    }

    public void a(boolean flag, int i1, int j1)
    {
        if (flag)
        {
            aa aa1 = c(i1);
            if (aa1 != null)
            {
                aa1.b();
            }
            return;
        }
        try
        {
            a(true, i1, j1, ((aa) (null)));
            return;
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
    }

    public void a(boolean flag, int i1, aj aj1)
    {
        if (b(i1))
        {
            throw new AssertionError("push");
        }
        b b1 = (b)f.get(Integer.valueOf(i1));
        if (b1 == null)
        {
            try
            {
                d.a(i1, h.c);
            }
            // Misplaced declaration of an exception variable
            catch (aj aj1)
            {
                throw new AssertionError(aj1);
            }
            aj1.m();
        } else
        {
            int j1 = aj1.d();
            aj1.a(b1.g);
            b1.a(j1);
            bp.a(b1, b1.g);
            if (flag)
            {
                f.remove(Integer.valueOf(i1));
                b1.d();
                bp.a(b1, null);
                return;
            }
        }
    }

    public void a(boolean flag, ab ab1)
    {
        long l2 = 0L;
        int i1 = l.d(0x10000);
        if (flag)
        {
            l.a();
        }
        l.a(ab1);
        int j1;
        long l1;
        try
        {
            d.b();
        }
        // Misplaced declaration of an exception variable
        catch (ab ab1)
        {
            throw new AssertionError(ab1);
        }
        j1 = l.d(0x10000);
        l1 = l2;
        if (j1 != -1)
        {
            l1 = l2;
            if (j1 != i1)
            {
                long l3 = j1 - i1;
                l1 = l3;
                if (!q)
                {
                    a(l3);
                    q = true;
                    l1 = l3;
                }
            }
        }
        for (ab1 = f.values().iterator(); ab1.hasNext(); ((b)ab1.next()).a(l1)) { }
    }

    public void a(boolean flag, boolean flag1, int i1, int j1, List list, o o1)
    {
        if (b(i1))
        {
            throw new AssertionError("push");
        }
        if (!m) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b b1;
        b1 = (b)f.get(Integer.valueOf(i1));
        if (b1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (o1.a())
        {
            try
            {
                d.a(i1, h.c);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new AssertionError(list);
            }
        }
        if (i1 > o && i1 % 2 != p % 2)
        {
            throw new AssertionError("unexpected receive stream");
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (o1.b())
        {
            try
            {
                d.a(i1, h.c);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new AssertionError(list);
            }
            f.remove(Integer.valueOf(i1));
            return;
        }
        b1.a(list, o1);
        if (flag1)
        {
            f.remove(Integer.valueOf(i1));
            bp.a(b1, null);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void b()
    {
        try
        {
            d.b();
            return;
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
    }
}
