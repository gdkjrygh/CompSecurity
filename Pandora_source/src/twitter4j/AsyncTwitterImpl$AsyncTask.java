// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package twitter4j:
//            AsyncTwitterImpl, TwitterException, TwitterListener, TwitterMethod

abstract class listeners
    implements Runnable
{

    final List listeners;
    final TwitterMethod method;
    final AsyncTwitterImpl this$0;

    abstract void invoke(List list)
        throws TwitterException;

    public void run()
    {
        invoke(listeners);
_L1:
        return;
        TwitterException twitterexception;
        twitterexception;
        if (listeners != null)
        {
            Iterator iterator = listeners.iterator();
            while (iterator.hasNext()) 
            {
                TwitterListener twitterlistener = (TwitterListener)iterator.next();
                try
                {
                    twitterlistener.onException(twitterexception, method);
                }
                catch (Exception exception) { }
            }
        }
          goto _L1
    }

    (TwitterMethod twittermethod, List list)
    {
        this$0 = AsyncTwitterImpl.this;
        super();
        method = twittermethod;
        listeners = list;
    }
}
