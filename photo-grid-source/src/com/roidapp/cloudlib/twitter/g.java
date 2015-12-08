// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.at;
import twitter4j.Twitter;
import twitter4j.auth.RequestToken;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            TwitterLoginActivity, a

final class g extends c
{

    final TwitterLoginActivity a;

    private g(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }

    g(TwitterLoginActivity twitterloginactivity, byte byte0)
    {
        this(twitterloginactivity);
    }

    private transient String a()
    {
        String s;
        try
        {
            TwitterLoginActivity.a(a, com.roidapp.cloudlib.twitter.TwitterLoginActivity.c(a).getOAuthRequestToken(a.i));
            Log.i("TwitterLoginActivity", (new StringBuilder("getOAuthRequestToken:")).append(a.i).toString());
            s = TwitterLoginActivity.b(a).getAuthenticationURL();
            Log.i("TwitterLoginActivity", (new StringBuilder("getAuthenticationURL:")).append(s).toString());
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
            publishProgress(new Throwable[] {
                throwable
            });
            return null;
        }
        return s;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (String)obj;
        if (obj != null)
        {
            TwitterLoginActivity.d(a).loadUrl(((String) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        if ((Throwable[])aobj != null && !a.isFinishing())
        {
            Toast.makeText(a, a.getString(at.h), 0).show();
            a.finish();
        }
    }
}
