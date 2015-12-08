// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView

private static class lockedOrientation
    implements Runnable
{

    private final WeakReference activityReference;
    private String lockedOrientation;
    private Activity mActivity;

    public void run()
    {
        mActivity = (Activity)activityReference.get();
        if (mActivity != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Display display;
        display = ((WindowManager)mActivity.getSystemService("window")).getDefaultDisplay();
        if (lockedOrientation.equalsIgnoreCase("Portrait"))
        {
            mActivity.setRequestedOrientation(1);
            return;
        }
        if (!lockedOrientation.equalsIgnoreCase("LandscapeLeft"))
        {
            break; /* Loop/switch isn't completed */
        }
        mActivity.setRequestedOrientation(0);
        if (display.getRotation() != 1)
        {
            mActivity.setRequestedOrientation(8);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (lockedOrientation.equalsIgnoreCase("PortraitUpSideDown"))
        {
            mActivity.setRequestedOrientation(9);
            return;
        }
        if (!lockedOrientation.equalsIgnoreCase("LandscapeRight"))
        {
            continue; /* Loop/switch isn't completed */
        }
        mActivity.setRequestedOrientation(8);
        if (display.getRotation() != 3)
        {
            mActivity.setRequestedOrientation(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!lockedOrientation.equalsIgnoreCase("none")) goto _L1; else goto _L4
_L4:
        if (display.getRotation() == 2)
        {
            mActivity.setRequestedOrientation(9);
            return;
        }
        if (display.getRotation() == 3)
        {
            mActivity.setRequestedOrientation(8);
            if (display.getRotation() != 3)
            {
                mActivity.setRequestedOrientation(0);
                return;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public (Activity activity, String s)
    {
        lockedOrientation = null;
        mActivity = null;
        activityReference = new WeakReference(activity);
        lockedOrientation = s;
    }
}
