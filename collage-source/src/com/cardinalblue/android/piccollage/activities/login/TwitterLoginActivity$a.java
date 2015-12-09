// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import com.cardinalblue.android.b.k;
import twitter4j.Twitter;
import twitter4j.User;
import twitter4j.auth.AccessToken;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            TwitterLoginActivity

private class <init> extends AsyncTask
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
            ((android.content.r) (obj)).putString("twitter_token", auri.getToken());
            ((android.content.r) (obj)).putString("twitter_token_secret", auri.getTokenSecret());
            ((android.content.r) (obj)).putString("twitter_user_name", b);
            ((android.content.r) (obj)).apply();
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
