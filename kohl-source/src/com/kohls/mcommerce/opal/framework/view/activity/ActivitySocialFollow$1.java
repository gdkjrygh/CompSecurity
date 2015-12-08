// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            ActivitySocialFollow

class this._cls0 extends WebChromeClient
{

    final ActivitySocialFollow this$0;

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (i >= 100)
        {
            findViewById(0x7f0d0100).setVisibility(0);
            findViewById(0x7f0d00ff).setVisibility(8);
        }
    }

    ()
    {
        this$0 = ActivitySocialFollow.this;
        super();
    }
}
