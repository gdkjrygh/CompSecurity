// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.Container;

// Referenced classes of package com.google.android.gms.internal:
//            zzmg, zzko, zzkv

class k
{
    static class a
        implements zzko.zza
    {

        private final Tracker a;

        public void zza(zzkv zzkv1)
        {
            a.setScreenName(zzkv1.zzuL());
            com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
            screenviewbuilder.set("&a", String.valueOf(zzkv1.zzaJ()));
            a.send(screenviewbuilder.build());
        }

        public void zza(zzkv zzkv1, Activity activity)
        {
        }

        a(Tracker tracker)
        {
            a = tracker;
        }
    }


    private final zzmg a;
    private final Context b;

    public k(Context context, Container container, zzmg zzmg1)
    {
        b = context;
        a = a(container, zzmg1);
        b();
    }

    static zzmg a(Container container, zzmg zzmg1)
    {
        if (container == null || container.isDefault())
        {
            return zzmg1;
        } else
        {
            zzmg1 = new zzmg.zza(zzmg1.zzxZ());
            zzmg1.zzek(container.getString("trackingId")).zzak(container.getBoolean("trackScreenViews")).zzal(container.getBoolean("collectAdIdentifiers"));
            return zzmg1.zzyc();
        }
    }

    private void b()
    {
        if (a.zzya() && !TextUtils.isEmpty(a.zzjs()))
        {
            Tracker tracker = a(a.zzjs());
            tracker.enableAdvertisingIdCollection(a.zzyb());
            a(new a(tracker));
        }
    }

    Tracker a(String s)
    {
        return GoogleAnalytics.getInstance(b).newTracker(s);
    }

    public zzmg a()
    {
        return a;
    }

    void a(zzko.zza zza)
    {
        zzv.zzr(zza);
        zzko zzko1 = zzko.zzal(b);
        zzko1.zzaa(true);
        zzko1.zza(zza);
    }
}
