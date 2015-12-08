// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.net.Uri;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.exception.OAuthException;

// Referenced classes of package me.grantland.twitter:
//            TwitterActivity

class val.uri extends Thread
{

    final TwitterActivity this$0;
    private final Uri val$uri;

    public void run()
    {
        try
        {
            String s = val$uri.getQueryParameter("oauth_token");
            String s1 = val$uri.getQueryParameter("oauth_verifier");
            TwitterActivity.access$6(TwitterActivity.this).setTokenWithSecret(s, TwitterActivity.access$6(TwitterActivity.this).getConsumerSecret());
            TwitterActivity.access$5(TwitterActivity.this).retrieveAccessToken(TwitterActivity.access$6(TwitterActivity.this), s1);
            TwitterActivity.access$8(TwitterActivity.this, TwitterActivity.access$6(TwitterActivity.this).getToken(), TwitterActivity.access$6(TwitterActivity.this).getTokenSecret());
            return;
        }
        catch (OAuthException oauthexception)
        {
            TwitterActivity.access$4(TwitterActivity.this, oauthexception);
        }
    }

    ()
    {
        this$0 = final_twitteractivity;
        val$uri = Uri.this;
        super();
    }
}
