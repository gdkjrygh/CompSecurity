// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.a.f;
import com.tinder.managers.af;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            m

public final class ae
    implements a
{

    static final boolean a;
    private final m b;
    private final a.a.a c;

    private ae(m m, a.a.a a1)
    {
        if (!a && m == null)
        {
            throw new AssertionError();
        }
        b = m;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = a1;
            return;
        }
    }

    public static a a(m m, a.a.a a1)
    {
        return new ae(m, a1);
    }

    public final Object a()
    {
        return new af((f)c.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/ae.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
