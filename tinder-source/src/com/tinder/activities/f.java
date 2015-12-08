// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.activities:
//            ActivityLogin

public final class f
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;
    private final a.a.a f;
    private final a.a.a g;

    private f(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6)
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
        }
        f = a5;
        if (!a && a6 == null)
        {
            throw new AssertionError();
        } else
        {
            g = a6;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6)
    {
        return new f(a1, a2, a3, a4, a5, a6);
    }

    public final void injectMembers(Object obj)
    {
        obj = (ActivityLogin)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.b = (d)c.a();
            obj.c = (com.tinder.managers.f)d.a();
            obj.d = (ae)e.a();
            obj.e = (z)f.a();
            obj.f = (com.tinder.d.a)g.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/activities/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
