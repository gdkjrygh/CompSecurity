// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.pm.PackageInfo;
import com.facebook.config.b.a;
import com.facebook.config.b.b;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class k extends d
{

    final com.facebook.base.c.a a;

    private k(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    k(com.facebook.base.c.a a1, com.facebook.base.c.b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new b((PackageInfo)a(android/content/pm/PackageInfo));
    }

    public Object b()
    {
        return a();
    }
}
