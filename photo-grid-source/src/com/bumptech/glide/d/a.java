// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import com.bumptech.glide.i.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.bumptech.glide.d:
//            i, j

final class a
    implements i
{

    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    a()
    {
    }

    final void a()
    {
        b = true;
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((j)iterator.next()).b()) { }
    }

    public final void a(j j1)
    {
        a.add(j1);
        if (c)
        {
            j1.d_();
            return;
        }
        if (b)
        {
            j1.b();
            return;
        } else
        {
            j1.c();
            return;
        }
    }

    final void b()
    {
        b = false;
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((j)iterator.next()).c()) { }
    }

    final void c()
    {
        c = true;
        for (Iterator iterator = h.a(a).iterator(); iterator.hasNext(); ((j)iterator.next()).d_()) { }
    }
}
