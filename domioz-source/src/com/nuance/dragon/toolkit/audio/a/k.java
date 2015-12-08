// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.audio.a;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.i;
import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            c

public final class k extends com.nuance.dragon.toolkit.audio.a.c
{

    private final a a;
    private boolean b;
    private boolean c;

    public k(a a1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("listener", a1);
        a = a1;
        b = false;
        c = false;
    }

    protected final void a(h h)
    {
        h = (g)h;
        if (b) goto _L2; else goto _L1
_L1:
        if (((g) (h)).g == i.c)
        {
            b = true;
            a.a();
        }
_L4:
        super.a(h);
        return;
_L2:
        if (!c && ((g) (h)).g == i.b)
        {
            c = true;
            a.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
