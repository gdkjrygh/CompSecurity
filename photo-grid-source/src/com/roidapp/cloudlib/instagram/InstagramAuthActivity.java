// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            f, h, g, a, 
//            b, c, d, e

public class InstagramAuthActivity extends Activity
{

    private final String a = "InstagramAuth";
    private RelativeLayout b;
    private WebView c;
    private ProgressDialog d;
    private String e;
    private String f;
    private Handler g;
    private Runnable h;

    public InstagramAuthActivity()
    {
        h = new f(this);
    }

    static ProgressDialog a(InstagramAuthActivity instagramauthactivity)
    {
        return instagramauthactivity.d;
    }

    static String a(InstagramAuthActivity instagramauthactivity, String s)
    {
        instagramauthactivity.f = s;
        return s;
    }

    static Runnable b(InstagramAuthActivity instagramauthactivity)
    {
        return instagramauthactivity.h;
    }

    static void c(InstagramAuthActivity instagramauthactivity)
    {
        HttpPost httppost;
        ArrayList arraylist;
        l.a();
        h h1 = (h)al.g().b("Instagram");
        httppost = new HttpPost("https://api.instagram.com/oauth/access_token");
        arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("client_id", h1.f));
        arraylist.add(new BasicNameValuePair("client_secret", h1.g));
        arraylist.add(new BasicNameValuePair("grant_type", "authorization_code"));
        arraylist.add(new BasicNameValuePair("redirect_uri", instagramauthactivity.e));
        arraylist.add(new BasicNameValuePair("code", instagramauthactivity.f));
        httppost.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
        Object obj = (new DefaultHttpClient()).execute(httppost);
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
        {
            obj = new JSONObject(EntityUtils.toString(((HttpResponse) (obj)).getEntity()));
            String s = ((JSONObject) (obj)).getJSONObject("user").getString("id");
            String s1 = ((JSONObject) (obj)).getString("access_token");
            com.roidapp.cloudlib.common.a.a(instagramauthactivity, ((JSONObject) (obj)).getJSONObject("user").getString("username"), s, s1, ((JSONObject) (obj)).getJSONObject("user").getString("profile_picture"));
            instagramauthactivity.g.sendEmptyMessage(16);
        }
        return;
        Object obj1;
        obj1;
        ((ClientProtocolException) (obj1)).printStackTrace();
        Message message = Message.obtain(instagramauthactivity.g, 32, ((ClientProtocolException) (obj1)).getMessage());
        instagramauthactivity.g.sendMessage(message);
        return;
        instagramauthactivity;
        throw instagramauthactivity;
        message;
        message.printStackTrace();
        Message message1 = Message.obtain(instagramauthactivity.g, 32, message.getMessage());
        instagramauthactivity.g.sendMessage(message1);
        return;
        message1;
        message1.printStackTrace();
        Message message2 = Message.obtain(instagramauthactivity.g, 32, message1.getMessage());
        instagramauthactivity.g.sendMessage(message2);
        return;
        message2;
        message2.printStackTrace();
        Message message3 = Message.obtain(instagramauthactivity.g, 32, message2.getMessage());
        instagramauthactivity.g.sendMessage(message3);
        return;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            setResult(0, getIntent());
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(2);
        setResult(0, getIntent());
        setContentView(as.I);
        g = new g(this);
        b = (RelativeLayout)findViewById(ar.k);
        c = (WebView)findViewById(ar.bm);
        c.getSettings().setSaveFormData(false);
        if (!l.b(this))
        {
            l.a(this, new com.roidapp.cloudlib.instagram.a(this), new b(this), new c(this));
            return;
        }
        if (getIntent().getBooleanExtra("logoutFlag", false))
        {
            System.out.println("\u6E05\u9664COOKIE...BEGIN");
            CookieSyncManager.createInstance(this);
            CookieSyncManager.getInstance().startSync();
            CookieManager.getInstance().removeSessionCookie();
            CookieManager.getInstance().removeAllCookie();
            c.clearCache(true);
            c.clearHistory();
            System.out.println("\u6E05\u9664COOKIE...END");
        }
        c.setWebChromeClient(new d(this));
        bundle = (h)al.g().b("Instagram");
        e = (new StringBuilder()).append(((h) (bundle)).h).append("://callback").toString();
        c.setWebViewClient(new AuthWebViewClient(null));
        WebSettings websettings;
        c.clearCache(true);
        l.d(this);
        websettings = c.getSettings();
        try
        {
            websettings.setJavaScriptEnabled(true);
        }
        catch (NullPointerException nullpointerexception) { }
        d = ProgressDialog.show(this, "", getString(at.R));
        d.setCanceledOnTouchOutside(false);
        d.setCancelable(true);
        d.setOnCancelListener(new e(this));
        c.loadUrl(String.format("https://api.instagram.com/oauth/authorize/?client_id=%s&redirect_uri=%s&response_type=code&scope=likes+relationships+comments", new Object[] {
            ((h) (bundle)).f, e
        }));
        c.clearFormData();
        return;
        bundle;
        bundle.printStackTrace();
        c.clearFormData();
        return;
        bundle;
        c.clearFormData();
        throw bundle;
    }

    protected void onDestroy()
    {
        c.destroy();
        c = null;
        b.removeAllViews();
        b = null;
        if (d != null)
        {
            d.dismiss();
        }
        super.onDestroy();
    }

    private class AuthWebViewClient extends WebViewClient
    {

        final InstagramAuthActivity a;

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (a.isFinishing())
            {
                return true;
            }
            if (Uri.parse(s).getScheme().equalsIgnoreCase(((h)al.g().b("Instagram")).h) && s.indexOf("code=") != -1)
            {
                webview = s.split("code=")[1];
                com.roidapp.cloudlib.instagram.InstagramAuthActivity.a(a, webview);
                if (com.roidapp.cloudlib.instagram.InstagramAuthActivity.a(a) != null)
                {
                    com.roidapp.cloudlib.instagram.InstagramAuthActivity.a(a).show();
                }
                (new Thread(InstagramAuthActivity.b(a))).start();
                return true;
            } else
            {
                return super.shouldOverrideUrlLoading(webview, s);
            }
        }

        private AuthWebViewClient()
        {
            a = InstagramAuthActivity.this;
            super();
        }

        AuthWebViewClient(com.roidapp.cloudlib.instagram.a a1)
        {
            this();
        }
    }

}
