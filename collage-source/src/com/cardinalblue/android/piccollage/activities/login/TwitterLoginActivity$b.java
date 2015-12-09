// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.webkit.WebView;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.a.b;
import twitter4j.Twitter;
import twitter4j.auth.RequestToken;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            TwitterLoginActivity

private class <init> extends b
{

    final TwitterLoginActivity a;

    protected transient String a(Void avoid[])
    {
        try
        {
            TwitterLoginActivity.a(a, com.cardinalblue.android.piccollage.activities.login.TwitterLoginActivity.b(a).getOAuthRequestToken("cardinalblue:///"));
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

    private Q(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }

    a(TwitterLoginActivity twitterloginactivity, a a1)
    {
        this(twitterloginactivity);
    }
}
