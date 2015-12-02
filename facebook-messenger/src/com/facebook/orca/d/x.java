// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.analytics.g.e;
import com.facebook.analytics.g.g;
import com.facebook.analytics.j.a;
import com.facebook.http.b.ap;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.d:
//            r, s, t

class x extends d
{

    final s a;

    private x(s s)
    {
        a = s;
        super();
    }

    x(s s, t t)
    {
        this(s);
    }

    public r a()
    {
        return new r((Context)e().a(android/content/Context), (ap)a(com/facebook/http/b/ap), (a)a(com/facebook/analytics/j/a), (av)a(com/facebook/analytics/av), (e)a(com/facebook/analytics/g/g));
    }

    public Object b()
    {
        return a();
    }
}
