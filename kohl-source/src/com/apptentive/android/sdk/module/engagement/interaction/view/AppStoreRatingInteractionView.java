// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import com.apptentive.android.sdk.ApptentiveInternal;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.module.engagement.interaction.model.AppStoreRatingInteraction;
import com.apptentive.android.sdk.module.rating.IRatingProvider;
import com.apptentive.android.sdk.module.rating.InsufficientRatingArgumentsException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view:
//            InteractionView

public class AppStoreRatingInteractionView extends InteractionView
{

    public AppStoreRatingInteractionView(AppStoreRatingInteraction appstoreratinginteraction)
    {
        super(appstoreratinginteraction);
    }

    private void displayError(Activity activity, String s)
    {
        final AlertDialog alertDialog = (new android.app.AlertDialog.Builder(activity)).create();
        alertDialog.setTitle(activity.getString(com.apptentive.android.sdk.R.string.apptentive_oops));
        alertDialog.setMessage(s);
        alertDialog.setButton(-1, activity.getString(com.apptentive.android.sdk.R.string.apptentive_ok), new android.content.DialogInterface.OnClickListener() {

            final AppStoreRatingInteractionView this$0;
            final AlertDialog val$alertDialog;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                alertDialog.dismiss();
            }

            
            {
                this$0 = AppStoreRatingInteractionView.this;
                alertDialog = alertdialog;
                super();
            }
        });
        alertDialog.show();
    }

    public boolean onBackPressed(Activity activity)
    {
        return true;
    }

    public void onStop()
    {
    }

    public void show(Activity activity)
    {
        String s;
        Object obj1;
        super.show(activity);
        obj1 = activity.getString(com.apptentive.android.sdk.R.string.apptentive_rating_error);
        s = ((String) (obj1));
        IRatingProvider iratingprovider = ApptentiveInternal.getRatingProvider();
        s = ((String) (obj1));
        String s1 = iratingprovider.activityNotFoundMessage(activity);
        s = s1;
        String s2 = Configuration.load(activity).getAppDisplayName();
        s = s1;
        obj1 = ApptentiveInternal.getRatingProviderArgs();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        s = s1;
        obj1 = new HashMap(((Map) (obj1)));
_L4:
        s = s1;
        if (((Map) (obj1)).containsKey("package"))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        s = s1;
        ((Map) (obj1)).put("package", activity.getPackageName());
        s = s1;
        if (((Map) (obj1)).containsKey("name"))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s = s1;
        ((Map) (obj1)).put("name", s2);
        s = s1;
        iratingprovider.startRating(activity, ((Map) (obj1)));
        activity.finish();
        return;
_L2:
        s = s1;
        obj1 = new HashMap();
        if (true) goto _L4; else goto _L3
_L3:
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        displayError(activity, s);
        activity.finish();
        return;
        Object obj;
        obj;
        displayError(activity, activity.getString(com.apptentive.android.sdk.R.string.apptentive_rating_error));
        activity.finish();
        return;
        obj;
        activity.finish();
        throw obj;
    }
}
