// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.CardViewImpl;
import android.support.v7.widget.ChildHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;

// Referenced classes of package com.google.android.gms.games.ui:
//            ImageAwareAdapter, LogflowEventListener, ImageLoader

public abstract class GamesRecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter
    implements ImageAwareAdapter
{
    public static interface DynamicSpanCountAdapter
    {

        public abstract void setSpanCountChangeListener(SpanCountChangeListener spancountchangelistener);
    }

    public static abstract class GamesRecyclerViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
        implements ImageLoader, com.google.android.play.animation.ShuffleAddItemAnimator.AnimateAddProvider
    {

        public GamesRecyclerAdapter mAdapter;
        public final Context mContext;

        public final int getLocalPosition()
        {
            int i;
            if (super.mPreLayoutPosition == -1)
            {
                i = super.mPosition;
            } else
            {
                i = super.mPreLayoutPosition;
            }
            return i - mAdapter.getBasePosition();
        }

        public final void loadImage(LoadingImageView loadingimageview, Uri uri, int i)
        {
            loadImage(loadingimageview, uri, i, null);
        }

        public final void loadImage(LoadingImageView loadingimageview, Uri uri, int i, com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onimageloadedlistener)
        {
            if (mAdapter == null || mAdapter.mShouldLoadImages)
            {
                if (onimageloadedlistener != null)
                {
                    loadingimageview.mOnImageLoadedListener = onimageloadedlistener;
                }
                loadingimageview.loadUri$3329f911(uri, i, true);
                return;
            } else
            {
                loadingimageview.clearImage();
                return;
            }
        }

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            mAdapter = gamesrecycleradapter;
        }

        public void repopulateViews()
        {
        }

        public boolean shouldAnimateAdd()
        {
            for (ViewGroup viewgroup = (ViewGroup)itemView.getParent(); viewgroup == null || itemView.getBottom() < 0 || itemView.getTop() > viewgroup.getHeight();)
            {
                return false;
            }

            return true;
        }

        public GamesRecyclerViewHolder(View view)
        {
            super(view);
            mContext = view.getContext();
            if ((view instanceof CardView) && !PlatformVersion.checkVersion(21))
            {
                Object obj = (CardView)view;
                float f = CardView.IMPL.getMaxElevation(((android.support.v7.widget.CardViewDelegate) (obj)));
                obj = (CardView)view;
                float f1 = CardView.IMPL.getRadius(((android.support.v7.widget.CardViewDelegate) (obj)));
                int i = (int)Math.ceil((double)f + (1.0D - GamesRecyclerAdapter.COS_45) * (double)f1);
                int j = (int)Math.ceil((double)f * 1.5D + (1.0D - GamesRecyclerAdapter.COS_45) * (double)f1);
                obj = (android.support.v7.widget.GridLayoutManager.LayoutParams)view.getLayoutParams();
                obj.leftMargin = Math.max(((android.support.v7.widget.GridLayoutManager.LayoutParams) (obj)).leftMargin - i, 0);
                obj.rightMargin = Math.max(((android.support.v7.widget.GridLayoutManager.LayoutParams) (obj)).rightMargin - i, 0);
                obj.topMargin = Math.max(((android.support.v7.widget.GridLayoutManager.LayoutParams) (obj)).topMargin - j, 0);
                obj.bottomMargin = Math.max(((android.support.v7.widget.GridLayoutManager.LayoutParams) (obj)).bottomMargin - j, 0);
                view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
        }
    }

    public static interface SpanCountChangeListener
    {

        public abstract void onSpanCountChanged();
    }


    private static final double COS_45 = Math.cos(Math.toRadians(45D));
    public GamesRecyclerAdapter mContainingAdapter;
    public boolean mIsFlinging;
    android.support.v7.widget.RecyclerView.ItemAnimator mItemAnimator;
    public LogflowEventListener mLogListener;
    private RecyclerView mRecyclerView;
    boolean mShouldLoadImages;
    private final android.support.v7.widget.GridLayoutManager.SpanSizeLookup mSpanSizeLookup = new android.support.v7.widget.GridLayoutManager.SpanSizeLookup() {

        final GamesRecyclerAdapter this$0;

        public final int getSpanSize(int i)
        {
            return GamesRecyclerAdapter.this.getSpanSize(i);
        }

            
            {
                this$0 = GamesRecyclerAdapter.this;
                super();
            }
    };
    private boolean mWaitingOnRecyclerView;

    public GamesRecyclerAdapter()
    {
        mShouldLoadImages = true;
        mWaitingOnRecyclerView = false;
        mIsFlinging = false;
        mContainingAdapter = null;
        mItemAnimator = null;
    }

    public final void enableImageLoading(boolean flag, boolean flag1)
    {
        if (mShouldLoadImages != flag)
        {
            mShouldLoadImages = flag;
            if (flag1 && usesLoadImage())
            {
                notifyForImageLoad();
            }
        }
    }

    public final int getBasePosition()
    {
        if (mContainingAdapter != null)
        {
            return mContainingAdapter.getNestedBasePosition(this);
        } else
        {
            return 0;
        }
    }

    public void getItemOffsets$3bb5fad4(Rect rect)
    {
    }

    protected int getNestedBasePosition(GamesRecyclerAdapter gamesrecycleradapter)
    {
        return 0;
    }

    public abstract int getSpanCount();

    protected int getSpanSize(int i)
    {
        return 1;
    }

    public android.support.v7.widget.GridLayoutManager.SpanSizeLookup getSpanSizeLookup()
    {
        return mSpanSizeLookup;
    }

    public int getTopPaddingResId()
    {
        return 0;
    }

    public boolean isVisible()
    {
        return !mWaitingOnRecyclerView;
    }

    public void notifyForImageLoad()
    {
        int k = getItemCount();
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.support.v7.widget.RecyclerView.ViewHolder viewholder;
        int j;
        Object obj;
        for (obj = this; obj != null && ((GamesRecyclerAdapter) (obj)).mRecyclerView == null; obj = ((GamesRecyclerAdapter) (obj)).mContainingAdapter) { }
        int i;
        int l;
        int i1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((GamesRecyclerAdapter) (obj)).mRecyclerView;
        }
        if (obj == null) goto _L1; else goto _L3
_L3:
        l = getBasePosition();
        i = 0;
_L7:
        if (i >= k) goto _L1; else goto _L4
_L4:
        if (((RecyclerView) (obj)).mDataSetHasChangedAfterLayout)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        i1 = ((RecyclerView) (obj)).mChildHelper.getUnfilteredChildCount();
        j = 0;
_L8:
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        viewholder = RecyclerView.getChildViewHolderInt(((RecyclerView) (obj)).mChildHelper.getUnfilteredChildAt(j));
        if (viewholder == null || viewholder.isRemoved() || ((RecyclerView) (obj)).getAdapterPositionFor(viewholder) != l + i) goto _L6; else goto _L5
_L5:
        if (viewholder != null)
        {
            ((GamesRecyclerViewHolder)viewholder).repopulateViews();
        }
        i++;
          goto _L7
_L6:
        j++;
          goto _L8
        viewholder = null;
          goto _L5
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerview)
    {
        super.onAttachedToRecyclerView(recyclerview);
        boolean flag;
        if (mRecyclerView == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mRecyclerView = recyclerview;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerview)
    {
        boolean flag;
        if (mRecyclerView == recyclerview)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mRecyclerView = null;
        super.onDetachedFromRecyclerView(recyclerview);
    }

    public void onFlingBegin()
    {
        enableImageLoading(false, false);
        mIsFlinging = true;
    }

    public void onFlingEnd()
    {
        enableImageLoading(true, true);
        mIsFlinging = false;
    }

    final void setWaitingOnRecyclerView(boolean flag)
    {
        int i;
label0:
        {
            i = getItemCount();
            boolean flag1 = isVisible();
            mWaitingOnRecyclerView = flag;
            flag = isVisible();
            if (flag1 != flag)
            {
                if (!flag)
                {
                    break label0;
                }
                notifyItemRangeInserted(0, getItemCount());
            }
            return;
        }
        notifyItemRangeRemoved(0, i);
    }

    public abstract boolean usesLoadImage();


}
