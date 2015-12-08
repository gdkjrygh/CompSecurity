// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.a.f;
import com.tinder.managers.ae;
import com.tinder.managers.ag;
import com.tinder.managers.d;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            m

public final class af
    implements a
{

    static final boolean a;
    private final m b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;

    private af(m m, a.a.a a1, a.a.a a2, a.a.a a3)
    {
        if (!a && m == null)
        {
            throw new AssertionError();
        }
        b = m;
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
        } else
        {
            e = a3;
            return;
        }
    }

    public static a a(m m, a.a.a a1, a.a.a a2, a.a.a a3)
    {
        return new af(m, a1, a2, a3);
    }

    public final Object a()
    {
        return new ag((d)c.a(), (ae)d.a(), (f)e.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/af.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
