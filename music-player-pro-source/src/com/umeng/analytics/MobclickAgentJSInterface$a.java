// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.analytics;

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.umeng.analytics:
//            MobclickAgentJSInterface, MobclickAgent, b

final class a extends WebChromeClient
{

    WebChromeClient a;
    final MobclickAgentJSInterface b;
    private final String c = "ekv";
    private final String d = "event";

    public void onCloseWindow(WebView webview)
    {
        a.onCloseWindow(webview);
    }

    public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        return a.onCreateWindow(webview, flag, flag1, message);
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a.onJsAlert(webview, s, s1, jsresult);
    }

    public boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a.onJsBeforeUnload(webview, s, s1, jsresult);
    }

    public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        return a.onJsConfirm(webview, s, s1, jsresult);
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        if (!"ekv".equals(s1)) goto _L2; else goto _L1
_L1:
        webview = new JSONObject(s2);
        s = new HashMap();
        s1 = (String)webview.remove("id");
        if (!webview.isNull("duration")) goto _L4; else goto _L3
_L3:
        int i = 0;
_L10:
        s2 = webview.keys();
_L8:
        if (s2.hasNext()) goto _L6; else goto _L5
_L5:
        MobclickAgent.a().a(MobclickAgentJSInterface.a(b), s1, s, i);
_L7:
        jspromptresult.confirm();
        return true;
_L4:
        String s3;
        try
        {
            i = ((Integer)webview.remove("duration")).intValue();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            webview.printStackTrace();
        }
          goto _L7
_L6:
        s3 = (String)s2.next();
        s.put(s3, webview.getString(s3));
          goto _L8
_L2:
label0:
        {
            if (!"event".equals(s1))
            {
                break label0;
            }
            try
            {
                webview = new JSONObject(s2);
                MobclickAgent.a().a(MobclickAgentJSInterface.a(b), webview.getString("tag"), webview.optString("label"), webview.optInt("duration"), 1);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview) { }
        }
          goto _L7
        return a.onJsPrompt(webview, s, s1, s2, jspromptresult);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onProgressChanged(WebView webview, int i)
    {
        a.onProgressChanged(webview, i);
    }

    public void onReceivedIcon(WebView webview, Bitmap bitmap)
    {
        a.onReceivedIcon(webview, bitmap);
    }

    public void onReceivedTitle(WebView webview, String s)
    {
        a.onReceivedTitle(webview, s);
    }

    public void onRequestFocus(WebView webview)
    {
        a.onRequestFocus(webview);
    }

    public (MobclickAgentJSInterface mobclickagentjsinterface, WebChromeClient webchromeclient)
    {
        b = mobclickagentjsinterface;
        super();
        a = null;
        if (webchromeclient == null)
        {
            a = new WebChromeClient();
            return;
        } else
        {
            a = webchromeclient;
            return;
        }
    }
}
