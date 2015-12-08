// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import com.tinder.managers.ae;
import com.tinder.managers.i;
import com.tinder.managers.z;
import dagger.a;

// Referenced classes of package com.tinder.c:
//            ae

public final class af
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;

    private af(a a1, a.a.a a2, a.a.a a3, a.a.a a4)
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
        } else
        {
            e = a4;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4)
    {
        return new af(a1, a2, a3, a4);
    }

    public final void injectMembers(Object obj)
    {
        obj = (com.tinder.c.ae)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (i)c.a();
            obj.b = (z)d.a();
            obj.c = (ae)e.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/c/af.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
