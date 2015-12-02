// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.analytics.av;
import com.facebook.auth.login.am;
import com.facebook.auth.login.v;
import com.facebook.inject.d;
import com.facebook.orca.login.af;
import com.facebook.orca.login.b;
import com.facebook.orca.nux.h;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dq extends d
{

    final com.facebook.orca.app.h a;

    private dq(com.facebook.orca.app.h h1)
    {
        a = h1;
        super();
    }

    dq(com.facebook.orca.app.h h1, i i)
    {
        this(h1);
    }

    public af a()
    {
        return new af((com.facebook.auth.b.d)a(com/facebook/auth/b/d), (av)a(com/facebook/analytics/av), (v)a(com/facebook/auth/login/v), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (h)a(com/facebook/orca/nux/h), (b)a(com/facebook/orca/login/b), (am)a(com/facebook/auth/login/am), (com.facebook.user.a.h)a(com/facebook/user/a/h));
    }

    public Object b()
    {
        return a();
    }
}
