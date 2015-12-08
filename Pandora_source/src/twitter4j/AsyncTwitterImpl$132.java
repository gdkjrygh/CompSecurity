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
    final String val$listOwnerScreenName;

    public void invoke(List list)
        throws TwitterException
    {
        PagableResponseList pagableresponselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getUserListSubscriptions(val$listOwnerScreenName, val$cursor);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotUserListSubscriptions(pagableresponselist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(String s, long l)
    {
        this$0 = final_asynctwitterimpl;
        val$listOwnerScreenName = s;
        val$cursor = l;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
