// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import com.tinder.managers.ManagerNotifications;
import com.tinder.managers.d;

// Referenced classes of package com.tinder.services:
//            GCMListenerService

public final class a
    implements dagger.a
{

    static final boolean a;
    private final dagger.a b;
    private final a.a.a c;
    private final a.a.a d;

    private a(dagger.a a1, a.a.a a2, a.a.a a3)
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

    public static dagger.a a(dagger.a a1, a.a.a a2, a.a.a a3)
    {
        return new a(a1, a2, a3);
    }

    public final void injectMembers(Object obj)
    {
        obj = (GCMListenerService)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (d)c.a();
            obj.b = (ManagerNotifications)d.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/services/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
