// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.b;

import com.nuance.dragon.toolkit.a.k;
import com.nuance.dragon.toolkit.a.s;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.audio.a.o;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.a.b:
//            d, e, b, c

public final class a
{

    private final s a;
    private o b;
    private d c;

    public a(s s1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("cloudServices", s1);
        a = s1;
    }

    static d a(a a1)
    {
        return a1.c;
    }

    static d b(a a1)
    {
        a1.c = null;
        return null;
    }

    public final b a(e e1, com.nuance.dragon.toolkit.a.b.c c1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("ttsSpec", e1);
        if (b != null)
        {
            b.i();
            b = null;
        }
        if (c != null)
        {
            x x1 = d.a(c);
            c = null;
            x1.f();
        }
        d d1 = new d((byte)0);
        c = d1;
        d.a(d1, new x(e1.a(), e1.b(), new com.nuance.dragon.toolkit.a.b.b(this, c1, d1), e1.g()));
        e1 = new k(e1.d(), e1.e(), e1.f());
        d.a(d1).a(e1);
        d.a(d1).e();
        b = new o();
        b.a(e1.a());
        a.a(d.a(d1), 5);
        return b;
    }
}
