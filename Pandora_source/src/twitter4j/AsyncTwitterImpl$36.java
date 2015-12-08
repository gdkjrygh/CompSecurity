// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class ncTask extends ncTask
{

    final AsyncTwitterImpl this$0;
    final long val$cursor;

    public void invoke(List list)
        throws TwitterException
    {
        IDs ids = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getIncomingFriendships(val$cursor);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotIncomingFriendships(ids);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(List list, long l)
    {
        this$0 = final_asynctwitterimpl;
        val$cursor = l;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
