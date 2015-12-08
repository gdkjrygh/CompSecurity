// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.DialogInterface;
import android.webkit.WebView;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            WebViewClient

class val.view
    implements android.content.OnCancelListener
{

    final WebViewClient this$0;
    final WebView val$view;

    public void onCancel(DialogInterface dialoginterface)
    {
        if (val$view != null)
        {
            val$view.stopLoading();
        }
    }

    ()
    {
        this$0 = final_webviewclient;
        val$view = WebView.this;
        super();
    }
}
