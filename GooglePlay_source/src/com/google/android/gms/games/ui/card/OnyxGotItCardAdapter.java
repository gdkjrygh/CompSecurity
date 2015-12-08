// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.logging.LogflowViewUiElementNode;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;
import com.google.android.gms.games.ui.appcontent.TextViewLayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.Collection;

public class OnyxGotItCardAdapter extends SingleItemRecyclerAdapter
{
    public static class Data
    {

        public final int mBackgroundResId;
        public final int mDescriptionResId;
        public final int mGotItButtonResId;
        public final int mImageResId;
        public final int mLearnMoreButtonResId;
        public final String mLogflowDocumentId;
        public final int mLogflowParentType;
        public final int mTitleResId;

        public Data(int i, int j, int k, int l)
        {
            this(i, j, 0, k, l, 0, 0);
        }

        public Data(int i, int j, int k, int l, int i1, int j1)
        {
            this(0x7f0b0061, i, j, k, l, i1, j1);
        }

        private Data(int i, int j, int k, int l, int i1, int j1, int k1)
        {
            mBackgroundResId = i;
            mImageResId = j;
            mTitleResId = k;
            mDescriptionResId = l;
            mGotItButtonResId = i1;
            mLearnMoreButtonResId = j1;
            mLogflowParentType = k1;
            mLogflowDocumentId = null;
        }
    }

    public static interface GotItEventListener
    {

        public abstract void onGotItClicked(String s);

        public abstract void onLearnMoreClicked(String s);
    }

    protected static class OnyxGotItCardViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements android.view.View.OnClickListener, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider
    {

        public final View mContainerView;
        public final TextView mDescriptionView;
        public final Button mGotItView;
        public final LoadingImageView mImageView;
        public final ArrayMap mLayoutSlots = new ArrayMap();
        protected final Button mLearnMoreView;
        public final TextView mTitleView;

        public final LayoutSlot getLayoutSlot(String s)
        {
            return (LayoutSlot)mLayoutSlots.get(s);
        }

        public final Collection getLayoutSlots()
        {
            return mLayoutSlots.values();
        }

