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
    final String val$callbackURL;
    final String val$xAuthAccessType;

    public void invoke(List list)
        throws TwitterException
    {
        twitter4j.auth.RequestToken requesttoken = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getOAuthRequestToken(val$callbackURL, val$xAuthAccessType);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotOAuthRequestToken(requesttoken);
            }
            catch (Exception exception) { }
        }

    }

    cTask(String s, String s1)
    {
        this$0 = final_asynctwitterimpl;
        val$callbackURL = s;
        val$xAuthAccessType = s1;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
