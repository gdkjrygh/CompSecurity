// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.y;
import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.fragments:
//            u

public final class v
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

    private v(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7)
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
        } else
        {
            h = a7;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7)
    {
        return new v(a1, a2, a3, a4, a5, a6, a7);
    }

    public final void injectMembers(Object obj)
    {
        obj = (u)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.B = (y)c.a();
            obj.C = (ad)d.a();
            obj.D = (ae)e.a();
            obj.E = (z)f.a();
            obj.F = (aa)g.a();
            obj.G = (ab)h.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/fragments/v.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
