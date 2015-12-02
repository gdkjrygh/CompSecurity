// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.c;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.analytics.g.e;
import com.facebook.analytics.g.g;
import com.facebook.analytics.j.a;
import com.facebook.http.b.ap;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.ui.images.b.aa;

// Referenced classes of package com.facebook.ui.images.c:
//            a, b

class j extends d
{

    final com.facebook.ui.images.c.a a;

    private j(com.facebook.ui.images.c.a a1)
    {
        a = a1;
        super();
    }

    j(com.facebook.ui.images.c.a a1, b b1)
    {
        this(a1);
    }

    public aa a()
    {
        return new aa((Context)e().a(android/content/Context), (ap)a(com/facebook/http/b/ap), (a)a(com/facebook/analytics/j/a), (av)a(com/facebook/analytics/av), (e)a(com/facebook/analytics/g/g));
    }

    public Object b()
    {
        return a();
    }
}
