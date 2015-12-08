// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import com.tinder.a.f;
import dagger.a;

// Referenced classes of package com.tinder.activities:
//            WebViewActivityInstagram

public final class j
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;

    private j(a a1, a.a.a a2)
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
        return new j(a1, a2);
    }

    public final void injectMembers(Object obj)
    {
        obj = (WebViewActivityInstagram)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.a = (f)c.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/activities/j.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
