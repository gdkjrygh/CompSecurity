// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class t> extends t>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.RefreshCWTask this$1;

        public void onCWListRefresh(int i)
        {
            BrowseAgent.access$5000(this$0);
        }

            
            {
                this$1 = BrowseAgent.RefreshCWTask.this;
                super();
            }
    };

    public void run()
    {
        if (BrowseAgent.access$4800(BrowseAgent.this, BrowseAgent.access$600(BrowseAgent.this)) && BrowseAgent.access$4900(BrowseAgent.this, BrowseAgent.access$600(BrowseAgent.this)))
        {
            BrowseAgent.access$000(BrowseAgent.this).refreshCWList(getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            Log.d("nf_service_browseagent", "Cache has no CW item so doing nothing for CW refresh");
            return;
        }
    }

    public <init>()
    {
        this$0 = BrowseAgent.this;
        super("refreshCW", BrowseAgent.access$4600(), BrowseAgent.access$4700(), null);
    }
}
