// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.c:
//            t, d, e

class h extends d
{

    final com.facebook.c.d a;

    private h(com.facebook.c.d d1)
    {
        a = d1;
        super();
    }

    h(com.facebook.c.d d1, e e)
    {
        this(d1);
    }

    public t a()
    {
        return new t((PackageManager)e().a(android/content/pm/PackageManager), ((Context)e().a(android/content/Context)).getApplicationInfo());
    }

    public Object b()
    {
        return a();
    }
}
