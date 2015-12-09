// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onKidsCharacterDetailsFetched(final com.netflix.mediaclient.servicemgr.KidsCharacterDetails useNewData, Boolean boolean1, final int statusCode)
    {
        final KidsCharacterDetails mergedDetails = BrowseAgent.getKidsCharacterDetailsFromCache(haracterId, BrowseAgent.access$600(_fld0), BrowseAgent.access$700(_fld0));
        if (mergedDetails == null)
        {
            Log.w("nf_service_browseagent", (new StringBuilder()).append("Cached character details are null, can't refresh - charId: ").append(haracterId).toString());
            return;
        }
        KidsCharacterDetails kidscharacterdetails = (KidsCharacterDetails)useNewData;
        useNewData = BrowseAgent.access$2000(_fld0, mergedDetails, useNewData);
        if (boolean1.booleanValue() && mergedDetails != null)
        {
            mergedDetails.updateWatchNext(kidscharacterdetails);
        }
        BrowseAgent.access$2100(_fld0).post(new Runnable() {

            final BrowseAgent.RefreshKidsCharacterDetailsTask._cls1 this$2;
            final com.netflix.mediaclient.servicemgr.KidsCharacterDetails val$mergedDetails;
            final int val$statusCode;
            final Boolean val$useNewData;

            public void run()
            {
                getCallback().onKidsCharacterDetailsFetched(mergedDetails, useNewData, statusCode);
            }

            
            {
                this$2 = BrowseAgent.RefreshKidsCharacterDetailsTask._cls1.this;
                mergedDetails = kidscharacterdetails;
                useNewData = boolean1;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
