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
    final boolean val$enableDeviceNotification;
    final boolean val$retweet;
    final long val$userId;

    public void invoke(List list)
        throws TwitterException
    {
        Relationship relationship = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).updateFriendship(val$userId, val$enableDeviceNotification, val$retweet);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.updatedFriendship(relationship);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(boolean flag, boolean flag1)
    {
        this$0 = final_asynctwitterimpl;
        val$userId = J.this;
        val$enableDeviceNotification = flag;
        val$retweet = flag1;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
