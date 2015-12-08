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
    final long val$listId;
    final long val$userId;

    public void invoke(List list)
        throws TwitterException
    {
        UserList userlist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).destroyUserListMember(val$listId, val$userId);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.destroyedUserListMember(userlist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(long l, long l1)
    {
        this$0 = final_asynctwitterimpl;
        val$listId = l;
        val$userId = l1;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
