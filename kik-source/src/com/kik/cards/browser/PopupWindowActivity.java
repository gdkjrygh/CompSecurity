// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URI;

public class PopupWindowActivity extends Activity
{
    private final class a extends WebChromeClient
    {

        final PopupWindowActivity a;

        public final void onReceivedTitle(WebView webview, String s)
        {
            super.onReceivedTitle(webview, s);
            PopupWindowActivity.a(a).setText(s);
        }

        private a()
        {
            a = PopupWindowActivity.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private final class b extends WebViewClient
    {

        final PopupWindowActivity a;

        public final void onPageFinished(WebView webview, String s)
        {
            PopupWindowActivity.a(a, s);
            super.onPageFinished(webview, s);
        }

        public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            PopupWindowActivity.a(a, s);
            if (!PopupWindowActivity.b(a, s))
            {
                super.onPageStarted(webview, s, bitmap);
                return;
            } else
            {
                webview.stopLoading();
                return;
            }
        }

        public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            PopupWindowActivity.b(a);
            sslerrorhandler.cancel();
            webview.stopLoading();
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            while (s == null || PopupWindowActivity.b(a, s)) 
            {
                return true;
            }
            PopupWindowActivity.a(a, s);
            return false;
        }

        private b()
        {
            a = PopupWindowActivity.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private Uri a;
    private String b;
    private WebView c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private Toast g;

    public PopupWindowActivity()
    {
    }

    static TextView a(PopupWindowActivity popupwindowactivity)
    {
        return popupwindowactivity.d;
    }

    static void a(PopupWindowActivity popupwindowactivity, String s)
    {
        Object obj;
        String s1;
        String s2;
        try
        {
            s = URI.create(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(popupwindowactivity, "Invalid URL! Cancelling.", 1).show();
            popupwindowactivity.finish();
            return;
        }
        obj = s.getScheme();
        s1 = s.getHost();
        s2 = s.getPath();
        if (obj == null || s1 == null || s2 == null)
        {
            return;
        }
        obj = (new StringBuilder()).append(((String) (obj)).toLowerCase()).append("://").append(s1).append(s2).toString();
        if (!"https".equalsIgnoreCase(s.getScheme()))
        {
            obj = android.text.Spannable.Factory.getInstance().newSpannable(((CharSequence) (obj)));
            int i;
            if (s.getScheme() == null)
            {
                i = 0;
            } else
            {
                i = s.getScheme().length();
            }
            ((Spannable) (obj)).setSpan(new ForegroundColorSpan(popupwindowactivity.getResources().getColor(0x7f0c0038)), 0, i, 33);
            popupwindowactivity.e.setText(((CharSequence) (obj)));
            popupwindowactivity.f.setImageResource(0x7f0201af);
            return;
        } else
        {
            s = android.text.Spannable.Factory.getInstance().newSpannable(((CharSequence) (obj)));
            s.setSpan(new ForegroundColorSpan(popupwindowactivity.getResources().getColor(0x7f0c0039)), 0, 5, 33);
            popupwindowactivity.e.setText(s);
            popupwindowactivity.f.setImageResource(0x7f020255);
            return;
        }
    }

    private boolean a(String s)
    {
        if (s == null)
        {
            g.setText("No authorization URL provided");
            g.show();
            finish();
            return true;
        }
        try
        {
            s = URI.create(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(this, "Invalid URL! Cancelling.", 1).show();
            finish();
            return true;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (s.getHost() != null && s.getScheme() != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        g.setText("Invalid URL! Cancelling.");
        g.show();
        finish();
        return true;
        return false;
    }

    static void b(PopupWindowActivity popupwindowactivity)
    {
        String s = popupwindowactivity.e.getText().toString();
        Spannable spannable = android.text.Spannable.Factory.getInstance().newSpannable(s);
        int i = s.indexOf(":");
        if (i >= 0)
        {
            spannable.setSpan(new ForegroundColorSpan(0xffff0000), 0, i, 33);
            popupwindowactivity.e.setText(spannable);
            popupwindowactivity.f.setImageResource(0x7f0202c7);
            popupwindowactivity.c.setWebChromeClient(null);
            popupwindowactivity.c.setWebViewClient(null);
            popupwindowactivity.c.loadData("<html></html>", "text/html", "UTF-8");
        }
    }

    static boolean b(PopupWindowActivity popupwindowactivity, String s)
    {
        s = Uri.parse(s);
        if (s != null && popupwindowactivity.b != null && popupwindowactivity.a.getHost().equalsIgnoreCase(s.getHost()) && popupwindowactivity.b.equalsIgnoreCase(s.getPath()))
        {
            Intent intent = new Intent();
            intent.putExtra("extra.resultUrl", s.toString());
            popupwindowactivity.setResult(-1, intent);
            popupwindowactivity.finish();
            return true;
        } else
        {
            return false;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        a = Uri.parse(bundle.getString("extra.url"));
        b = bundle.getString("extra.callbackPath");
        setContentView(0x7f030012);
        c = (WebView)findViewById(0x7f0e0017);
        d = (TextView)findViewById(0x7f0e007b);
        e = (TextView)findViewById(0x7f0e007d);
        f = (ImageView)findViewById(0x7f0e007c);
        c.getSettings().setJavaScriptEnabled(true);
        c.setWebViewClient(new b((byte)0));
        c.setWebChromeClient(new a((byte)0));
        c.requestFocus();
        g = Toast.makeText(this, "", 1);
        if (!a(a.toString()))
        {
            c.loadUrl(a.toString());
        }
    }
}
