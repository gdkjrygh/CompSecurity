// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.os.Build;
import java.util.TreeMap;

// Referenced classes of package com.millennialmedia.android:
//            MMConversionTracker, HandShake, MMSDK, HttpGetRequest, 
//            MMLog

static final class val.installTimeUTC
    implements Runnable
{

    final Context val$context;
    final TreeMap val$extraParams;
    final String val$goalId;
    final long val$installTimeUTC;
    final boolean val$isFirstLaunch;

    public void run()
    {
        val$extraParams.put("ua", (new StringBuilder()).append("Android:").append(Build.MODEL).toString());
        val$extraParams.put("apid", HandShake.apid);
        MMSDK.insertUrlCommonValues(val$context, val$extraParams);
        HttpGetRequest httpgetrequest = new HttpGetRequest();
        try
        {
            httpgetrequest.trackConversion(val$goalId, val$isFirstLaunch, val$installTimeUTC, val$extraParams);
            return;
        }
        catch (Exception exception)
        {
            MMLog.e("MMConversionTracker", "Problem doing conversion tracking.", exception);
        }
    }

    (TreeMap treemap, Context context1, String s, boolean flag, long l)
    {
        val$extraParams = treemap;
        val$context = context1;
        val$goalId = s;
        val$isFirstLaunch = flag;
        val$installTimeUTC = l;
        super();
    }
}
