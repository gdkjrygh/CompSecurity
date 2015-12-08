// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.b;

import com.nuance.dragon.toolkit.audio.c.a;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.audio.b:
//            a

final class l extends a
{

    final com.nuance.dragon.toolkit.audio.b.a a;
    private final LinkedList b = new LinkedList();

    l(com.nuance.dragon.toolkit.audio.b.a a1)
    {
        a = a1;
        super();
    }

    public final e a()
    {
        return com.nuance.dragon.toolkit.audio.b.a.a(a);
    }

    final void a(List list)
    {
        b.addAll(list);
        f();
    }

    public final int b()
    {
        return b.size();
    }

    public final boolean c()
    {
        return this == com.nuance.dragon.toolkit.audio.b.a.b(a);
    }

    protected final h d()
    {
        if (!b.isEmpty())
        {
            return (g)b.remove();
        } else
        {
            return null;
        }
    }

    final void e()
    {
        g();
    }
}
