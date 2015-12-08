// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, Version, AdMarvelInternalWebView

class val.callback
    implements android.content.tener
{

    final val.callback this$1;
    private final AdMarvelInternalWebView val$adMarvelInternalWebView;
    private final AdMarvelWebView val$adMarvelWebView;
    private final String val$allday;
    private final int val$availability;
    private final String val$callback;
    private final String val$date;
    private final String val$description;
    private final String val$endDate;
    private final String val$exceptionDateString;
    private final String val$location;
    private final String val$recurrenceRules;
    private final int val$reminderoffset;
    private final int val$status;
    private final String val$timezone;
    private final String val$title;
    private final String val$url;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (Version.getAndroidSDKVersion() >= 14)
        {
            cess._mth0(this._cls1.this).post(new tRunnablePostAPI14(val$adMarvelInternalWebView, val$adMarvelWebView, val$date, val$title, val$description, val$location, val$allday, val$endDate, val$reminderoffset, val$timezone, val$url, val$recurrenceRules, val$exceptionDateString, val$status, val$availability, val$callback));
            return;
        } else
        {
            cess._mth0(this._cls1.this).post(new tRunnable(val$adMarvelInternalWebView, val$adMarvelWebView, val$date, val$title, val$description, val$location, val$allday, val$endDate, val$reminderoffset, val$timezone, val$url, val$recurrenceRules, val$exceptionDateString, val$status, val$availability, val$callback));
            return;
        }
    }

    tRunnable()
    {
        this$1 = final_trunnable;
        val$adMarvelInternalWebView = admarvelinternalwebview;
        val$adMarvelWebView = admarvelwebview;
        val$date = s;
        val$title = s1;
        val$description = s2;
        val$location = s3;
        val$allday = s4;
        val$endDate = s5;
        val$reminderoffset = i;
        val$timezone = s6;
        val$url = s7;
        val$recurrenceRules = s8;
        val$exceptionDateString = s9;
        val$status = j;
        val$availability = k;
        val$callback = String.this;
        super();
    }
}
