// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class mIncludeBoxshots extends mIncludeBoxshots
{

    final int mFromLoMo;
    final boolean mIncludeBoxshots;
    final int mToLoMo;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.PrefetchGenreLoLoMoTask this$1;

        public void onGenreLoLoMoPrefetched(int i1)
        {
            if (mIncludeBoxshots)
            {
                throw new RuntimeException("Unimplemented exception");
            } else
            {
                BrowseAgent.access$200(this$0).post(i1. new Runnable() {

                    final _cls1 this$2;
                    final int val$statusCode;

                    public void run()
                    {
                        getCallback().onGenreLoLoMoPrefetched(statusCode);
                    }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
                });
                return;
            }
        }

            
            {
                this$1 = BrowseAgent.PrefetchGenreLoLoMoTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).prefetchGenreLoLoMo(getCategory(), mFromLoMo, mToLoMo, getFromIndex(), getToIndex(), webClientCallback);
    }

    public _cls1.this._cls1(String s, int i, int j, int k, int l, boolean flag, 
            BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(s, k, l, browseagentcallback);
        mFromLoMo = i;
        mToLoMo = j;
        mIncludeBoxshots = flag;
    }
}
