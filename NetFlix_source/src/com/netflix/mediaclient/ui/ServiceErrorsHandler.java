// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AppStoreHelper;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.ui:
//            RelaunchActivity

public class ServiceErrorsHandler
{

    private static final String TAG = "ServiceErrorsHandler";

    private ServiceErrorsHandler()
    {
    }

    private static boolean handleAppUpdateNeeded(Activity activity, boolean flag)
    {
        if (!flag)
        {
            int i = PreferenceUtils.getIntPref(activity, "nflx_update_skipped", 0);
            int j = PreferenceUtils.getIntPref(activity, "config_recommended_version", -1);
            if (Log.isLoggable("ServiceErrorsHandler", 2))
            {
                Log.v("ServiceErrorsHandler", (new StringBuilder()).append("Current min recommended version = ").append(j).append(" - Last skipped update = ").append(i).toString());
            }
            if (i == j)
            {
                return false;
            }
        }
        com.netflix.mediaclient.android.widget.UpdateDialog.Builder builder = new com.netflix.mediaclient.android.widget.UpdateDialog.Builder(activity);
        builder.setTitle("");
        if (!flag)
        {
            builder.setMessage(0x7f0c0075);
            builder.setCancelable(false);
            builder.setNegativeButton(0x7f0c0101, new android.content.DialogInterface.OnClickListener(activity) {

                final Activity val$activity;

                public void onClick(DialogInterface dialoginterface, int k)
                {
                    k = PreferenceUtils.getIntPref(activity, "config_recommended_version", -1);
                    if (Log.isLoggable("ServiceErrorsHandler", 4))
                    {
                        Log.i("ServiceErrorsHandler", (new StringBuilder()).append("User clicked cancel on prompt to update. Saving minRecommendedVersion = ").append(k).toString());
                    }
                    PreferenceUtils.putIntPref(activity, "nflx_update_skipped", k);
                    activity.startActivity(RelaunchActivity.createStartIntent(activity, "ServiceErrorsHandler"));
                    activity.finish();
                }

            
            {
                activity = activity1;
                super();
            }
            });
        } else
        {
            builder.setMessage(0x7f0c0076);
        }
        builder.setPositiveButton(0x7f0c0071, new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int k)
            {
                Log.i("ServiceErrorsHandler", "User clicked Ok on prompt to update");
                dialoginterface = AppStoreHelper.getUpdateSourceIntent(activity);
                if (dialoginterface == null)
                {
                    break MISSING_BLOCK_LABEL_42;
                }
                dialoginterface.addFlags(0x10000000);
                activity.startActivity(dialoginterface);
                activity.finish();
                return;
                dialoginterface;
                Log.e("ServiceErrorsHandler", "Failed to start store Activity!", dialoginterface);
                activity.finish();
                return;
                dialoginterface;
                activity.finish();
                throw dialoginterface;
            }

            
            {
                activity = activity1;
                super();
            }
        });
        builder.show();
        return true;
    }

    public static boolean handleManagerResponse(Activity activity, int i)
    {
        boolean flag = false;
        Log.v("ServiceErrorsHandler", (new StringBuilder()).append("Handling manager response, code: ").append(i).append(" [").append(activity.getClass().toString()).append("]").toString());
        switch (i)
        {
        default:
            provideDialog(activity, (new StringBuilder()).append(activity.getString(0x7f0c0197)).append(" (").append(i).append(")").toString());
            flag = true;
            // fall through

        case 0: // '\0'
            return flag;

        case 1: // '\001'
            return handleAppUpdateNeeded(activity, false);

        case -5: 
            return handleAppUpdateNeeded(activity, true);

        case -11: 
            provideDialog(activity, activity.getString(0x7f0c010e));
            return true;

        case -101: 
        case -100: 
            provideDialog(activity, activity.getString(0x7f0c017c));
            return true;

        case -122: 
        case -121: 
        case -120: 
            provideDialog(activity, (new StringBuilder()).append(activity.getString(0x7f0c0196)).append(" (").append(i).append(")").toString());
            return true;
        }
    }

    private static void provideDialog(Activity activity, String s)
    {
        (new android.app.AlertDialog.Builder(activity)).setCancelable(false).setMessage(s).setPositiveButton(0x7f0c0071, new android.content.DialogInterface.OnClickListener(activity) {

            final Activity val$activity;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                activity.finish();
            }

            
            {
                activity = activity1;
                super();
            }
        }).show();
    }
}
