// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.roidapp.baselib.c.l;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import twitter4j.Twitter;
import twitter4j.auth.RequestToken;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            g, f, b, c, 
//            d, TwitterVerifyActivity, e

public class TwitterLoginActivity extends Activity
{

    ProgressDialog a;
    private WebView b;
    private Twitter c;
    private RequestToken d;
    private g e;
    private f f;

    public TwitterLoginActivity()
    {
    }

    static f a(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.f;
    }

    static f a(TwitterLoginActivity twitterloginactivity, f f1)
    {
        twitterloginactivity.f = f1;
        return f1;
    }

    static RequestToken a(TwitterLoginActivity twitterloginactivity, RequestToken requesttoken)
    {
        twitterloginactivity.d = requesttoken;
        return requesttoken;
    }

    static RequestToken b(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.d;
    }

    static Twitter c(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.c;
    }

    static WebView d(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.b;
    }

    protected final void a()
    {
        if (e != null && e.getStatus$2cfd0ac4() != l.c)
        {
            e.cancel(true);
        }
        if (f != null && f.getStatus$2cfd0ac4() != l.c)
        {
            f.cancel(true);
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1)
        {
            setResult(0);
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(as.ai);
        setResult(0);
        if (!com.roidapp.baselib.e.l.b(this))
        {
            com.roidapp.baselib.e.l.a(this, new b(this), new c(this));
            return;
        }
        b = (WebView)findViewById(ar.du);
        b.setWebViewClient(new _cls3());
        b.getSettings().setJavaScriptEnabled(true);
        b.clearCache(true);
        com.roidapp.baselib.e.l.d(this);
        b.setWebChromeClient(new com.roidapp.cloudlib.twitter.d(this));
        c = TwitterVerifyActivity.a();
        e = new g(this, (byte)0);
        e.execute(new Void[0]);
        b.clearFormData();
_L2:
        a = com.roidapp.cloudlib.common.d.a(this, getString(at.R));
        a.setCanceledOnTouchOutside(false);
        a.setOnCancelListener(new e(this));
        a.show();
        return;
        bundle;
        bundle.printStackTrace();
        b.clearFormData();
        if (true) goto _L2; else goto _L1
_L1:
        bundle;
        b.clearFormData();
        throw bundle;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a();
    }

    private class _cls3 extends WebViewClient
    {

        final TwitterLoginActivity a;

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (!s.startsWith(a.i))
            {
                return false;
            }
            webview = Uri.parse(s);
            if (TextUtils.isEmpty(webview.getQueryParameter("denied")))
            {
                TwitterLoginActivity.a(a, new f(a, (byte)0));
                TwitterLoginActivity.a(a).execute(new Uri[] {
                    webview
                });
                return true;
            } else
            {
                a.finish();
                return true;
            }
        }

        _cls3()
        {
            a = TwitterLoginActivity.this;
            super();
        }
    }

}
