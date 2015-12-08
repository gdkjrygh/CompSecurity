// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

public final class clk extends WebViewClient
{

    private final String a;
    private boolean b;
    private final ckw c;
    private final chm d;

    public clk(chm chm1, ckw ckw1, String s)
    {
        a = b(s);
        b = false;
        c = ckw1;
        d = chm1;
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
            bka.a("Passback received");
            d.a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bka.b(s.getMessage());
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
        if (!btj.a(s, s1) || !btj.a(obj1, obj)) goto _L1; else goto _L4
_L4:
        bka.a("Passback received");
        d.a();
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
        bka.b(indexoutofboundsexception.getMessage());
        return s;
    }

    public final void onLoadResource(WebView webview, String s)
    {
        bka.a((new StringBuilder("JavascriptAdWebViewClient::onLoadResource: ")).append(s).toString());
        if (!a(s))
        {
            c.k().onLoadResource(c.a(), s);
        }
    }

    public final void onPageFinished(WebView webview, String s)
    {
        bka.a((new StringBuilder("JavascriptAdWebViewClient::onPageFinished: ")).append(s).toString());
        if (!b)
        {
            webview = d;
            ((chm) (webview)).a.postDelayed(webview, 200L);
            b = true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        bka.a((new StringBuilder("JavascriptAdWebViewClient::shouldOverrideUrlLoading: ")).append(s).toString());
        if (a(s))
        {
            bka.a("shouldOverrideUrlLoading: received passback url");
            return true;
        } else
        {
            return c.k().shouldOverrideUrlLoading(c.a(), s);
        }
    }
}
