// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            FeaturedLoyaltyProgramListFragment

final class this._cls0
    implements AsyncCallback
{

    final FeaturedLoyaltyProgramListFragment this$0;

    private void onSuccess(com.google.wallet.proto.api.ramsResponse ramsresponse)
    {
        FeaturedLoyaltyProgramListFragment.access$300(FeaturedLoyaltyProgramListFragment.this, Arrays.asList(ramsresponse.programs));
        setDisplayType(splayType.LIST);
    }

    public final void onFailure(Exception exception)
    {
        setDisplayType(splayType.ERROR);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api.ramsResponse)obj);
    }

    splayType()
    {
        this$0 = FeaturedLoyaltyProgramListFragment.this;
        super();
    }
}
