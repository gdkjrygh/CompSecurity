// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import com.tinder.managers.z;

// Referenced classes of package com.tinder.adapters:
//            ActivityMainPagerAdapter

public final class a
    implements dagger.a
{

    static final boolean a;
    private final dagger.a b;
    private final a.a.a c;

    private a(dagger.a a1, a.a.a a2)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && a2 == null)
        {
            throw new AssertionError();
        } else
        {
            c = a2;
            return;
        }
    }

    public static dagger.a a(dagger.a a1, a.a.a a2)
    {
        return new a(a1, a2);
    }

    public final void injectMembers(Object obj)
    {
        obj = (ActivityMainPagerAdapter)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (z)c.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/adapters/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
