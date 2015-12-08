// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final KidsCharacterDetails val$mergedDetails;
    final int val$statusCode;
    final Boolean val$useNewData;

    public void run()
    {
        allback().onKidsCharacterDetailsFetched(val$mergedDetails, val$useNewData, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$mergedDetails = kidscharacterdetails;
        val$useNewData = boolean1;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$RefreshKidsCharacterDetailsTask$1

/* anonymous class */
    class BrowseAgent.RefreshKidsCharacterDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.RefreshKidsCharacterDetailsTask this$1;

        public void onKidsCharacterDetailsFetched(final KidsCharacterDetails useNewData, Boolean boolean1, int i)
        {
            final com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails mergedDetails = BrowseAgent.getKidsCharacterDetailsFromCache(mCharacterId, BrowseAgent.access$600(this$0), BrowseAgent.access$700(this$0));
            if (mergedDetails == null)
            {
                Log.w("nf_service_browseagent", (new StringBuilder()).append("Cached character details are null, can't refresh - charId: ").append(mCharacterId).toString());
                return;
            }
            com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails kidscharacterdetails = (com.netflix.mediaclient.service.webclient.model.KidsCharacterDetails)useNewData;
            useNewData = BrowseAgent.access$2000(this$0, mergedDetails, useNewData);
            if (boolean1.booleanValue() && mergedDetails != null)
            {
                mergedDetails.updateWatchNext(kidscharacterdetails);
            }
            BrowseAgent.access$2100(this$0).post(i. new BrowseAgent.RefreshKidsCharacterDetailsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.RefreshKidsCharacterDetailsTask.this;
                super();
            }
    }

}