        public void onClick(View view)
        {
            OnyxGotItCardAdapter onyxgotitcardadapter = (OnyxGotItCardAdapter)mAdapter;
            ((com.google.android.gms.common.images.internal) (onyxgotitcardadapter))..logClick(view);
            if (view == mLearnMoreView)
            {
                onyxgotitcardadapter.mEventListener.onLearnMoreClicked(onyxgotitcardadapter.mTag);
            } else
            if (view == mGotItView)
            {
                onyxgotitcardadapter.mEventListener.onGotItClicked(onyxgotitcardadapter.mTag);
                return;
            }
        }

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            OnyxGotItCardAdapter onyxgotitcardadapter = (OnyxGotItCardAdapter)mAdapter;
            View view = itemView;
            i = onyxgotitcardadapter.mData.mLogflowParentType;
            Data data = onyxgotitcardadapter.mData;
            LogflowUiUtils.setupLogflowAndImpressView(view, gamesrecycleradapter, 225, i, null);
            gamesrecycleradapter = onyxgotitcardadapter.mData;
            mContainerView.setBackgroundResource(((Data) (gamesrecycleradapter)).mBackgroundResId);
            mImageView.setImageResource(((Data) (gamesrecycleradapter)).mImageResId);
            if (((Data) (gamesrecycleradapter)).mTitleResId != 0)
            {
                mTitleView.setVisibility(0);
                mTitleView.setText(((Data) (gamesrecycleradapter)).mTitleResId);
            } else
            {
                mTitleView.setVisibility(8);
            }
            mDescriptionView.setText(((Data) (gamesrecycleradapter)).mDescriptionResId);
            if (((Data) (gamesrecycleradapter)).mLearnMoreButtonResId == 0)
            {
                mLearnMoreView.setVisibility(8);
            } else
            {
                mLearnMoreView.setVisibility(0);
                mLearnMoreView.setText(((Data) (gamesrecycleradapter)).mLearnMoreButtonResId);
            }
            mGotItView.setText(((Data) (gamesrecycleradapter)).mGotItButtonResId);
            mGotItView.setContentDescription(mGotItView.getResources().getString(((Data) (gamesrecycleradapter)).mGotItButtonResId).toLowerCase());
            ((com.google.android.gms.common.images.internal) (onyxgotitcardadapter))..logImpression(mContainerView, ((GamesRecyclerAdapter) (onyxgotitcardadapter)).mIsFlinging);
        }

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, ExtendedAppContentCard extendedappcontentcard)
        {
            super.populateViews(gamesrecycleradapter, i, extendedappcontentcard);
            AppContentUtils.resetLayoutSlots(this);
            AppContentUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, extendedappcontentcard, 225);
            mLearnMoreView.setVisibility(8);
            mContainerView.setBackgroundResource(0x7f0b0061);
            AppContentUtils.populateLayoutSlots(extendedappcontentcard, this);
        }


        public OnyxGotItCardViewHolder(View view)
        {
            SingleItemViewHolder(view);
            mContainerView = view.findViewById(0x7f0d016f);
            mImageView = (LoadingImageView)view.findViewById(0x7f0d006f);
            mTitleView = (TextView)view.findViewById(0x7f0d0075);
            mDescriptionView = (TextView)view.findViewById(0x7f0d00f0);
            mLearnMoreView = (Button)view.findViewById(0x7f0d01ff);
            mLearnMoreView.setOnClickListener(this);
            mGotItView = (Button)view.findViewById(0x7f0d0200);
            mGotItView.setOnClickListener(this);
            mImageView.setTag(0x7f0d0061, new LogflowViewUiElementNode(203, (byte)0));
            mLearnMoreView.setTag(0x7f0d0061, new LogflowViewUiElementNode(506, (byte)0));
            mGotItView.setTag(0x7f0d0061, new LogflowViewUiElementNode(501, (byte)0));
            mLayoutSlots.put("LARGE_PRIMARY_LABEL", new LargePrimaryLayoutSlot());
            mLayoutSlots.put("TITLE_ICON", new TitleIconLayoutSlot((byte)0));
            mLayoutSlots.put("TITLE", new TextViewLayoutSlot(mContext, mTitleView));
            mLayoutSlots.put("SUBTITLE", new TextViewLayoutSlot(mContext, mDescriptionView));
        }
    }

    /* member class not found */
    class OnyxGotItCardViewHolder.LargePrimaryLayoutSlot {}

    private final class OnyxGotItCardViewHolder.TitleIconLayoutSlot extends LayoutSlot
    {

        final OnyxGotItCardViewHolder this$0;

        public final void resetAnnotation()
        {
            super.resetAnnotation();
            mImageView.setVisibility(4);
        }

        public final void setAnnotation(AppContentAnnotation appcontentannotation)
        {
            super.setAnnotation(appcontentannotation);
            Bundle bundle = appcontentannotation.getModifiers();
            if (bundle.containsKey("backgroundColor"))
            {
                mImageView.setBackgroundColor(Color.parseColor(bundle.getString("backgroundColor")));
            }
            mImageView.setImageResource(AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId()));
            mImageView.setVisibility(0);
        }

        private OnyxGotItCardViewHolder.TitleIconLayoutSlot()
        {
            this$0 = OnyxGotItCardViewHolder.this;
            LayoutSlot();
        }

        OnyxGotItCardViewHolder.TitleIconLayoutSlot(byte byte0)
        {
            TitleIconLayoutSlot();
        }
    }


    public final Data mData;
    private final GotItEventListener mEventListener;
    private final String mTag;

    public OnyxGotItCardAdapter(Context context, Data data, GotItEventListener gotiteventlistener, String s)
    {
        this(context, data, gotiteventlistener, s, true);
    }

    public OnyxGotItCardAdapter(Context context, Data data, GotItEventListener gotiteventlistener, String s, boolean flag)
    {
        super(context, flag);
        mData = data;
        mEventListener = gotiteventlistener;
        mTag = s;
    }

    public int getItemViewType()
    {
        return 0x7f0400ab;
    }

    public com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new OnyxGotItCardViewHolder(mInflater.inflate(0x7f0400ab, viewgroup, false));
    }




}
