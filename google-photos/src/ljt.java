// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class ljt
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final lji a;
    private final Map b = new HashMap();

    public ljt(lji lji1)
    {
        b.d(lji1);
        a = lji1;
    }

    private ljq a(Activity activity, int i)
    {
        b.d(activity);
        ljq ljq2 = (ljq)b.get(activity);
        ljq ljq1 = ljq2;
        if (ljq2 == null)
        {
            if (i == 0)
            {
                ljq1 = new ljq(true);
            } else
            {
                ljq1 = new ljq(true, i);
            }
            ljq1.a(activity.getClass().getCanonicalName());
            b.put(activity, ljq1);
        }
        return ljq1;
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
                    activity.g = true;
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
            if ((activity = (ljq)b.get(activity)) != null)
            {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", ((ljq) (activity)).b);
                bundle1.putString("name", ((ljq) (activity)).a);
                bundle1.putInt("referrer_id", ((ljq) (activity)).c);
                bundle1.putString("referrer_name", ((ljq) (activity)).d);
                bundle1.putBoolean("interstitial", ((ljq) (activity)).f);
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
                return;
            }
        }
    }

    public final void onActivityStarted(Activity activity)
    {
        ljj aljj[];
        ljq ljq1;
        lji lji1;
        boolean flag;
        flag = false;
        ljq1 = a(activity, 0);
        lji1 = a;
        b.d(ljq1);
        int i;
        if (!ljq1.g)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (lji1.b != null)
        {
            ljq1.a(lji1.b.b);
            ljq1.b(lji1.b.a);
        }
        aljj = lji1.a();
        for (i = 0; i < aljj.length; i++)
        {
            aljj[i].a(ljq1, activity);
        }

        ljq1.g = true;
        if (TextUtils.isEmpty(ljq1.a)) goto _L4; else goto _L3
_L3:
        activity = aljj;
_L6:
        if (lji1.b != null && lji1.b.b == ljq1.b)
        {
            lji1.b = ljq1;
        } else
        {
            lji1.b = null;
            lji1.b = ljq1;
            Object obj = activity;
            int j = ((flag) ? 1 : 0);
            if (activity == null)
            {
                obj = lji1.a();
                j = ((flag) ? 1 : 0);
            }
            while (j < obj.length) 
            {
                obj[j].a(ljq1);
                j++;
            }
        }
_L4:
        return;
_L2:
        activity = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
