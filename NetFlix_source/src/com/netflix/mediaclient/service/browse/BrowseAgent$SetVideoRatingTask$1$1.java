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
        allback().onVideoRatingSet(val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$SetVideoRatingTask$1

/* anonymous class */
    class BrowseAgent.SetVideoRatingTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.SetVideoRatingTask this$1;

        public void onVideoRatingSet(int i)
        {
            BrowseAgent.access$3300(this$0).post(i. new BrowseAgent.SetVideoRatingTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.SetVideoRatingTask.this;
                super();
            }
    }

}
