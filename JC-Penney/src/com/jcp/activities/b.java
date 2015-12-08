// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

// Referenced classes of package com.jcp.activities:
//            AssistantsImageKnowledgeActivity

public class b extends WebViewClient
{

    final AssistantsImageKnowledgeActivity a;

    public b(AssistantsImageKnowledgeActivity assistantsimageknowledgeactivity)
    {
        a = assistantsimageknowledgeactivity;
        super();
    }

    public void onPageFinished(WebView webview, String s)
    {
        AssistantsImageKnowledgeActivity.a(a).setVisibility(8);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        AssistantsImageKnowledgeActivity.a(a).setVisibility(0);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview.loadUrl(s);
        return true;
    }
}
