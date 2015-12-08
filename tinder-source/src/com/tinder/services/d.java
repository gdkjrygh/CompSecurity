// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import com.tinder.managers.w;
import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.services:
//            WearIntentService

public final class d
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;

    private d(a a1, a.a.a a2, a.a.a a3)
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
        return new d(a1, a2, a3);
    }

    public final void injectMembers(Object obj)
    {
        obj = (WearIntentService)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.b = (z)c.a();
            obj.c = (w)d.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/services/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
