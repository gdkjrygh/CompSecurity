// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.p;
import kik.a.f.q;
import kik.a.h.j;

// Referenced classes of package kik.a.f.f:
//            ac, aa, ab

public abstract class z
    implements ac
{

    private int a;
    private p b;
    private f c;
    private final k d = new k(this);
    private long e;
    protected final boolean f;
    protected final long g = kik.a.h.j.b();
    protected kik.a.f.j h;
    private long i;
    private int j;
    private Object k;
    private long l;
    private String m;

    public z(kik.a.f.j j1)
    {
        boolean flag = false;
        super();
        b = new p();
        c = new f();
        j = 100;
        k = null;
        l = -1L;
        h = j1;
        a = 0;
        e = -1L;
        if (kik.a.h.j.c() > 0L)
        {
            flag = true;
        }
        f = flag;
        if (h != null)
        {
            c.a(d.a(), new aa(this));
            b.a(new ab(this));
        }
    }

    public final void a(int i1)
    {
        if (i1 == 1)
        {
            l = System.currentTimeMillis();
        }
        i1;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 46
    //                   2 57
    //                   3 68;
           goto _L1 _L2 _L3 _L4
_L1:
        a = i1;
        return;
_L2:
        d.a(null);
        continue; /* Loop/switch isn't completed */
_L3:
        b.a(this);
        continue; /* Loop/switch isn't completed */
_L4:
        b.a(new q(j, k));
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void a(int i1, Object obj)
    {
        k = obj;
        b(i1);
    }

    protected final void a(Object obj)
    {
        k = obj;
    }

    public boolean a(long l1)
    {
        if (a > 0) goto _L2; else goto _L1
_L1:
        if (e <= 0L)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (l1 - i <= e) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!h() || a >= 2)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (l1 - l > m_()) goto _L3; else goto _L5
_L5:
        return false;
        return false;
    }

    public boolean a(z z1)
    {
        return false;
    }

    public final void b(int i1)
    {
        j = i1;
        a(3);
    }

    public final void b(long l1)
    {
        e = l1;
    }

    public final long c(long l1)
    {
        if (a <= 0)
        {
            return (i + e) - l1;
        }
        if (a < 2)
        {
            return (l + m_()) - l1;
        } else
        {
            return -1L;
        }
    }

    public final void c(int i1)
    {
        j = i1;
    }

    public boolean c()
    {
        return true;
    }

    public final void d(long l1)
    {
        i = l1;
    }

    public boolean h()
    {
        return false;
    }

    public final p j()
    {
        return b;
    }

    public final int k()
    {
        return a;
    }

    public final int l()
    {
        return j;
    }

    public abstract String l_();

    public final Object m()
    {
        return k;
    }

    public long m_()
    {
        return 15000L;
    }

    public String toString()
    {
        if (m == null)
        {
            return getClass().getName();
        } else
        {
            return m;
        }
    }
}
