// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import com.bumptech.glide.i.h;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide:
//            m

final class n
{

    private final Queue a = h.a(7);

    public n()
    {
        for (int i = 0; i < 7; i++)
        {
            a.offer(new m((byte)0));
        }

    }

    public final m a(int i, int j)
    {
        m m1 = (m)a.poll();
        a.offer(m1);
        m.a(m1, i);
        m.b(m1, j);
        return m1;
    }
}
