// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.pinterest.activity.signin:
//            WebAuthActivity

class this._cls2 extends WebViewClient
{

    final g this$2;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri = Uri.parse(s);
        if (s.startsWith("http://www.pinterest.com/android_app_oauth/") || s.startsWith("http://www.pinterdev.com/android_app_oauth/") || s.startsWith("oauth://twitter"))
        {
            onAuthSuccess(uri);
            return true;
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }

    _cls9()
    {
        this$2 = this._cls2.this;
        super();
    }
}
