// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.content.Context;
import com.roidapp.videolib.gl.e;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.a.h;
import jp.co.cyberagent.android.a.k;
import jp.co.cyberagent.android.a.s;

// Referenced classes of package com.roidapp.videolib.b:
//            c, u, x, l, 
//            k

public final class g extends c
{

    public static final u x;
    long y[] = {
        0L, 500L, 1500L, 3000L, 5000L, 10000L, 12000L, 15000L
    };
    private s z;

    public g(Context context)
    {
        super(context);
        z = new s();
        p = (new x[] {
            new x(3, 3100L, 3800L, 1.0F, 1.1F), new x(3, 5330L, 6450L, 1.0F, 1.1F), new x(3, 7730L, 8730L, 1.0F, 1.1F), new x(3, 9930L, 11000L, 1.0F, 1.1F), new x(3, 11600L, 12770L, 1.0F, 1.1F), new x(3, 13730L, 15000L, 1.0F, 1.05F)
        });
        q = (new l[] {
            new l(0, 1800L, 3840L), new l(1, 3860L, 6450L), new l(2, 6460L, 8740L), new l(3, 8740L, 11000L), new l(4, 11000L, 12770L), new l(5, 12770L, 15000L)
        });
    }

    public final h a(long l1)
    {
        if (l1 >= v - u)
        {
            l = (List)a.get(1);
        } else
        {
            l = (List)a.get(0);
        }
        k.a(l);
        if (r != null)
        {
            r.a(l1);
        }
        if (t != null)
        {
            t.a(l1);
        }
        return k;
    }

    protected final void a()
    {
        ArrayList arraylist = new ArrayList();
        if (h != null)
        {
            arraylist.add(h);
        }
        if (m != null)
        {
            arraylist.add(m);
        }
        arraylist.add(z);
        ArrayList arraylist1 = new ArrayList();
        if (h != null)
        {
            arraylist1.add(h);
        }
        if (m != null)
        {
            arraylist1.add(m);
        }
        arraylist1.add(z);
        if (j != null)
        {
            arraylist1.add(j);
        }
        a.add(arraylist);
        a.add(arraylist1);
    }

    public final void a(e e1)
    {
        super.a(e1);
        z.a(o);
    }

    protected final void b()
    {
        c.clear();
        c.add(z);
        if (m != null)
        {
            c.add(m);
        }
    }

    protected final void c()
    {
        b.clear();
        b.add(z);
        if (m != null)
        {
            b.add(m);
        }
        if (h != null)
        {
            b.add(h);
        }
        if (j != null)
        {
            b.add(j);
        }
    }

    protected final void d()
    {
        if (f.size() > 0)
        {
            c.removeAll(f);
            c.addAll(f);
            b.removeAll(f);
            b.addAll(f);
            for (int i = 0; i < a.size(); i++)
            {
                boolean flag = ((List)a.get(i)).remove(j);
                boolean flag1 = ((List)a.get(i)).remove(z);
                ((List)a.get(i)).removeAll(f);
                ((List)a.get(i)).addAll(f);
                if (flag1)
                {
                    ((List)a.get(i)).add(z);
                }
                if (flag)
                {
                    ((List)a.get(i)).add(j);
                }
            }

        }
    }

    public final void e()
    {
        super.e();
        f();
    }

    public final int g()
    {
        return 2;
    }

    public final void h()
    {
        b.clear();
        a.clear();
        if (k != null)
        {
            k.a(c);
            k.i();
        }
        c.clear();
        k = null;
        if (s != null)
        {
            s.a();
        }
        if (r != null)
        {
            r.a();
        }
        if (t != null)
        {
            t.a();
        }
        s = null;
        t = null;
        r = null;
        h = null;
        e.clear();
        j = null;
        i = null;
        m = null;
        z = null;
        o = null;
        super.h();
    }

    static 
    {
        x = u.b;
    }
}
