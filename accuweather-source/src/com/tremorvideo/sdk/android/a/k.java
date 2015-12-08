// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.a;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tremorvideo.sdk.android.videoad.aq;
import com.tremorvideo.sdk.android.videoad.b;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.tremorvideo.sdk.android.a:
//            c, a

public class k extends WebView
{
    private class a extends WebChromeClient
    {

        final k a;

        private a()
        {
            a = k.this;
            super();
        }

    }

    private class b extends WebViewClient
    {

        final k a;

        public void onPageFinished(WebView webview, String s)
        {
            if (!k.a(a))
            {
                a.a();
            }
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (Uri.parse(s).getScheme().equals("tremorvideo"))
            {
                k.a(a, URI.create(s));
                return true;
            } else
            {
                return false;
            }
        }

        private b()
        {
            a = k.this;
            super();
        }

    }


    private aq a;
    private b b;
    private a c;
    private com.tremorvideo.sdk.android.videoad.b d;
    private boolean e;

    public k(Context context, aq aq1)
    {
        super(context);
        a = aq1;
        c();
    }

    static boolean a(k k1)
    {
        return k1.e;
    }

    static boolean a(k k1, URI uri)
    {
        return k1.a(uri);
    }

    private boolean a(URI uri)
    {
        String s = uri.getHost();
        Object obj = URLEncodedUtils.parse(uri, "UTF-8");
        uri = new HashMap();
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); uri.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        }

        uri = com.tremorvideo.sdk.android.a.c.a(s, uri, this);
        if (uri == null)
        {
            a(s);
            return false;
        } else
        {
            uri.a();
            a(s);
            return true;
        }
    }

    private void c()
    {
        setScrollContainer(false);
        setBackgroundColor(0);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginsEnabled(true);
        getSettings().setAllowFileAccess(true);
        d = a.k();
        b = new b();
        setWebViewClient(b);
        c = new a();
        setWebChromeClient(c);
        e = false;
    }

    protected void a()
    {
        b("tremorcore.fireEvent('viewableChange','true');");
    }

    protected void a(String s)
    {
        b((new StringBuilder()).append("tremorcore.nativeCallComplete('").append(s).append("');").toString());
    }

    public void a(Map map)
    {
        d.a(map);
    }

    public void b()
    {
        d.a();
    }

    protected void b(String s)
    {
        if (s != null)
        {
            super.loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
        }
    }

    public void destroy()
    {
        clearCache(false);
        destroyDrawingCache();
    }
}
