// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import com.facebook.auth.b.b;
import com.facebook.base.broadcast.a;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.background:
//            q, g

class m extends d
{

    private m()
    {
    }

    m(g g)
    {
        this();
    }

    public q a()
    {
        return new q((b)a(com/facebook/auth/b/b), (k)a(com/facebook/fbservice/ops/k), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (a)a(com/facebook/base/broadcast/a), (com.facebook.common.v.a)a(com/facebook/common/v/a), (com.facebook.common.time.a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
