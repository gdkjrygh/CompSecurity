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
    final long val$sourceId;
    final long val$targetId;

    public void invoke(List list)
        throws TwitterException
    {
        Relationship relationship = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).showFriendship(val$sourceId, val$targetId);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotShowFriendship(relationship);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(long l, long l1)
    {
        this$0 = final_asynctwitterimpl;
        val$sourceId = l;
        val$targetId = l1;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
