// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import java.lang.ref.WeakReference;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, BrowseWebClient, SimpleBrowseAgentCallback

private class this._cls0 extends this._cls0
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchSeasonDetailsTask this$1;

        public void onSeasonDetailsFetched(final SeasonDetails seasonDetails, int i)
        {
            updateCacheIfNecessary(seasonDetails, i);
            BrowseAgent.access$2800(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final SeasonDetails val$seasonDetails;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onSeasonDetailsFetched(seasonDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                seasonDetails = seasondetails;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchSeasonDetailsTask.this;
                super();
            }
    };

    public void run()
    {
        Object obj = (SeasonDetails)getCachedValue();
        if (obj == null)
        {
            obj = BrowseAgent.access$2600(getCategory());
            obj = (WeakReference)BrowseAgent.access$2700(BrowseAgent.this).get(((String) (obj)));
            if (obj != null && ((WeakReference) (obj)).get() != null)
            {
                obj = (SeasonDetails)((WeakReference) (obj)).get();
                webClientCallback.onSeasonDetailsFetched(((SeasonDetails) (obj)), 0);
                return;
            } else
            {
                BrowseAgent.access$000(BrowseAgent.this).fetchSeasonDetails(getCategory(), webClientCallback);
                return;
            }
        } else
        {
            webClientCallback.onSeasonDetailsFetched(((SeasonDetails) (obj)), 0);
            return;
        }
    }

    public _cls1.this._cls1(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
    }
}
