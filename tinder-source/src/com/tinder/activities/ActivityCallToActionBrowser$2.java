// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.tinder.activities:
//            ActivityCallToActionBrowser

final class a extends WebChromeClient
{

    final ActivityCallToActionBrowser a;

    public final void onReceivedTitle(WebView webview, String s)
    {
        super.onReceivedTitle(webview, s);
        a.a(webview.getTitle());
    }

    _cls9(ActivityCallToActionBrowser activitycalltoactionbrowser)
    {
        a = activitycalltoactionbrowser;
        super();
    }
}
