// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

final class axk
    implements axr
{

    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    axk()
    {
    }

    final void a()
    {
        b = true;
        for (Iterator iterator = bag.a(a).iterator(); iterator.hasNext(); ((axs)iterator.next()).c_()) { }
    }

    public final void a(axs axs1)
    {
        a.add(axs1);
        if (c)
        {
            axs1.j_();
            return;
        }
        if (b)
        {
            axs1.c_();
            return;
        } else
        {
            axs1.d_();
            return;
        }
    }

    final void b()
    {
        b = false;
        for (Iterator iterator = bag.a(a).iterator(); iterator.hasNext(); ((axs)iterator.next()).d_()) { }
    }

    public final void b(axs axs1)
    {
        a.remove(axs1);
    }

    final void c()
    {
        c = true;
        for (Iterator iterator = bag.a(a).iterator(); iterator.hasNext(); ((axs)iterator.next()).j_()) { }
    }
}
