// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            m

public final class n
    implements a
{

    static final boolean a;
    private final m b;

    private n(m m1)
    {
        if (!a && m1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = m1;
            return;
        }
    }

    public static a a(m m1)
    {
        return new n(m1);
    }

    public final Object a()
    {
        android.content.Context context = b.a;
        if (context == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return context;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/n.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
