// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.settings;

import me.lyft.android.analytics.CallAnalytics;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.settings:
//            SignUrlService

class val.analytics
    implements Action1
{

    final SignUrlService this$0;
    final CallAnalytics val$analytics;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        val$analytics.trackSuccess();
    }

    ()
    {
        this$0 = final_signurlservice;
        val$analytics = CallAnalytics.this;
        super();
    }
}
