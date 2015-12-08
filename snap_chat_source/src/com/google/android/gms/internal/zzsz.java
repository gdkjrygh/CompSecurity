// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.Container;

// Referenced classes of package com.google.android.gms.internal:
//            zzta, zzre, zzrh

class zzsz
{
    static class zza
        implements zzre.zza
    {

        private final Tracker zzBL;

        public void zza(zzrh zzrh1)
        {
            zzBL.setScreenName(zzrh1.zzre());
            com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
            screenviewbuilder.set("&a", String.valueOf(zzrh1.zzaF()));
            zzBL.send(screenviewbuilder.build());
        }

        public void zza(zzrh zzrh1, Activity activity)
        {
        }

        zza(Tracker tracker)
        {
            zzBL = tracker;
        }
    }


    private final Context mContext;
    private final zzta zzmB;

    public zzsz(Context context, Container container, zzta zzta1)
    {
        mContext = context;
        zzmB = zza(container, zzta1);
        zzrw();
    }

    static zzta zza(Container container, zzta zzta1)
    {
        if (container == null || container.isDefault())
        {
            return zzta1;
        } else
        {
            zzta1 = new zzta.zza(zzta1.zzrx());
            zzta1.zzcA(container.getString("trackingId")).zzab(container.getBoolean("trackScreenViews")).zzac(container.getBoolean("collectAdIdentifiers"));
            return zzta1.zzrA();
        }
    }

    private void zzrw()
    {
        if (zzmB.zzry() && !TextUtils.isEmpty(zzmB.zzgL()))
        {
            Tracker tracker = zzcz(zzmB.zzgL());
            tracker.enableAdvertisingIdCollection(zzmB.zzrz());
            zzb(new zza(tracker));
        }
    }

    void zzb(zzre.zza zza1)
    {
        zzx.zzl(zza1);
        zzre zzre1 = zzre.zzag(mContext);
        zzre1.zzZ(true);
        zzre1.zza(zza1);
    }

    Tracker zzcz(String s)
    {
        return GoogleAnalytics.getInstance(mContext).newTracker(s);
    }

    public zzta zzrv()
    {
        return zzmB;
    }
}
