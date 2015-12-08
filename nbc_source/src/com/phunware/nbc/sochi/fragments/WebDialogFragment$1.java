// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            WebDialogFragment

class this._cls0 extends WebViewClient
{

    final WebDialogFragment this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return onShouldOverrideUrlLoading(webview, s);
    }

    ()
    {
        this$0 = WebDialogFragment.this;
        super();
    }
}
