// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, Version, AdMarvelInternalWebView

class val.reminderoffset
    implements android.content.tialJS._cls4
{

    final val.reminderoffset this$1;
    private final AdMarvelActivity val$adMarvelActivity;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final String val$allday;
    private final String val$date;
    private final String val$description;
    private final String val$endDate;
    private final String val$location;
    private final int val$reminderoffset;
    private final String val$title;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (Version.getAndroidSDKVersion() >= 14)
        {
            AdMarvelActivity.access$7(val$adMarvelActivity).post(new tAPI14(val$adMarvelInternalWebView, val$adMarvelActivity, val$date, val$title, val$description, val$location, val$allday, val$endDate, val$reminderoffset));
            return;
        } else
        {
            AdMarvelActivity.access$7(val$adMarvelActivity).post(new nit>(val$adMarvelInternalWebView, val$adMarvelActivity, val$date, val$title, val$description, val$location, val$allday, val$endDate, val$reminderoffset));
            return;
        }
    }

    tAPI14()
    {
        this$1 = final_tapi14;
        val$adMarvelActivity = admarvelactivity;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$date = s;
        val$title = s1;
        val$description = s2;
        val$location = s3;
        val$allday = s4;
        val$endDate = s5;
        val$reminderoffset = I.this;
        super();
    }
}
