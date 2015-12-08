// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.account:
//            WebActivity

final class this._cls0 extends WebChromeClient
{

    final WebActivity this$0;

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        WebActivity.access$800().info((new StringBuilder("onConsoleMessage: ")).append(consolemessage.message()).toString());
        return false;
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        progressBar.setIndeterminate(false);
        if (i == 100)
        {
            progressBar.setVisibility(8);
            return;
        } else
        {
            progressBar.setProgress(i);
            progressBar.setVisibility(0);
            return;
        }
    }

    ()
    {
        this$0 = WebActivity.this;
        super();
    }
}
