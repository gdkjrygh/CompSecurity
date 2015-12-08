// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            ActivitySocialFollow

class this._cls0 extends WebViewClient
{

    final ActivitySocialFollow this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (ActivitySocialFollow.access$100(ActivitySocialFollow.this) == 1 && s.contains("http://www.kohls.com"))
        {
            webview = Uri.parse(s);
            ActivitySocialFollow.access$202(ActivitySocialFollow.this, webview.getQueryParameter("oauth_verifier"));
            (new ckgroundTask(ActivitySocialFollow.this, null)).executeOnExecutor(ckgroundTask.THREAD_POOL_EXECUTOR, new Integer[] {
                Integer.valueOf(2)
            });
            return true;
        } else
        {
            return false;
        }
    }

    ckgroundTask()
    {
        this$0 = ActivitySocialFollow.this;
        super();
    }
}
