// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentUtils, ExtendedAppContentCard

public final class OnyxAppContentCardAdapter extends OnyxCardAdapter
{
    private static final class OnyxAppContentCardViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        private final com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider mSlotProvider;

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (ExtendedAppContentCard)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            gamesrecycleradapter = (OnyxAppContentCardAdapter)gamesrecycleradapter;
            AppContentUtils.resetLayoutSlots(mSlotProvider);
            AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, ((ExtendedAppContentCard) (obj)), gamesrecycleradapter.getLogflowUiElementType());
            if (((OnyxAppContentCardAdapter) (gamesrecycleradapter)).mUnusedSlots.contains("SUBTITLE"))
            {
                hideSubtitle();
            }
            AppContentUtils.populateLayoutSlots(((ExtendedAppContentCard) (obj)), mSlotProvider);
            resizeSnippet();
        }

        public OnyxAppContentCardViewHolder(View view)
        {
            super(view);
            mSlotProvider = LayoutSlotInflater.getSlotProvider(view);
        }
    }


    private static final HashSet OPTIONAL_SLOTS = new HashSet(Arrays.asList(new String[] {
        "SUBTITLE", "SNIPPET"
    }));
    private int mCardType;
    private HashSet mUnusedSlots;

    public OnyxAppContentCardAdapter(Context context, int i)
    {
        super(context);
        mCardType = i;
        mUnusedSlots = new HashSet();
    }

    private void checkRangeForUnusedSlots(int i, int j)
    {
        if (AppContentUtils.updateUnusedSlots(mUnusedSlots, super.mDataBuffer, i, j))
        {
            super.onDataChanged();
        }
    }

    public static int getViewTypeForCardType(int i)
    {
        return getItemViewType(i, 0x7f0d002e);
    }

    protected final int getCardType()
    {
        return mCardType;
    }

    protected final int getDataType()
    {
        return 0x7f0d002e;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new OnyxAppContentCardViewHolder(view);
    }

    public final void onDataChanged()
    {
        super.onDataChanged();
        mUnusedSlots = AppContentUtils.getUnusedSlots(super.mDataBuffer, OPTIONAL_SLOTS);
    }

    public final void onDataRangeChanged(int i, int j)
    {
        super.onDataRangeChanged(i, j);
        checkRangeForUnusedSlots(i, j);
    }

    public final void onDataRangeInserted(int i, int j)
    {
        super.onDataRangeInserted(i, j);
        checkRangeForUnusedSlots(i, j);
    }

    public final void setDataBuffer(DataBuffer databuffer)
    {
        super.setDataBuffer(databuffer);
        mUnusedSlots = AppContentUtils.getUnusedSlots(databuffer, OPTIONAL_SLOTS);
    }



}
