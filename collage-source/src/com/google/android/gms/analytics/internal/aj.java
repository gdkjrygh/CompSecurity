// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, af, t

public class aj extends r
{

    private boolean a;
    private boolean b;
    private AlarmManager c;

    protected aj(t t)
    {
        super(t);
        c = (AlarmManager)o().getSystemService("alarm");
    }

    private PendingIntent f()
    {
        Intent intent = new Intent(o(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(o(), 0, intent, 0);
    }

    protected void a()
    {
        ActivityInfo activityinfo;
        try
        {
            c.cancel(f());
            if (q().j() <= 0L)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            activityinfo = o().getPackageManager().getReceiverInfo(new ComponentName(o(), com/google/android/gms/analytics/AnalyticsReceiver), 2);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return;
        }
        if (activityinfo == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (activityinfo.enabled)
        {
            b("Receiver registered. Using alarm for local dispatch.");
            a = true;
        }
    }

    public boolean b()
    {
        return a;
    }

    public boolean c()
    {
        return b;
    }

    public void d()
    {
        D();
        z.a(b(), "Receiver not registered");
        long l = q().j();
        if (l > 0L)
        {
            e();
            long l1 = n().b();
            b = true;
            c.setInexactRepeating(2, l1 + l, 0L, f());
        }
    }

    public void e()
    {
        D();
        b = false;
        c.cancel(f());
    }
}
