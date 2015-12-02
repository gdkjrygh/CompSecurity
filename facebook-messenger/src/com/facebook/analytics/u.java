// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.facebook.analytics.b.a;
import com.facebook.analytics.b.b;
import com.facebook.common.process.c;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            f, g

class u extends d
{

    final f a;

    private u(f f)
    {
        a = f;
        super();
    }

    u(f f, g g)
    {
        this(f);
    }

    public b a()
    {
        if (((com.facebook.common.process.d)a(com/facebook/common/process/d)).b().d())
        {
            return new b((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/analytics/b/a));
        } else
        {
            return null;
        }
    }

    public Object b()
    {
        return a();
    }
}
