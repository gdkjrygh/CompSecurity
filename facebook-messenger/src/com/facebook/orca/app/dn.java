// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.appconfig.m;
import com.facebook.inject.d;
import com.facebook.orca.c.a;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dn extends d
{

    final h a;

    private dn(h h)
    {
        a = h;
        super();
    }

    dn(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return new a((m)a(com/facebook/appconfig/m), (com.facebook.orca.common.a.d)a(com/facebook/orca/common/a/d), (com.facebook.config.b.a)a(com/facebook/config/b/a));
    }

    public Object b()
    {
        return a();
    }
}
