// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.a.a.a.c.a.c.a;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            an, aq, x, ar, 
//            aa, e, al

abstract class ap
{

    protected final e a;
    protected final x b;
    private final boolean c;
    private final boolean d;
    private boolean e;
    private final Handler f = new Handler();

    ap(e e1, boolean flag, boolean flag1, x x1)
    {
        b = x1;
        c = flag;
        d = flag1;
        a = e1;
    }

    static boolean b(ap ap1)
    {
        return ap1.c;
    }

    void a()
    {
        e = true;
    }

    final void a(int i, String s)
    {
        a(new an(b, 3, s, null, null, i));
    }

    void a(a a1)
    {
    }

    void a(al al)
    {
    }

    final void a(an an1)
    {
        f.post(new aq(this, an1));
    }

    protected final void a(ap ap1)
    {
        b.a(ap1);
    }

    void a(e e1)
    {
    }

    final void a(String s, String s1)
    {
        a(new an(b, 2, null, s1, s, 0));
    }

    final void a(short word0)
    {
        a(new an(b, word0));
    }

    void b()
    {
        e = false;
    }

    void c()
    {
        a(new ar(a, b));
        b.i().a(b, new an(b, (byte)0));
    }

    void d()
    {
    }

    final void e()
    {
        a(new an(b, 0xfff0000));
    }
}
