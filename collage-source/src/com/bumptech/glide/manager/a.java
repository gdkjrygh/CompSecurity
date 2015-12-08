// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import com.bumptech.glide.g.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.bumptech.glide.manager:
//            g, h

class a
    implements g
{

    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    a()
    {
    }

    void a()
    {
        b = true;
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((com.bumptech.glide.manager.h)iterator.next()).d()) { }
    }

    public void a(com.bumptech.glide.manager.h h1)
    {
        a.add(h1);
        if (c)
        {
            h1.f();
            return;
        }
        if (b)
        {
            h1.d();
            return;
        } else
        {
            h1.e();
            return;
        }
    }

    void b()
    {
        b = false;
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((com.bumptech.glide.manager.h)iterator.next()).e()) { }
    }

    void c()
    {
        c = true;
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((com.bumptech.glide.manager.h)iterator.next()).f()) { }
    }
}
