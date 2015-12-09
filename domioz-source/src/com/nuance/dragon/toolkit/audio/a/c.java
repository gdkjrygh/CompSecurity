// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            g

public class c extends g
{

    private final LinkedList a;
    private final ArrayList b;
    private final int c;
    private e d;
    private int e;

    public c()
    {
        this(e.k);
    }

    private c(e e1)
    {
        a = new LinkedList();
        b = new ArrayList();
        c = -1;
        d = e1;
    }

    public final e a()
    {
        return d;
    }

    public void a(b b1)
    {
        a.clear();
        if (d != e.k)
        {
            b1.a();
        }
        d = b1.a();
        super.a(b1);
    }

    protected final void a(b b1, l l)
    {
        b.ensureCapacity(b1.a(l));
        b1.a(l, b);
        for (b1 = b.iterator(); b1.hasNext(); a(((h) (l))))
        {
            l = (h)b1.next();
            a.add(l);
            e = e + ((h) (l)).d;
            if (c < 0 || e <= c)
            {
                continue;
            }
            h h1 = (h)a.removeFirst();
            if (h1 != null)
            {
                e = e - h1.d;
            }
        }

        b.clear();
        if (e > 0)
        {
            f();
        }
    }

    protected void a(h h1)
    {
    }

    public final int b()
    {
        return a.size();
    }

    protected void b(b b1, l l)
    {
        h();
    }

    public final boolean c()
    {
        return k();
    }

    protected final void d()
    {
        g();
    }

    protected final h e()
    {
        if (a.isEmpty())
        {
            return null;
        } else
        {
            h h1 = (h)a.remove();
            e = e - h1.d;
            return h1;
        }
    }
}
