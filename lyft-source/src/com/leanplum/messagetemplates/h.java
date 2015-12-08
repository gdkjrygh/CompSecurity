// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.leanplum.Leanplum;

// Referenced classes of package com.leanplum.messagetemplates:
//            BaseMessageDialog, WebInterstitialOptions

final class h extends WebViewClient
{

    private BaseMessageDialog a;

    h(BaseMessageDialog basemessagedialog)
    {
        a = basemessagedialog;
        super();
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!s.contains(a.webOptions.getCloseUrl())) goto _L2; else goto _L1
_L1:
        a.cancel();
        webview = s.split("\\?");
        if (webview.length <= 1) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        webview = webview[1].split("&");
        j = webview.length;
        i = 0;
_L6:
        if (i < j) goto _L5; else goto _L4
_L4:
        return true;
_L5:
        s = webview[i].split("=");
        if (s.length > 1 && s[0].equals("result"))
        {
            Leanplum.track(s[1]);
        }
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }
}
