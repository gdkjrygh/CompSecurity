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

private static class activityReference
    implements Runnable
{

    private static int currentOrientaion = 0x80000000;
    private final WeakReference activityReference;

    private int getCurrentOriention()
    {
        return currentOrientaion;
    }

    public void run()
    {
        try
        {
            if (activityReference.get() != null)
            {
                currentOrientaion = ((WindowManager)((Activity)activityReference.get()).getSystemService("window")).getDefaultDisplay().getRotation();
            }
            return;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
        }
    }



    public (Activity activity)
    {
        activityReference = new WeakReference(activity);
    }
}
