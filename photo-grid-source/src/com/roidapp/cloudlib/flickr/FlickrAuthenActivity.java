// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            f, g, a, b, 
//            c, j, d, e, 
//            i, h

public class FlickrAuthenActivity extends Activity
{

    public static String a = "";
    private i b;
    private h c;
    private ProgressDialog d;
    private WebView e;

    public FlickrAuthenActivity()
    {
    }

    static h a(FlickrAuthenActivity flickrauthenactivity)
    {
        return flickrauthenactivity.c;
    }

    static h a(FlickrAuthenActivity flickrauthenactivity, h h1)
    {
        flickrauthenactivity.c = h1;
        return h1;
    }

    static void a(FlickrAuthenActivity flickrauthenactivity, String s)
    {
        if (flickrauthenactivity.isFinishing())
        {
            Log.w("AuthenticationActivity", "showLoginFailDialog after this activity finish.");
            return;
        }
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(flickrauthenactivity)).create();
        alertdialog.setTitle(flickrauthenactivity.getString(at.b));
        if (s != null && s.contains("authentication") && s.contains("challenge"))
        {
            alertdialog.setMessage((new StringBuilder()).append(flickrauthenactivity.getString(at.as)).append(flickrauthenactivity.getString(at.aZ)).toString());
        } else
        {
            alertdialog.setMessage((new StringBuilder()).append(s).append("\n").append(flickrauthenactivity.getString(at.as)).toString());
        }
        alertdialog.setButton(flickrauthenactivity.getString(at.bo), new f(flickrauthenactivity));
        alertdialog.setButton2(flickrauthenactivity.getString(at.ab), new g(flickrauthenactivity));
        alertdialog.show();
    }

    static ProgressDialog b(FlickrAuthenActivity flickrauthenactivity)
    {
        return flickrauthenactivity.d;
    }

    static WebView c(FlickrAuthenActivity flickrauthenactivity)
    {
        return flickrauthenactivity.e;
    }

    protected void onActivityResult(int k, int i1, Intent intent)
    {
        super.onActivityResult(k, i1, intent);
        if (k == 1)
        {
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(2);
        setResult(0);
        setContentView(as.z);
        if (!l.b(this))
        {
            l.a(this, new com.roidapp.cloudlib.flickr.a(this), new b(this), new c(this));
            return;
        }
        a = ((j)al.g().b("Flickr")).h;
        e = (WebView)findViewById(ar.a);
        e.setWebViewClient(new _cls4());
        e.clearCache(true);
        l.d(this);
        e.setWebChromeClient(new d(this));
        e.getSettings().setJavaScriptEnabled(true);
        d = ProgressDialog.show(this, "", getString(at.R));
        d.setCanceledOnTouchOutside(false);
        d.setCancelable(true);
        d.setOnCancelListener(new e(this));
        b = new i(this);
        b.execute(new Void[0]);
        e.clearFormData();
        return;
        bundle;
        bundle.printStackTrace();
        e.clearFormData();
        return;
        bundle;
        e.clearFormData();
        throw bundle;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (b != null && b.getStatus$2cfd0ac4() != com.roidapp.baselib.c.l.c)
        {
            b.cancel(true);
        }
        if (c != null && c.getStatus$2cfd0ac4() != com.roidapp.baselib.c.l.c)
        {
            c.cancel(true);
        }
        if (d != null)
        {
            d.dismiss();
        }
    }


    private class _cls4 extends WebViewClient
    {

        final FlickrAuthenActivity a;

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            webview = Uri.parse(s);
            if (!webview.getScheme().equalsIgnoreCase(com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a))
            {
                break; /* Loop/switch isn't completed */
            }
            s = com.roidapp.cloudlib.common.a.h(a);
            if (s != null && s.getUser() != null)
            {
                break; /* Loop/switch isn't completed */
            }
            s = webview.getQuery().split("&");
            if (s == null || s.length != 2)
            {
                break; /* Loop/switch isn't completed */
            }
            webview = s[0].substring(s[0].indexOf("=") + 1);
            s = s[1].substring(s[1].indexOf("=") + 1);
            (new StringBuilder("OAuth Token: ")).append(webview).append("; OAuth Verifier: ").append(s);
            OAuth oauth = com.roidapp.cloudlib.common.a.h(a);
            if (oauth != null && oauth.getToken() != null && oauth.getToken().getOauthTokenSecret() != null)
            {
                com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a(a, new h(a));
                com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a(a).execute(new String[] {
                    webview, oauth.getToken().getOauthTokenSecret(), s
                });
                return true;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (FlickrAuthenActivity.b(a) != null)
            {
                FlickrAuthenActivity.b(a).show();
            }
            return false;
        }

        _cls4()
        {
            a = FlickrAuthenActivity.this;
            super();
        }
    }

}
