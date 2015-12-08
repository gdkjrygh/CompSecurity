// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import com.tinder.managers.ae;
import com.tinder.utils.n;
import dagger.a;

// Referenced classes of package com.tinder.services:
//            GCMRegistrationIntentService

public final class b
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;

    private b(a a1, a.a.a a2, a.a.a a3)
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
        return new b(a1, a2, a3);
    }

    public final void injectMembers(Object obj)
    {
        obj = (GCMRegistrationIntentService)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (ae)c.a();
            obj.b = (n)d.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/services/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
