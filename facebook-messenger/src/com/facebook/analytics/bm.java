// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import com.facebook.analytics.periodicreporters.k;
import com.facebook.common.e.h;
import com.facebook.common.hardware.a;
import com.facebook.e.c;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ak, ay, az

class bm extends d
{

    final ay a;

    private bm(ay ay)
    {
        a = ay;
        super();
    }

    bm(ay ay, az az)
    {
        this(ay);
    }

    public k a()
    {
        return new k((Context)e().a(android/content/Context), (com.facebook.base.a.d)a(com/facebook/base/a/d), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (TelephonyManager)a(android/telephony/TelephonyManager), (PackageManager)a(android/content/pm/PackageManager), (com.facebook.common.hardware.k)a(com/facebook/common/hardware/k), (c)a(com/facebook/e/c), (a)a(com/facebook/common/hardware/a), (ak)a(com/facebook/analytics/ak), (h)a(com/facebook/common/e/h), (com.facebook.analytics.i.a)a(com/facebook/analytics/i/a));
    }

    public Object b()
    {
        return a();
    }
}
