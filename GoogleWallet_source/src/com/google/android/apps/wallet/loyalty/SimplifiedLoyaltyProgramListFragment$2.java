// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            SimplifiedLoyaltyProgramListFragment, LoyaltyCardsHandler

final class this._cls0
    implements android.widget.tyProgramListFragment._cls2
{

    final SimplifiedLoyaltyProgramListFragment this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
        if (adapterview == SimplifiedLoyaltyProgramListFragment.access$100())
        {
            startActivity(LoyaltyApi.createStartNewAdhocLoyaltyCardFlowIntent(getActivity(), loyaltyCardsHandler.supportsImageCapture()));
        } else
        if (adapterview instanceof com.google.wallet.proto.api.ogram)
        {
            adapterview = (com.google.wallet.proto.api.ogram)adapterview;
            startActivity(LoyaltyApi.createFeaturedProgramDetailsActivityIntentWithProgramId(getActivity(), ((com.google.wallet.proto.api.ogram) (adapterview)).programId));
            return;
        }
    }

    ()
    {
        this$0 = SimplifiedLoyaltyProgramListFragment.this;
        super();
    }
}
