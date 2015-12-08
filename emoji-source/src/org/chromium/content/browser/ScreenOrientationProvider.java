// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.gfx.DeviceDisplayInfo;

// Referenced classes of package org.chromium.content.browser:
//            ScreenOrientationListener

public class ScreenOrientationProvider
{

    private static final String TAG = "ScreenOrientationProvider";

    private ScreenOrientationProvider()
    {
    }

    private static int getOrientationFromWebScreenOrientations(byte byte0, Activity activity)
    {
        switch (byte0)
        {
        default:
            Log.w("ScreenOrientationProvider", "Trying to lock to unsupported orientation!");
            // fall through

        case 0: // '\0'
            return -1;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 9;

        case 3: // '\003'
            return 0;

        case 4: // '\004'
            return 8;

        case 7: // '\007'
            return 7;

        case 6: // '\006'
            return 6;

        case 5: // '\005'
            return 10;

        case 8: // '\b'
            activity = DeviceDisplayInfo.create(activity);
            break;
        }
        byte0 = activity.getRotationDegrees();
        if (byte0 == 0 || byte0 == 180)
        {
            return activity.getDisplayHeight() < activity.getDisplayWidth() ? 0 : 1;
        }
        return activity.getDisplayHeight() >= activity.getDisplayWidth() ? 0 : 1;
    }

    static void lockOrientation(byte byte0)
    {
        lockOrientation(byte0, ApplicationStatus.getLastTrackedFocusedActivity());
    }

    public static void lockOrientation(byte byte0, Activity activity)
    {
        int i;
        if (activity != null)
        {
            if ((i = getOrientationFromWebScreenOrientations(byte0, activity)) != -1)
            {
                activity.setRequestedOrientation(i);
                return;
            }
        }
    }

    static void startAccurateListening()
    {
        ThreadUtils.runOnUiThread(new Runnable() {

            public void run()
            {
                ScreenOrientationListener.getInstance().startAccurateListening();
            }

        });
    }

    static void stopAccurateListening()
    {
        ThreadUtils.runOnUiThread(new Runnable() {

            public void run()
            {
                ScreenOrientationListener.getInstance().stopAccurateListening();
            }

        });
    }

    static void unlockOrientation()
    {
        Exception exception;
        Activity activity = ApplicationStatus.getLastTrackedFocusedActivity();
        if (activity == null)
        {
            return;
        }
        int j = getOrientationFromWebScreenOrientations((byte)activity.getIntent().getIntExtra("org.chromium.content_public.common.orientation", 0), activity);
        int i = j;
        if (j == -1)
        {
            try
            {
                i = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128).screenOrientation;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                activity.setRequestedOrientation(j);
                return;
            }
            finally
            {
                activity.setRequestedOrientation(j);
            }
        }
        activity.setRequestedOrientation(i);
        return;
        throw exception;
    }
}
