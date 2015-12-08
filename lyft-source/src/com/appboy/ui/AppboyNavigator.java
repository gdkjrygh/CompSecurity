// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.Constants;
import com.appboy.IAppboyNavigator;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.ActivityAction;
import com.appboy.ui.actions.WebAction;
import com.appboy.ui.activities.AppboyFeedActivity;

public class AppboyNavigator
    implements IAppboyNavigator
{

    private static final String TAG;

    public AppboyNavigator()
    {
    }

    public void gotoNewsFeed(Context context, Bundle bundle)
    {
        bundle = new ComponentName(context, com/appboy/ui/activities/AppboyFeedActivity);
        try
        {
            context.getPackageManager().getActivityInfo(bundle, 1);
            (new ActivityAction(new Intent(context, com/appboy/ui/activities/AppboyFeedActivity))).execute(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.d(TAG, "The AppboyFeedActivity is not registered in the manifest. Ignoring request to display the news feed.");
        }
    }

    public void gotoURI(Context context, Uri uri, Bundle bundle)
    {
        if (uri == null)
        {
            AppboyLogger.e(TAG, "IAppboyNavigator cannot open URI because the URI is null.");
            return;
        } else
        {
            (new WebAction(uri.toString())).execute(context);
            return;
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/AppboyNavigator.getName()
        });
    }
}
