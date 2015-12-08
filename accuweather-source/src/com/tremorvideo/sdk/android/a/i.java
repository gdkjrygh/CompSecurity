// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

// Referenced classes of package com.tremorvideo.sdk.android.a:
//            c, a, j

public class i extends WebView
{
    private class a extends WebChromeClient
    {

        final i a;

        private a()
        {
            a = i.this;
            super();
        }

        a(j j1)
        {
            this();
        }
    }

    public static interface b
    {

        public abstract void a(boolean flag, boolean flag1);
    }

    private class c extends WebViewClient
    {

        final i a;

        public void onPageFinished(WebView webview, String s)
        {
            if (webview instanceof i)
            {
                ((i)webview).a();
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (Uri.parse(s).getScheme().equals("tremorvideo"))
            {
                i.a(a, URI.create(s));
                return true;
            } else
            {
                return false;
            }
        }

        private c()
        {
            a = i.this;
            super();
        }

        c(j j1)
        {
            this();
        }
    }


    public b a;
    private a b;
    private c c;
    private boolean d;
    private Handler e;
    private Runnable f;

    public i(Context context, b b1)
    {
        super(context);
        d = false;
        b();
        a = b1;
    }

    static boolean a(i k, URI uri)
    {
        return k.a(uri);
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
            return false;
        } else
        {
            uri.a();
            return true;
        }
    }

    private void b()
    {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginsEnabled(true);
        getSettings().setAllowFileAccess(true);
        b = new a(null);
        setWebChromeClient(b);
        c = new c(null);
        setWebViewClient(c);
        e = new Handler();
        f = new j(this);
        e.postDelayed(f, 8000L);
    }

    public void a()
    {
        if (!d)
        {
            d = true;
            super.loadUrl("javascript:validateXML()");
        }
    }

    public void a(Map map)
    {
        if (e != null)
        {
            e.removeCallbacks(f);
            e = null;
            f = null;
        }
        if (((String)map.get("valid")).equals("true"))
        {
            a.a(true, false);
            return;
        } else
        {
            a.a(false, false);
            return;
        }
    }

    public void destroy()
    {
        if (e != null)
        {
            e.removeCallbacks(f);
            e = null;
            f = null;
        }
        clearCache(false);
        destroyDrawingCache();
    }
}
