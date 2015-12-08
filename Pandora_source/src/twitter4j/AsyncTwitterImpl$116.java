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
    final long val$ownerId;
    final String val$slug;
    final long val$userIds[];

    public void invoke(List list)
        throws TwitterException
    {
        UserList userlist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).createUserListMembers(val$ownerId, val$slug, val$userIds);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.createdUserListMembers(userlist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(String s, long al[])
    {
        this$0 = final_asynctwitterimpl;
        val$ownerId = J.this;
        val$slug = s;
        val$userIds = al;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
