// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.activities.login.BaseLoginActivity;
import com.cardinalblue.android.piccollage.activities.login.FbLoginForReadActivity;
import com.cardinalblue.android.piccollage.controller.network.f;
import com.facebook.AccessToken;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.cardinalblue.android.piccollage.auth:
//            PicAuth

public class PicLoginActivity extends BaseLoginActivity
    implements a.b
{

    public static int c = 0;
    public static int d = 1;
    private PicAuth e;
    private String f;
    private int g;
    private String h;
    private String i;
    private String j;

    public PicLoginActivity()
    {
    }

    static PicAuth a(PicLoginActivity picloginactivity)
    {
        return picloginactivity.e;
    }

    static String a(PicLoginActivity picloginactivity, String s)
    {
        picloginactivity.j = s;
        return s;
    }

    private Intent b(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("error", s);
        s = new Intent();
        s.putExtras(bundle);
        return s;
    }

    static String b(PicLoginActivity picloginactivity, String s)
    {
        picloginactivity.f = s;
        return s;
    }

    private void h()
    {
        Bundle bundle = new Bundle();
        bundle.putString("target", "cb");
        bundle.putString("cb_access_token", e.d());
        bundle.putString("caption", h);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(-1, intent);
    }

    protected void a()
    {
        k.a(this, com.cardinalblue.android.piccollage.controller.network.f.b());
    }

    public void a(int l, Intent intent)
    {
        Object obj;
        intent = AccessToken.getCurrentAccessToken();
        if (intent == null)
        {
            com.cardinalblue.android.piccollage.a.b.ae(i);
            com.cardinalblue.android.piccollage.a.b.j(i, "facebook error");
            setResult(0);
            finish();
            return;
        }
        obj = new ArrayList();
        ((List) (obj)).add(new BasicNameValuePair("fb_access_token", intent.getToken()));
        intent = f;
        obj = k.a(intent, ((List) (obj)));
        intent = ((Intent) (obj));
_L2:
        a.loadUrl(intent);
        return;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        urisyntaxexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(Bundle bundle, a.a a1)
    {
        if (a1 != null)
        {
            k.a(this, 0x7f0700f8, 1);
            k.b((new StringBuilder()).append("PicLogin authorize failed, code: ").append(a1.a()).toString(), a1.b());
            e.a();
            setResult(0, b("pic_login_facebook_login_error"));
            com.cardinalblue.android.piccollage.a.b.ae(i);
            com.cardinalblue.android.piccollage.a.b.j(i, "server error");
            if ("home".equals(i))
            {
                com.cardinalblue.android.piccollage.a.b.ai("fail");
            }
            finish();
            return;
        }
        k.i(this);
        com.cardinalblue.android.piccollage.a.b.i(i, j);
        com.cardinalblue.android.piccollage.a.b.j(i, "success");
        if ("home".equals(i))
        {
            com.cardinalblue.android.piccollage.a.b.ai("success");
        }
        if (g == d)
        {
            h();
            finish();
            return;
        } else
        {
            setResult(-1);
            finish();
            return;
        }
    }

    public void a(String s)
    {
        if (s != null)
        {
            a.loadUrl(s);
        }
    }

    protected void c()
    {
    }

    protected WebViewClient d()
    {
        return new com.cardinalblue.android.piccollage.activities.login.BaseLoginActivity.a() {

            final PicLoginActivity b;

            public void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                webview = Uri.parse(s);
                if (webview != null && "/register".equals(webview.getPath()))
                {
                    com.cardinalblue.android.piccollage.a.f.e(b);
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                Uri uri = Uri.parse(s);
                String s2 = uri.getPath();
                if (s2 == null)
                {
                    com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("url: ").append(s).toString()));
                    return false;
                }
                if (s2.contains("/cb_authorize"))
                {
                    String s1 = uri.getQueryParameter("cb_user_provenance");
                    PicLoginActivity picloginactivity = b;
                    webview = s1;
                    if (s1 == null)
                    {
                        webview = "unknown";
                    }
                    PicLoginActivity.a(picloginactivity, webview);
                }
                if (s2.equals("/fb_connect"))
                {
                    com.cardinalblue.android.piccollage.a.f.d(b);
                }
                if (s2.equals("/fb_connect"))
                {
                    webview = uri.getQueryParameter("redirect_uri");
                    s = uri.getQueryParameters("scope");
                    if (s == null || s.size() == 0)
                    {
                        s = c.a;
                    }
                    s = new Intent(b.getApplicationContext(), com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity);
                    com.cardinalblue.android.piccollage.auth.PicLoginActivity.b(b, webview);
                    b.startActivityForResult(s, 701);
                    return true;
                }
                if (s.startsWith("cardinalblue://localhost/cb_authorized"))
                {
                    webview = uri.getQueryParameter("cb_access_token");
                    PicLoginActivity.a(b).a(webview);
                    PicLoginActivity.a(b).f();
                    PicLoginActivity.a(b).j();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                b = PicLoginActivity.this;
                super(PicLoginActivity.this);
            }
        };
    }

    protected void g()
    {
    }

    protected void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        if (l == 701)
        {
            a(i1, intent);
        }
    }

    public void onBackPressed()
    {
        com.cardinalblue.android.piccollage.a.b.aZ();
        com.cardinalblue.android.piccollage.a.b.j(i, "fail");
        if ("home".equals(i))
        {
            com.cardinalblue.android.piccollage.a.b.ai("cancel");
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = PicAuth.h();
        g = getIntent().getIntExtra("key_pic_login_purpose", c);
        i = getIntent().getStringExtra("from");
        h = getIntent().getStringExtra("key_pic_login_caption");
        if (e.b())
        {
            if (g == d)
            {
                h();
                finish();
                return;
            } else
            {
                setResult(-1);
                finish();
                return;
            }
        } else
        {
            com.cardinalblue.android.piccollage.a.b.ad(i);
            e.a(this);
            return;
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        f = bundle.getString("saved_redirect_uri");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("saved_redirect_uri", f);
    }

}
