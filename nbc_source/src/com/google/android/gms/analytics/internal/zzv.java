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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzr, zzf

public class zzv extends zzd
{

    private boolean zzKW;
    private boolean zzKX;
    private AlarmManager zzKY;

    protected zzv(zzf zzf)
    {
        super(zzf);
        zzKY = (AlarmManager)getContext().getSystemService("alarm");
    }

    private PendingIntent zzjI()
    {
        Intent intent = new Intent(getContext(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(getContext(), 0, intent, 0);
    }

    public void cancel()
    {
        zzia();
        zzKX = false;
        zzKY.cancel(zzjI());
    }

    public boolean zzbp()
    {
        return zzKX;
    }

    protected void zzhn()
    {
        ActivityInfo activityinfo;
        try
        {
            zzKY.cancel(zzjI());
            if (zzhR().zzjf() <= 0L)
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
            zzaT("Receiver registered. Using alarm for local dispatch.");
            zzKW = true;
        }
    }

    public boolean zzjG()
    {
        return zzKW;
    }

    public void zzjH()
    {
        zzia();
        zzu.zza(zzjG(), "Receiver not registered");
        long l = zzhR().zzjf();
        if (l > 0L)
        {
            cancel();
            long l1 = zzhP().elapsedRealtime();
            zzKX = true;
            zzKY.setInexactRepeating(2, l1 + l, 0L, zzjI());
        }
    }
}
