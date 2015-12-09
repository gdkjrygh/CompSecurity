// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimablePurchaseRecordEventPublisher

public class P2PModule
{

    private static final TimeUnit CACHE_TTL_UNIT;

    public P2PModule()
    {
    }

    static Cache getClaimablePurchaseRecordEventCache()
    {
        return CacheBuilder.newBuilder().maximumSize(1L).expireAfterWrite(5L, CACHE_TTL_UNIT).build();
    }

    static InitializedEventPublisher getInitializedEventPublishers(ClaimablePurchaseRecordEventPublisher claimablepurchaserecordeventpublisher)
    {
        return claimablepurchaserecordeventpublisher;
    }

    static Resources getResources(Application application)
    {
        return application.getResources();
    }

    static 
    {
        CACHE_TTL_UNIT = TimeUnit.MINUTES;
    }
}
