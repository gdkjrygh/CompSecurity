// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import dagger.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.adapters:
//            v

public final class w
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;

    private w(a a1, a.a.a a2)
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

    public static a a(a a1, a.a.a a2)
    {
        return new w(a1, a2);
    }

    public final void injectMembers(Object obj)
    {
        obj = (v)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (c)c.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/adapters/w.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
