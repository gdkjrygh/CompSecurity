// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.webkit.WebView;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p.ca.ac;
import p.cw.c;
import p.dd.bm;
import p.df.a;
import twitter4j.AsyncTwitter;
import twitter4j.AsyncTwitterFactory;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterAdapter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterMethod;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.RequestToken;

// Referenced classes of package p.bx:
//            e, d

public class f
    implements e
{
    private static class a extends AsyncTask
    {

        protected transient String a(String as[])
        {
            String s1 = as[0];
            String s2 = as[1];
            as = com.pandora.android.provider.b.a.b().k();
            as.a(s1, as.g());
            try
            {
                AccessToken accesstoken = p.bx.d.b().d().getOAuthAccessToken(s2);
                as.a(accesstoken.getToken(), accesstoken.getTokenSecret());
            }
            // Misplaced declaration of an exception variable
            catch (String as[]) { }
            p.bx.d.b().a(p.bx.e.a.a);
            return null;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((String[])aobj);
        }

        private a()
        {
        }

    }

    private class b extends AsyncTask
    {

        final f a;
        private Activity b;

        protected transient String a(Object aobj[])
        {
            if (!p.bx.f.a(a))
            {
                return null;
            }
            try
            {
                b = (Activity)aobj[0];
                p.bx.f.a(a, a.f());
                f.d(a).setOAuthConsumer(p.bx.f.b(a), p.bx.f.c(a));
                aobj = f.d(a).getOAuthRequestToken().getAuthorizationURL();
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                p.df.a.a("TwitterConnectImpl", (new StringBuilder()).append("Failed to fetch Twitter oAuth URL: ").append(((TwitterException) (aobj)).getStatusCode()).append("; ").append(((TwitterException) (aobj)).getErrorMessage()).toString());
                ((TwitterException) (aobj)).printStackTrace();
                return null;
            }
            return ((String) (aobj));
        }

        protected void a(String s1)
        {
            if (s1 == null)
            {
                f.e(a);
            } else
            if (b != null && !b.isFinishing())
            {
                Bundle bundle = new Bundle(2);
                bundle.putString("intent_uri", s1);
                bundle.putSerializable("intent_web_view_client_class", p/bx/f$c);
                bundle.putString("intent_title", "Twitter Authentication");
                com.pandora.android.activity.a.a(b, p/bx/f$d, 0, bundle, -1, false);
                super.onPostExecute(s1);
                return;
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a(aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((String)obj);
        }

        private b()
        {
            a = f.this;
            super();
        }

    }

    public static class c
        implements p.ca.ac.d
    {

        public boolean a(WebView webview, String s1)
        {
            if (s1.startsWith("http://callback.twitter.pandora.com"))
            {
                Object obj = Uri.parse(s1);
                if (((Uri) (obj)).getQueryParameter("denied") != null)
                {
                    p.bx.d.b().a(p.bx.e.a.b);
                } else
                {
                    s1 = ((Uri) (obj)).getQueryParameter("oauth_token");
                    obj = ((Uri) (obj)).getQueryParameter("oauth_verifier");
                    (new a()).execute(new String[] {
                        s1, obj
                    });
                }
                webview.setWebChromeClient(null);
                webview.stopLoading();
                return true;
            } else
            {
                return false;
            }
        }

        public c()
        {
        }
    }

    public static class d extends ac
    {

        public void a(int l)
        {
            if (l == 0)
            {
                p.bx.d.b().a(p.bx.e.a.b);
            }
            super.a(l);
        }

        public boolean e_()
        {
            return false;
        }

        public boolean f_()
        {
            return true;
        }

        public d()
        {
        }
    }


    private Twitter a;
    private String b;
    private String c;
    private b d;
    private CopyOnWriteArraySet e;

    f()
    {
        e = new CopyOnWriteArraySet();
        com.pandora.android.provider.b.a.b().b(this);
    }

    static Twitter a(f f1, Twitter twitter)
    {
        f1.a = twitter;
        return twitter;
    }

    private void a(boolean flag)
    {
        if (a != null)
        {
            a.setOAuthAccessToken(null);
        }
        com.pandora.android.provider.b.a.b().k().e();
        if (flag)
        {
            h();
        }
    }

    static boolean a(f f1)
    {
        return f1.k();
    }

    static String b(f f1)
    {
        return f1.b;
    }

    static String c(f f1)
    {
        return f1.c;
    }

    static Twitter d(f f1)
    {
        return f1.a;
    }

    static void e(f f1)
    {
        f1.i();
    }

    private void h()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((e.b)iterator.next()).c()) { }
    }

    private void i()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((e.b)iterator.next()).b()) { }
    }

    private void j()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((e.b)iterator.next()).a()) { }
    }

    private boolean k()
    {
        if (s.a(b) || s.a(c))
        {
            p.df.a.b("TwitterConnectImpl", "Twitter consumer keys are null");
            return false;
        } else
        {
            return true;
        }
    }

    public void a(Activity activity, e.b b1)
    {
        Object obj = com.pandora.android.provider.b.a.b().k();
        b1 = ((ag) (obj)).f();
        obj = ((ag) (obj)).g();
        boolean flag;
        if (b1 != null && obj != null)
        {
            a = f();
            a.setOAuthConsumer(b, c);
            a.setOAuthAccessToken(new AccessToken(b1, ((String) (obj))));
            if (!a.getAuthorization().isEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        if (flag)
        {
            a(false);
            d = new b();
            d.execute(new Object[] {
                activity
            });
        }
    }

    public void a(String s1)
    {
        if (!k())
        {
            e();
            return;
        } else
        {
            AsyncTwitter asynctwitter = g();
            asynctwitter.addListener(new TwitterAdapter() {

                final f a;

                public void onException(TwitterException twitterexception, TwitterMethod twittermethod)
                {
                    p.df.a.a("TwitterConnectImpl", (new StringBuilder()).append("TwitterConnect.post.onException() --> Method : ").append(twittermethod).append(",  Ex : ").append(twitterexception).toString());
                    if (twitterexception.getStatusCode() == 401)
                    {
                        a.e();
                    }
                }

                public void updatedStatus(Status status)
                {
                    p.df.a.a("TwitterConnectImpl", (new StringBuilder()).append("TwitterConnect.post.updatedStatus() --> ").append(status).toString());
                }

            
            {
                a = f.this;
                super();
            }
            });
            Object obj = com.pandora.android.provider.b.a.b().k();
            String s2 = ((ag) (obj)).f();
            obj = ((ag) (obj)).g();
            asynctwitter.setOAuthConsumer(b, c);
            asynctwitter.setOAuthAccessToken(new AccessToken(s2, ((String) (obj))));
            p.df.a.a("TwitterConnectImpl", "TwitterConnect.post() --> updateStatus(message)");
            asynctwitter.updateStatus(s1);
            return;
        }
    }

    public void a(e.a a1)
    {
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[p.bx.e.a.values().length];
                try
                {
                    a[p.bx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.bx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.bx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.bx._cls2.a[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            j();
            return;

        case 2: // '\002'
            i();
            return;

        case 3: // '\003'
            h();
            break;
        }
    }

    public boolean a()
    {
        if (a != null)
        {
            return a.getAuthorization().isEnabled();
        } else
        {
            return false;
        }
    }

    public boolean a(e.b b1)
    {
        return e.remove(b1);
    }

    public void b()
    {
        if (a != null)
        {
            a.setOAuthAccessToken(null);
        }
        a = null;
        com.pandora.android.provider.b.a.b().c(this);
    }

    public boolean b(e.b b1)
    {
        return e.add(b1);
    }

    public boolean c()
    {
        return com.pandora.android.provider.b.a.b().k().d();
    }

    public Twitter d()
    {
        return a;
    }

    public void e()
    {
        a(true);
    }

    Twitter f()
    {
        return (new TwitterFactory()).getInstance();
    }

    AsyncTwitter g()
    {
        return (new AsyncTwitterFactory()).getInstance();
    }

    public void onUpdateTwitterAuthConsumer(bm bm1)
    {
        b = bm1.a;
        c = bm1.b;
    }
}
