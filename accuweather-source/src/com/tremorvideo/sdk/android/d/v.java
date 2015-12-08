// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.tremorvideo.sdk.android.videoad.ad;
import com.tremorvideo.sdk.android.videoad.ct;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            w, c, o, i, 
//            e, s, r

public class v extends WebView
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/d/v$a, s1);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("ENABLED", 0);
            b = new a("DISABLED", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    static class b
    {

        private h a;
        private g b;
        private k c;
        private i d;
        private f e;
        private j f;

        static f a(b b1, f f1)
        {
            b1.e = f1;
            return f1;
        }

        static g a(b b1, g g1)
        {
            b1.b = g1;
            return g1;
        }

        static i a(b b1)
        {
            return b1.d;
        }

        static k a(b b1, k k1)
        {
            b1.c = k1;
            return k1;
        }

        static h b(b b1)
        {
            return b1.a;
        }

        static g c(b b1)
        {
            return b1.b;
        }

        static k d(b b1)
        {
            return b1.c;
        }

        static f e(b b1)
        {
            return b1.e;
        }

        static j f(b b1)
        {
            return b1.f;
        }

        b()
        {
        }
    }

    private class c extends WebChromeClient
        implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener
    {

        final v a;
        private v b;
        private VideoView c;
        private android.webkit.WebChromeClient.CustomViewCallback d;
        private int e;

        public void a()
        {
            if (c != null)
            {
                c.stopPlayback();
                if (d != null)
                {
                    d.onCustomViewHidden();
                }
                c = null;
                d = null;
            }
        }

        public boolean b()
        {
            if (c != null)
            {
                c.stopPlayback();
                d.onCustomViewHidden();
                onHideCustomView();
                b.a();
                b.d();
                c = null;
                d = null;
                b.o();
                return true;
            } else
            {
                return false;
            }
        }

        public void c()
        {
            if (c != null)
            {
                e = c.getCurrentPosition();
                c.pause();
            }
        }

        public void d()
        {
            if (c != null)
            {
                c.forceLayout();
                c.requestLayout();
                if (!c.isPlaying())
                {
                    c.start();
                    if (c.isPlaying() && e > 0)
                    {
                        c.seekTo(e);
                    }
                }
                e = 0;
            }
        }

        public void onCompletion(MediaPlayer mediaplayer)
        {
            c.stopPlayback();
            d.onCustomViewHidden();
            onHideCustomView();
            b.a();
            b.d();
            c = null;
            d = null;
            b.o();
        }

        public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
        {
            c.stopPlayback();
            d.onCustomViewHidden();
            onHideCustomView();
            b.a();
            b.d();
            c = null;
            d = null;
            return true;
        }

        public boolean onJsAlert(WebView webview, String s1, String s2, JsResult jsresult)
        {
            return false;
        }

        public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
            Object obj;
            super.onShowCustomView(view, customviewcallback);
            if (!(view instanceof FrameLayout))
            {
                break MISSING_BLOCK_LABEL_139;
            }
            obj = (FrameLayout)view;
            if (!(((FrameLayout) (obj)).getFocusedChild() instanceof VideoView))
            {
                break MISSING_BLOCK_LABEL_139;
            }
            view = (VideoView)((FrameLayout) (obj)).getFocusedChild();
            c = view;
            d = customviewcallback;
            ((FrameLayout) (obj)).removeView(view);
            customviewcallback = (Activity)a.getContext();
            obj = new RelativeLayout(a.getContext());
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams.addRule(14);
            layoutparams.addRule(15);
            view.setLayoutParams(layoutparams);
            ((RelativeLayout) (obj)).addView(view);
            customviewcallback.setContentView(((View) (obj)));
            view.setOnCompletionListener(this);
            view.setOnErrorListener(this);
            view.start();
            b.c();
            return;
            view;
            ct.a(view);
            return;
        }

        public c(v v2)
        {
            a = v.this;
            super();
            e = 0;
            b = v2;
        }
    }

    private class d extends WebViewClient
    {

        final v a;

        public void onPageFinished(WebView webview, String s1)
        {
            if (!v.a(a))
            {
                v.a(a, true);
                v.b(a).c();
                a.a(com.tremorvideo.sdk.android.d.r.a(v.c(a)));
                a.r();
                if (a.l() != null)
                {
                    a.l().a(a);
                }
                v.b(a, true);
            }
        }

        public void onReceivedError(WebView webview, int i1, String s1, String s2)
        {
            super.onReceivedError(webview, i1, s1, s2);
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            if (Uri.parse(s1).getScheme().equals("mraid"))
            {
                v.a(a, URI.create(s1));
                return true;
            }
            webview = new Intent();
            webview.setAction("android.intent.action.VIEW");
            webview.setData(Uri.parse(s1));
            webview.addFlags(0x10000000);
            try
            {
                a.getContext().startActivity(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                ct.a(webview);
                return false;
            }
            return true;
        }

        private d()
        {
            a = v.this;
            super();
        }

        d(w w1)
        {
            this();
        }
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        private static final e d[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/tremorvideo/sdk/android/d/v$e, s1);
        }

        public static e[] values()
        {
            return (e[])d.clone();
        }

        static 
        {
            a = new e("ALWAYS_VISIBLE", 0);
            b = new e("ALWAYS_HIDDEN", 1);
            c = new e("AD_CONTROLLED", 2);
            d = (new e[] {
                a, b, c
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface f
    {

        public abstract void a(v v1, boolean flag);
    }

    public static interface g
    {

        public abstract void a(v v1, m m1);
    }

    public static interface h
    {

        public abstract void a(v v1);
    }

    public static interface i
    {

        public abstract void a(v v1);
    }

    public static interface j
    {

        public abstract void a(v v1);
    }

    public static interface k
    {

        public abstract void a(v v1);
    }

    public static final class l extends Enum
    {

        public static final l a;
        public static final l b;
        private static final l c[];

        public static l valueOf(String s1)
        {
            return (l)Enum.valueOf(com/tremorvideo/sdk/android/d/v$l, s1);
        }

        public static l[] values()
        {
            return (l[])c.clone();
        }

        static 
        {
            a = new l("INLINE", 0);
            b = new l("INTERSTITIAL", 1);
            c = (new l[] {
                a, b
            });
        }

        private l(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class m extends Enum
    {

        public static final m a;
        public static final m b;
        public static final m c;
        public static final m d;
        private static final m e[];

        public static m valueOf(String s1)
        {
            return (m)Enum.valueOf(com/tremorvideo/sdk/android/d/v$m, s1);
        }

        public static m[] values()
        {
            return (m[])e.clone();
        }

        static 
        {
            a = new m("LOADING", 0);
            b = new m("DEFAULT", 1);
            c = new m("EXPANDED", 2);
            d = new m("HIDDEN", 3);
            e = (new m[] {
                a, b, c, d
            });
        }

        private m(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private com.tremorvideo.sdk.android.d.c a;
    private o b;
    private d c;
    private c d;
    private boolean e;
    private final l f;
    private ad g;
    private String h;
    private boolean i;
    private b j;

    public v(Context context, a a1, e e1, l l1, String s1)
    {
        super(context);
        i = false;
        i = false;
        f = l1;
        h = s1;
        a(a1, e1);
    }

    private void a(a a1, e e1)
    {
        setScrollContainer(false);
        setBackgroundColor(0);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setOnTouchListener(new w(this));
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginsEnabled(true);
        getSettings().setAllowFileAccess(true);
        a = new com.tremorvideo.sdk.android.d.c(this);
        b = new o(this, a1, e1);
        c = new d(null);
        setWebViewClient(c);
        d = new c(this);
        setWebChromeClient(d);
        j = new b();
    }

    static boolean a(v v1)
    {
        return v1.e;
    }

    static boolean a(v v1, URI uri)
    {
        return v1.a(uri);
    }

    static boolean a(v v1, boolean flag)
    {
        v1.i = flag;
        return flag;
    }

    private boolean a(URI uri)
    {
        String s1 = uri.getHost();
        Object obj = URLEncodedUtils.parse(uri, "UTF-8");
        uri = new HashMap();
        NameValuePair namevaluepair;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); uri.put(namevaluepair.getName(), namevaluepair.getValue()))
        {
            namevaluepair = (NameValuePair)((Iterator) (obj)).next();
        }

        uri = com.tremorvideo.sdk.android.d.i.a(s1, uri, this);
        if (uri == null)
        {
            c(s1);
            return false;
        } else
        {
            uri.a();
            c(s1);
            return true;
        }
    }

    static o b(v v1)
    {
        return v1.b;
    }

    static boolean b(v v1, boolean flag)
    {
        v1.e = flag;
        return flag;
    }

    static l c(v v1)
    {
        return v1.f;
    }

    private void t()
    {
        if (b.a(j) != null)
        {
            b.a(j).a(this);
        }
    }

    public void a()
    {
        if (g != null)
        {
            g.n();
        }
    }

    protected void a(s s1)
    {
        s1 = (new StringBuilder()).append("{").append(s1.toString()).append("}").toString();
        b((new StringBuilder()).append("window.mraidbridge.fireChangeEvent(").append(s1).append(");").toString());
    }

    public void a(f f1)
    {
        b.a(j, f1);
    }

    public void a(g g1)
    {
        b.a(j, g1);
    }

    public void a(k k1)
    {
        b.a(j, k1);
    }

    public void a(ad ad1)
    {
        g = ad1;
    }

    public void a(String s1)
    {
        String s2 = s1;
        if (s1.indexOf("<html>") == -1)
        {
            s2 = (new StringBuilder()).append("<html><head><meta name='viewport' content='user-scalable=no; initial-scale=1.0'/></head><body style='margin:0;padding:0;overflow:hidden;background:transparent;'>").append(s1).append("</body></html>").toString();
        }
        s1 = (new StringBuilder()).append("file://").append(h).append("mraid.js").toString();
        s1 = s2.replace("<head>", (new StringBuilder()).append("<head><script src='").append(s1).append("'></script>").toString());
        loadDataWithBaseURL((new StringBuilder()).append("file:/").append(h).toString(), s1, "text/html", "UTF-8", null);
    }

    protected void a(String s1, String s2)
    {
        b((new StringBuilder()).append("window.mraidbridge.fireErrorEvent('").append(s1).append("', '").append(s2).append("');").toString());
    }

    protected void a(ArrayList arraylist)
    {
        arraylist = arraylist.toString();
        if (arraylist.length() < 2)
        {
            return;
        } else
        {
            arraylist = (new StringBuilder()).append("{").append(arraylist.substring(1, arraylist.length() - 1)).append("}").toString();
            b((new StringBuilder()).append("window.mraidbridge.fireChangeEvent(").append(arraylist).append(");").toString());
            return;
        }
    }

    protected void b(String s1)
    {
        if (s1 != null && i)
        {
            super.loadUrl((new StringBuilder()).append("javascript:").append(s1).toString());
        }
    }

    public boolean b()
    {
        o();
        return d.b();
    }

    public void c()
    {
        g.o();
    }

    protected void c(String s1)
    {
        b((new StringBuilder()).append("window.mraidbridge.nativeCallComplete('").append(s1).append("');").toString());
    }

    public void d()
    {
        g.p();
    }

    public void destroy()
    {
        b.b();
        super.destroy();
    }

    public void e()
    {
        d.a();
        b.b();
        loadDataWithBaseURL(null, "", "text/html", "UTF-8", null);
        clearView();
    }

    public void f()
    {
        p();
        if (d != null)
        {
            d.c();
        }
    }

    public void g()
    {
        q();
        if (d != null)
        {
            d.d();
        }
    }

    protected com.tremorvideo.sdk.android.d.c h()
    {
        return a;
    }

    protected o i()
    {
        return b;
    }

    public h j()
    {
        return b.b(j);
    }

    public g k()
    {
        return b.c(j);
    }

    public k l()
    {
        return b.d(j);
    }

    public void loadUrl(String s1)
    {
        StringBuffer stringbuffer;
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        stringbuffer = new StringBuffer();
        byte abyte0[];
        int i1;
        try
        {
            s1 = defaulthttpclient.execute(new HttpGet(s1)).getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            t();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            t();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            t();
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = s1.getContent();
        abyte0 = new byte[4096];
_L1:
        i1 = s1.read(abyte0);
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        stringbuffer.append(new String(abyte0, 0, i1));
          goto _L1
        a(stringbuffer.toString());
        return;
    }

    public f m()
    {
        return b.e(j);
    }

    public j n()
    {
        return b.f(j);
    }

    public void o()
    {
        b("window.mraidbridge.fireTremorVideoEndEvent();");
    }

    public void p()
    {
        b("window.mraidbridge.fireTremorPauseAppEvent();");
    }

    public void q()
    {
        b("window.mraidbridge.fireTremorResumeAppEvent();");
    }

    protected void r()
    {
        b("window.mraidbridge.fireReadyEvent();");
    }

    public void s()
    {
        try
        {
            a(new URI("mraid://close"));
            return;
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
    }
}
