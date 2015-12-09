// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onKidsCharacterDetailsFetched(final KidsCharacterDetails kidsCharacterDetails, final Boolean dataChanged, final int statusCode)
    {
        dateCacheIfNecessary(kidsCharacterDetails, statusCode);
        BrowseAgent.access$1900(_fld0).post(new Runnable() {

            final BrowseAgent.FetchKidsCharacterDetailsTask._cls1 this$2;
            final Boolean val$dataChanged;
            final KidsCharacterDetails val$kidsCharacterDetails;
            final int val$statusCode;

            public void run()
            {
                getCallback().onKidsCharacterDetailsFetched(kidsCharacterDetails, dataChanged, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchKidsCharacterDetailsTask._cls1.this;
                kidsCharacterDetails = kidscharacterdetails;
                dataChanged = boolean1;
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
