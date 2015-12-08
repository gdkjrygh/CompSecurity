// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            j, i, v, q, 
//            f

public static abstract class c extends j
    implements c
{
    public final class a
    {

        private final Iterator a;
        private java.util.Map.Entry b;
        private final boolean c;
        private j.d d;

        public final void a(int k, f f1)
        {
            while (b != null && ((j.f)b.getKey()).b < k) 
            {
                Object obj = (j.f)b.getKey();
                if (c && ((j.f) (obj)).c.s == z.b.i && !((j.f) (obj)).d)
                {
                    int i1 = ((j.f) (obj)).b;
                    obj = (q)b.getValue();
                    f1.a(1, 3);
                    f1.a(2, 0);
                    f1.j(i1);
                    f1.a(3, 2);
                    f1.a(((q) (obj)));
                    f1.a(1, 4);
                } else
                {
                    i.a(((i.a) (obj)), b.getValue(), f1);
                }
                if (a.hasNext())
                {
                    b = (java.util.Map.Entry)a.next();
                } else
                {
                    b = null;
                }
            }
        }

        private a(boolean flag)
        {
            d = j.d.this;
            super();
            d1 = d.c;
            if (j.d.this.c)
            {
                d1 = new n.b(j.d.this.a.entrySet().iterator());
            } else
            {
                d1 = j.d.this.a.entrySet().iterator();
            }
            a = j.d.this;
            if (a.hasNext())
            {
                b = (java.util.Map.Entry)a.next();
            }
            c = flag;
        }

        public a(boolean flag, byte byte0)
        {
            this(flag);
        }
    }


    public i c;

    public final void a(a.b b1)
    {
        if (c.b)
        {
            c = c.c();
        }
        i k = c;
        b1 = b1.c;
        for (int i1 = 0; i1 < ((i) (b1)).a.b(); i1++)
        {
            k.b(((i) (b1)).a.b(i1));
        }

        for (b1 = ((i) (b1)).a.c().iterator(); b1.hasNext(); k.b((java.util.Entry)b1.next())) { }
    }

    public final boolean b()
    {
        Object obj = c;
        for (int k = 0; k < ((i) (obj)).a.b(); k++)
        {
            if (!i.a(((i) (obj)).a.b(k)))
            {
                return false;
            }
        }

        for (obj = ((i) (obj)).a.c().iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (!i.a((java.util.Entry)((Iterator) (obj)).next()))
            {
                return false;
            }
        }

        return true;
    }

    public final c l()
    {
        return super.k();
    }

    public final c m()
    {
        return super.i();
    }

    public a()
    {
        c = i.a();
    }
}
