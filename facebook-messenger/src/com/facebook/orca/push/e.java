// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.push;

import com.facebook.analytics.cn;
import com.facebook.auth.annotations.LoggedInUserKey;
import com.facebook.fbservice.ops.k;
import com.facebook.inject.d;
import com.facebook.orca.notify.av;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.push:
//            b, c, d

class e extends d
{

    final c a;

    private e(c c)
    {
        a = c;
        super();
    }

    e(c c, com.facebook.orca.push.d d1)
    {
        this(c);
    }

    public b a()
    {
        return new b(b(com/facebook/user/UserKey, com/facebook/auth/annotations/LoggedInUserKey), (av)a(com/facebook/orca/notify/av), (k)a(com/facebook/fbservice/ops/k), (com.facebook.base.a.d)a(com/facebook/base/a/d), (cn)a(com/facebook/analytics/cn));
    }

    public Object b()
    {
        return a();
    }
}
