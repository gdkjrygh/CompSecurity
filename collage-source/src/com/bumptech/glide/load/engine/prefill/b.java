// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.prefill;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.load.engine.prefill:
//            c

final class b
{

    private final Map a;
    private final List b;
    private int c;
    private int d;

    public c a()
    {
        c c1 = (c)b.get(d);
        Integer integer = (Integer)a.get(c1);
        int i;
        if (integer.intValue() == 1)
        {
            a.remove(c1);
            b.remove(d);
        } else
        {
            a.put(c1, Integer.valueOf(integer.intValue() - 1));
        }
        c = c - 1;
        if (b.isEmpty())
        {
            i = 0;
        } else
        {
            i = (d + 1) % b.size();
        }
        d = i;
        return c1;
    }

    public boolean b()
    {
        return c == 0;
    }
}
