// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tremorvideo.sdk.android.videoad.ct;
import com.tremorvideo.sdk.android.videoad.gb;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            a, n, z, ag, 
//            c, ah, ak, ab, 
//            an

public class ScriptInterpreter
{
    private class a extends WebViewClient
    {

        final ScriptInterpreter a;

        public void onPageFinished(WebView webview, String s)
        {
            a.scriptLoaded = true;
            a.b.m();
        }

        private a()
        {
            a = ScriptInterpreter.this;
            super();
        }

    }


    WebView a;
    n b;
    com.tremorvideo.sdk.android.richmedia.a c;
    public boolean scriptLoaded;

    public ScriptInterpreter(Context context)
    {
        a = new WebView(context);
        a.getSettings().setJavaScriptEnabled(true);
        a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        a.addJavascriptInterface(this, "Device");
        a.setWebViewClient(new a());
    }

    public void callFunction(String s)
    {
        if (s != "" && s != null)
        {
            ct.d((new StringBuilder()).append("Calling Function: ").append(s).toString());
            a.loadUrl((new StringBuilder()).append("javascript:").append(s).append("();").toString());
        }
    }

    public void destroy()
    {
        a.destroy();
        a = null;
    }

    public void getValue(String s, String s1)
    {
        String s2 = ct.g().a(s);
        s = s2;
        if (s2 == null)
        {
            s = "null";
        }
        a.loadUrl((new StringBuilder()).append("javascript:callCallback(").append(s1).append(",").append(s).append(");").toString());
    }

    public WebView getView()
    {
        return a;
    }

    public void load(n n1, com.tremorvideo.sdk.android.richmedia.a a1)
    {
        scriptLoaded = false;
        String s = (new StringBuilder()).append("<html><head><script type=\"text/javascript\">\n").append(a1.f()).toString();
        s = (new StringBuilder()).append(s).append("</script></head></html>").toString();
        a.loadData(s, "text/html", "UTF-8");
        c = a1;
        b = n1;
    }

    public void onError(String s)
    {
        ct.d(s);
    }

    public void playVideo(int i, int j)
    {
        b.a(i, j);
    }

    public void setImage(int i, int j)
    {
        Object obj = b.b();
        Object obj1 = ((z) (obj)).a(i);
        if (obj1 instanceof ag)
        {
            obj1 = (ag)obj1;
            if (obj1 != null)
            {
                obj = ((z) (obj)).f().p().a(j);
                if (obj != null)
                {
                    ((ag) (obj1)).a(((android.graphics.Bitmap) (obj)));
                }
            }
        }
    }

    public void setOverrideScene(int i, int j)
    {
        z z1 = b.b();
        Object obj = z1.a(i);
        if (obj instanceof ah)
        {
            obj = (ah)obj;
            if (obj != null)
            {
                ((ah) (obj)).a(z1.f().b(j));
            }
        }
    }

    public void setScene(int i)
    {
        z z1 = c.b(i);
        if (z1 != null)
        {
            b.a(z1);
        }
    }

    public void setText(int i, String s)
    {
        Object obj = b.b().a(i);
        if (obj instanceof ak)
        {
            obj = (ak)obj;
            if (obj != null)
            {
                ((ak) (obj)).a(s);
            }
        }
    }

    public void setValue(String s, String s1)
    {
        ct.g().a(s, s1);
    }

    public void setVisibility(int i, int j)
    {
        ab ab1 = b.b().a(i);
        if (ab1 != null)
        {
            ab1.a(j);
        }
    }

    public void startEvent(String s)
    {
        b.b(String.valueOf(an.a(s)));
    }
}
