// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import android.content.Context;
import com.squareup.okhttp.c;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            b

public final class h
    implements a
{

    static final boolean a;
    private final b b;
    private final a.a.a c;

    private h(b b1, a.a.a a1)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        }
        b = b1;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = a1;
            return;
        }
    }

    public static a a(b b1, a.a.a a1)
    {
        return new h(b1, a1);
    }

    public final Object a()
    {
        return new c(((Context)c.a()).getCacheDir(), 0x4b00000L);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/h.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
