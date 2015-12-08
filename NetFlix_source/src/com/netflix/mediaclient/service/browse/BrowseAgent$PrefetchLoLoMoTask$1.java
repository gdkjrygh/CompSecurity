// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onLoLoMoPrefetched(final int statusCode)
    {
        if (ncludeBoxshots)
        {
            throw new RuntimeException("Unimplemented exception");
        } else
        {
            BrowseAgent.access$100(_fld0).post(new Runnable() {

                final BrowseAgent.PrefetchLoLoMoTask._cls1 this$2;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onLoLoMoPrefetched(statusCode);
                }

            
            {
                this$2 = BrowseAgent.PrefetchLoLoMoTask._cls1.this;
                statusCode = i;
                super();
            }
            });
            return;
        }
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
