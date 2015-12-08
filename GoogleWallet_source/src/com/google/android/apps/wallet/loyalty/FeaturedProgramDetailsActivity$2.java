// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            FeaturedProgramDetailsActivity

final class val.discoverableId
    implements Callable
{

    final FeaturedProgramDetailsActivity this$0;
    final String val$discoverableId;

    private com.google.wallet.proto.api.altyProgram call()
        throws Exception
    {
        return loyaltyApiClient.fetchFeaturedProgram(val$discoverableId);
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_featuredprogramdetailsactivity;
        val$discoverableId = String.this;
        super();
    }
}
