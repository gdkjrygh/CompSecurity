// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.SimpleBrowseAgentCallback;
import com.netflix.mediaclient.servicemgr.LoMo;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            BrowseVolleyWebClient, PrefetchHomeLoLoMoRequest

class > extends SimpleBrowseAgentCallback
{

    final BrowseVolleyWebClient this$0;
    final BrowseAgentCallback val$cb;
    final int val$fromVideoFinal;
    final LoMo val$lomo;

    public void onVideosFetched(List list, int i)
    {
        if (i == 0 && val$fromVideoFinal == 0)
        {
            PrefetchHomeLoLoMoRequest.injectSocialData(val$lomo, list);
        }
        val$cb.onVideosFetched(list, i);
    }

    t()
    {
        this$0 = final_browsevolleywebclient;
        val$fromVideoFinal = i;
        val$lomo = lomo1;
        val$cb = BrowseAgentCallback.this;
        super();
    }
}
