// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.DeepLinkManager;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.notifications:
//            InAppNotificationDialogView

class val.analytics extends WebViewClient
{

    final InAppNotificationDialogView this$0;
    final AsyncActionAnalytics val$analytics;

    public void onPageFinished(WebView webview, String s)
    {
        webview = webView.getLayoutParams();
        webview.webView = -2;
        webView.setLayoutParams(webview);
        webView.requestLayout();
        val$analytics.trackResponseSuccess(InAppNotificationDialogView.access$000(InAppNotificationDialogView.this));
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        InAppNotificationDialogView.access$100(InAppNotificationDialogView.this);
        val$analytics.trackResponseFailure(s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        dialogFlow.dismiss();
        if (s.startsWith("tel:"))
        {
            webview = new Intent("android.intent.action.DIAL", Uri.parse(s));
            getContext().startActivity(webview);
            return true;
        }
        if (s.startsWith("mailto:"))
        {
            webview = new Intent("android.intent.action.SENDTO", Uri.parse(s));
            getContext().startActivity(webview);
            return true;
        }
        if (s.startsWith("lyft:"))
        {
            deepLinkManager.route(s);
            return true;
        } else
        {
            WebBrowser.open(getContext(), s);
            return true;
        }
    }

    A()
    {
        this$0 = final_inappnotificationdialogview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
