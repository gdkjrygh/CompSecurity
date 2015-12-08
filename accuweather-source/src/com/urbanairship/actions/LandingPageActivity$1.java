// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import android.content.Intent;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.urbanairship.Logger;
import com.urbanairship.widget.LandingPageWebView;
import com.urbanairship.widget.UAWebViewClient;

// Referenced classes of package com.urbanairship.actions:
//            LandingPageActivity

class val.progressBar extends UAWebViewClient
{

    final LandingPageActivity this$0;
    final ProgressBar val$progressBar;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (LandingPageActivity.access$000(LandingPageActivity.this) != null)
        {
            switch (LandingPageActivity.access$000(LandingPageActivity.this).intValue())
            {
            default:
                LandingPageActivity.access$002(LandingPageActivity.this, null);
                LandingPageActivity.access$100(LandingPageActivity.this).loadData("", "text/html", null);
                return;

            case -8: 
            case -6: 
            case -1: 
                loadLandingPage(20000L);
                break;
            }
            return;
        }
        if (LandingPageActivity.access$200(LandingPageActivity.this) != -1)
        {
            LandingPageActivity.access$100(LandingPageActivity.this).setBackgroundColor(LandingPageActivity.access$200(LandingPageActivity.this));
        }
        LandingPageActivity.access$300(LandingPageActivity.this, LandingPageActivity.access$100(LandingPageActivity.this), val$progressBar);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (s1 != null && s1.equals(getIntent().getDataString()))
        {
            Logger.error((new StringBuilder()).append("Failed to load landing page ").append(s1).append(" with error ").append(i).append(" ").append(s).toString());
            LandingPageActivity.access$002(LandingPageActivity.this, Integer.valueOf(i));
        }
    }

    ()
    {
        this$0 = final_landingpageactivity;
        val$progressBar = ProgressBar.this;
        super();
    }
}
