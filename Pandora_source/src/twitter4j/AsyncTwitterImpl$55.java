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
    final String val$description;
    final String val$location;
    final String val$name;
    final String val$url;

    public void invoke(List list)
        throws TwitterException
    {
        User user = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).updateProfile(val$name, val$url, val$location, val$description);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.updatedProfile(user);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(String s2, String s3)
    {
        this$0 = final_asynctwitterimpl;
        val$name = s;
        val$url = String.this;
        val$location = s2;
        val$description = s3;
        super(final_asynctwitterimpl, final_twittermethod, final_list);
    }
}
