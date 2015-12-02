// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.a;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.f;

// Referenced classes of package com.facebook.analytics.a:
//            a, b

class d
    implements f, Runnable
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b)
    {
        this(a1);
    }

    public void a()
    {
        com.facebook.analytics.a.a.b(a).a(this);
        a.d();
    }

    public void a(com.facebook.prefs.shared.d d1, ae ae1)
    {
        if (ae1.a(aj.m))
        {
            a.d();
        }
    }

    public void run()
    {
        a();
    }
}
