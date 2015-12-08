// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.DialogInterface;
import android.webkit.WebView;

// Referenced classes of package com.fitbit.ui:
//            WebViewActivity

class a
    implements android.content.CancelListener
{

    final WebViewActivity a;

    public void onCancel(DialogInterface dialoginterface)
    {
        a.g = false;
        WebViewActivity.a(a).stopLoading();
        if (WebViewActivity.a(a).canGoBack())
        {
            WebViewActivity.a(a).goBack();
            return;
        } else
        {
            a.onBackPressed();
            return;
        }
    }

    OnCancelListener(WebViewActivity webviewactivity)
    {
        a = webviewactivity;
        super();
    }
}
