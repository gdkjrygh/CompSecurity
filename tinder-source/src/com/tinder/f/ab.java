// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.a.f;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.i;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.parse.UserParse;
import dagger.internal.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.f:
//            m

public final class ab
    implements a
{

    static final boolean a;
    private final m b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;
    private final a.a.a f;
    private final a.a.a g;
    private final a.a.a h;
    private final a.a.a i;
    private final a.a.a j;
    private final a.a.a k;
    private final a.a.a l;
    private final a.a.a m;

    private ab(m m1, a.a.a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, 
            a.a.a a7, a.a.a a8, a.a.a a9, a.a.a a10, a.a.a a11)
    {
        if (!a && m1 == null)
        {
            throw new AssertionError();
        }
        b = m1;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        c = a1;
        if (!a && a2 == null)
        {
            throw new AssertionError();
        }
        d = a2;
        if (!a && a3 == null)
        {
            throw new AssertionError();
        }
        e = a3;
        if (!a && a4 == null)
        {
            throw new AssertionError();
        }
        f = a4;
        if (!a && a5 == null)
        {
            throw new AssertionError();
        }
        g = a5;
        if (!a && a6 == null)
        {
            throw new AssertionError();
        }
        h = a6;
        if (!a && a7 == null)
        {
            throw new AssertionError();
        }
        i = a7;
        if (!a && a8 == null)
        {
            throw new AssertionError();
        }
        j = a8;
        if (!a && a9 == null)
        {
            throw new AssertionError();
        }
        k = a9;
        if (!a && a10 == null)
        {
            throw new AssertionError();
        }
        l = a10;
        if (!a && a11 == null)
        {
            throw new AssertionError();
        } else
        {
            m = a11;
            return;
        }
    }

    public static a a(m m1, a.a.a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, 
            a.a.a a8, a.a.a a9, a.a.a a10, a.a.a a11)
    {
        return new ab(m1, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
    }

    public final Object a()
    {
        ae ae1 = (ae)c.a();
        y y1 = (y)d.a();
        return new com.tinder.managers.ab(ae1, (i)e.a(), y1, (UserParse)f.a(), (ad)g.a(), (c)h.a(), (f)i.a(), (com.tinder.d.a)j.a(), (e)k.a(), (z)l.a(), (d)m.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/ab.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
