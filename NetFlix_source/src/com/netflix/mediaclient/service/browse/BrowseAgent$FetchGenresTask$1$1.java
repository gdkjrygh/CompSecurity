// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final List val$requestedGenres;
    final int val$statusCode;

    public void run()
    {
        allback().onGenresFetched(val$requestedGenres, val$statusCode);
    }

    ()
    {
        this$2 = final_;
        val$requestedGenres = list;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenresTask$1

/* anonymous class */
    class BrowseAgent.FetchGenresTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchGenresTask this$1;

        public void onGenresFetched(final List requestedGenres, int i)
        {
            updateCacheIfNecessary(requestedGenres, i);
            BrowseAgent.access$5100(this$0).post(i. new BrowseAgent.FetchGenresTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchGenresTask.this;
                super();
            }
    }

}
