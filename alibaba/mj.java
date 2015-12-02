// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;

public interface mj
{

    public abstract void a(WebView webview, int i, String s);

    public abstract void a(WebView webview, String s, String s1);

    public abstract boolean a(WebView webview, String s, String s1, JsResult jsresult, String s2);

    public abstract boolean a(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult, String s3);
}
