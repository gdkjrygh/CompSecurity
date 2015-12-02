// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import android.app.AlarmManager;
import android.content.Context;
import com.facebook.analytics.av;
import com.facebook.common.hardware.k;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.push.annotations.IsGcmEnabled;

// Referenced classes of package com.facebook.push.c2dm:
//            C2DMRegistrar, FacebookPushServerRegistrar, y, d, 
//            e

class g extends d
{

    final com.facebook.push.c2dm.d a;

    private g(com.facebook.push.c2dm.d d1)
    {
        a = d1;
        super();
    }

    g(com.facebook.push.c2dm.d d1, e e)
    {
        this(d1);
    }

    public C2DMRegistrar a()
    {
        return new C2DMRegistrar((Context)e().a(android/content/Context), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (av)a(com/facebook/analytics/av), ((Boolean)a(java/lang/Boolean, com/facebook/push/annotations/IsGcmEnabled)).booleanValue(), (k)a(com/facebook/common/hardware/k), (FacebookPushServerRegistrar)a(com/facebook/push/c2dm/FacebookPushServerRegistrar), (y)a(com/facebook/push/c2dm/y), (AlarmManager)e().a(android/app/AlarmManager));
    }

    public Object b()
    {
        return a();
    }
}
