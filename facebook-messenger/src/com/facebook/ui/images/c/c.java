// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import com.facebook.analytics.av;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.inject.d;
import com.facebook.ui.images.b.a;
import com.facebook.ui.images.b.aa;

// Referenced classes of package com.facebook.ui.images.c:
//            a, b

class c extends d
{

    final com.facebook.ui.images.c.a a;

    private c(com.facebook.ui.images.c.a a1)
    {
        a = a1;
        super();
    }

    c(com.facebook.ui.images.c.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((com.facebook.ui.images.cache.a)a(com/facebook/ui/images/cache/a), (aa)a(com/facebook/ui/images/b/aa), (av)a(com/facebook/analytics/av), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
