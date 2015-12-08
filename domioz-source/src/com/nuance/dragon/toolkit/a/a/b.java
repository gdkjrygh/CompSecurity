// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.a;

import com.nuance.dragon.toolkit.a.ai;
import com.nuance.dragon.toolkit.a.q;
import com.nuance.dragon.toolkit.a.s;
import com.nuance.dragon.toolkit.a.x;
import com.nuance.dragon.toolkit.audio.a.o;
import com.nuance.dragon.toolkit.d.b.c;
import com.nuance.dragon.toolkit.d.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a.a:
//            e, f, c, d

public final class b
{

    private final s a;
    private final o b = new o();
    private com.nuance.dragon.toolkit.a.a.e c;
    private String d;
    private String e;
    private int f;

    public b(s s1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("cloudServices", s1);
        a = s1;
        f = 0;
    }

    static com.nuance.dragon.toolkit.a.a.e a(b b1)
    {
        return b1.c;
    }

    static void a(b b1, String s1)
    {
        if (s1 != null && s1.length() > 0)
        {
            int i = s1.indexOf(":");
            if (i != -1)
            {
                b1.d = s1.substring(0, i);
                b1.e = s1.substring(i + 1);
            }
        }
    }

    static com.nuance.dragon.toolkit.a.a.e b(b b1)
    {
        b1.c = null;
        return null;
    }

    static o c(b b1)
    {
        return b1.b;
    }

    public final void a()
    {
        if (c != null)
        {
            if (com.nuance.dragon.toolkit.a.a.e.c(c))
            {
                com.nuance.dragon.toolkit.d.e.c(this, "current recognition has been already processed");
            } else
            {
                com.nuance.dragon.toolkit.a.a.e.d(c);
                if (com.nuance.dragon.toolkit.a.a.e.e(c))
                {
                    com.nuance.dragon.toolkit.a.a.e.b(c).e();
                    return;
                }
            }
        }
    }

    public final void a(f f1, com.nuance.dragon.toolkit.audio.b b1, d d1)
    {
        com.nuance.dragon.toolkit.d.b.c.a("recogSpec", f1);
        com.nuance.dragon.toolkit.d.b.c.a("audioSource", b1);
        com.nuance.dragon.toolkit.d.b.c.a("resultListener", d1);
        b();
        com.nuance.dragon.toolkit.a.a.e e1 = new com.nuance.dragon.toolkit.a.a.e((byte)0);
        c = e1;
        com.nuance.dragon.toolkit.a.a.e.a(e1, new x(f1.a(), f1.b(), new com.nuance.dragon.toolkit.a.a.c(this, e1, f1, d1), f1.c(), f));
        b.a(b1);
        for (b1 = f1.d().iterator(); b1.hasNext(); com.nuance.dragon.toolkit.a.a.e.b(e1).a(d1))
        {
            d1 = (ai)b1.next();
        }

        com.nuance.dragon.toolkit.a.a.e.b(e1).a(new q(f1.e(), b));
        a.a(com.nuance.dragon.toolkit.a.a.e.b(e1), 6);
    }

    public final void b()
    {
        b.i();
        if (c != null)
        {
            x x1 = com.nuance.dragon.toolkit.a.a.e.b(c);
            c = null;
            x1.f();
        }
    }
}
