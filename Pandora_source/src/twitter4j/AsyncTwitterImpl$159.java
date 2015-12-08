// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class cTask extends cTask
{

    final AsyncTwitterImpl this$0;
    final String val$password;
    final String val$screenName;

    public void invoke(List list)
        throws TwitterException
    {
        twitter4j.auth.AccessToken accesstoken = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getOAuthAccessToken(val$screenName, val$password);
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

    cTask(String s, String s1)
    {
        this$0 = final_asynctwitterimpl;
        val$screenName = s;
        val$password = s1;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
