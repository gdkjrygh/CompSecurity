// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final Boolean val$dataChanged;
    final KidsCharacterDetails val$kidsCharacterDetails;
    final int val$statusCode;

    public void run()
    {
        allback().onKidsCharacterDetailsFetched(val$kidsCharacterDetails, val$dataChanged, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$kidsCharacterDetails = kidscharacterdetails;
        val$dataChanged = boolean1;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchKidsCharacterDetailsTask$1

/* anonymous class */
    class BrowseAgent.FetchKidsCharacterDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchKidsCharacterDetailsTask this$1;

        public void onKidsCharacterDetailsFetched(final KidsCharacterDetails kidsCharacterDetails, final Boolean dataChanged, int i)
        {
            updateCacheIfNecessary(kidsCharacterDetails, i);
            BrowseAgent.access$1900(this$0).post(i. new BrowseAgent.FetchKidsCharacterDetailsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchKidsCharacterDetailsTask.this;
                super();
            }
    }

}
