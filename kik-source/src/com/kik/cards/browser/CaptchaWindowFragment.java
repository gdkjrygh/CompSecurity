// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kik.cards.web.bf;
import com.kik.e.a;
import com.kik.g.aq;
import com.kik.g.s;
import com.kik.sdkutils.d;
import java.net.URI;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.ProgressDialogFragment;
import kik.android.util.cv;

// Referenced classes of package com.kik.cards.browser:
//            b, a, c, d

public class CaptchaWindowFragment extends KikScopedDialogFragment
{
    private final class a extends WebChromeClient
    {

        final CaptchaWindowFragment a;

        public final void onReceivedTitle(WebView webview, String s)
        {
            super.onReceivedTitle(webview, s);
        }

        private a()
        {
            a = CaptchaWindowFragment.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends WebViewClient
    {

        boolean a;
        boolean b;
        final CaptchaWindowFragment c;

        static void a(b b1)
        {
            if (CaptchaWindowFragment.b(b1.c) != null)
            {
                CaptchaWindowFragment.b(b1.c).a();
            }
            if (b1.a && !b1.b)
            {
                b1.c.a.dismissAllowingStateLoss();
                return;
            } else
            {
                b1.b = false;
                return;
            }
        }

        static boolean a(String s1)
        {
            return s1 != null && s1.endsWith("#success");
        }

        public final void onPageFinished(WebView webview, String s1)
        {
            cv.e(new View[] {
                com.kik.cards.browser.CaptchaWindowFragment.a(c)
            });
            if (!b)
            {
                a = true;
            }
            if (CaptchaWindowFragment.b(c) != null) goto _L2; else goto _L1
_L1:
            com.kik.cards.browser.CaptchaWindowFragment.a(c, new aq());
            CaptchaWindowFragment.b(c).a(com.kik.sdkutils.d.a(webview, new com.kik.cards.browser.c(this, webview)));
            webview.loadUrl("javascript:(function(metas){for(var i=metas.length;i--;)if(metas[i].name==='kik-captcha'){window.location.hash='#success';break}})(document.getElementsByTagName('meta'))");
            s.a(CaptchaWindowFragment.b(c), 1000L);
_L4:
            super.onPageFinished(webview, s1);
            return;
_L2:
            if (webview != null)
            {
                webview.postDelayed(new com.kik.cards.browser.d(this, webview), 100L);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            a = false;
            if (!com.kik.cards.browser.CaptchaWindowFragment.a(c, s1))
            {
                super.onPageStarted(webview, s1, bitmap);
                return;
            } else
            {
                webview.stopLoading();
                return;
            }
        }

        public final void onReceivedError(WebView webview, int i, String s1, String s2)
        {
            CaptchaWindowFragment.c(c);
            super.onReceivedError(webview, i, s1, s2);
        }

        public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            sslerrorhandler.cancel();
            webview.stopLoading();
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            if (s1 == null)
            {
                return true;
            }
            if (!com.kik.cards.browser.CaptchaWindowFragment.a(c, s1))
            {
                c.a(s1);
                return true;
            }
            if (!a)
            {
                b = true;
            }
            a = false;
            return true;
        }

        private b()
        {
            c = CaptchaWindowFragment.this;
            super();
            a = true;
            b = false;
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class c extends com.kik.ui.fragment.FragmentBase.a
    {

        public final c a(String s)
        {
            a("extra.url", s);
            return this;
        }

        public final String a()
        {
            return g("extra.url");
        }

        public c()
        {
        }
    }


    protected ProgressDialogFragment a;
    com.kik.android.a b;
    private Uri c;
    private WebView d;
    private View e;
    private aq f;
    private String g;
    private c h;

    public CaptchaWindowFragment()
    {
        h = new c();
    }

    static View a(CaptchaWindowFragment captchawindowfragment)
    {
        return captchawindowfragment.e;
    }

    static aq a(CaptchaWindowFragment captchawindowfragment, aq aq)
    {
        captchawindowfragment.f = aq;
        return aq;
    }

    static boolean a(CaptchaWindowFragment captchawindowfragment, String s)
    {
        s = Uri.parse(s);
        Uri uri = Uri.parse("https://kik.com/captcha-url");
        if (s != null && s.getHost() != null && s.getHost().equals(uri.getHost()) && s.getQueryParameter("response") != null)
        {
            Bundle bundle = new Bundle();
            captchawindowfragment.g = s.getQueryParameter("response");
            bundle.putString("extra.resultUrl", captchawindowfragment.g);
            captchawindowfragment.a(bundle);
            captchawindowfragment.J();
            return true;
        } else
        {
            return false;
        }
    }

    static aq b(CaptchaWindowFragment captchawindowfragment)
    {
        return captchawindowfragment.f;
    }

    private boolean b(String s)
    {
        if (s == null)
        {
            J();
            return true;
        }
        try
        {
            s = URI.create(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            J();
            return true;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (s.getHost() != null && s.getScheme() != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        J();
        return true;
        return false;
    }

    static void c(CaptchaWindowFragment captchawindowfragment)
    {
        captchawindowfragment.d.setWebChromeClient(null);
        captchawindowfragment.d.setWebViewClient(null);
        captchawindowfragment.d.loadData("<html></html>", "text/html", "UTF-8");
        captchawindowfragment.d.postDelayed(new com.kik.cards.browser.b(captchawindowfragment), 500L);
    }

    protected final void a(String s)
    {
        Object obj = bf.a(s, c.toString());
        s = d.getContext();
        obj = Uri.parse(((String) (obj)));
        try
        {
            obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
            ((Intent) (obj)).addFlags(0x10000000);
            s.startActivity(((Intent) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        a = new ProgressDialogFragment(getString(0x7f090148), true);
        a.setCancelable(true);
        a.e();
        a.a(new com.kik.cards.browser.a(this));
        a(a);
        d = (WebView)getActivity().findViewById(0x7f0e0017);
        d.getSettings().setJavaScriptEnabled(true);
        d.setWebViewClient(new b((byte)0));
        d.setWebChromeClient(new a((byte)0));
        d.requestFocus();
        if (!b(c.toString()))
        {
            d.loadUrl((new StringBuilder()).append(c.toString()).append("&callback_url=https://kik.com/captcha-url").toString());
        }
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        h.a(getArguments());
        b.b("Captcha Shown").g().b();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = h.a();
        if (bundle != null)
        {
            c = Uri.parse(bundle);
        }
        layoutinflater = layoutinflater.inflate(0x7f030003, viewgroup, false);
        e = layoutinflater.findViewById(0x7f0e0016);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (g == null)
        {
            b.b("Captcha Incomplete").g().b();
            return;
        } else
        {
            b.b("Captcha Complete").g().b();
            return;
        }
    }
}
