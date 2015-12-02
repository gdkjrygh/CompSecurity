// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class at extends d
{

    final a a;

    private at(a a1)
    {
        a = a1;
        super();
    }

    at(a a1, b b1)
    {
        this(a1);
    }

    public PackageManager a()
    {
        return ((Context)e().a(android/content/Context)).getPackageManager();
    }

    public Object b()
    {
        return a();
    }
}
