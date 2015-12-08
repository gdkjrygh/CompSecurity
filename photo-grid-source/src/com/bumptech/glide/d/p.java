// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import com.bumptech.glide.g.c;
import com.bumptech.glide.i.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class p
{

    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final List b = new ArrayList();
    private boolean c;

    public p()
    {
    }

    public final void a()
    {
        c = true;
        Iterator iterator = h.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c1.e())
            {
                c1.d();
                b.add(c1);
            }
        } while (true);
    }

    public final void a(c c1)
    {
        a.add(c1);
        if (!c)
        {
            c1.b();
            return;
        } else
        {
            b.add(c1);
            return;
        }
    }

    public final void b()
    {
        c = false;
        Iterator iterator = h.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (!c1.f() && !c1.h() && !c1.e())
            {
                c1.b();
            }
        } while (true);
        b.clear();
    }

    public final void b(c c1)
    {
        a.remove(c1);
        b.remove(c1);
    }

    public final void c()
    {
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((c)iterator.next()).c()) { }
        b.clear();
    }

    public final void d()
    {
        Iterator iterator = h.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (!c1.f() && !c1.h())
            {
                c1.d();
                if (!c)
                {
                    c1.b();
                } else
                {
                    b.add(c1);
                }
            }
        } while (true);
    }
}
