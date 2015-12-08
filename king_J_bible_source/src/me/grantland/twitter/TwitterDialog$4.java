// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.exception.OAuthException;

// Referenced classes of package me.grantland.twitter:
//            TwitterDialog

class val.uri extends Thread
{

    final TwitterDialog this$0;
    private final Uri val$uri;

    public void run()
    {
        Message message = new Message();
        Bundle bundle = new Bundle();
        try
        {
            String s = val$uri.getQueryParameter("oauth_token");
            String s1 = val$uri.getQueryParameter("oauth_verifier");
            TwitterDialog.access$8(TwitterDialog.this).setTokenWithSecret(s, TwitterDialog.access$8(TwitterDialog.this).getConsumerSecret());
            TwitterDialog.access$7(TwitterDialog.this).retrieveAccessToken(TwitterDialog.access$8(TwitterDialog.this), s1);
            message.what = 2;
            bundle.putString("access_token", TwitterDialog.access$8(TwitterDialog.this).getToken());
            bundle.putString("access_secret", TwitterDialog.access$8(TwitterDialog.this).getTokenSecret());
        }
        catch (OAuthException oauthexception)
        {
            message.what = -1;
            bundle.putSerializable("error", oauthexception);
        }
        message.setData(bundle);
        TwitterDialog.access$9(TwitterDialog.this).sendMessage(message);
    }

    on()
    {
        this$0 = final_twitterdialog;
        val$uri = Uri.this;
        super();
    }
}
