// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.os.AsyncTask;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class Tweeter
{
    public class SendTwit extends AsyncTask
    {

        TwitterUploadDelegate del;
        String msg;
        final Tweeter this$0;

        protected transient Boolean doInBackground(Void avoid[])
        {
            return Boolean.valueOf(tweet(msg));
        }

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            super.onPostExecute(boolean1);
            if (boolean1.booleanValue())
            {
                if (del != null)
                {
                    del.UploadSuccessFully();
                }
            } else
            if (del != null)
            {
                del.UploadFailed();
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        public SendTwit(String s, TwitterUploadDelegate twitteruploaddelegate)
        {
            this$0 = Tweeter.this;
            super();
            msg = "";
            msg = s;
            del = twitteruploaddelegate;
        }
    }

    public static interface TwitterUploadDelegate
    {

        public abstract void UploadFailed();

        public abstract void UploadSuccessFully();
    }


    protected OAuthConsumer oAuthConsumer;

    public Tweeter(String s, String s1, String s2, String s3)
    {
        oAuthConsumer = new CommonsHttpOAuthConsumer(s2, s3);
        oAuthConsumer.setTokenWithSecret(s, s1);
    }

    public boolean tweet(String s)
    {
        if (s == null && s.length() > 10)
        {
            throw new IllegalArgumentException("message cannot be null and must be less than 10 chars");
        }
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost("https://api.twitter.com/1/statuses/update.json");
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(new BasicNameValuePair("status", s));
        linkedlist.add(new BasicNameValuePair("wrap_links", "true"));
        httppost.setEntity(new UrlEncodedFormEntity(linkedlist, "UTF-8"));
        Log.i("TWITTER", (new StringBuilder("Requesting URL : ")).append("https://api.twitter.com/1/statuses/update.json").toString());
        oAuthConsumer.sign(httppost);
        s = defaulthttpclient.execute(httppost);
        StringBuilder stringbuilder;
        String s1;
        boolean flag;
        if (s.getStatusLine().getStatusCode() == 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i("TWITTER", (new StringBuilder("Statusline : ")).append(s.getStatusLine()).toString());
        s = new BufferedReader(new InputStreamReader(s.getEntity().getContent()));
        stringbuilder = new StringBuilder();
_L1:
        s1 = s.readLine();
        if (s1 == null)
        {
            try
            {
                Log.i("TWITTER", (new StringBuilder("Response : ")).append(stringbuilder.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.i("TWITTER", (new StringBuilder()).append(s).toString());
                return false;
            }
            return flag;
        }
        stringbuilder.append(s1);
          goto _L1
    }

    public void upload(String s, boolean flag, TwitterUploadDelegate twitteruploaddelegate)
        throws Exception
    {
        if (!flag)
        {
            (new SendTwit(s, twitteruploaddelegate)).execute(new Void[0]);
        }
    }
}
