// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.managers.ae;
import dagger.internal.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.f:
//            m

public final class ad
    implements a
{

    static final boolean a;
    private final m b;
    private final a.a.a c;
    private final a.a.a d;

    private ad(m m, a.a.a a1, a.a.a a2)
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
        } else
        {
            d = a2;
            return;
        }
    }

    public static a a(m m, a.a.a a1, a.a.a a2)
    {
        return new ad(m, a1, a2);
    }

    public final Object a()
    {
        return new com.tinder.managers.ad((ae)c.a(), (c)d.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/ad.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
