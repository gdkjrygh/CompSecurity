// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.http.b.ar;
import com.facebook.http.b.au;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            an, ck, au, f, 
//            g

class p extends d
{

    final f a;

    private p(f f)
    {
        a = f;
        super();
    }

    p(f f, g g)
    {
        this(f);
    }

    public an a()
    {
        return new an((ck)a(com/facebook/analytics/ck), (com.facebook.analytics.i.d)a(com/facebook/analytics/i/d), (au)a(com/facebook/analytics/au), (ar)a(com/facebook/http/b/ar));
    }

    public Object b()
    {
        return a();
    }
}
