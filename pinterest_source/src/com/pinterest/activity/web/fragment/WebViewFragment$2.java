// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.webkit.WebView;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class this._cls0
    implements com.pinterest.base.riber
{

    final WebViewFragment this$0;

    public void onEventMainThread(com.pinterest.activity.pin.fragment.CsrSelectEvent csrselectevent)
    {
        WebViewFragment.access$100(WebViewFragment.this).loadUrl(csrselectevent.getUrl());
    }

    CsrSelectEvent()
    {
        this$0 = WebViewFragment.this;
        super();
    }
}
