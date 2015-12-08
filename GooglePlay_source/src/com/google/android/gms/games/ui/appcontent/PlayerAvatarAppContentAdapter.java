// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.AutoLayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlotInflater;
import java.util.Arrays;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentUtils, ExtendedAppContentCard

public final class PlayerAvatarAppContentAdapter extends DatabufferRecyclerAdapter
{
    private static final class PlayerAvatarHolder extends com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder
    {

        private final com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider mSlotProvider;

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            obj = (ExtendedAppContentCard)obj;
            super.populateViews(gamesrecycleradapter, i, obj);
            AppContentUtils.resetLayoutSlots(mSlotProvider);
            PlayerAvatarAppContentAdapter playeravatarappcontentadapter = (PlayerAvatarAppContentAdapter)mAdapter;
            AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, ((ExtendedAppContentCard) (obj)), 218);
            if (playeravatarappcontentadapter.mHasLargePrimaryLabel)
            {
                i = 4;
            } else
            {
                i = 8;
            }
            gamesrecycleradapter = (AutoLayoutSlot)mSlotProvider.getLayoutSlot("LARGE_PRIMARY_LABEL");
            if (gamesrecycleradapter != null)
            {
                gamesrecycleradapter.mTitleHideVis = i;
            }
            AppContentUtils.populateLayoutSlots(((ExtendedAppContentCard) (obj)), mSlotProvider);
        }

        public PlayerAvatarHolder(View view)
        {
            super(view);
            mSlotProvider = LayoutSlotInflater.getSlotProvider(view);
        }
    }


    private static final HashSet OPTIONAL_SLOTS = new HashSet(Arrays.asList(new String[] {
        "LARGE_PRIMARY_LABEL"
    }));
    private boolean mHasLargePrimaryLabel;
    private HashSet mUnusedSlots;

    public PlayerAvatarAppContentAdapter(Context context)
    {
        super(context);
        mUnusedSlots = new HashSet();
        mHasLargePrimaryLabel = false;
    }

    private void checkRangeForUnusedSlots(int i, int j)
    {
        if (AppContentUtils.updateUnusedSlots(mUnusedSlots, super.mDataBuffer, i, j))
        {
            refreshUnusedSlotCache();
            super.onDataChanged();
        }
    }

    public static int getScreenRowsResId()
    {
        return 0x7f0e0040;
    }

    public static int getSpanCountResId()
    {
        return 0x7f0e0021;
    }

    public static int getViewType()
    {
        return 0x7f0d002f;
    }

    private void refreshUnusedSlotCache()
    {
        boolean flag;
        if (!mUnusedSlots.contains("LARGE_PRIMARY_LABEL"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasLargePrimaryLabel = flag;
    }

    protected final int getCardItemViewType$134621()
    {
        return 0x7f0d002f;
    }

    public final int getSpanCount()
    {
        return mContext.getResources().getInteger(0x7f0e0021);
    }

    protected final com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i)
    {
        return new PlayerAvatarHolder(mInflater.inflate(0x7f0400b7, viewgroup, false));
    }

    public final void onDataChanged()
    {
        super.onDataChanged();
        mUnusedSlots = AppContentUtils.getUnusedSlots(super.mDataBuffer, OPTIONAL_SLOTS);
        boolean flag;
        if (!mUnusedSlots.contains("LARGE_PRIMARY_LABEL"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasLargePrimaryLabel = flag;
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
        refreshUnusedSlotCache();
    }


}
