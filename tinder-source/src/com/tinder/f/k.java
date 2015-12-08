// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import android.content.Context;
import com.android.volley.a.f;
import com.android.volley.a.m;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            b

public final class k
    implements a
{

    static final boolean a;
    private final b b;
    private final a.a.a c;
    private final a.a.a d;

    private k(b b1, a.a.a a1, a.a.a a2)
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
        return new k(b1, a1, a2);
    }

    public final volatile Object a()
    {
        return m.a((Context)c.a(), (f)d.a());
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/k.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
