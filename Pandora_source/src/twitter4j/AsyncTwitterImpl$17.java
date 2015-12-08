// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, Twitter, TwitterListener, 
//            OEmbedRequest, TwitterMethod

class ncTask extends ncTask
{

    final AsyncTwitterImpl this$0;
    final OEmbedRequest val$req;

    public void invoke(List list)
        throws TwitterException
    {
        OEmbed oembed = AsyncTwitterImpl.access$000(AsyncTwitterImpl.this).getOEmbed(val$req);
        for (list = list.iterator(); list.hasNext();)
        {
            TwitterListener twitterlistener = (TwitterListener)list.next();
            try
            {
                twitterlistener.gotOEmbed(oembed);
            }
            catch (Exception exception) { }
        }

    }

    ncTask(List list, OEmbedRequest oembedrequest)
    {
        this$0 = final_asynctwitterimpl;
        val$req = oembedrequest;
        super(final_asynctwitterimpl, TwitterMethod.this, list);
    }
}
