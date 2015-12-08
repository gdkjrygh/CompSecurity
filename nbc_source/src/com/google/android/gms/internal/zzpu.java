// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.Container;

// Referenced classes of package com.google.android.gms.internal:
//            zzpv, zznw, zzod

class zzpu
{
    static class zza
        implements zznw.zza
    {

        private final Tracker zzIq;

        public void zza(zzod zzod1)
        {
            zzIq.setScreenName(zzod1.zzwB());
            com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
            screenviewbuilder.set("&a", String.valueOf(zzod1.zzbn()));
            zzIq.send(screenviewbuilder.build());
        }

        public void zza(zzod zzod1, Activity activity)
        {
        }

        zza(Tracker tracker)
        {
            zzIq = tracker;
        }
    }


    private final Context mContext;
    private final zzpv zzoY;

    public zzpu(Context context, Container container, zzpv zzpv1)
    {
        mContext = context;
        zzoY = zza(container, zzpv1);
        zzzS();
    }

    static zzpv zza(Container container, zzpv zzpv1)
    {
        if (container == null || container.isDefault())
        {
            return zzpv1;
        } else
        {
            zzpv1 = new zzpv.zza(zzpv1.zzzT());
            zzpv1.zzeS(container.getString("trackingId")).zzap(container.getBoolean("trackScreenViews")).zzaq(container.getBoolean("collectAdIdentifiers"));
            return zzpv1.zzzW();
        }
    }

    private void zzzS()
    {
        if (zzoY.zzzU() && !TextUtils.isEmpty(zzoY.getTrackingId()))
        {
            Tracker tracker = zzeR(zzoY.getTrackingId());
            tracker.enableAdvertisingIdCollection(zzoY.zzzV());
            zzb(new zza(tracker));
        }
    }

    void zzb(zznw.zza zza1)
    {
        zzu.zzu(zza1);
        zznw zznw1 = zznw.zzaC(mContext);
        zznw1.zzaf(true);
        zznw1.zza(zza1);
    }

    Tracker zzeR(String s)
    {
        return GoogleAnalytics.getInstance(mContext).newTracker(s);
    }

    public zzpv zzzR()
    {
        return zzoY;
    }
}
