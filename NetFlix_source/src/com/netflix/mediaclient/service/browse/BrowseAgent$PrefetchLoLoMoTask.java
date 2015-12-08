// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class mIncludeExtraCharacters extends mIncludeExtraCharacters
{

    final int mFromCWVideo;
    final int mFromLoMo;
    final boolean mIncludeBoxshots;
    final boolean mIncludeExtraCharacters;
    final int mToCWVideo;
    final int mToLoMo;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.PrefetchLoLoMoTask this$1;

        public void onLoLoMoPrefetched(int k1)
        {
            if (mIncludeBoxshots)
            {
                throw new RuntimeException("Unimplemented exception");
            } else
            {
                BrowseAgent.access$100(this$0).post(k1. new Runnable() {

                    final _cls1 this$2;
                    final int val$statusCode;

                    public void run()
                    {
                        getCallback().onLoLoMoPrefetched(statusCode);
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
                this$1 = BrowseAgent.PrefetchLoLoMoTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).prefetchLoLoMo(getCategory(), mFromLoMo, mToLoMo, getFromIndex(), getToIndex(), mFromCWVideo, mToCWVideo, mIncludeExtraCharacters, webClientCallback);
    }

    public >(int i, int j, int k, int l, int i1, int j1, 
            boolean flag, boolean flag1, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super("lolomo", k, l, browseagentcallback);
        mFromLoMo = i;
        mToLoMo = j;
        mFromCWVideo = i1;
        mToCWVideo = j1;
        mIncludeBoxshots = flag1;
        mIncludeExtraCharacters = flag;
    }
}
