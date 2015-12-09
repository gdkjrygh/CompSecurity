// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.l;
import com.nuance.dragon.toolkit.d.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            o, r, e, p

public final class q extends o
{

    private final b a;
    private final l e;
    private p f;
    private e g;
    private boolean h;
    private final List i = new ArrayList();
    private final Boolean j[] = new Boolean[1];

    public q(String s, b b1)
    {
        super(s);
        com.nuance.dragon.toolkit.d.b.c.a("source", b1);
        a = b1;
        h = false;
        j[0] = Boolean.valueOf(false);
        e = new r(this, s);
        e.d(b1);
    }

    static b a(q q1)
    {
        return q1.a;
    }

    static p b(q q1)
    {
        return q1.f;
    }

    static l c(q q1)
    {
        return q1.e;
    }

    static e d(q q1)
    {
        return q1.g;
    }

    static List e(q q1)
    {
        return q1.i;
    }

    static boolean f(q q1)
    {
        q1.h = true;
        return true;
    }

    static p g(q q1)
    {
        q1.f = null;
        return null;
    }

    static Boolean[] h(q q1)
    {
        return q1.j;
    }

    static e i(q q1)
    {
        q1.g = null;
        return null;
    }

    final void a()
    {
        e.h();
        f = null;
    }

    final void a(e e1)
    {
        e1.a(b);
        if (!h)
        {
            g = e1;
        }
    }

    final boolean a(e e1, p p1)
    {
        if (!h)
        {
            f = p1;
        }
        if (i.size() > 0)
        {
            g g2;
            for (Iterator iterator = i.iterator(); iterator.hasNext(); e1.a(b, g2, false))
            {
                g2 = (g)iterator.next();
            }

            i.clear();
        }
        if (h)
        {
            e1.a(b, null, true);
            p1.a(this, j[0].booleanValue());
            return h;
        }
        if (a != null)
        {
            int k = a.a(e);
            do
            {
                int i1 = k - 1;
                if (k <= 0)
                {
                    break;
                }
                p1 = b;
                g g1 = (g)a.b(e);
                boolean flag;
                if (h && i1 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e1.a(p1, g1, flag);
                k = i1;
            } while (true);
        }
        return h;
    }
}
