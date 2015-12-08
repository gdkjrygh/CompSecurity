// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class t> extends t>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.HideVideoTask this$1;

        public void onVideoHide(int i)
        {
            BrowseAgent.access$4500(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onVideoHide(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.HideVideoTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).hideVideo(getCategory(), webClientCallback);
    }

    public <init>(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(s, 0, 0, browseagentcallback);
    }
}
