// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.metrics;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.adobe.mobile.Analytics;
import java.util.Hashtable;

// Referenced classes of package com.phunware.nbc.sochi.metrics:
//            TrackingHelperBase

public class TrackingHelper extends TrackingHelperBase
{

    public TrackingHelper(Application application)
    {
        super(application);
    }

    public String getAppName()
    {
        return "Live";
    }

    public void trackAppLaunch(Intent intent, TrackingHelperBase.PageInfo pageinfo)
    {
        Hashtable hashtable;
        Uri uri;
        super.trackAppLaunch(intent, pageinfo);
        hashtable = new Hashtable();
        uri = intent.getData();
        if (uri == null || !uri.isHierarchical()) goto _L2; else goto _L1
_L1:
        if (uri.getQueryParameter("campaign") == null) goto _L4; else goto _L3
_L3:
        hashtable.put("nbcs.launch", "smartbanner");
        hashtable.put("nbcs.campaign", uri.getQueryParameter("campaign"));
_L2:
        intent = intent.getStringExtra("ni");
        if (intent != null)
        {
            hashtable.put("nbcs.campaign", intent);
            hashtable.put("nbcs.launch", "push");
        }
        if (hashtable.isEmpty())
        {
            hashtable.put("nbcs.launch", "organic");
        }
        Analytics.trackState("app_launch", hashtable);
        trackPageEvent(pageinfo);
        return;
_L4:
        if (uri.getQueryParameter("cmpid") != null)
        {
            hashtable.put("nbcs.launch", "seeit");
            hashtable.put("nbcs.campaign", uri.getQueryParameter("cmpid"));
        } else
        if (uri.getQueryParameter("source") != null)
        {
            hashtable.put("nbcs.launch", "website");
            hashtable.put("nbcs.campaign", uri.getQueryParameter("source"));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
