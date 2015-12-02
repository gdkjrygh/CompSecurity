// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

public final class akw extends WebViewClient
{

    private final String a;
    private boolean b;
    private final akk c;
    private final agw d;

    public akw(agw agw1, akk akk1, String s)
    {
        a = b(s);
        b = false;
        c = akk1;
        d = agw1;
    }

    private boolean a(String s)
    {
        s = b(s);
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        String s1;
        Object obj;
        Object obj1;
        try
        {
            obj = new URI(s);
            if (!"passback".equals(((URI) (obj)).getScheme()))
            {
                continue; /* Loop/switch isn't completed */
            }
            of.a("Passback received");
            d.b();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            of.b(s.getMessage());
            return false;
        }
        return true;
        if (TextUtils.isEmpty(a)) goto _L1; else goto _L3
_L3:
        obj1 = new URI(a);
        s = ((URI) (obj1)).getHost();
        s1 = ((URI) (obj)).getHost();
        obj1 = ((URI) (obj1)).getPath();
        obj = ((URI) (obj)).getPath();
        if (!wl.a(s, s1) || !wl.a(obj1, obj)) goto _L1; else goto _L4
_L4:
        of.a("Passback received");
        d.b();
        return true;
    }

    private static String b(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        if (!s.endsWith("/")) goto _L1; else goto _L3
_L3:
        String s1 = s.substring(0, s.length() - 1);
        return s1;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        of.b(indexoutofboundsexception.getMessage());
        return s;
    }

    public final void onLoadResource(WebView webview, String s)
    {
        of.a((new StringBuilder("JavascriptAdWebViewClient::onLoadResource: ")).append(s).toString());
        if (!a(s))
        {
            c.i().onLoadResource(c.a(), s);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        of.a((new StringBuilder("JavascriptAdWebViewClient::onPageFinished: ")).append(s).toString());
        if (!b)
        {
            d.a();
            b = true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        of.a((new StringBuilder("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ")).append(s).toString());
        if (a(s))
        {
            of.a("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return c.i().shouldOverrideUrlLoading(c.a(), s);
        }
    }
}
