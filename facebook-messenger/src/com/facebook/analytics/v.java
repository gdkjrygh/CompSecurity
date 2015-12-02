// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.b.a;
import com.facebook.common.process.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            f, g

class v extends d
{

    final f a;

    private v(f f)
    {
        a = f;
        super();
    }

    v(f f, g g)
    {
        this(f);
    }

    public com.facebook.analytics.b.c a()
    {
        c c1 = ((com.facebook.common.process.d)a(com/facebook/common/process/d)).b();
        if (c1.d())
        {
            return null;
        } else
        {
            return new com.facebook.analytics.b.c((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), c1.c(), (a)a(com/facebook/analytics/b/a), (com.facebook.common.time.a)a(com/facebook/common/time/a));
        }
    }

    public Object b()
    {
        return a();
    }
}
