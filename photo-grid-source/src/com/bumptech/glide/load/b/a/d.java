// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import com.bumptech.glide.i.h;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            m

abstract class d
{

    private final Queue a = h.a(20);

    d()
    {
    }

    protected abstract m a();

    public final void a(m m1)
    {
        if (a.size() < 20)
        {
            a.offer(m1);
        }
    }

    protected final m b()
    {
        m m2 = (m)a.poll();
        m m1 = m2;
        if (m2 == null)
        {
            m1 = a();
        }
        return m1;
    }
}
