// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.controller;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.vungle.log.Logger;
import com.vungle.publisher.ac;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.g;
import com.vungle.publisher.x;
import com.vungle.publisher.y;
import org.json.JSONException;
import org.json.JSONObject;

public class AdWebChromeClient extends WebChromeClient
{

    EventBus a;

    public AdWebChromeClient()
    {
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        boolean flag;
        Logger.v("VungleAd", (new StringBuilder("js prompt: ")).append(s1).toString());
        flag = s1.startsWith("vungle:");
        if (!flag) goto _L2; else goto _L1
_L1:
        webview = null;
        s = s1.substring(7);
        webview = s;
        s1 = new JSONObject(s);
        webview = s;
        s2 = s1.getString("method");
        webview = s;
        s1.getString("params");
        webview = s;
        if (!"close".equalsIgnoreCase(s2)) goto _L4; else goto _L3
_L3:
        webview = s;
        try
        {
            a.a(new x());
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            Logger.w("VungleAd", "no javascript method call");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.w("VungleAd", (new StringBuilder("invalid json ")).append(webview).toString(), s);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            Logger.e("VungleAd", webview);
        }
_L5:
        jspromptresult.cancel();
_L2:
        return flag;
_L4:
        webview = s;
        if (!"download".equalsIgnoreCase(s2))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        webview = s;
        a.a(new g(com.vungle.publisher.db.model.EventTracking.a.i));
        break MISSING_BLOCK_LABEL_101;
        webview = s;
        if (!"replay".equalsIgnoreCase(s2))
        {
            break MISSING_BLOCK_LABEL_211;
        }
        webview = s;
        a.a(new y());
        break MISSING_BLOCK_LABEL_101;
        webview = s;
        if (!"privacy".equalsIgnoreCase(s2))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        webview = s;
        a.a(new ac());
        break MISSING_BLOCK_LABEL_101;
        webview = s;
        Logger.w("VungleAd", (new StringBuilder("unknown javascript method: ")).append(s2).toString());
          goto _L5
    }
}
