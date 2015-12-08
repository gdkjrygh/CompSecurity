// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.ai;
import com.tinder.managers.h;
import com.tinder.managers.i;
import com.tinder.managers.z;
import com.tinder.utils.n;
import dagger.a;

// Referenced classes of package com.tinder.base:
//            ActivitySignedInBase

public final class c
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;
    private final a.a.a f;
    private final a.a.a g;
    private final a.a.a h;
    private final a.a.a i;
    private final a.a.a j;
    private final a.a.a k;

    private c(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, 
            a.a.a a8, a.a.a a9, a.a.a a10)
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
        }
        g = a6;
        if (!a && a7 == null)
        {
            throw new AssertionError();
        }
        h = a7;
        if (!a && a8 == null)
        {
            throw new AssertionError();
        }
        i = a8;
        if (!a && a9 == null)
        {
            throw new AssertionError();
        }
        j = a9;
        if (!a && a10 == null)
        {
            throw new AssertionError();
        } else
        {
            k = a10;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, a.a.a a8, 
            a.a.a a9, a.a.a a10)
    {
        return new c(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
    }

    public final void injectMembers(Object obj)
    {
        obj = (ActivitySignedInBase)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.r = (ae)c.a();
            obj.s = (ab)d.a();
            obj.t = (z)e.a();
            obj.u = (i)f.a();
            obj.v = (n)g.a();
            obj.w = (h)h.a();
            obj.x = (aa)i.a();
            obj.y = (ai)j.a();
            obj.z = (com.tinder.d.a)k.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/base/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
