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
    final String val$end_sleepTime;
    final String val$lang;
    final Boolean val$sleep_timeEnabled;
    final String val$start_sleepTime;
    final String val$time_zone;
    final Integer val$trend_locationWoeid;

    public void invoke(List list)
        throws TwitterException
    {
        AccountSettings accountsettings = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).updateAccountSettings(val$trend_locationWoeid, val$sleep_timeEnabled, val$start_sleepTime, val$end_sleepTime, val$time_zone, val$lang);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.updatedAccountSettings(accountsettings);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(String s2, String s3)
    {
        this$0 = final_asynctwitterimpl;
        val$trend_locationWoeid = integer;
        val$sleep_timeEnabled = boolean1;
        val$start_sleepTime = s;
        val$end_sleepTime = String.this;
        val$time_zone = s2;
        val$lang = s3;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
