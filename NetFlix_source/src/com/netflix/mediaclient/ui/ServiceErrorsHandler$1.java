// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.ui:
//            ServiceErrorsHandler, RelaunchActivity

static final class val.activity
    implements android.content.Listener
{

    final Activity val$activity;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i = PreferenceUtils.getIntPref(val$activity, "config_recommended_version", -1);
        if (Log.isLoggable("ServiceErrorsHandler", 4))
        {
            Log.i("ServiceErrorsHandler", (new StringBuilder()).append("User clicked cancel on prompt to update. Saving minRecommendedVersion = ").append(i).toString());
        }
        PreferenceUtils.putIntPref(val$activity, "nflx_update_skipped", i);
        val$activity.startActivity(RelaunchActivity.createStartIntent(val$activity, "ServiceErrorsHandler"));
        val$activity.finish();
    }

    (Activity activity1)
    {
        val$activity = activity1;
        super();
    }
}
