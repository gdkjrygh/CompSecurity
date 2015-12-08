// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.appattach;

import android.content.Context;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PreferenceUtils;
import com.appattach.tracking.appAttachTracking;

public class AppAttachUtility
{

    public AppAttachUtility()
    {
    }

    private void activateAppAttachInPreferences(Context context)
    {
        PreferenceUtils.save(context, "was_appattach_activated", true);
    }

    private boolean isAppAttachActivated(Context context)
    {
        return PreferenceUtils.get(context, "was_appattach_activated", false);
    }

    public void initAppattach(Context context)
    {
        appAttachTracking.setDebug(false);
        if (!isAppAttachActivated(context))
        {
            Logger.i(this, "!isAppAttachActivated()");
            appAttachTracking.init(context);
            appAttachTracking.event("Activated");
            activateAppAttachInPreferences(context);
        }
    }
}
