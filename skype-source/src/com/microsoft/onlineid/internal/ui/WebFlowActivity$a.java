// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.microsoft.onlineid.internal.e;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            WebFlowActivity, f

private final class <init> extends WebChromeClient
{

    final WebFlowActivity a;

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        try
        {
            ((android.webkit.nsport)message.obj).setWebView(new WebView(a));
            message.sendToTarget();
            WebFlowActivity.c(a).a();
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            e.a(false);
            return false;
        }
        return true;
    }

    private (WebFlowActivity webflowactivity)
    {
        a = webflowactivity;
        super();
    }

    a(WebFlowActivity webflowactivity, byte byte0)
    {
        this(webflowactivity);
    }
}
