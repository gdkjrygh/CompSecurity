// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import android.content.Context;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.f;
import com.tinder.managers.g;
import dagger.internal.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.f:
//            m

public final class o
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

    private o(m m, a.a.a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6)
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
        } else
        {
            h = a6;
            return;
        }
    }

    public static a a(m m, a.a.a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6)
    {
        return new o(m, a1, a2, a3, a4, a5, a6);
    }

    public final Object a()
    {
        Context context = (Context)c.a();
        ae ae1 = (ae)d.a();
        d d1 = (d)e.a();
        return new g(context, ae1, (f)f.a(), d1, (com.tinder.a.f)g.a(), (c)h.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/o.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
