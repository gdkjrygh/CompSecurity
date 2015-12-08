// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import android.content.Context;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            b

public final class d
    implements a
{

    static final boolean a;
    private final b b;
    private final a.a.a c;
    private final a.a.a d;

    private d(b b1, a.a.a a1, a.a.a a2)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        }
        b = b1;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        c = a1;
        if (!a && a2 == null)
        {
            throw new AssertionError();
        } else
        {
            d = a2;
            return;
        }
    }

    public static a a(b b1, a.a.a a1, a.a.a a2)
    {
        return new d(b1, a1, a2);
    }

    public final Object a()
    {
        Context context = (Context)c.a();
        d.a();
        return new com.tinder.utils.d(context);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
