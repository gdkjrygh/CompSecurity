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
    final String val$resources[];

    public void invoke(List list)
        throws TwitterException
    {
        java.util.Map map = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getRateLimitStatus(val$resources);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotRateLimitStatus(map);
            }
            catch (Exception exception) { }
        }

    }

    cTask(List list, String as[])
    {
        this$0 = final_asynctwitterimpl;
        val$resources = as;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
