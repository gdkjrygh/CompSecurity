// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.browse.volley.BrowseVolleyWebClient;
import com.netflix.mediaclient.service.webclient.WebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClient;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseWebClient

public final class BrowseWebClientFactory
{

    private BrowseWebClientFactory()
    {
    }

    public static final BrowseWebClient create(HardCache hardcache, SoftCache softcache, SoftCache softcache1, List list, List list1, NetflixService netflixservice, WebClient webclient)
    {
        return new BrowseVolleyWebClient(hardcache, softcache, softcache1, list, list1, netflixservice, (FalcorVolleyWebClient)webclient);
    }
}
