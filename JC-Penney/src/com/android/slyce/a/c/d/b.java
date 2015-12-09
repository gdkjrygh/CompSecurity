// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.e;
import com.android.slyce.a.a.h;
import com.android.slyce.a.ag;
import com.android.slyce.a.aj;
import com.android.slyce.a.b.l;
import com.android.slyce.a.bp;
import com.android.slyce.a.r;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.android.slyce.a.c.d:
//            a, ab, k, o

public class b
    implements ag
{

    long a;
    h b;
    final int c;
    a d;
    a e;
    e f;
    aj g;
    l h;
    boolean i;
    int j;
    boolean k;
    aj l;
    final com.android.slyce.a.c.d.a m;

    public b(com.android.slyce.a.c.d.a a1, int i1, boolean flag, boolean flag1, List list)
    {
        m = a1;
        super();
        a = m.l.d(0x10000);
        g = new aj();
        h = new l();
        i = true;
        l = new aj();
        c = i1;
    }

    public void a()
    {
        try
        {
            m.d.a(true, c, l);
            return;
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
    }

    void a(int i1)
    {
        j = j + i1;
        if (j >= m.j.d(0x10000) / 2)
        {
            try
            {
                m.d.a(c, j);
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
            j = 0;
        }
        m.a(i1);
    }

    public void a(long l1)
    {
        long l2 = a;
        a = a + l1;
        if (a > 0L && l2 <= 0L)
        {
            bp.a(b);
        }
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void a(e e1)
    {
        f = e1;
    }

    public void a(h h1)
    {
        b = h1;
    }

    public void a(aj aj1)
    {
        int i1 = (int)Math.min(a, m.k);
        i1 = Math.min(aj1.d(), i1);
        if (i1 == 0)
        {
            return;
        }
        aj aj2 = aj1;
        if (i1 < aj1.d())
        {
            if (l.e())
            {
                throw new AssertionError("wtf");
            }
            aj1.a(l, i1);
            aj2 = l;
        }
        try
        {
            m.d.a(false, c, aj2);
            a = a - (long)i1;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aj aj1)
        {
            throw new AssertionError(aj1);
        }
    }

    public void a(List list, o o)
    {
        h.b(list);
    }

    public com.android.slyce.a.c.d.a b()
    {
        return m;
    }

    public void b(a a1)
    {
        e = a1;
    }

    public l c()
    {
        return h;
    }

    public void d()
    {
        i = false;
    }

    public boolean e()
    {
        boolean flag;
        if ((c & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return m.h == flag;
    }

    public e f()
    {
        return f;
    }

    public h g()
    {
        return b;
    }

    public a h()
    {
        return e;
    }

    public boolean i()
    {
        return i;
    }

    public void j()
    {
        k = false;
    }

    public boolean k()
    {
        return k;
    }

    public r l()
    {
        return m.a.l();
    }
}
