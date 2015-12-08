// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushUser;

// Referenced classes of package com.urbanairship.widget:
//            RichPushMessageView

class this._cls0 extends WebViewClient
{

    final RichPushMessageView this$0;

    public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
    {
        webview = RichPushManager.shared().getRichPushUser();
        httpauthhandler.proceed(webview.getId(), webview.getPassword());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return false;
    }

    ()
    {
        this$0 = RichPushMessageView.this;
        super();
    }
}
