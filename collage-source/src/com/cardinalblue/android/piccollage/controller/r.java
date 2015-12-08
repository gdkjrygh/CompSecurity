// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class r
{
    private class a extends com.cardinalblue.android.piccollage.controller.a.a
    {

        final r a;

        protected transient Throwable a(AccessToken aaccesstoken[])
        {
            try
            {
                Twitter twitter = r.a();
                twitter.setOAuthAccessToken(aaccesstoken[0]);
                twitter.verifyCredentials();
                publishProgress(aaccesstoken);
            }
            // Misplaced declaration of an exception variable
            catch (AccessToken aaccesstoken[])
            {
                aaccesstoken.printStackTrace();
                return aaccesstoken;
            }
            return null;
        }

        protected void a(Throwable throwable)
        {
            super.onPostExecute(throwable);
            if (throwable != null && r.a(a) != null)
            {
                r.a(a).p();
            }
        }

        protected transient void b(AccessToken aaccesstoken[])
        {
            if (r.a(a) != null)
            {
                r.a(a).a(aaccesstoken[0]);
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((AccessToken[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Throwable)obj);
        }

        protected void onPreExecute()
        {
            super.a(c, 0x7f0702bd);
        }

        protected void onProgressUpdate(Object aobj[])
        {
            b((AccessToken[])aobj);
        }

        protected a(Context context)
        {
            a = r.this;
            super(context);
        }
    }

    public static interface b
    {

        public abstract void a(AccessToken accesstoken);

        public abstract void p();
    }


    private final b a;
    private final Context b;

    public r(Context context, b b1)
    {
        b = context;
        a = b1;
    }

    static b a(r r1)
    {
        return r1.a;
    }

    public static Twitter a()
    {
        Twitter twitter = (new TwitterFactory()).getInstance();
        twitter.setOAuthConsumer("pDlpJ3WjkOc5e93fs561A", "l0MClx5L5TzOYcfYHiSNhsmwRIAcDuuXjfyME66E");
        return twitter;
    }

    public AccessToken b()
        throws Throwable
    {
        SharedPreferences sharedpreferences = b.getSharedPreferences("cardinalblue_3", 0);
        return new AccessToken(sharedpreferences.getString("twitter_token", ""), sharedpreferences.getString("twitter_token_secret", ""));
    }

    public boolean c()
    {
        boolean flag1 = false;
        Object obj = b.getSharedPreferences("cardinalblue_3", 0);
        String s = ((SharedPreferences) (obj)).getString("twitter_token", "");
        obj = ((SharedPreferences) (obj)).getString("twitter_token_secret", "");
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                flag = true;
            }
        }
        return flag;
    }

    public void d()
    {
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("cardinalblue_3", 0).edit();
        editor.remove("twitter_token");
        editor.remove("twitter_token_secret");
        editor.remove("twitter_user_name");
        editor.apply();
    }

    public void e()
    {
        AccessToken accesstoken = b();
        (new a(b)).execute(new AccessToken[] {
            accesstoken
        });
_L1:
        return;
        Throwable throwable;
        throwable;
        if (a != null)
        {
            a.p();
            return;
        }
          goto _L1
    }
}
