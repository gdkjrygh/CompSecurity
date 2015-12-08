// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.util.SignInDurationReporter;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLiveIdActivity

final class this._cls0 extends WebViewClient
{

    final SignInLiveIdActivity this$0;

    public final void onPageFinished(WebView webview, String s)
    {
        webview = createSignInTelemetryEvent(LogEvent.w, Type.MSA, false);
        analytics.a(webview);
        signInDurationReporter.a(com.skype.android.util.CheckPoint.c, String.valueOf(Type.MSA), false);
        progressBar.setVisibility(4);
        if (s.startsWith(getString(0x7f080565)))
        {
            SignInLiveIdActivity.access$200(SignInLiveIdActivity.this, s);
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        progressBar.setVisibility(0);
        progressBar.setProgress(0);
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        SignInLiveIdActivity.access$300().info((new StringBuilder("onReceivedError code:")).append(i).append(" description:").append(s).append(" url:").append(s1).toString());
        SignInLiveIdActivity.access$100(SignInLiveIdActivity.this);
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        SignInLiveIdActivity.access$400().info((new StringBuilder("onReceivedSslError: ")).append(sslerror.getPrimaryError()).toString());
        progressBar.setVisibility(4);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s);
        if (webview != null && webview.getHost() != null && SignInLiveIdActivity.access$000().matcher(webview.getHost()).matches())
        {
            return false;
        } else
        {
            SignInLiveIdActivity.access$100(SignInLiveIdActivity.this);
            return true;
        }
    }

    oint()
    {
        this$0 = SignInLiveIdActivity.this;
        super();
    }
}
