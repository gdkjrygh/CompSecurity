// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.WebView;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.account:
//            UserFeedbackWebActivity

final class this._cls0
    implements tener
{

    private long start;
    final UserFeedbackWebActivity this$0;

    public final void onPageFinished(WebView webview, String s)
    {
        removeWebPageLoadListener();
        long l = SystemClock.uptimeMillis();
        analytics.a(AnalyticsEvent.aF, Analytics.c(l - start));
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        start = SystemClock.uptimeMillis();
    }

    tener()
    {
        this$0 = UserFeedbackWebActivity.this;
        super();
    }
}
