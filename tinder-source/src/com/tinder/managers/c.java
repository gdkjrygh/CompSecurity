// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.squareup.okhttp.s;
import com.tinder.a.f;
import com.tinder.utils.n;
import dagger.a;

// Referenced classes of package com.tinder.managers:
//            ManagerApp, d, i, ad, 
//            ai

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
        obj = (ManagerApp)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.e = (d)c.a();
            obj.f = (de.greenrobot.event.c)d.a();
            obj.g = (s)e.a();
            obj.h = (n)f.a();
            obj.i = (f)g.a();
            obj.j = (com.squareup.okhttp.c)h.a();
            obj.k = (i)i.a();
            obj.l = (ad)j.a();
            obj.m = (ai)k.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/managers/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
