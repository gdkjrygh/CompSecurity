// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final int val$statusCode;

    public void run()
    {
        allback().onGenreLoLoMoPrefetched(val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$PrefetchGenreLoLoMoTask$1

/* anonymous class */
    class BrowseAgent.PrefetchGenreLoLoMoTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.PrefetchGenreLoLoMoTask this$1;

        public void onGenreLoLoMoPrefetched(int i)
        {
            if (mIncludeBoxshots)
            {
                throw new RuntimeException("Unimplemented exception");
            } else
            {
                BrowseAgent.access$200(this$0).post(i. new BrowseAgent.PrefetchGenreLoLoMoTask._cls1._cls1());
                return;
            }
        }

            
            {
                this$1 = BrowseAgent.PrefetchGenreLoLoMoTask.this;
                super();
            }
    }

}
