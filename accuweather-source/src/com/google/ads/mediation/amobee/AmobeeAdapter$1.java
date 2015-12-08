// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.amobee;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation.amobee:
//            AmobeeAdapter

class val.isBanner
    implements android.app.vityLifecycleCallbacks
{

    final AmobeeAdapter this$0;
    private final Activity val$activity;
    private final boolean val$isBanner;

    public void onActivityCreated(Activity activity1, Bundle bundle)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivityCreated");
    }

    public void onActivityDestroyed(Activity activity1)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivityDestroyed");
    }

    public void onActivityPaused(Activity activity1)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivityPaused");
    }

    public void onActivityResumed(Activity activity1)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivityResumed");
    }

    public void onActivitySaveInstanceState(Activity activity1, Bundle bundle)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivitySaveInstanceState");
    }

    public void onActivityStarted(Activity activity1)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivityStarted");
        if (activity1 == val$activity)
        {
            if (val$isBanner && AmobeeAdapter.access$2(AmobeeAdapter.this))
            {
                AmobeeAdapter.access$3(AmobeeAdapter.this).onDismissScreen(AmobeeAdapter.this);
                AmobeeAdapter.access$4(AmobeeAdapter.this, false);
            }
            if (!val$isBanner && AmobeeAdapter.access$5(AmobeeAdapter.this))
            {
                if (AmobeeAdapter.access$6(AmobeeAdapter.this) != null)
                {
                    AmobeeAdapter.access$6(AmobeeAdapter.this).onDismissScreen(AmobeeAdapter.this);
                }
                AmobeeAdapter.access$7(AmobeeAdapter.this, false);
            }
        }
        activity1.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    public void onActivityStopped(Activity activity1)
    {
        Log.d("Gooogle AmobeeAdapter", "onActivityStopped");
    }

    stener()
    {
        this$0 = final_amobeeadapter;
        val$activity = activity1;
        val$isBanner = Z.this;
        super();
    }
}
