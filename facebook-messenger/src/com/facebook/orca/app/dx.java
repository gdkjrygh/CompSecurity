// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.analytics.ak;
import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.inject.d;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.app:
//            fe, dv, dw

class dx extends d
{

    final dv a;

    private dx(dv dv)
    {
        a = dv;
        super();
    }

    dx(dv dv, dw dw)
    {
        this(dv);
    }

    public ak a()
    {
        return new fe(b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (com.facebook.base.a.d)a(com/facebook/base/a/d));
    }

    public Object b()
    {
        return a();
    }
}
