// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.background;

import com.facebook.auth.b.b;
import com.facebook.common.time.a;
import com.facebook.fbservice.ops.k;

// Referenced classes of package com.facebook.config.background:
//            i, ConfigRefreshInterval, c

class d extends com.facebook.inject.d
{

    private d()
    {
    }

    d(c c)
    {
        this();
    }

    public i a()
    {
        return new i((b)a(com/facebook/auth/b/b), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (k)a(com/facebook/fbservice/ops/k), b(java/lang/Long, com/facebook/config/background/ConfigRefreshInterval), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
