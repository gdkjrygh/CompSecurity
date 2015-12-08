// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.util:
//            MdxUtils, LogUtils

public static class rating extends LoggingManagerCallback
{

    private final NetflixActivity activity;
    private final float rating;

    public void onVideoRatingSet(int i)
    {
        super.onVideoRatingSet(i);
        if (activity.destroyed())
        {
            return;
        }
        if (i != 0)
        {
            Log.w("MdxUtils", "Invalid status code failed");
            Toast.makeText(activity, 0x7f0c0150, 1).show();
            Log.d("MdxUtils", "Report rate action ended");
            UIError uierror = new t>(i, ActionOnUIError.displayedError, "", null);
            LogUtils.reportRateActionEnded(activity, uierror.eason(), uierror.rror(), null, Integer.valueOf((int)rating));
            return;
        } else
        {
            Log.v("MdxUtils", "Rating has been updated ok");
            Toast.makeText(activity, 0x7f0c0151, 1).show();
            LogUtils.reportRateActionEnded(activity, com.netflix.mediaclient.servicemgr.success, null, null, Integer.valueOf((int)rating));
            return;
        }
    }

    public eason(NetflixActivity netflixactivity, float f)
    {
        super("MdxUtils");
        activity = netflixactivity;
        rating = f;
    }
}
