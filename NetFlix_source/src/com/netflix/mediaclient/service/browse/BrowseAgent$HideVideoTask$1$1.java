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
        allback().onVideoHide(val$statusCode);
    }

    t>()
    {
        this$2 = final_t>;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$HideVideoTask$1

/* anonymous class */
    class BrowseAgent.HideVideoTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.HideVideoTask this$1;

        public void onVideoHide(int i)
        {
            BrowseAgent.access$4500(this$0).post(i. new BrowseAgent.HideVideoTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.HideVideoTask.this;
                super();
            }
    }

}
