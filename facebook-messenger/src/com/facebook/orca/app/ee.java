// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.analytics.av;
import com.facebook.auth.b.b;
import com.facebook.inject.d;
import com.facebook.orca.notify.au;

// Referenced classes of package com.facebook.orca.app:
//            LoginReminderManager, dv, dw

class ee extends d
{

    final dv a;

    private ee(dv dv1)
    {
        a = dv1;
        super();
    }

    ee(dv dv1, dw dw)
    {
        this(dv1);
    }

    public LoginReminderManager a()
    {
        return new LoginReminderManager(dv.a(a), (b)a(com/facebook/auth/b/b), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), new au((com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d)), (av)a(com/facebook/analytics/av));
    }

    public Object b()
    {
        return a();
    }
}
