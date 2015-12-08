// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.h;

// Referenced classes of package com.android.slyce.a:
//            ap, aj, ai

public class ah
    implements ap
{

    static final boolean f;
    ap a;
    aj b;
    h c;
    int d;
    boolean e;

    public ah(ap ap1)
    {
        b = new aj();
        d = 0x7fffffff;
        a(ap1);
    }

    static void a(ah ah1)
    {
        ah1.e();
    }

    private void e()
    {
        if (b.e())
        {
            a.a(b);
            if (b.d() == 0 && e)
            {
                a.a();
            }
        }
        if (!b.e() && c != null)
        {
            c.a();
        }
    }

    public void a()
    {
        if (b.e())
        {
            e = true;
            return;
        } else
        {
            a.a();
            return;
        }
    }

    public void a(int j)
    {
        if (!f && j < 0)
        {
            throw new AssertionError();
        } else
        {
            d = j;
            return;
        }
    }

    public void a(a a1)
    {
        a.a(a1);
    }

    public void a(h h1)
    {
        c = h1;
    }

    public void a(aj aj1)
    {
        a(aj1, false);
    }

    protected void a(aj aj1, boolean flag)
    {
        if (!b.e())
        {
            a.a(aj1);
        }
        if (aj1.d() > 0)
        {
            int j = Math.min(aj1.d(), d);
            if (flag)
            {
                j = aj1.d();
            }
            if (j > 0)
            {
                aj1.a(b, j);
            }
        }
    }

    public void a(ap ap1)
    {
        a = ap1;
        a.a(new ai(this));
    }

    public boolean b()
    {
        return b.e();
    }

    public int c()
    {
        return b.d();
    }

    public int d()
    {
        return d;
    }

    public h g()
    {
        return c;
    }

    public boolean i()
    {
        return a.i();
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/ah.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
