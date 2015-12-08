// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;
import twitter4j.auth.RequestToken;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class cTask extends cTask
{

    final AsyncTwitterImpl this$0;
    final String val$oauthVerifier;
    final RequestToken val$requestToken;

    public void invoke(List list)
        throws TwitterException
    {
        twitter4j.auth.AccessToken accesstoken = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getOAuthAccessToken(val$requestToken, val$oauthVerifier);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotOAuthAccessToken(accesstoken);
            }
            catch (Exception exception) { }
        }

    }

    cTask(RequestToken requesttoken, String s)
    {
        this$0 = final_asynctwitterimpl;
        val$requestToken = requesttoken;
        val$oauthVerifier = s;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
