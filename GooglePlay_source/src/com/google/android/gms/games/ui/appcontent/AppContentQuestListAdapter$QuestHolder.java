// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.view.View;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentQuestListAdapter, ExtendedAppContentCard, AppContentUtils

private static final class mRootView extends com.google.android.gms.games.ui.wHolder
{

    private final View mLargeLabelDivider;
    private final View mRootView;
    private final com.google.android.gms.games.ui.layouts.er.mLargeLabelDivider mSlotProvider;

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (ExtendedAppContentCard)obj;
        super.populateViews(gamesrecycleradapter, i, obj);
        AppContentUtils.resetLayoutSlots(mSlotProvider);
        AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, ((ExtendedAppContentCard) (obj)), 219);
        AppContentUtils.populateLayoutSlots(((ExtendedAppContentCard) (obj)), mSlotProvider);
        gamesrecycleradapter = mSlotProvider.Slot("LARGE_PRIMARY_LABEL");
        obj = mSlotProvider.Slot("LARGE_SECONDARY_LABEL");
        View view = mLargeLabelDivider;
        if (gamesrecycleradapter != null && obj != null && ((LayoutSlot) (gamesrecycleradapter)).mVisible && ((LayoutSlot) (obj)).mVisible)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public (View view)
    {
        super(view);
        mRootView = view;
        mLargeLabelDivider = mRootView.findViewById(0x7f0d025a);
        mSlotProvider = LayoutSlotInflater.getSlotProvider(mRootView);
    }
}
