// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            a, bx, bh, bd, 
//            by, g, bu, f, 
//            aq

public static abstract class ring extends ring
    implements 
{

    protected static bx b(bd bd1)
    {
        return new bx(bh.a(bd1));
    }

    private  c(f f, aq aq)
    {
        return ()super.a(f, aq);
    }

    public a a(bd bd1)
    {
        if (bd1.e() != e())
        {
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        for (Iterator iterator = bd1.d_().entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Entry)iterator.next();
              = ()((java.util.Entry) (obj)).getKey();
            if (.o())
            {
                obj = ((List)((java.util.Entry) (obj)).getValue()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    a(, ((Iterator) (obj)).next());
                }
            } else
            if (.f() == .a.i)
            {
                bd bd2 = (bd)b();
                if (bd2 == bd2.w())
                {
                    b(, ((java.util.Entry) (obj)).getValue());
                } else
                {
                    b(, bd2.u().c(bd2).c((bd)((java.util.Entry) (obj)).getValue()).i());
                }
            } else
            {
                b(, ((java.util.Entry) (obj)).getValue());
            }
        }

        a(bd1.f());
        return this;
    }

    public  a(by by1)
    {
        b(by.a(f()).a(by1).b());
        return this;
    }

    public .b a(g g1, aq aq)
    {
          = by.a(f());
         1;
        int i;
        do
        {
            i = g1.a();
            if (i == 0)
            {
                break;
            }
            1 = new (this);
        } while (bh.a(g1, , aq, e(), 1, i));
        b(.b());
        return this;
    }

    public final .b a(f f, aq aq)
    {
        return c(f, aq);
    }

    public abstract c b();

    public c b(g g1, aq aq)
    {
        return a(g1, aq);
    }

    public final  b(f f, aq aq)
    {
        return c(f, aq);
    }

    public c c()
    {
        return b();
    }

    public  c(bd bd1)
    {
        return a(bd1);
    }

    public  c(g g1, aq aq)
    {
        return a(g1, aq);
    }

    public Object clone()
    {
        return b();
    }

    public String toString()
    {
        return bu.a(this);
    }

    public ring()
    {
    }
}
