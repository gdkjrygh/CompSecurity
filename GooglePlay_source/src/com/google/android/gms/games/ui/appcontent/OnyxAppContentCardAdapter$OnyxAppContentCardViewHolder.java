// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.view.View;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            OnyxAppContentCardAdapter, ExtendedAppContentCard, AppContentUtils

private static final class mSlotProvider extends com.google.android.gms.games.ui.card.older
{

    private final com.google.android.gms.games.ui.layouts.er.resizeSnippet mSlotProvider;

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        obj = (ExtendedAppContentCard)obj;
        super.older(gamesrecycleradapter, i, obj);
        gamesrecycleradapter = (OnyxAppContentCardAdapter)gamesrecycleradapter;
        AppContentUtils.resetLayoutSlots(mSlotProvider);
        AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, ((ExtendedAppContentCard) (obj)), OnyxAppContentCardAdapter.access$000(gamesrecycleradapter));
        if (OnyxAppContentCardAdapter.access$100(gamesrecycleradapter).contains("SUBTITLE"))
        {
            hideSubtitle();
        }
        AppContentUtils.populateLayoutSlots(((ExtendedAppContentCard) (obj)), mSlotProvider);
        resizeSnippet();
    }

    public (View view)
    {
        super(view);
        mSlotProvider = LayoutSlotInflater.getSlotProvider(view);
    }
}
