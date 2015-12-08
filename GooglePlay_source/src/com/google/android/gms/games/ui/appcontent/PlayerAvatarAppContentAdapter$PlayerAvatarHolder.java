// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.view.View;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.AutoLayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            PlayerAvatarAppContentAdapter, ExtendedAppContentCard, AppContentUtils

private static final class mSlotProvider extends com.google.android.gms.games.ui.atarHolder
{

    private final com.google.android.gms.games.ui.layouts.er.mSlotProvider mSlotProvider;

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (ExtendedAppContentCard)obj;
        super.pulateViews(gamesrecycleradapter, i, obj);
        AppContentUtils.resetLayoutSlots(mSlotProvider);
        PlayerAvatarAppContentAdapter playeravatarappcontentadapter = (PlayerAvatarAppContentAdapter)mAdapter;
        AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, ((ExtendedAppContentCard) (obj)), 218);
        if (PlayerAvatarAppContentAdapter.access$000(playeravatarappcontentadapter))
        {
            i = 4;
        } else
        {
            i = 8;
        }
        gamesrecycleradapter = (AutoLayoutSlot)mSlotProvider.mSlotProvider("LARGE_PRIMARY_LABEL");
        if (gamesrecycleradapter != null)
        {
            gamesrecycleradapter.mTitleHideVis = i;
        }
        AppContentUtils.populateLayoutSlots(((ExtendedAppContentCard) (obj)), mSlotProvider);
    }

    public a(View view)
    {
        super(view);
        mSlotProvider = LayoutSlotInflater.getSlotProvider(view);
    }
}
