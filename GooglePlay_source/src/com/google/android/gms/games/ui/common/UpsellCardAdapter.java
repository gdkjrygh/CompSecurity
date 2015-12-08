// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;
import com.google.android.gms.games.ui.appcontent.TextViewLayoutSlot;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;

public final class UpsellCardAdapter extends OnyxGotItCardAdapter
{
    public static final class Data extends com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data
    {

        public final int mBackgroundColor;

        public Data(int i, int j)
        {
            super(0x7f0b0096, 0x7f0200e0, j, 0x7f1000bc);
            mBackgroundColor = i;
        }
    }

    protected static final class PlusUpsellCardViewHolder extends com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.OnyxGotItCardViewHolder
    {

        private final LinearLayout mTextContainer;

        private void setImageDimens()
        {
            mContext.getResources();
            Drawable drawable = mImageView.getDrawable();
            if (drawable == null)
            {
                return;
            } else
            {
                float f = (float)drawable.getIntrinsicWidth() / (float)drawable.getIntrinsicHeight();
                mImageView.setImageAspectRatioAdjust(2, f);
                return;
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (UpsellCardAdapter)mAdapter;
            setImageDimens();
            Data data = (Data)((UpsellCardAdapter) (gamesrecycleradapter)).mData;
            mImageView.setBackgroundColor(data.mBackgroundColor);
            mGotItView.setTextColor(data.mBackgroundColor);
            ((GamesFragmentActivity)
// JavaClassFileOutputException: get_constant: invalid tag

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
        {
            populateViews(gamesrecycleradapter, i, extendedappcontentcard);
            mContainerView.setBackgroundResource(0x7f0b0096);
            setImageDimens();
            gamesrecycleradapter = (UpsellCardAdapter)mAdapter;
            ((GamesFragmentActivity)
// JavaClassFileOutputException: get_constant: invalid tag

        public PlusUpsellCardViewHolder(View view)
        {
            boolean flag = true;
            super(view);
            mTextContainer = (LinearLayout)view.findViewById(0x7f0d0201);
            view = view.getResources();
            int i;
            int j;
            if (view.getConfiguration().orientation != 1)
            {
                flag = false;
            }
            if (flag)
            {
                i = 0;
            } else
            {
                i = view.getDimensionPixelOffset(0x7f0c013f);
            }
            j = view.getDimensionPixelOffset(0x7f0c013d);
            mTitleView.setTextColor(0xff000000);
            ((android.view.ViewGroup.MarginLayoutParams)mTitleView.getLayoutParams()).setMargins(i, j, i, 0);
            ((TextViewLayoutSlot)mLayoutSlots.get("TITLE")).mDefaultTextColor = 0xff000000;
            mDescriptionView.setTextColor(0xff000000);
            ((android.view.ViewGroup.MarginLayoutParams)mDescriptionView.getLayoutParams()).setMargins(i, 0, i, 0);
            ((TextViewLayoutSlot)mLayoutSlots.get("SUBTITLE")).mDefaultTextColor = 0xff000000;
            mImageView.setPadding(0, 0, 0, 0);
            mImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            if (flag)
            {
                mImageView.getLayoutParams().width = -1;
            } else
            {
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
                mImageView.setLayoutParams(layoutparams);
                mTextContainer.setLayoutParams(layoutparams);
            }
            if (android.os.Build.VERSION.SDK_INT >= 22)
            {
                view = view.getDrawable(0x7f020160, null);
            } else
            {
                view = view.getDrawable(0x7f020160);
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                mGotItView.setBackground(view);
                return;
            } else
            {
                mGotItView.setBackgroundDrawable(view);
                return;
            }
        }
    }


    protected final int mLogSource;
    protected final Integer mLogSubSource;

    private UpsellCardAdapter(Context context, Data data, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener gotiteventlistener, int i, Integer integer)
    {
        StringBuilder stringbuilder = (new StringBuilder("UpsellCard.")).append(i);
        String s;
        if (integer == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder(".")).append(integer).toString();
        }
        OnyxGotItCardAdapter(context, data, gotiteventlistener, stringbuilder.append(s).toString(), false);
        mLogSource = i;
        mLogSubSource = integer;
    }

    public static UpsellCardAdapter createPlusUpsellCardAdapter(GamesFragmentActivity gamesfragmentactivity, Data data, int i, Integer integer)
    {
        return new UpsellCardAdapter(gamesfragmentactivity, data, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener(gamesfragmentactivity, i, integer) {

            final GamesFragmentActivity val$parent;
            final int val$source;
            final Integer val$subSource;

            public final void onGotItClicked(String s)
            {
                parent.launchPlusUpgradeFlow(source, subSource);
            }

            public final void onLearnMoreClicked(String s)
            {
            }

            
            {
                parent = gamesfragmentactivity;
                source = i;
                subSource = integer;
                super();
            }
        }, i, integer);
    }

    public final int getItemViewType()
    {
        return 0x7f0d0045;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new PlusUpsellCardViewHolder(mInflater.inflate(0x7f0400ab, viewgroup, false));
    }


}
