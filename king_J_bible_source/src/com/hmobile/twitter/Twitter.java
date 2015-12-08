// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.webkit.CookieSyncManager;
import java.io.IOException;
import java.net.MalformedURLException;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;

// Referenced classes of package com.hmobile.twitter:
//            Util, TwDialog, DialogError, TwitterError

public class Twitter
{
    public static interface DialogListener
    {

        public abstract void onCancel();

        public abstract void onComplete(Bundle bundle);

        public abstract void onError(DialogError dialogerror);

        public abstract void onTwitterError(TwitterError twittererror);
    }


    public static final String ACCESS_TOKEN = "access_token";
    public static final String AUTHORIZE = "authorize";
    public static final String CALLBACK_SCHEME = "gc";
    public static final String CALLBACK_URI = "gc://twitt";
    public static final String CANCEL_URI = "twitter://cancel";
    protected static String OAUTH_ACCESS_TOKEN = "https://api.twitter.com/oauth/access_token";
    protected static String OAUTH_AUTHORIZE = "https://api.twitter.com/oauth/authorize";
    protected static String OAUTH_REQUEST_TOKEN = "https://api.twitter.com/oauth/request_token";
    public static final String REQUEST = "request";
    protected static String REQUEST_ENDPOINT = "https://api.twitter.com/1";
    public static final String SECRET_TOKEN = "secret_token";
    public static final String TAG = "twitter";
    private String mAccessToken;
    private CommonsHttpOAuthConsumer mHttpOauthConsumer;
    private CommonsHttpOAuthProvider mHttpOauthProvider;
    private Drawable mIcon;
    private String mSecretToken;

    public Twitter(Drawable drawable)
    {
        mAccessToken = null;
        mSecretToken = null;
        mIcon = drawable;
    }

    public void authorize(Context context, Handler handler, String s, String s1, final DialogListener listener)
    {
        mHttpOauthConsumer = new CommonsHttpOAuthConsumer(s, s1);
        mHttpOauthProvider = new CommonsHttpOAuthProvider(OAUTH_REQUEST_TOKEN, OAUTH_ACCESS_TOKEN, OAUTH_AUTHORIZE);
        CookieSyncManager.createInstance(context);
        dialog(context, handler, new DialogListener() {

            final Twitter this$0;
            private final DialogListener val$listener;

            public void onCancel()
            {
                Log.d("twitter", "Login cancelled");
                listener.onCancel();
            }

            public void onComplete(Bundle bundle)
            {
                CookieSyncManager.getInstance().sync();
                setAccessToken(bundle.getString("access_token"));
                setSecretToken(bundle.getString("secret_token"));
                if (isSessionValid())
                {
                    Log.d("twitter", (new StringBuilder("token ")).append(getAccessToken()).append(" ").append(getSecretToken()).toString());
                    listener.onComplete(bundle);
                    return;
                } else
                {
                    onTwitterError(new TwitterError("failed to receive oauth token"));
                    return;
                }
            }

            public void onError(DialogError dialogerror)
            {
                Log.d("twitter", (new StringBuilder("Login failed: ")).append(dialogerror).toString());
                listener.onError(dialogerror);
            }

            public void onTwitterError(TwitterError twittererror)
            {
                Log.d("twitter", (new StringBuilder("Login failed: ")).append(twittererror).toString());
                listener.onTwitterError(twittererror);
            }

            
            {
                this$0 = Twitter.this;
                listener = dialoglistener;
                super();
            }
        });
    }

    public void dialog(Context context, Handler handler, DialogListener dialoglistener)
    {
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
        {
            Util.showAlert(context, "Error", "Application requires permission to access the Internet");
            return;
        } else
        {
            (new TwDialog(context, mHttpOauthProvider, mHttpOauthConsumer, dialoglistener, mIcon)).show();
            return;
        }
    }

    public String getAccessToken()
    {
        return mAccessToken;
    }

    public String getSecretToken()
    {
        return mSecretToken;
    }

    public boolean isSessionValid()
    {
        return getAccessToken() != null && getSecretToken() != null;
    }

    public String logout(Context context)
        throws MalformedURLException, IOException
    {
        return "true";
    }

    public void setAccessToken(String s)
    {
        mAccessToken = s;
    }

    public void setIcon(Drawable drawable)
    {
    }

    public void setSecretToken(String s)
    {
        mSecretToken = s;
    }

}
