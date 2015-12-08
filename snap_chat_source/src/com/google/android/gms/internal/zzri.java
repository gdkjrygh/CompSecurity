// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import av;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzre

public final class zzri
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final zzre zzasy;
    private final Map zzasz = new av();

    public zzri(zzre zzre1)
    {
        zzx.zzl(zzre1);
        zzasy = zzre1;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        int i;
        if (bundle != null)
        {
            if ((bundle = bundle.getBundle("com.google.android.gms.measurement.screen_view")) != null && (i = bundle.getInt("id")) > 0)
            {
                activity = zza(activity, i);
                activity.setScreenName(bundle.getString("name"));
                activity.zzgr(bundle.getInt("referrer_id"));
                activity.zzcv(bundle.getString("referrer_name"));
                activity.zzaa(bundle.getBoolean("interstitial"));
                activity.zzrh();
                return;
            }
        }
    }

    public final void onActivityDestroyed(Activity activity)
    {
        zzasz.remove(activity);
    }

    public final void onActivityPaused(Activity activity)
    {
    }

    public final void onActivityResumed(Activity activity)
    {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            if ((activity = (zzrh)zzasz.get(activity)) != null)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", activity.zzaF());
                bundle1.putString("name", activity.zzre());
                bundle1.putInt("referrer_id", activity.zzrf());
                bundle1.putString("referrer_name", activity.zzrg());
                bundle1.putBoolean("interstitial", activity.zzri());
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
                return;
            }
        }
    }

    public final void onActivityStarted(Activity activity)
    {
        zzrh zzrh1 = zza(activity, 0);
        zzasy.zzb(zzrh1, activity);
    }

    public final void onActivityStopped(Activity activity)
    {
    }

    final zzrh zza(Activity activity, int i)
    {
        zzx.zzl(activity);
        zzrh zzrh2 = (zzrh)zzasz.get(activity);
        zzrh zzrh1 = zzrh2;
        if (zzrh2 == null)
        {
            if (i == 0)
            {
                zzrh1 = new zzrh(true);
            } else
            {
                zzrh1 = new zzrh(true, i);
            }
            zzrh1.setScreenName(activity.getClass().getCanonicalName());
            zzasz.put(activity, zzrh1);
        }
        return zzrh1;
    }
}
