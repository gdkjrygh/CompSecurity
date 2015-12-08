// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import dagger.a;

// Referenced classes of package com.tinder.c:
//            x

public final class y
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;
    private final a.a.a f;

    private y(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && a2 == null)
        {
            throw new AssertionError();
        }
        c = a2;
        if (!a && a3 == null)
        {
            throw new AssertionError();
        }
        d = a3;
        if (!a && a4 == null)
        {
            throw new AssertionError();
        }
        e = a4;
        if (!a && a5 == null)
        {
            throw new AssertionError();
        } else
        {
            f = a5;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5)
    {
        return new y(a1, a2, a3, a4, a5);
    }

    public final void injectMembers(Object obj)
    {
        obj = (x)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (ab)c.a();
            obj.b = (d)d.a();
            obj.c = (ae)e.a();
            obj.d = (com.tinder.d.a)f.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/c/y.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
