// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import android.webkit.WebView;

// Referenced classes of package com.pinterest.activity.signin:
//            WebAuthActivity

class this._cls1
    implements Runnable
{

    final hURL this$1;

    public void run()
    {
        class _cls1 extends WebViewClient
        {

            final WebAuthActivity._cls1._cls1 this$2;

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

            _cls1()
            {
                this$2 = WebAuthActivity._cls1._cls1.this;
                super();
            }
        }

        _webview.setWebViewClient(new _cls1());
        _webview.loadUrl(_authURL);
    }

    _cls1()
    {
        this$1 = this._cls1.this;
        super();
    }
}
