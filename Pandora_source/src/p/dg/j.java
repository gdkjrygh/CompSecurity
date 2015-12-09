// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.q;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p.cw.c;
import p.dd.ae;
import p.dd.bo;
import p.dd.bp;

// Referenced classes of package p.dg:
//            k, l

public class j
{
    public static class a
    {

        public p.cw.d.a a;

        public a(p.cw.d.a a1)
        {
            a = a1;
        }
    }


    private static a d;
    private static volatile a e;
    private final ConcurrentHashMap a = new ConcurrentHashMap();
    private p.dg.k b;
    private String c;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private af j;
    private q k;
    private c l;

    public j(c c1)
    {
        l = c1;
        c1.b(this);
    }

    private p.dg.k a(String s, boolean flag)
    {
        p.dg.k k2 = (p.dg.k)a.get(s);
        p.dg.k k1 = k2;
        if (k2 == null)
        {
            k1 = new p.dg.k(l, s, flag, f, 0x36ee80);
            a.put(s, k1);
        }
        return k1;
    }

    private p.dg.k d()
    {
        String s = j.d();
        if (b == null || !s.equals(c))
        {
            c = s;
            s = String.format("%s: %s", new Object[] {
                "42f7ef80-c976-421d-9fc4-dab4d1fc387c", c
            });
            b = new p.dg.k(l, s, false, f(), 0x5265c00);
        }
        return b;
    }

    private a e()
    {
        if (e == null)
        {
            e = new a(p.cw.d.a.b);
        }
        return e;
    }

    private int f()
    {
        if (j.i())
        {
            return h;
        } else
        {
            return g;
        }
    }

    public void a()
    {
        l.c(this);
        l = null;
    }

    public boolean a(l l1, aa aa1)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (aa1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = aa1.C();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = flag1;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        l1 = l1.m();
        l1 = a(l1.c(), l1.u());
        flag = flag1;
        boolean flag2;
        if (l1.b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!l1.a())
        {
            break MISSING_BLOCK_LABEL_77;
        }
        flag2 = d().a();
        flag = flag1;
        if (flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        l1;
        throw l1;
    }

    a b(l l1, aa aa1)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (j != null) goto _L2; else goto _L1
_L1:
        l1 = e();
_L4:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L2:
        if (a(l1, aa1))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (i)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        l1 = l1.m();
        boolean flag;
        if (!a(l1.c(), l1.u()).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d().a())
        {
            flag1 = false;
        }
        l.o().a(l1.c(), flag1, flag);
        i = true;
        l1 = e();
        continue; /* Loop/switch isn't completed */
        l1 = d;
        if (true) goto _L4; else goto _L3
_L3:
        l1;
        throw l1;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d().a();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    void c()
    {
        if (k == null || j == null)
        {
            return;
        }
        f = k.c();
        ConcurrentHashMap concurrenthashmap = a;
        concurrenthashmap;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((p.dg.k)iterator.next()).a(f)) { }
        break MISSING_BLOCK_LABEL_79;
        Exception exception;
        exception;
        concurrenthashmap;
        JVM INSTR monitorexit ;
        throw exception;
        concurrenthashmap;
        JVM INSTR monitorexit ;
        g = j.n();
        h = j.o();
        d().a(f());
        return;
    }

    public void c(l l1, aa aa1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!aa1.C())
        {
            aa1 = aa1.s();
            l1 = l1.m();
            l1 = a(l1.c(), l1.u());
            l1.a(aa1);
            if (!l1.b())
            {
                d().a(aa1);
            }
            i = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l1;
        throw l1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void onPartnerData(ae ae1)
    {
        k = ae1.a;
        c();
    }

    public void onUserData(bo bo1)
    {
        j = bo1.a;
        c();
    }

    public void onUserStateChange(bp bp)
    {
        c();
    }

    static 
    {
        d = new a(p.cw.d.a.a);
    }
}
