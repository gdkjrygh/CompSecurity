// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class mCharacterId extends mCharacterId
{

    String mCharacterId;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchKidsCharacterDetailsTask this$1;

        public void onKidsCharacterDetailsFetched(final KidsCharacterDetails kidsCharacterDetails, final Boolean dataChanged, int i)
        {
            updateCacheIfNecessary(kidsCharacterDetails, i);
            BrowseAgent.access$1900(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final Boolean val$dataChanged;
                final KidsCharacterDetails val$kidsCharacterDetails;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onKidsCharacterDetailsFetched(kidsCharacterDetails, dataChanged, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                kidsCharacterDetails = kidscharacterdetails;
                dataChanged = boolean1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchKidsCharacterDetailsTask.this;
                super();
            }
    };

    public void run()
    {
        if ((KidsCharacterDetails)getCachedValue() == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchKidsCharacterDetails(getCategory(), webClientCallback);
            return;
        } else
        {
            refreshKidsCharacterDetail(mCharacterId, webClientCallback);
            return;
        }
    }

    public _cls1.this._cls1(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
        mCharacterId = s;
    }
}
