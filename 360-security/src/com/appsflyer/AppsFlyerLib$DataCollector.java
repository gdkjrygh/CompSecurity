// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer;

import android.content.Context;

// Referenced classes of package com.appsflyer:
//            AppsFlyerLib

private static class <init>
    implements Runnable
{

    private String appsFlyerKey;
    private Context context;
    private String eventName;
    private String eventValue;
    private String referrer;

    public void run()
    {
        AppsFlyerLib.access$200(context, appsFlyerKey, eventName, eventValue, referrer);
    }

    private (Context context1, String s, String s1, String s2, String s3)
    {
        context = context1;
        appsFlyerKey = s;
        eventName = s1;
        eventValue = s2;
        referrer = s3;
    }

    referrer(Context context1, String s, String s1, String s2, String s3, referrer referrer1)
    {
        this(context1, s, s1, s2, s3);
    }
}
