// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            Query, TwitterMethod

class ncTask extends ncTask
{

    final AsyncTwitterImpl this$0;
    final Query val$query;

    public void invoke(List list)
        throws TwitterException
    {
        QueryResult queryresult = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).search(val$query);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.searched(queryresult);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(List list, Query query1)
    {
        this$0 = final_asynctwitterimpl;
        val$query = query1;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
