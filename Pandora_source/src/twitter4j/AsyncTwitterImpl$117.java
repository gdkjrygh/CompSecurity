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
    final String val$screenNames[];

    public void invoke(List list)
        throws TwitterException
    {
        UserList userlist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).createUserListMembers(val$listId, val$screenNames);
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

    cTask(long l, String as[])
    {
        this$0 = final_asynctwitterimpl;
        val$listId = l;
        val$screenNames = as;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
