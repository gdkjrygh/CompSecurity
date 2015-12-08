// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.h;
import com.android.slyce.a.ag;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.ap;
import com.android.slyce.a.at;
import com.android.slyce.a.c.a.a;
import com.android.slyce.a.r;

// Referenced classes of package com.android.slyce.a.c:
//            s, w, z, u, 
//            av, az, aa, y

abstract class x extends at
    implements ag, s, w
{

    static final boolean p;
    private com.android.slyce.a.a.a d;
    private u e;
    private ag f;
    private boolean g;
    protected av j;
    boolean k;
    int l;
    String m;
    String n;
    ap o;

    public x(u u1)
    {
        d = new z(this);
        k = false;
        g = true;
        e = u1;
    }

    static ag a(x x1)
    {
        return x1.f;
    }

    private void o()
    {
        if (g)
        {
            g = false;
            if (!p && e.e().a("Content-Type") == null)
            {
                throw new AssertionError();
            }
            if (!p && e.e().a("Transfer-Encoding") == null && com.android.slyce.a.c.az.a(e.e()) == -1)
            {
                throw new AssertionError();
            }
        }
    }

    public s a(int i1)
    {
        l = i1;
        return this;
    }

    public s a(ap ap1)
    {
        o = ap1;
        return this;
    }

    public s a(av av1)
    {
        j = av1;
        return this;
    }

    public s a(String s1)
    {
        m = s1;
        return this;
    }

    public void a()
    {
        throw new AssertionError("end called?");
    }

    public void a(com.android.slyce.a.a.a a1)
    {
        o.a(a1);
    }

    public void a(h h)
    {
        o.a(h);
    }

    void a(ag ag1)
    {
        f = ag1;
        if (f == null)
        {
            return;
        } else
        {
            f.b(d);
            return;
        }
    }

    public void a(aj aj)
    {
        o();
        o.a(aj);
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        f.a(new aa(this));
        f.a(null);
        f.a(null);
        f.b(null);
        k = true;
    }

    public ag a_()
    {
        return f;
    }

    public s b(am am)
    {
        a(am);
        return this;
    }

    public s b(String s1)
    {
        n = s1;
        return this;
    }

    protected void b()
    {
    }

    protected void b(Exception exception)
    {
    }

    public av b_()
    {
        return j;
    }

    public ap c_()
    {
        return o;
    }

    public String e()
    {
        return m;
    }

    public h g()
    {
        return o.g();
    }

    public boolean i()
    {
        return o.i();
    }

    public r l()
    {
        return f.l();
    }

    public int m()
    {
        return l;
    }

    protected void n()
    {
        a a1 = e.g();
        if (a1 != null)
        {
            a1.a(e, this, new y(this));
            return;
        } else
        {
            b(((Exception) (null)));
            return;
        }
    }

    public String toString()
    {
        if (j == null)
        {
            return super.toString();
        } else
        {
            return j.e((new StringBuilder()).append(m).append(" ").append(l).append(" ").append(n).toString());
        }
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/x.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
    }
}
