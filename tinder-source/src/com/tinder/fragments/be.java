// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ae;
import com.tinder.managers.ag;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.i;
import com.tinder.managers.y;
import com.tinder.managers.z;
import dagger.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.fragments:
//            bd

public final class be
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
    private final a.a.a m;

    private be(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, 
            a.a.a a8, a.a.a a9, a.a.a a10, a.a.a a11, a.a.a a12)
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
        }
        l = a11;
        if (!a && a12 == null)
        {
            throw new AssertionError();
        } else
        {
            m = a12;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, a.a.a a8, 
            a.a.a a9, a.a.a a10, a.a.a a11, a.a.a a12)
    {
        return new be(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
    }

    public final void injectMembers(Object obj)
    {
        obj = (bd)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.e = (y)c.a();
            obj.f = (i)d.a();
            obj.g = (ab)e.a();
            obj.h = (z)f.a();
            obj.i = (ManagerLiveRail)g.a();
            obj.j = (ae)h.a();
            obj.k = (d)i.a();
            obj.l = (aa)j.a();
            obj.m = (ag)k.a();
            obj.n = (c)l.a();
            obj.o = (e)m.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/fragments/be.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
