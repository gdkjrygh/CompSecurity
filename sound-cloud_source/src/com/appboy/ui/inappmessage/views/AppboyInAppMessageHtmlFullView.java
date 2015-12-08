// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//            AppboyInAppMessageHtmlBaseView

public class AppboyInAppMessageHtmlFullView extends AppboyInAppMessageHtmlBaseView
{

    private WebView a;

    public AppboyInAppMessageHtmlFullView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final WebView a()
    {
        if (a == null)
        {
            a = (WebView)findViewById(com.appboy.ui.n.c.com_appboy_inappmessage_html_full_webview);
            if (a != null)
            {
                a.getSettings().setJavaScriptEnabled(true);
            }
        }
        return a;
    }
}
