// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

static final class val.js
    implements Runnable
{

    final String val$js;

    public void run()
    {
        WebView webview = AppHelper.getAppView();
        if (webview != null && webview.getUrl() != null && !webview.getUrl().contains("about:blank"))
        {
            Log.d("AppHelper", (new StringBuilder()).append("Javascript: ").append(val$js).toString());
            AppHelper.access$000().sendJavascript(val$js);
            return;
        } else
        {
            Log.d("AppHelper", "No Target for JS!");
            return;
        }
    }

    bileBanking(String s)
    {
        val$js = s;
        super();
    }
}
