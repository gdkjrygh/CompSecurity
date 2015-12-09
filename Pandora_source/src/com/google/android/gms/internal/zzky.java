// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzkv, zzko

public final class zzky
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final zzko zzawY;
    private final Map zzawZ = new HashMap();

    public zzky(zzko zzko1)
    {
        zzv.zzr(zzko1);
        zzawY = zzko1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            if ((bundle = bundle.getBundle("com.google.android.gms.measurement.screen_view")) != null)
            {
                int i = bundle.getInt("id");
                if (i <= 0)
                {
                    Log.w("com.google.android.gms.measurement.internal.ActivityLifecycleTracker", "Invalid screenId in saved activity state");
                    return;
                } else
                {
                    activity = zza(activity, i);
                    activity.setScreenName(bundle.getString("name"));
                    activity.zzgJ(bundle.getInt("referrer_id"));
                    activity.zzdd(bundle.getString("referrer_name"));
                    activity.zzad(bundle.getBoolean("interstitial"));
                    activity.zzuP();
                    return;
                }
            }
        }
    }

    public void onActivityDestroyed(Activity activity)
    {
        zzawZ.remove(activity);
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        if (bundle != null)
        {
            if ((activity = (zzkv)zzawZ.get(activity)) != null)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", activity.zzaJ());
                bundle1.putString("name", activity.zzuL());
                bundle1.putInt("referrer_id", activity.zzuM());
                bundle1.putString("referrer_name", activity.zzuN());
                bundle1.putBoolean("interstitial", activity.zzuQ());
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
                return;
            }
        }
    }

    public void onActivityStarted(Activity activity)
    {
        zzkv zzkv1 = zza(activity, 0);
        zzawY.zzb(zzkv1, activity);
    }

    public void onActivityStopped(Activity activity)
    {
    }

    zzkv zza(Activity activity, int i)
    {
        zzv.zzr(activity);
        zzkv zzkv2 = (zzkv)zzawZ.get(activity);
        zzkv zzkv1 = zzkv2;
        if (zzkv2 == null)
        {
            if (i == 0)
            {
                zzkv1 = new zzkv(true);
            } else
            {
                zzkv1 = new zzkv(true, i);
            }
            zzkv1.setScreenName(activity.getClass().getCanonicalName());
            zzawZ.put(activity, zzkv1);
        }
        return zzkv1;
    }
}
