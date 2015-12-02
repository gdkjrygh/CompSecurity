// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.analytics.av;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.orca.sms:
//            af, ah, ai

class au extends d
{

    final ah a;

    private au(ah ah)
    {
        a = ah;
        super();
    }

    au(ah ah, ai ai)
    {
        this(ah);
    }

    public af a()
    {
        return new af((Context)e().a(android/content/Context), (av)a(com/facebook/analytics/av), (PackageManager)a(android/content/pm/PackageManager), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d));
    }

    public Object b()
    {
        return a();
    }
}
