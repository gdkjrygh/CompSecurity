// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity

private static class lockedOrientation
    implements Runnable
{

    private final WeakReference activityReference;
    private String lockedOrientation;
    private Activity mActivity;

    public void run()
    {
        Object obj;
        try
        {
            mActivity = (Activity)activityReference.get();
            if (mActivity == null)
            {
                break MISSING_BLOCK_LABEL_286;
            }
            if (lockedOrientation == null)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logging.log(Log.getStackTraceString(((Throwable) (obj))));
            return;
        }
        obj = ((WindowManager)mActivity.getSystemService("window")).getDefaultDisplay();
        if (lockedOrientation.equalsIgnoreCase("Portrait"))
        {
            mActivity.setRequestedOrientation(1);
            if (((Display) (obj)).getRotation() != 0)
            {
                mActivity.setRequestedOrientation(9);
                return;
            }
            break MISSING_BLOCK_LABEL_286;
        }
        if (lockedOrientation.equalsIgnoreCase("LandscapeLeft"))
        {
            mActivity.setRequestedOrientation(0);
            if (((Display) (obj)).getRotation() != 1)
            {
                mActivity.setRequestedOrientation(8);
                return;
            }
            break MISSING_BLOCK_LABEL_286;
        }
        if (lockedOrientation.equalsIgnoreCase("PortraitUpSideDown"))
        {
            mActivity.setRequestedOrientation(9);
            if (((Display) (obj)).getRotation() != 2)
            {
                mActivity.setRequestedOrientation(1);
                return;
            }
            break MISSING_BLOCK_LABEL_286;
        }
        if (lockedOrientation.equalsIgnoreCase("LandscapeRight"))
        {
            mActivity.setRequestedOrientation(8);
            if (((Display) (obj)).getRotation() != 3)
            {
                mActivity.setRequestedOrientation(0);
                return;
            }
            break MISSING_BLOCK_LABEL_286;
        }
        if (!lockedOrientation.equalsIgnoreCase("none"))
        {
            break MISSING_BLOCK_LABEL_286;
        }
        if (((Display) (obj)).getRotation() == 2)
        {
            mActivity.setRequestedOrientation(9);
            if (((Display) (obj)).getRotation() != 2)
            {
                mActivity.setRequestedOrientation(1);
                return;
            }
            break MISSING_BLOCK_LABEL_286;
        }
        if (((Display) (obj)).getRotation() == 3)
        {
            mActivity.setRequestedOrientation(8);
            if (((Display) (obj)).getRotation() != 3)
            {
                mActivity.setRequestedOrientation(0);
            }
        }
    }

    public (Activity activity, String s)
    {
        lockedOrientation = null;
        mActivity = null;
        activityReference = new WeakReference(activity);
        lockedOrientation = s;
    }
}
