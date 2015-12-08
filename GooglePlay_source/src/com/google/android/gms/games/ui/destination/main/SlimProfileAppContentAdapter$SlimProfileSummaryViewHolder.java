// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.appcontent.AppContentCard;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.AvatarLayoutSlot;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;
import com.google.android.gms.games.ui.appcontent.TextViewLayoutSlot;
import com.google.android.gms.games.ui.common.players.SharedProfileSummaryUtils;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            SlimProfileAppContentAdapter

private static final class mLargePrimaryLabelView extends com.google.android.gms.games.ui.ummaryViewHolder
    implements com.google.android.gms.games.ui.layouts.ewHolder
{
    private final class ProgressLayoutSlot extends LayoutSlot
    {

        private final ArrayList mClickableViews = new ArrayList();
        final SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder this$0;

        public final List getClickableViews()
        {
            return mClickableViews;
        }

        public final void resetAnnotation()
        {
            super.resetAnnotation();
            mLevelProgressView.setVisibility(8);
            mNextLevelView.setVisibility(8);
        }

        public final void setAnnotation(AppContentAnnotation appcontentannotation)
        {
            super.setAnnotation(appcontentannotation);
            appcontentannotation = appcontentannotation.getModifiers();
            int i = SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder.parseInt(appcontentannotation.getString("currentSteps"), 0);
            int j = SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder.parseInt(appcontentannotation.getString("totalSteps"), 0);
            int k = UiUtils.getLevelColor(mContext.getResources(), getLevelNumber(1));
            if (j <= 0)
            {
                SharedProfileSummaryUtils.displayMaxLevelInformation(mContext.getResources(), mLevelProgressView, mNextLevelView, i, k);
                return;
            } else
            {
                SharedProfileSummaryUtils.displayNextLevelInformation(mContext.getResources(), mLevelProgressView, mNextLevelView, i, j, k);
                return;
            }
        }

        public ProgressLayoutSlot()
        {
            this$0 = SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder.this;
            super();
            mClickableViews.add(mLevelProgressView);
        }
    }

    private final class SnippetLayoutSlot extends LayoutSlot
    {

        private final ArrayList mClickableViews = new ArrayList();
        final SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder this$0;

        public final List getClickableViews()
        {
            return mClickableViews;
        }

        public final void resetAnnotation()
        {
            mBottomContainerView.setVisibility(8);
        }

        public final void setAnnotation(AppContentAnnotation appcontentannotation)
        {
            super.setAnnotation(appcontentannotation);
            SharedProfileSummaryUtils.addLevelUpCongrats(mContext.getResources(), mCongratsLevelView, mCongratsMessageView, getLevelNumber(1));
            mBottomContainerView.setVisibility(0);
        }

        public SnippetLayoutSlot()
        {
            this$0 = SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder.this;
            super();
            mClickableViews.add(mBottomContainerView);
        }
    }

    private final class WholeCardLayoutSlot extends LayoutSlot
    {

        private final ArrayList mClickableViews = new ArrayList();
        final SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder this$0;

        public final List getClickableViews()
        {
            return mClickableViews;
        }

        public WholeCardLayoutSlot()
        {
            this$0 = SlimProfileAppContentAdapter.SlimProfileSummaryViewHolder.this;
            super();
            mClickableViews.add(itemView);
        }
    }


    private final MetagameAvatarView mAvatarView;
    final View mBottomContainerView;
    private ExtendedAppContentCard mCard;
    final TextView mCongratsLevelView;
    final TextView mCongratsMessageView;
    private final TextView mLargePrimaryLabelView;
    private ArrayMap mLayoutSlots;
    final ProgressBar mLevelProgressView;
    final TextView mNextLevelView;
    private final View mPlayerBannerBackgroundView;
    private final TextView mPlayerNameView;
    private final TextView mPlayerNicknameView;

    static int parseInt(String s, int i)
    {
        int j = i;
        if (!TextUtils.isEmpty(s))
        {
            j = i;
            if (TextUtils.isDigitsOnly(s))
            {
                j = Integer.parseInt(s);
            }
        }
        return j;
    }

    public final LayoutSlot getLayoutSlot(String s)
    {
        return (LayoutSlot)mLayoutSlots.get(s);
    }

    public final Collection getLayoutSlots()
    {
        return mLayoutSlots.values();
    }

    final int getLevelNumber(int i)
    {
        return parseInt(mCard.mCard.getExtras().getString("playerLevel"), 1);
    }

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
    {
        super.ws(gamesrecycleradapter, i, extendedappcontentcard);
        mCard = extendedappcontentcard;
        AppContentUtils.resetLayoutSlots(this);
        AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, extendedappcontentcard, 216);
        mPlayerBannerBackgroundView.setBackgroundColor(UiUtils.getLevelColorForBackground(mContext.getResources(), getLevelNumber(1)));
        AppContentUtils.populateLayoutSlots(extendedappcontentcard, this);
    }

    public itemView(View view)
    {
        super(view);
        mPlayerBannerBackgroundView = view.findViewById(0x7f0d0172);
        mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d01ba);
        mAvatarView.setOutlineStrokeWidthResId(0x7f0c0111);
        mAvatarView.setShadowStrokeWidthResId(0x7f0c0109);
        mAvatarView.setAvatarElevationResId(0x7f0c0106);
        UiUtils.hideViewAndItsDescendantsFromAccessibilityServices(mAvatarView);
        mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
        mPlayerNicknameView = (TextView)view.findViewById(0x7f0d0236);
        mNextLevelView = (TextView)view.findViewById(0x7f0d023d);
        mLevelProgressView = (ProgressBar)view.findViewById(0x7f0d023f);
        mBottomContainerView = view.findViewById(0x7f0d0244);
        mCongratsLevelView = (TextView)view.findViewById(0x7f0d0245);
        mCongratsMessageView = (TextView)view.findViewById(0x7f0d0246);
        mLargePrimaryLabelView = (TextView)view.findViewById(0x7f0d025b);
        mLayoutSlots = new ArrayMap();
        mLayoutSlots.put("TITLE", (new TextViewLayoutSlot(mContext, mPlayerNameView)).setDefaultTextColorResId(0x7f0b02ca));
        mLayoutSlots.put("SUBTITLE", (new TextViewLayoutSlot(mContext, mPlayerNicknameView)).setDefaultTextColorResId(0x7f0b02ca));
        mLayoutSlots.put("AVATAR", new AvatarLayoutSlot(mAvatarView));
        mLayoutSlots.put("PROGRESS", new ProgressLayoutSlot());
        mLayoutSlots.put("SNIPPET", new SnippetLayoutSlot());
        mLayoutSlots.put("WHOLE_CARD", new WholeCardLayoutSlot());
        mLayoutSlots.put("LARGE_PRIMARY_LABEL", new TextViewLayoutSlot(mContext, mLargePrimaryLabelView));
    }
}
