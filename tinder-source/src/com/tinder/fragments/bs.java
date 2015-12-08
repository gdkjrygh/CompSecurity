// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.ab;
import com.tinder.managers.ac;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.ag;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.x;
import com.tinder.managers.y;
import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.fragments:
//            bm

public final class bs
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
    private final a.a.a l;

    private bs(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, 
            a.a.a a8, a.a.a a9, a.a.a a10, a.a.a a11)
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
        }
        k = a10;
        if (!a && a11 == null)
        {
            throw new AssertionError();
        } else
        {
            l = a11;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, a.a.a a8, 
            a.a.a a9, a.a.a a10, a.a.a a11)
    {
        return new bs(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
    }

    public final void injectMembers(Object obj)
    {
        obj = (bm)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.j = (d)c.a();
            obj.k = (ae)d.a();
            obj.l = (ad)e.a();
            obj.m = (z)f.a();
            obj.n = (ac)g.a();
            obj.o = (x)h.a();
            obj.p = (y)i.a();
            obj.q = (ab)j.a();
            obj.r = (e)k.a();
            obj.s = (ag)l.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/fragments/bs.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
