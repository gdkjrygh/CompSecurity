// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.app.Activity;
import android.content.Intent;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

// Referenced classes of package me.grantland.twitter:
//            TwitterActivity, TwitterDialog, TwitterError

public class Twitter
{
    public static interface DialogListener
    {

        public abstract void onCancel();

        public abstract void onComplete(String s, String s1);

        public abstract void onError(TwitterError twittererror);
    }


    public static final String ACCESS_TOKEN = "https://twitter.com/oauth/access_token";
    public static final String AUTHORIZE = "https://twitter.com/oauth/authorize";
    public static final String CALLBACK_SCHEME = "gc";
    public static final String CALLBACK_URI = "gc://twitt";
    public static final boolean DEBUG = false;
    public static final int DEFAULT_AUTH_ACTIVITY_CODE = 4242;
    public static final String DENIED = "denied";
    public static final String EXTRA_ACCESS_KEY = "access_key";
    public static final String EXTRA_ACCESS_SECRET = "access_secret";
    public static final String EXTRA_AUTHORIZE_PARAMS = "params";
    public static final String EXTRA_CONSUMER = "consumer";
    public static final String EXTRA_ERROR = "error";
    public static final String REQUEST_TOKEN = "https://twitter.com/oauth/request_token";
    public static final String TAG = "me.grantland.twitter";
    private OAuthConsumer mConsumer;
    private DialogListener mListener;
    private int mRequestCode;

    public Twitter(String s, String s1)
    {
        mConsumer = null;
        mListener = null;
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException("You must specify your consumer key and secret when instantiating a Twitter object. See README for details.");
        } else
        {
            mConsumer = new CommonsHttpOAuthConsumer(s, s1);
            return;
        }
    }

    private boolean startTwitterActivity(Activity activity, String s, int i, DialogListener dialoglistener)
    {
        mRequestCode = i;
        mListener = dialoglistener;
        dialoglistener = new Intent(activity, me/grantland/twitter/TwitterActivity);
        dialoglistener.putExtra("consumer", mConsumer);
        dialoglistener.putExtra("params", s);
        activity.startActivityForResult(dialoglistener, 4242);
        return true;
    }

    private boolean startTwitterDialog(Activity activity, String s, final DialogListener listener)
    {
        (new TwitterDialog(activity, mConsumer, s, new DialogListener() {

            final Twitter this$0;
            private final DialogListener val$listener;

            public void onCancel()
            {
                listener.onCancel();
            }

            public void onComplete(String s1, String s2)
            {
                mConsumer.setTokenWithSecret(s1, s2);
                listener.onComplete(s1, s1);
            }

            public void onError(TwitterError twittererror)
            {
                listener.onError(twittererror);
            }

            
            {
                this$0 = Twitter.this;
                listener = dialoglistener;
                super();
            }
        })).show();
        return true;
    }

    public boolean authorize(Activity activity, DialogListener dialoglistener)
    {
        return authorize(activity, false, null, 4242, dialoglistener);
    }

    public boolean authorize(Activity activity, boolean flag, String s, int i, DialogListener dialoglistener)
    {
        String s1 = "";
        if (flag)
        {
            s1 = (new StringBuilder(String.valueOf(""))).append("?force_login=").append(flag).toString();
        }
        Object obj = s1;
        if (s != null)
        {
            obj = new StringBuilder(String.valueOf(s1));
            if (s1.length() == 0)
            {
                s1 = "&";
            } else
            {
                s1 = "?";
            }
            obj = ((StringBuilder) (obj)).append(s1).append("screen_name=").append(s).toString();
        }
        if (i > 0)
        {
            startTwitterActivity(activity, ((String) (obj)), i, dialoglistener);
        } else
        {
            startTwitterDialog(activity, ((String) (obj)), dialoglistener);
        }
        return true;
    }

    public boolean authorize(Activity activity, boolean flag, String s, DialogListener dialoglistener)
    {
        return authorize(activity, flag, s, 4242, dialoglistener);
    }

    public void authorizeCallback(int i, int j, Intent intent)
    {
        if (mRequestCode == i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        if (-1 != j)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = intent.getStringExtra("error");
        if (s != null)
        {
            mListener.onError(new TwitterError(s));
            return;
        }
        s = intent.getStringExtra("access_key");
        intent = intent.getStringExtra("access_secret");
        mConsumer.setTokenWithSecret(s, intent);
        if (mListener == null) goto _L1; else goto _L3
_L3:
        mListener.onComplete(s, intent);
        return;
        if (j != 0 || mListener == null) goto _L1; else goto _L4
_L4:
        mListener.onCancel();
        return;
    }

    public String getAccessToken()
    {
        return mConsumer.getToken();
    }

    public String getAccessTokenSecret()
    {
        return mConsumer.getTokenSecret();
    }

    public String getConsumerKey()
    {
        return mConsumer.getConsumerKey();
    }

    public String getConsumerSecret()
    {
        return mConsumer.getConsumerSecret();
    }

    public boolean isSessionValid()
    {
        return mConsumer != null && getAccessToken() != null && getAccessTokenSecret() != null;
    }

    public void setConsumerKeyAndSecret(String s, String s1)
    {
        mConsumer = new CommonsHttpOAuthConsumer(s, s1);
    }

    public void setTokenWithSecret(String s, String s1)
    {
        mConsumer.setTokenWithSecret(s, s1);
    }

}
