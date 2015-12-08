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
    final String val$containedWithin;
    final GeoLocation val$location;
    final String val$name;
    final String val$streetAddress;

    public void invoke(List list)
        throws TwitterException
    {
        ResponseList responselist = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getSimilarPlaces(val$location, val$name, val$containedWithin, val$streetAddress);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotSimilarPlaces(responselist);
            }
            catch (Exception exception) { }
        }

    }

    cTask(String s1, String s2)
    {
        this$0 = final_asynctwitterimpl;
        val$location = geolocation;
        val$name = String.this;
        val$containedWithin = s1;
        val$streetAddress = s2;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
