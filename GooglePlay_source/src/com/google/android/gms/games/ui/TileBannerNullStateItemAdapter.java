// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui:
//            SingleItemAdapter, GamesViewHolder, GamesBaseAdapter

public final class TileBannerNullStateItemAdapter extends SingleItemAdapter
{
    private final class ViewHolder extends GamesViewHolder
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final View mButtonOverlay;
        final TextView mButtonView;
        final View mDividerView;
        final ImageView mImageView;
        private final View mRootView;
        final TextView mTextView;
        final View mTileOverlay;
        final TileBannerNullStateItemAdapter this$0;

        final boolean applyImageRightMargin(boolean flag)
        {
            boolean flag1 = false;
            int i = mImageView.getWidth();
            if (i > 0)
            {
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mImageView.getLayoutParams();
                layoutparams.rightMargin = -(int)((float)i / 3F);
                mImageView.setLayoutParams(layoutparams);
                mImageView.setVisibility(0);
                flag1 = true;
            } else
            {
                mImageView.setVisibility(4);
                if (flag)
                {
                    mImageView.getViewTreeObserver().addOnGlobalLayoutListener(this);
                    return false;
                }
            }
            return flag1;
        }

        public final void onGlobalLayout()
        {
            ViewTreeObserver viewtreeobserver;
label0:
            {
                if (mType != 3 && mType != 5 && applyImageRightMargin(false))
                {
                    viewtreeobserver = mImageView.getViewTreeObserver();
                    if (!PlatformVersion.checkVersion(16))
                    {
                        break label0;
                    }
                    viewtreeobserver.removeOnGlobalLayoutListener(this);
                }
                return;
            }
            viewtreeobserver.removeGlobalOnLayoutListener(this);
        }

        public ViewHolder(GamesBaseAdapter gamesbaseadapter, View view)
        {
            this$0 = TileBannerNullStateItemAdapter.this;
            super(gamesbaseadapter);
            mRootView = view;
            mImageView = (ImageView)view.findViewById(0x7f0d006f);
            mTextView = (TextView)view.findViewById(0x7f0d009f);
            mDividerView = view.findViewById(0x7f0d025a);
            mButtonView = (TextView)view.findViewById(0x7f0d011b);
            mTileOverlay = view.findViewById(0x7f0d02a4);
            mButtonOverlay = view.findViewById(0x7f0d02a5);
            mRootView.setPadding(mRootView.getPaddingLeft(), 0, mRootView.getPaddingRight(), mRootView.getPaddingBottom());
            if (mType != 2) goto _L2; else goto _L1
_L1:
            gamesbaseadapter = view.findViewById(0x7f0d02a2);
            view = gamesbaseadapter.getLayoutParams();
            view.height = mContext.getResources().getDimensionPixelSize(0x7f0c01eb);
            gamesbaseadapter.setLayoutParams(view);
            if (PlatformVersion.checkVersion(17))
            {
                mButtonView.setCompoundDrawablesRelativeWithIntrinsicBounds(0x7f0200f5, 0, 0, 0);
            } else
            {
                mButtonView.setCompoundDrawablesWithIntrinsicBounds(0x7f0200f5, 0, 0, 0);
            }
_L4:
            if (mTileTag != null)
            {
                mTileOverlay.setOnClickListener(mOnClickListener);
                mTileOverlay.setTag(mTileTag);
            }
            if (mButtonTag != null)
            {
                mButtonOverlay.setOnClickListener(mOnClickListener);
                mButtonOverlay.setTag(mButtonTag);
            }
            return;
_L2:
            if (mType == 3)
            {
                gamesbaseadapter = (android.widget.RelativeLayout.LayoutParams)mImageView.getLayoutParams();
                gamesbaseadapter.height = -2;
                gamesbaseadapter.width = -2;
                gamesbaseadapter.addRule(11, -1);
                gamesbaseadapter.addRule(10, -1);
                int i = mContext.getResources().getDimensionPixelSize(0x7f0c01ef);
                mImageView.setPadding(0, i, i, 0);
                mImageView.setLayoutParams(gamesbaseadapter);
                gamesbaseadapter = mDividerView.getLayoutParams();
                gamesbaseadapter.width = -1;
                mDividerView.setLayoutParams(gamesbaseadapter);
            } else
            if (mType == 5)
            {
                gamesbaseadapter = view.findViewById(0x7f0d02a2);
                view = gamesbaseadapter.getLayoutParams();
                view.height = mContext.getResources().getDimensionPixelSize(0x7f0c01ea);
                gamesbaseadapter.setLayoutParams(view);
                gamesbaseadapter = (android.widget.RelativeLayout.LayoutParams)mImageView.getLayoutParams();
                gamesbaseadapter.height = -2;
                gamesbaseadapter.width = -2;
                gamesbaseadapter.addRule(11, -1);
                gamesbaseadapter.addRule(10, -1);
                int j = mContext.getResources().getDimensionPixelSize(0x7f0c01ef);
                mImageView.setPadding(0, j, j, 0);
                mImageView.setLayoutParams(gamesbaseadapter);
                gamesbaseadapter = mDividerView.getLayoutParams();
                gamesbaseadapter.width = -1;
                mDividerView.setLayoutParams(gamesbaseadapter);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }
    }


