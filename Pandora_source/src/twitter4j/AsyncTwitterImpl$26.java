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
    final String val$text;
    final long val$userId;

    public void invoke(List list)
        throws TwitterException
    {
        DirectMessage directmessage = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).sendDirectMessage(val$userId, val$text);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.sentDirectMessage(directmessage);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(long l, String s)
    {
        this$0 = final_asynctwitterimpl;
        val$userId = l;
        val$text = s;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
