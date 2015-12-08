// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.cards;

import com.tinder.managers.ae;
import dagger.a;

// Referenced classes of package com.tinder.cards:
//            a

public final class b
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;

    private b(a a1, a.a.a a2)
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
        return new b(a1, a2);
    }

    public final void injectMembers(Object obj)
    {
        obj = (com.tinder.cards.a)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.mManagerPrefs = (ae)c.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/cards/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
