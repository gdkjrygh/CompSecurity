// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import com.tinder.managers.ae;
import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.utils:
//            ae

public final class af
    implements a
{

    static final boolean a;
    private final a.a.a b;
    private final a.a.a c;

    private af(a.a.a a1, a.a.a a2)
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

    public static a a(a.a.a a1, a.a.a a2)
    {
        return new af(a1, a2);
    }

    public final void injectMembers(Object obj)
    {
        obj = (com.tinder.utils.ae)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.a = (ae)b.a();
            obj.b = (z)c.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/utils/af.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
