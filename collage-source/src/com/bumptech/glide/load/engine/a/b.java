// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;

import com.bumptech.glide.g.h;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.engine.a:
//            h

abstract class b
{

    private final Queue a = h.a(20);

    b()
    {
    }

    public void a(com.bumptech.glide.load.engine.a.h h1)
    {
        if (a.size() < 20)
        {
            a.offer(h1);
        }
    }

    protected abstract com.bumptech.glide.load.engine.a.h b();

    protected com.bumptech.glide.load.engine.a.h c()
    {
        com.bumptech.glide.load.engine.a.h h2 = (com.bumptech.glide.load.engine.a.h)a.poll();
        com.bumptech.glide.load.engine.a.h h1 = h2;
        if (h2 == null)
        {
            h1 = b();
        }
        return h1;
    }
}