    private final int mButtonResId;
    private final String mButtonTag;
    private final Context mContext;
    private final int mDrawableResId;
    private final LayoutInflater mInflater;
    private final android.view.View.OnClickListener mOnClickListener;
    private final int mTextResId;
    private final String mTileTag;
    private final int mTopPadding;
    private final int mType;

    public TileBannerNullStateItemAdapter(Context context, int i, int j, int k, android.view.View.OnClickListener onclicklistener, String s, String s1)
    {
        this(context, i, j, k, onclicklistener, s, s1, 2);
    }

    private TileBannerNullStateItemAdapter(Context context, int i, int j, int k, android.view.View.OnClickListener onclicklistener, String s, String s1, 
            int l)
    {
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mDrawableResId = i;
        mTextResId = j;
        mButtonResId = k;
        mOnClickListener = onclicklistener;
        mTileTag = s;
        mButtonTag = s1;
        mType = 2;
        mTopPadding = 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = mInflater.inflate(0x7f0400e1, viewgroup, false);
            UiUtils.hideViewFromAccessibilityServices(view1);
            view1.setTag(new ViewHolder(this, view1));
        }
        view = (ViewHolder)view1.getTag();
        ((ViewHolder) (view)).mImageView.setImageResource(((ViewHolder) (view))._fld0.mDrawableResId);
        if (((ViewHolder) (view))._fld0.mType != 3 && ((ViewHolder) (view))._fld0.mType != 5)
        {
            view.applyImageRightMargin(true);
        } else
        {
            ((ViewHolder) (view)).mImageView.setVisibility(0);
        }
        ((ViewHolder) (view)).mTextView.setText(((ViewHolder) (view))._fld0.mTextResId);
        ((ViewHolder) (view)).mTileOverlay.setContentDescription(((ViewHolder) (view))._fld0.mContext.getString(((ViewHolder) (view))._fld0.mTextResId));
        if (((ViewHolder) (view))._fld0.mButtonResId > 0)
        {
            ((ViewHolder) (view)).mDividerView.setVisibility(0);
            ((ViewHolder) (view)).mButtonView.setVisibility(0);
            ((ViewHolder) (view)).mButtonView.setText(((ViewHolder) (view))._fld0.mButtonResId);
            ((ViewHolder) (view)).mButtonOverlay.setContentDescription(((ViewHolder) (view))._fld0.mContext.getResources().getString(((ViewHolder) (view))._fld0.mButtonResId));
            return view1;
        } else
        {
            ((ViewHolder) (view)).mDividerView.setVisibility(8);
            ((ViewHolder) (view)).mButtonView.setVisibility(8);
            return view1;
        }
    }






}
