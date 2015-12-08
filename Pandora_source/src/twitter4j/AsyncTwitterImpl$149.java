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

    public void invoke(List list)
        throws TwitterException
    {
        String s = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getTermsOfService();
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotTermsOfService(s);
            }
            catch (Exception exception) { }
        }

    }

    cTask(TwitterMethod twittermethod, List list)
    {
        this$0 = AsyncTwitterImpl.this;
        super(AsyncTwitterImpl.this, twittermethod, list);
    }
}
