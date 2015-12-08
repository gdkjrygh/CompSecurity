// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            TwitterMethod

class ncTask extends ncTask
{

    final AsyncTwitterImpl this$0;
    final InputStream val$image;
    final boolean val$tile;

    public void invoke(List list)
        throws TwitterException
    {
        User user = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).updateProfileBackgroundImage(val$image, val$tile);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.updatedProfileBackgroundImage(user);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(InputStream inputstream, boolean flag)
    {
        this$0 = final_asynctwitterimpl;
        val$image = inputstream;
        val$tile = flag;
        super(final_asynctwitterimpl, final_twittermethod, List.this);
    }
}
