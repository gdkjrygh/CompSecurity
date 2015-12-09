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
    final int val$page;
    final String val$query;

    public void invoke(List list)
        throws TwitterException
    {
        ResponseList responselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).searchUsers(val$query, val$page);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.searchedUser(responselist);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(String s, int i)
    {
        this$0 = final_asynctwitterimpl;
        val$query = s;
        val$page = i;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
