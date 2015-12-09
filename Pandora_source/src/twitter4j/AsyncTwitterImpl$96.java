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
    final long val$id;

    public void invoke(List list)
        throws TwitterException
    {
        Status status = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).destroyFavorite(val$id);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.destroyedFavorite(status);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(List list, long l)
    {
        this$0 = final_asynctwitterimpl;
        val$id = l;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
