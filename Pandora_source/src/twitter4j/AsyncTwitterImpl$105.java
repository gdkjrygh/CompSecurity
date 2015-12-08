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
    final boolean val$filterToOwnedLists;
    final String val$listMemberScreenName;

    public void invoke(List list)
        throws TwitterException
    {
        PagableResponseList pagableresponselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getUserListMemberships(val$listMemberScreenName, val$cursor, val$filterToOwnedLists);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotUserListMemberships(pagableresponselist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(long l, boolean flag)
    {
        this$0 = final_asynctwitterimpl;
        val$listMemberScreenName = String.this;
        val$cursor = l;
        val$filterToOwnedLists = flag;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
