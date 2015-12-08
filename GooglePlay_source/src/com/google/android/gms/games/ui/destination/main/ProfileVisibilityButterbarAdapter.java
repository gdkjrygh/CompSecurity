// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;
import com.google.android.gms.games.ui.appcontent.TextViewLayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ProfileVisibilityButterbarAdapter extends SingleItemRecyclerAdapter
{
    private static final class PrivateLevelButterBarViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider
    {

        private final ImageView mImageView;
        private ArrayMap mLayoutSlots;
        private final View mRootView;
        private final TextView mSubtitleView;
        private final TextView mTitleView;

        public final LayoutSlot getLayoutSlot(String s)
        {
            return (LayoutSlot)mLayoutSlots.get(s);
        }

        public final Collection getLayoutSlots()
        {
            return mLayoutSlots.values();
        }

        public final void onClick(View view)
        {
            view = (ProfileVisibilityButterbarAdapter)mAdapter;
            if (((ProfileVisibilityButterbarAdapter) (view)).mEventListener != null)
            {
                ((ProfileVisibilityButterbarAdapter) (view)).mEventListener.onChangeSettingsClicked();
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, 217, 1000, null);
            mTitleView.setText(0x7f1000f2);
            mSubtitleView.setText(0x7f1000f1);
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
        {
            super.populateViews(gamesrecycleradapter, i, extendedappcontentcard);
            AppContentUtils.resetLayoutSlots(this);
            AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, extendedappcontentcard, 217);
            AppContentUtils.populateLayoutSlots(extendedappcontentcard, this);
        }



        public PrivateLevelButterBarViewHolder(View view)
        {
            super(view);
            mTitleView = (TextView)view.findViewById(0x7f0d0075);
            mSubtitleView = (TextView)view.findViewById(0x7f0d0074);
            mImageView = (ImageView)view.findViewById(0x7f0d011a);
            mRootView = view.findViewById(0x7f0d010e);
            mRootView.setOnClickListener(this);
            mLayoutSlots = new ArrayMap();
            mLayoutSlots.put("WHOLE_CARD", new WholeCardLayoutSlot());
            mLayoutSlots.put("TITLE_ICON", new TitleIconLayoutSlot((byte)0));
            mLayoutSlots.put("TITLE", new TextViewLayoutSlot(mContext, mTitleView));
            mLayoutSlots.put("SUBTITLE", new TextViewLayoutSlot(mContext, mSubtitleView));
        }
    }

    private final class PrivateLevelButterBarViewHolder.TitleIconLayoutSlot extends LayoutSlot
    {

        final PrivateLevelButterBarViewHolder this$0;

        public final void resetAnnotation()
        {
            super.resetAnnotation();
            mImageView.setVisibility(8);
        }

        public final void setAnnotation(AppContentAnnotation appcontentannotation)
        {
            super.setAnnotation(appcontentannotation);
            mImageView.setVisibility(0);
            mImageView.setImageResource(AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId()));
        }

        private PrivateLevelButterBarViewHolder.TitleIconLayoutSlot()
        {
            this$0 = PrivateLevelButterBarViewHolder.this;
            super();
        }

        PrivateLevelButterBarViewHolder.TitleIconLayoutSlot(byte byte0)
        {
            this();
        }
    }

    private final class PrivateLevelButterBarViewHolder.WholeCardLayoutSlot extends LayoutSlot
    {

        private final ArrayList mClickableViews = new ArrayList();
        final PrivateLevelButterBarViewHolder this$0;

        public final List getClickableViews()
        {
            return mClickableViews;
        }

        public PrivateLevelButterBarViewHolder.WholeCardLayoutSlot()
        {
            this$0 = PrivateLevelButterBarViewHolder.this;
            super();
            mClickableViews.add(mRootView);
        }
    }

    public static interface ProfileVisibilityButterbarEventListener
    {

        public abstract void onChangeSettingsClicked();
    }


    private ProfileVisibilityButterbarEventListener mEventListener;

    public ProfileVisibilityButterbarAdapter(Context context, ProfileVisibilityButterbarEventListener profilevisibilitybutterbareventlistener)
    {
        super(context);
        mEventListener = profilevisibilitybutterbareventlistener;
    }

    public final int getItemViewType()
    {
        return 0x7f040049;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new PrivateLevelButterBarViewHolder(mInflater.inflate(0x7f040049, viewgroup, false));
    }

    public final void updateButterBarVisibility(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setVisible(flag);
    }

}
