// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jn, jg

public final class jq
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final jg a;
    private final Map b = new HashMap();

    public jq(jg jg1)
    {
        y.a(jg1);
        a = jg1;
    }

    private jn a(Activity activity, int i)
    {
        y.a(activity);
        jn jn2 = (jn)b.get(activity);
        jn jn1 = jn2;
        if (jn2 == null)
        {
            if (i == 0)
            {
                jn1 = new jn(true);
            } else
            {
                jn1 = new jn(true, i);
            }
            jn1.a(activity.getClass().getCanonicalName());
            b.put(activity, jn1);
        }
        return jn1;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
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
                    activity = a(activity, i);
                    activity.a(bundle.getString("name"));
                    activity.a(bundle.getInt("referrer_id"));
                    activity.b(bundle.getString("referrer_name"));
                    activity.a(bundle.getBoolean("interstitial"));
                    activity.g();
                    return;
                }
            }
        }
    }

    public final void onActivityDestroyed(Activity activity)
    {
        b.remove(activity);
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
            if ((activity = (jn)b.get(activity)) != null)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", activity.b());
                bundle1.putString("name", activity.a());
                bundle1.putInt("referrer_id", activity.c());
                bundle1.putString("referrer_name", activity.d());
                bundle1.putBoolean("interstitial", activity.h());
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
                return;
            }
        }
    }

    public final void onActivityStarted(Activity activity)
    {
        jn jn1 = a(activity, 0);
        a.a(jn1, activity);
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
