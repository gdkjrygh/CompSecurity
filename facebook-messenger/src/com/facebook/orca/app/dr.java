// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.analytics.av;
import com.facebook.inject.d;
import com.facebook.orca.login.ai;
import com.facebook.orca.login.b;
import com.facebook.phonenumbers.PhoneNumberUtil;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class dr extends d
{

    final h a;

    private dr(h h)
    {
        a = h;
        super();
    }

    dr(h h, i i)
    {
        this(h);
    }

    public ai a()
    {
        return new ai((av)a(com/facebook/analytics/av), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (PhoneNumberUtil)a(com/facebook/phonenumbers/PhoneNumberUtil), (b)a(com/facebook/orca/login/b));
    }

    public Object b()
    {
        return a();
    }
}
