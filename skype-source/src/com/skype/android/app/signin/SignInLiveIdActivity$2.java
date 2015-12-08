// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            SignInLiveIdActivity

final class this._cls0 extends WebChromeClient
{

    final SignInLiveIdActivity this$0;

    public final boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        SignInLiveIdActivity.access$500().info(consolemessage.message());
        return false;
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        progressBar.setProgress(i);
    }

    _cls9()
    {
        this$0 = SignInLiveIdActivity.this;
        super();
    }
}
