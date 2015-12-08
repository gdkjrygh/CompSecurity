// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.r;
import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            BaseLoginActivity

public class TwitterLoginActivity extends BaseLoginActivity
{
    private class a extends AsyncTask
    {

        final TwitterLoginActivity a;
        private String b;

        protected transient AccessToken a(Uri auri[])
        {
            Object obj;
            Object obj1;
            obj1 = null;
            obj = obj1;
            auri = auri[0].getQueryParameter("oauth_verifier");
            obj = obj1;
            auri = TwitterLoginActivity.b(a).getOAuthAccessToken(TwitterLoginActivity.c(a), auri);
            obj = auri;
            TwitterLoginActivity.b(a).setOAuthAccessToken(auri);
            obj = auri;
            try
            {
                b = TwitterLoginActivity.b(a).showUser(TwitterLoginActivity.b(a).getId()).getName();
            }
            // Misplaced declaration of an exception variable
            catch (Uri auri[])
            {
                auri.printStackTrace();
                publishProgress(new Throwable[] {
                    auri
                });
                auri = ((Uri []) (obj));
            }
            if (auri != null)
            {
                obj = a.getSharedPreferences("cardinalblue_3", 0).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("twitter_token", auri.getToken());
                ((android.content.SharedPreferences.Editor) (obj)).putString("twitter_token_secret", auri.getTokenSecret());
                ((android.content.SharedPreferences.Editor) (obj)).putString("twitter_user_name", b);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
            return auri;
        }

        protected void a(AccessToken accesstoken)
        {
            if (accesstoken != null)
            {
                String s = a.getIntent().getExtras().getString("caption");
                Bundle bundle = new Bundle();
                bundle.putString("target", "twitter");
                bundle.putString("auth[twitter][token]", accesstoken.getToken());
                bundle.putString("auth[twitter][token_secret]", accesstoken.getTokenSecret());
                bundle.putString("caption", s);
                accesstoken = new Intent();
                accesstoken.putExtras(bundle);
                a.setResult(-1, accesstoken);
            }
            a.finish();
        }

        protected transient void a(Throwable athrowable[])
        {
            if (athrowable[0] != null)
            {
                k.a(a, 0x7f0700f8, 0);
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Uri[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((AccessToken)obj);
        }

        protected void onProgressUpdate(Object aobj[])
        {
            a((Throwable[])aobj);
        }

        private a()
        {
            a = TwitterLoginActivity.this;
            super();
        }

    }

    private class b extends com.cardinalblue.android.piccollage.controller.a.b
    {

        final TwitterLoginActivity a;

        protected transient String a(Void avoid[])
        {
            try
            {
                TwitterLoginActivity.a(a, TwitterLoginActivity.b(a).getOAuthRequestToken("cardinalblue:///"));
                avoid = TwitterLoginActivity.c(a).getAuthenticationURL();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
                publishProgress(new Throwable[] {
                    avoid
                });
                return null;
            }
            return avoid;
        }

        protected void a(String s)
        {
            if (s != null)
            {
                a.a.loadUrl(s);
            }
        }

        protected transient void a(Throwable athrowable[])
        {
            k.a(a, 0x7f0700f8, 0);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((String)obj);
        }

        protected void onProgressUpdate(Object aobj[])
        {
            a((Throwable[])aobj);
        }

        private b()
        {
            a = TwitterLoginActivity.this;
            super();
        }

    }


    private a c;
    private b d;
    private RequestToken e;
    private Twitter f;

    public TwitterLoginActivity()
    {
    }

    static a a(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.c;
    }

    static a a(TwitterLoginActivity twitterloginactivity, a a1)
    {
        twitterloginactivity.c = a1;
        return a1;
    }

    static RequestToken a(TwitterLoginActivity twitterloginactivity, RequestToken requesttoken)
    {
        twitterloginactivity.e = requesttoken;
        return requesttoken;
    }

    static Twitter b(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.f;
    }

    static RequestToken c(TwitterLoginActivity twitterloginactivity)
    {
        return twitterloginactivity.e;
    }

    protected void a()
    {
        k.a(this, "twitter.com");
    }

    protected void c()
    {
        if (d != null && d.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            d.cancel(true);
        }
        if (c != null && c.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            c.cancel(true);
        }
    }

    protected WebViewClient d()
    {
        return new BaseLoginActivity.a() {

            final TwitterLoginActivity b;

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.startsWith("cardinalblue:///"))
                {
                    webview = Uri.parse(s);
                    if (!TextUtils.isEmpty(webview.getQueryParameter("denied")))
                    {
                        b.finish();
                        return true;
                    } else
                    {
                        TwitterLoginActivity.a(b, b. new a());
                        TwitterLoginActivity.a(b).execute(new Uri[] {
                            webview
                        });
                        return true;
                    }
                } else
                {
                    return false;
                }
            }

            
            {
                b = TwitterLoginActivity.this;
                super(TwitterLoginActivity.this);
            }
        };
    }

    protected void g()
    {
        f = r.a();
        d = new b();
        d.a(new Void[0]);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if ((new r(this, null)).c())
        {
            setResult(-1);
            finish();
        }
    }
}
