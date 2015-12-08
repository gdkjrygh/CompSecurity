// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinMarkletFragment

class receivedError extends WebViewClient
{

    private boolean receivedError;
    final PinMarkletFragment this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        PLog.log("#onPageFinished", new Object[0]);
        if (!receivedError)
        {
            PinMarkletFragment.access$102(PinMarkletFragment.this, Boolean.TRUE.booleanValue());
            PinMarkletFragment.access$200(PinMarkletFragment.this);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        receivedError = true;
        PinMarkletFragment.access$000(PinMarkletFragment.this, 0x7f07040b);
    }

    A()
    {
        this$0 = PinMarkletFragment.this;
        super();
        receivedError = false;
    }
}
