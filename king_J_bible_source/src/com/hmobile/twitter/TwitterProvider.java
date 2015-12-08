// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.regex.Pattern;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.hmobile.twitter:
//            BaseProvider, Twitter, SocialException, TwDialog, 
//            DialogError, TwitterError

public class TwitterProvider extends BaseProvider
{
    public class Tweeter
    {

        protected CommonsHttpOAuthConsumer oAuthConsumer;
        final TwitterProvider this$0;

        public boolean tweet(String s)
        {
            if (s == null && s.length() > 140)
            {
                throw new IllegalArgumentException("message cannot be null and must be less than 140 chars");
            }
            Object obj;
            obj = new DefaultHttpClient();
            String s1 = TwitterProvider.TWITTER_POST_MESSAGE_URL;
            HttpPost httppost = new HttpPost(s1);
            LinkedList linkedlist = new LinkedList();
            linkedlist.add(new BasicNameValuePair("status", s));
            linkedlist.add(new BasicNameValuePair("wrap_links", "true"));
            httppost.setEntity(new UrlEncodedFormEntity(linkedlist, "UTF-8"));
            Log.i("TWITTER", (new StringBuilder("Requesting URL : ")).append(s1).toString());
            oAuthConsumer.sign(httppost);
            s = ((DefaultHttpClient) (obj)).execute(httppost);
            Log.i("TWITTER", (new StringBuilder("Statusline : ")).append(s.getStatusLine()).toString());
            s = new BufferedReader(new InputStreamReader(s.getEntity().getContent()));
            obj = new StringBuilder();
_L1:
            String s2 = s.readLine();
            if (s2 == null)
            {
                try
                {
                    Log.i("TWITTER", (new StringBuilder("Response : ")).append(((StringBuilder) (obj)).toString()).toString());
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.i("TWITTER", (new StringBuilder()).append(s).toString());
                    return false;
                }
                return true;
            }
            ((StringBuilder) (obj)).append(s2);
              goto _L1
        }

        public void upload(String s, boolean flag)
            throws Exception
        {
            if (!flag)
            {
                tweet(s);
            }
        }

        public Tweeter(String s, String s1)
        {
            this$0 = TwitterProvider.this;
            super();
            oAuthConsumer = new CommonsHttpOAuthConsumer(TwitterProvider.TWITTER_CONSUMER_KEY, TwitterProvider.TWITTER_CONSUMER_SECRET);
            oAuthConsumer.setTokenWithSecret(s, s1);
        }
    }


    public static String CALL_BACK_URL = "twitter-oauth://callback";
    public static final Pattern ID_PATTERN = Pattern.compile(".*?\"id_str\":\"(\\d*)\".*");
    public static final Pattern SCREEN_NAME_PATTERN = Pattern.compile(".*?\"screen_name\":\"([^\"]*).*");
    public static String TWITPIC_API_KEY = "";
    public static String TWITTER_CONSUMER_KEY = "";
    public static String TWITTER_CONSUMER_SECRET = "";
    public static final String TWITTER_OAUTH_ACCESS_TOKEN_ENDPOINT = "http://twitter.com/oauth/access_token";
    public static final String TWITTER_OAUTH_AUTHORIZE_ENDPOINT = "http://twitter.com/oauth/authorize";
    public static final String TWITTER_OAUTH_REQUEST_TOKEN_ENDPOINT = "http://twitter.com/oauth/request_token";
    public static String TWITTER_POST_MESSAGE_URL = "http://twitter.com/statuses/update.json";
    private static volatile TwitterProvider _instance;
    String accessToken;
    private CommonsHttpOAuthConsumer commonsHttpOAuthConsumer;
    private CommonsHttpOAuthProvider commonsHttpOAuthProvider;
    private Twitter.DialogListener dialogListener;
    Context m_context;
    public Drawable m_drawable;
    BaseProvider.TwitterCallbacks m_listner;
    String secretToken;
    Tweeter tweet;
    Twitter twitter;

    public TwitterProvider()
    {
        m_drawable = null;
        twitter = new Twitter(m_drawable);
        dialogListener = new Twitter.DialogListener() {

            final TwitterProvider this$0;

            public void onCancel()
            {
                Log.e("Twitter", "onCancel");
                m_listner.TwitterPostedSuccessfully();
            }

            public void onComplete(Bundle bundle)
            {
                secretToken = bundle.getString("secret_token");
                accessToken = bundle.getString("access_token");
                tweet = new Tweeter(accessToken, secretToken);
                m_listner.TwitterLogedIn();
            }

            public void onError(DialogError dialogerror)
            {
                Log.e("Twitter", "onError called for TwitterDialog", new Exception(dialogerror));
            }

            public void onTwitterError(TwitterError twittererror)
            {
                Log.e("Twitter", "onTwitterError called for TwitterDialog", new Exception(twittererror));
            }

            
            {
                this$0 = TwitterProvider.this;
                super();
            }
        };
    }

    public TwitterProvider Instance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        com/hmobile/twitter/TwitterProvider;
        JVM INSTR monitorenter ;
        if (_instance == null)
        {
            _instance = new TwitterProvider();
        }
        com/hmobile/twitter/TwitterProvider;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        com/hmobile/twitter/TwitterProvider;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isLoggedIn()
    {
        return false;
    }

    public void login()
        throws SocialException
    {
        if (m_context == null)
        {
            throw new SocialException(SocialException.SocialExceptionType.ContextNotSet);
        }
        if (TWITTER_CONSUMER_KEY.length() <= 0)
        {
            throw new SocialException(SocialException.SocialExceptionType.ConsumerDataNotSet);
        }
        if (TWITTER_CONSUMER_SECRET.length() <= 0)
        {
            throw new SocialException(SocialException.SocialExceptionType.ConsumerDataNotSet);
        }
        if (TWITPIC_API_KEY.length() <= 0)
        {
            throw new SocialException(SocialException.SocialExceptionType.ConsumerDataNotSet);
        } else
        {
            commonsHttpOAuthProvider = new CommonsHttpOAuthProvider("http://twitter.com/oauth/request_token", "http://twitter.com/oauth/access_token", "http://twitter.com/oauth/authorize");
            commonsHttpOAuthConsumer = new CommonsHttpOAuthConsumer(TWITTER_CONSUMER_KEY, TWITTER_CONSUMER_SECRET);
            commonsHttpOAuthProvider.setOAuth10a(true);
            (new TwDialog(m_context, commonsHttpOAuthProvider, commonsHttpOAuthConsumer, dialogListener, m_drawable)).show();
            return;
        }
    }

    public void logout()
    {
        try
        {
            twitter.logout(m_context);
            return;
        }
        catch (MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void post(String s)
    {
        try
        {
            tweet.upload(s, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void postImage(String s, String s1)
    {
        try
        {
            tweet.upload(s1, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
    }

    public void setConsumerData(String s, String s1, String s2)
    {
        TWITTER_CONSUMER_KEY = s;
        TWITTER_CONSUMER_SECRET = s1;
        TWITPIC_API_KEY = s2;
    }

    public void setContext(Context context)
    {
        m_context = context;
    }

    public void setIcon(Drawable drawable)
    {
        m_drawable = drawable;
    }

    public void setTwitterProviderListener(BaseProvider.TwitterCallbacks twittercallbacks)
    {
        m_listner = twittercallbacks;
    }

}
