// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.controller;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vungle.log.Logger;
import com.vungle.publisher.ar;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.util.ViewUtils;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.display.controller:
//            WebViewConfig

public class AdWebViewClient extends WebViewClient
{

    EventBus a;
    WebViewConfig b;

    public AdWebViewClient()
    {
    }

    public void onPageFinished(WebView webview, String s)
    {
        Logger.v("VungleAd", "webview finished loading. appending config string");
        if (s.toLowerCase().startsWith("javascript:"))
        {
            return;
        }
        s = new StringBuilder("javascript:function actionClicked(m,p){ var q = prompt('vungle:'+JSON.stringify({method:m,params:(p?p:null)}));if(q&&typeof q === 'string'){return JSON.parse(q).result;}};function noTapHighlight(){var l=document.getElementsByTagName('*');for(var i=0; i<l.length; i++){l[i].style.webkitTapHighlightColor='rgba(0,0,0,0)';}};noTapHighlight();");
        try
        {
            s.append("if (typeof vungleInit == 'function') {vungleInit($webviewConfig$);};".replace("$webviewConfig$", b.c()));
        }
        catch (JSONException jsonexception)
        {
            Logger.e("VungleAd", "webview failed to load config object", jsonexception);
        }
        s = s.toString();
        Logger.v("VungleAd", (new StringBuilder("webview client injecting javascript: ")).append(s).toString());
        webview.loadUrl(s);
        ViewUtils.b(webview);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Logger.e("VungleAd", (new StringBuilder("failed to load web view: code ")).append(i).append(", ").append(s).toString());
        a.a(new ar());
    }
}
