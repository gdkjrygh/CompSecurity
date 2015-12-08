// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.net.Uri;
import android.widget.Toast;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.auth.AccessToken;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            TwitterLoginActivity

final class f extends c
{

    final TwitterLoginActivity a;
    private String b;

    private f(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }

    f(TwitterLoginActivity twitterloginactivity, byte byte0)
    {
        this(twitterloginactivity);
    }

    private transient AccessToken a(Uri auri[])
    {
        try
        {
            auri = auri[0].getQueryParameter("oauth_verifier");
            auri = com.roidapp.cloudlib.twitter.TwitterLoginActivity.c(a).getOAuthAccessToken(TwitterLoginActivity.b(a), auri);
            com.roidapp.cloudlib.twitter.TwitterLoginActivity.c(a).setOAuthAccessToken(auri);
            b = com.roidapp.cloudlib.twitter.TwitterLoginActivity.c(a).showUser(com.roidapp.cloudlib.twitter.TwitterLoginActivity.c(a).getId()).getName();
        }
        // Misplaced declaration of an exception variable
        catch (Uri auri[])
        {
            auri.printStackTrace();
            publishProgress(new Throwable[] {
                auri
            });
            return null;
        }
        if (auri == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        com.roidapp.cloudlib.common.a.a(a, b, auri.getToken(), auri.getTokenSecret());
        return auri;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((Uri[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        if ((AccessToken)obj != null)
        {
            a.setResult(-1);
        } else
        {
            a.setResult(0);
        }
        a.finish();
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
        }
    }
}
