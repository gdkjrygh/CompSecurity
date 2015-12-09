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
    final long val$cursor;
    final long val$listId;

    public void invoke(List list)
        throws TwitterException
    {
        PagableResponseList pagableresponselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getUserListMembers(val$listId, val$cursor);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotUserListMembers(pagableresponselist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(long l, long l1)
    {
        this$0 = final_asynctwitterimpl;
        val$listId = l;
        val$cursor = l1;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
