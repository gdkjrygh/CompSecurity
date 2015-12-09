// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.a.a.a.c.a.c.a;
import com.nuance.a.a.a.c.a.c.b;
import com.nuance.a.a.a.c.a.c.h;
import com.nuance.a.a.a.c.a.c.j;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            f, v, x, ap

final class u
    implements j
{

    final f a;

    u(f f1)
    {
        a = f1;
        super();
    }

    public final void a(a a1)
    {
        f.c(a).post(new v(this, a1));
    }

    public final void a(b b1)
    {
        (new StringBuilder("[LATCHK] PDX Query Retry Returned: ")).append(b1.b()).append("(").append(b1.a()).append(")");
        String s = b1.f();
        b1 = b1.a();
        com.nuance.dragon.toolkit.a.f.b(a).k().a(s, b1);
    }

    public final void a(h h1)
    {
        (new StringBuilder("[LATCHK] PDX Query Error Returned: ")).append(h1.a()).append("(").append(h1.b()).append(")");
        com.nuance.dragon.toolkit.a.f.b(a).k().a(h1.a(), h1.b());
    }

    public final void a(short word0)
    {
        com.nuance.dragon.toolkit.a.f.b(a).k().a(word0);
    }
}
