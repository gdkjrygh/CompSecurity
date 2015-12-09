// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.a;
import com.android.slyce.a.b.g;
import com.android.slyce.a.c.av;
import com.android.slyce.a.c.az;
import com.android.slyce.a.c.n;
import com.android.slyce.a.c.s;

// Referenced classes of package com.android.slyce.a.c.d:
//            b, a, aj

class ap
    implements g
{

    final n a;
    final b b;
    final aj c;

    ap(aj aj, n n1, b b1)
    {
        c = aj;
        a = n1;
        b = b1;
        super();
    }

    public void a(Exception exception, av av1)
    {
        a.h.a(exception);
        exception = az.a(b, b.b().g, av1, false);
        a.f.b(exception);
    }

    public volatile void a(Exception exception, Object obj)
    {
        a(exception, (av)obj);
    }
}
