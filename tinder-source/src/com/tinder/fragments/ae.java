// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.g;
import com.tinder.managers.y;
import dagger.a;

// Referenced classes of package com.tinder.fragments:
//            FragmentMap

public final class ae
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;

    private ae(a a1, a.a.a a2, a.a.a a3)
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
        } else
        {
            d = a3;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3)
    {
        return new ae(a1, a2, a3);
    }

    public final void injectMembers(Object obj)
    {
        obj = (FragmentMap)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (y)c.a();
            obj.b = (g)d.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/fragments/ae.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
