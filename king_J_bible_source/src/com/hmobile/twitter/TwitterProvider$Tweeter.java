// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.hmobile.twitter:
//            TwitterProvider

public class onsumer.setTokenWithSecret
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

    public onsumer(String s, String s1)
    {
        this$0 = TwitterProvider.this;
        super();
        oAuthConsumer = new CommonsHttpOAuthConsumer(TwitterProvider.TWITTER_CONSUMER_KEY, TwitterProvider.TWITTER_CONSUMER_SECRET);
        oAuthConsumer.setTokenWithSecret(s, s1);
    }
}
