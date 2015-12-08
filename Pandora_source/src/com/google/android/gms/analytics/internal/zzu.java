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
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzq, zze

public class zzu extends zzd
{

    private boolean zzHa;
    private boolean zzHb;
    private AlarmManager zzHc;

    protected zzu(zze zze)
    {
        super(zze);
        zzHc = (AlarmManager)getContext().getSystemService("alarm");
    }

    private PendingIntent zziB()
    {
        Intent intent = new Intent(getContext(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(getContext(), 0, intent, 0);
    }

    public void cancel()
    {
        zzgR();
        zzHb = false;
        zzHc.cancel(zziB());
    }

    public boolean zzaK()
    {
        return zzHb;
    }

    protected void zzgb()
    {
        ActivityInfo activityinfo;
        try
        {
            zzHc.cancel(zziB());
            if (zzgI().zzhY() <= 0L)
            {
                break MISSING_BLOCK_LABEL_70;
            }
            activityinfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), com/google/android/gms/analytics/AnalyticsReceiver), 2);
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
            zzaF("Receiver registered. Using alarm for local dispatch.");
            zzHa = true;
        }
    }

    public void zziA()
    {
        zzgR();
        zzv.zza(zziz(), "Receiver not registered");
        long l = zzgI().zzhY();
        if (l > 0L)
        {
            cancel();
            long l1 = zzgG().elapsedRealtime();
            zzHb = true;
            zzHc.setInexactRepeating(2, l1 + l, 0L, zziB());
        }
    }

    public boolean zziz()
    {
        return zzHa;
    }
}
