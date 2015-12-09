// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;

// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            FeaturedLoyaltyProgramListFragment

final class this._cls0
    implements android.widget.turedLoyaltyProgramListFragment._cls2
{

    final FeaturedLoyaltyProgramListFragment this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
        if (adapterview instanceof com.google.wallet.proto.api.Program)
        {
            adapterview = (com.google.wallet.proto.api.Program)adapterview;
            startActivity(LoyaltyApi.createFeaturedProgramDetailsActivityIntentWithProgramId(getActivity(), ((com.google.wallet.proto.api.Program) (adapterview)).programId));
        }
    }

    ()
    {
        this$0 = FeaturedLoyaltyProgramListFragment.this;
        super();
    }
}
