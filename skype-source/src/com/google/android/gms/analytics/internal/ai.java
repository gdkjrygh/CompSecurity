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
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, ae, s

public final class ai extends q
{

    private boolean a;
    private boolean b;
    private AlarmManager c;

    protected ai(s s)
    {
        super(s);
        c = (AlarmManager)m().getSystemService("alarm");
    }

    private PendingIntent f()
    {
        Intent intent = new Intent(m(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(m(), 0, intent, 0);
    }

    protected final void a()
    {
        ActivityInfo activityinfo;
        try
        {
            c.cancel(f());
            if (ae.e() <= 0L)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            activityinfo = m().getPackageManager().getReceiverInfo(new ComponentName(m(), com/google/android/gms/analytics/AnalyticsReceiver), 2);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return;
        }
        if (activityinfo == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (activityinfo.enabled)
        {
            c("Receiver registered. Using alarm for local dispatch.");
            a = true;
        }
    }

    public final boolean b()
    {
        return a;
    }

    public final boolean c()
    {
        return b;
    }

    public final void d()
    {
        B();
        y.a(a, "Receiver not registered");
        long l = ae.e();
        if (l > 0L)
        {
            e();
            long l1 = l().b();
            b = true;
            c.setInexactRepeating(2, l1 + l, 0L, f());
        }
    }

    public final void e()
    {
        B();
        b = false;
        c.cancel(f());
    }
}
