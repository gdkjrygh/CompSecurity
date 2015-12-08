// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.i;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.parse.UserParse;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            b

public final class l
    implements a
{

    static final boolean a;
    private final b b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;
    private final a.a.a f;
    private final a.a.a g;

    private l(b b1, a.a.a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        }
        b = b1;
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
        } else
        {
            g = a5;
            return;
        }
    }

    public static a a(b b1, a.a.a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5)
    {
        return new l(b1, a1, a2, a3, a4, a5);
    }

    public final Object a()
    {
        return new UserParse((z)c.a(), (y)d.a(), (ae)e.a(), (ad)f.a(), (i)g.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/l.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
