// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            GeoLocation, TwitterMethod

class cTask extends cTask
{

    final AsyncTwitterImpl this$0;
    final GeoLocation val$location;

    public void invoke(List list)
        throws TwitterException
    {
        ResponseList responselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getClosestTrends(val$location);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotClosestTrends(responselist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(List list, GeoLocation geolocation)
    {
        this$0 = final_asynctwitterimpl;
        val$location = geolocation;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
