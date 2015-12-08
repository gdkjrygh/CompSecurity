// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class mCharacterId extends mCharacterId
{

    String mCharacterId;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.RefreshKidsCharacterDetailsTask this$1;

        public void onKidsCharacterDetailsFetched(final com.netflix.mediaclient.servicemgr.KidsCharacterDetails useNewData, Boolean boolean1, int i)
        {
            final KidsCharacterDetails mergedDetails = BrowseAgent.getKidsCharacterDetailsFromCache(mCharacterId, BrowseAgent.access$600(this$0), BrowseAgent.access$700(this$0));
            if (mergedDetails == null)
            {
                Log.w("nf_service_browseagent", (new StringBuilder()).append("Cached character details are null, can't refresh - charId: ").append(mCharacterId).toString());
                return;
            }
            KidsCharacterDetails kidscharacterdetails = (KidsCharacterDetails)useNewData;
            useNewData = BrowseAgent.access$2000(this$0, mergedDetails, useNewData);
            if (boolean1.booleanValue() && mergedDetails != null)
            {
                mergedDetails.updateWatchNext(kidscharacterdetails);
            }
            BrowseAgent.access$2100(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final com.netflix.mediaclient.servicemgr.KidsCharacterDetails val$mergedDetails;
                final int val$statusCode;
                final Boolean val$useNewData;

                public void run()
                {
                    getCallback().onKidsCharacterDetailsFetched(mergedDetails, useNewData, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                mergedDetails = kidscharacterdetails;
                useNewData = boolean1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.RefreshKidsCharacterDetailsTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).refreshKidsCharacterDetils(getCategory(), webClientCallback);
    }

    public _cls1.this._cls1(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(s, 0, 0, browseagentcallback);
        mCharacterId = s;
    }
}
