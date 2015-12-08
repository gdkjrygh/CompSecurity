// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.webkit.WebView;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.account:
//            WebActivity

public class UserFeedbackWebActivity extends WebActivity
{

    Analytics analytics;

    public UserFeedbackWebActivity()
    {
    }

    public WebActivity.WebPageLoadListener createWebPageLoadListener()
    {
        return new WebActivity.WebPageLoadListener() {

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

            
            {
                this$0 = UserFeedbackWebActivity.this;
                super();
            }
        };
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        return true;
    }
}
