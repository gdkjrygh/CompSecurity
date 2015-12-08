// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import android.content.Context;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            m

public final class t
    implements a
{

    static final boolean a;
    private final m b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;

    private t(m m, a.a.a a1, a.a.a a2, a.a.a a3)
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
        return new t(m, a1, a2, a3);
    }

    public final Object a()
    {
        return new ManagerLiveRail((Context)c.a(), (ae)d.a(), (d)e.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/t.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
