// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            c, b

public final class a extends com.nuance.dragon.toolkit.audio.a.c
{

    private final int a;
    private final com.nuance.dragon.toolkit.audio.a.b b;
    private int c;
    private boolean d;

    public a(int i, com.nuance.dragon.toolkit.audio.a.b b1)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.nuance.dragon.toolkit.d.b.c.a("timeoutMs", "greater than 0", flag);
        com.nuance.dragon.toolkit.d.b.c.a("listener", b1);
        a = i;
        b = b1;
    }

    public final void a(b b1)
    {
        c = 0;
        d = false;
        super.a(b1);
    }

    protected final volatile void a(h h)
    {
        h = (g)h;
        super.a(h);
        c = c + ((g) (h)).d;
        if (c >= a && !d)
        {
            d = true;
            b.a();
        }
    }
}
