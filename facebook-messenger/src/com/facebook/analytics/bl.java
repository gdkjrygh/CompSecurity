// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.analytics.periodicreporters.e;
import com.facebook.analytics.periodicreporters.j;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.analytics:
//            ay, az

class bl extends d
{

    final ay a;

    private bl(ay ay)
    {
        a = ay;
        super();
    }

    bl(ay ay, az az)
    {
        this(ay);
    }

    public e a()
    {
        return new e((Context)e().a(android/content/Context), (com.facebook.analytics.c.e)a(com/facebook/analytics/c/e), (PackageManager)a(android/content/pm/PackageManager), (ActivityManager)a(android/app/ActivityManager), c(com/facebook/analytics/periodicreporters/j));
    }

    public Object b()
    {
        return a();
    }
}
