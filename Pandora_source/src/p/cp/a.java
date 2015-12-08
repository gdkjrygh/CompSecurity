// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class a extends WebChromeClient
{

    public a()
    {
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
        try
        {
            p.df.a.c("JAVASCRIPT", (new StringBuilder()).append("invoked: onConsoleMessage() - ").append(s1).append(":").append(i).append(" - ").append(s).toString());
            super.onConsoleMessage(s, i, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        try
        {
            p.df.a.c("JAVASCRIPT", (new StringBuilder()).append(consolemessage.message()).append(" -- line ").append(consolemessage.lineNumber()).append(" -- source:").append(consolemessage.sourceId()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (ConsoleMessage consolemessage) { }
        return true;
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        try
        {
            p.df.a.c("JAVASCRIPT", s1);
            jsresult.confirm();
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview) { }
        return true;
    }
}
