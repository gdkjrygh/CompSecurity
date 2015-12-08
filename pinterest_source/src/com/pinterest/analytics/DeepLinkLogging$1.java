// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import android.app.Activity;
import android.net.Uri;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.schemas.event.EventType;
import java.util.concurrent.Callable;

// Referenced classes of package com.pinterest.analytics:
//            PinterestDeepLinkMetaData, DeepLinkLogging, Pinalytics

class c
    implements Callable
{

    final Activity a;
    final String b;
    final Uri c;
    final DeepLinkLogging d;

    public Object call()
    {
        DeepLinkLogging.a(d, PinterestDeepLinkMetaData.a(a));
        String s = DeepLinkLogging.a(d, b, c.toString());
        Pinalytics.a(EventType.APP_START, null, DeepLinkLogging.a(d));
        AnalyticsApi.b((new StringBuilder("app_start")).append(s).toString());
        return null;
    }

    etaData(DeepLinkLogging deeplinklogging, Activity activity, String s, Uri uri)
    {
        d = deeplinklogging;
        a = activity;
        b = s;
        c = uri;
        super();
    }
}
