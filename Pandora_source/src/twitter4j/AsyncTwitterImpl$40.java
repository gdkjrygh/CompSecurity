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
    final boolean val$follow;
    final long val$userId;

    public void invoke(List list)
        throws TwitterException
    {
        User user = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).createFriendship(val$userId, val$follow);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.createdFriendship(user);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(long l, boolean flag)
    {
        this$0 = final_asynctwitterimpl;
        val$userId = l;
        val$follow = flag;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
