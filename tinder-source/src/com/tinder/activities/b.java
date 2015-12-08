// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import com.tinder.managers.d;
import dagger.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.activities:
//            ActivityBanned

public final class b
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;

    private b(a a1, a.a.a a2, a.a.a a3, a.a.a a4)
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
        return new b(a1, a2, a3, a4);
    }

    public final void injectMembers(Object obj)
    {
        obj = (ActivityBanned)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (d)c.a();
            obj.b = (c)d.a();
            obj.c = (com.tinder.d.a)e.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/activities/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
