// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.kik.g.e;
import com.kik.g.k;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.cards.web:
//            az, au

public class ba extends WebChromeClient
{

    private static final b a = org.c.c.a("WebConsole");
    private final az b;
    private k c;
    private k d;
    private k e;
    private au f;

    public ba(au au1, az az1)
    {
        c = new k(this);
        d = new k(this);
        e = new k(this);
        f = au1;
        b = az1;
    }

    private static String a(String s, int i, String s1, String s2)
    {
        return String.format("Console.%s: %s (%s:%d)", new Object[] {
            s2, s, s1, Integer.valueOf(i)
        });
    }

    public final e a()
    {
        return c.a();
    }

    public final e b()
    {
        return d.a();
    }

    public final e c()
    {
        return e.a();
    }

    public void onCloseWindow(WebView webview)
    {
        d.a(null);
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
        String s2 = a(s, i, s1, "LOG");
        a.a(s2);
        super.onConsoleMessage(s, i, s1);
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        if (consolemessage == null)
        {
            consolemessage = "null console message";
        } else
        {
            String s = "LOG";
            if (consolemessage.messageLevel() != null)
            {
                s = consolemessage.messageLevel().toString();
            }
            consolemessage = a(consolemessage.message(), consolemessage.lineNumber(), consolemessage.sourceId(), s);
        }
        a.a(consolemessage);
        return true;
    }

    public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        if (!flag)
        {
            return super.onCreateWindow(webview, flag, flag1, message);
        }
        if (flag1)
        {
            e.a(message);
        }
        return false;
    }

    public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
    {
        if (b != null)
        {
            b.a(s, callback);
            return;
        } else
        {
            callback.invoke(s, false, false);
            return;
        }
    }

    public void onHideCustomView()
    {
        super.onHideCustomView();
        f.u();
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        a.b("Blocking alert with message: {}", s1);
        jsresult.cancel();
        return true;
    }

    public boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        a.b("Blocking beforeUnload with message: {}", s1);
        jsresult.cancel();
        return true;
    }

    public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        a.b("Blocking confirm with message: {}", s1);
        jsresult.cancel();
        return true;
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        a.b("Blocking confirm with prompt: {}", s1);
        jspromptresult.cancel();
        return true;
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        c.a(Integer.valueOf(i));
    }

    public void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        super.onShowCustomView(view, i, customviewcallback);
        f.a(view, customviewcallback);
    }

    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        super.onShowCustomView(view, customviewcallback);
        f.a(view, customviewcallback);
    }

}
