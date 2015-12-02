// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.analytics.a;
import com.facebook.analytics.ck;
import com.facebook.config.server.j;
import com.facebook.inject.d;
import com.facebook.orca.b.b;

// Referenced classes of package com.facebook.orca.app:
//            dv, dw

class er extends d
{

    final dv a;

    private er(dv dv)
    {
        a = dv;
        super();
    }

    er(dv dv, dw dw)
    {
        this(dv);
    }

    public ck a()
    {
        return new b((a)a(com/facebook/analytics/a), (j)a(com/facebook/config/server/j), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
