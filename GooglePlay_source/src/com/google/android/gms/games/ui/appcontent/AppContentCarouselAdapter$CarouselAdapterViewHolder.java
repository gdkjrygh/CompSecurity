// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentCarouselAdapter, CarouselViewPager, TextViewLayoutSlot, AppContentUtils

private static final class mViewPager extends com.google.android.gms.games.ui.ViewHolder
    implements mViewPager, com.google.android.gms.games.ui.layouts.er
{
    private final class BannerLayoutSlot extends LayoutSlot
    {

        final AppContentCarouselAdapter.CarouselAdapterViewHolder this$0;

        public final void resetAnnotation()
        {
            super.resetAnnotation();
            mBannerImageView.setVisibility(8);
        }

        public final void setAnnotation(AppContentAnnotation appcontentannotation)
        {
            float f;
            Object obj;
            f = 0.8F;
            super.setAnnotation(appcontentannotation);
            obj = AppContentCarouselAdapter.CarouselAdapterViewHolder.this;
            if (appcontentannotation.getModifiers() != null) goto _L2; else goto _L1
_L1:
            obj.mBannerHeight = f;
            obj = appcontentannotation.getImageUri();
            int i = AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId());
            if (obj != null || i > 0)
            {
                mBannerImageView.loadUri$3329f911(((android.net.Uri) (obj)), i, true);
                mMakeBannerVisibleOnResize = true;
                mViewPager.requestLayout();
            }
            return;
_L2:
            String s = appcontentannotation.getModifiers().getString("height");
            if (!TextUtils.isEmpty(s))
            {
                f = Float.parseFloat(s);
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        private BannerLayoutSlot()
        {
            this$0 = AppContentCarouselAdapter.CarouselAdapterViewHolder.this;
            super();
        }

        BannerLayoutSlot(byte byte0)
        {
            this();
        }
    }


    float mBannerHeight;
    LoadingImageView mBannerImageView;
    private View mHeaderLayout;
    private ArrayMap mLayoutSlots;
    boolean mMakeBannerVisibleOnResize;
    private TextView mTitleTextView;
    CarouselViewPager mViewPager;

    public final LayoutSlot getLayoutSlot(String s)
    {
        return (LayoutSlot)mLayoutSlots.get(s);
    }

    public final Collection getLayoutSlots()
    {
        return mLayoutSlots.values();
    }

    public final void onLayout()
    {
        if (mMakeBannerVisibleOnResize)
        {
            mBannerImageView.setVisibility(0);
            mMakeBannerVisibleOnResize = false;
        }
        if (mBannerImageView.getVisibility() == 0)
        {
            int i = mHeaderLayout.getMeasuredHeight() + (int)(mBannerHeight * (float)mViewPager.getMeasuredHeight());
            if (mBannerImageView.getMeasuredHeight() != i)
            {
                mBannerImageView.setMinimumHeight(i);
                mBannerImageView.setMaxHeight(i);
                mBannerImageView.getLayoutParams().tLayoutParams = i;
                mBannerImageView.post(new Runnable() {

                    final AppContentCarouselAdapter.CarouselAdapterViewHolder this$0;

                    public final void run()
                    {
                        mBannerImageView.requestLayout();
                    }

            
            {
                this$0 = AppContentCarouselAdapter.CarouselAdapterViewHolder.this;
                super();
            }
                });
            }
        }
    }

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        super.ateViews(gamesrecycleradapter, i);
        gamesrecycleradapter = (AppContentCarouselAdapter)super.r;
        AppContentUtils.resetLayoutSlots(this);
        mMakeBannerVisibleOnResize = false;
        CarouselViewPager carouselviewpager = mViewPager;
        carouselviewpager.mNumColumns = AppContentCarouselAdapter.access$200(gamesrecycleradapter).getSpanCount();
        Display display = ((WindowManager)carouselviewpager.getContext().getSystemService("window")).getDefaultDisplay();
        if (PlatformVersion.checkVersion(13))
        {
            Point point = new Point();
            display.getSize(point);
            i = point.x;
        } else
        {
            i = display.getWidth();
        }
        carouselviewpager.mCardWidth = i / carouselviewpager.mNumColumns;
        i = carouselviewpager.getContext().getResources().getDimensionPixelSize(0x7f0c0130);
        carouselviewpager.mPageMarginFix = carouselviewpager.mCardWidth / 10;
        carouselviewpager.setPageMargin(i + carouselviewpager.mPageMarginFix * -2);
        carouselviewpager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(AppContentCarouselAdapter.access$300(gamesrecycleradapter));
        AppContentUtils.populateLayoutSlots(AppContentCarouselAdapter.access$400(gamesrecycleradapter), this);
    }

    public _cls1.this._cls0(View view)
    {
        super(view);
        mMakeBannerVisibleOnResize = false;
        mBannerHeight = 0.8F;
        mHeaderLayout = view.findViewById(0x7f0d0120);
        mBannerImageView = (LoadingImageView)view.findViewById(0x7f0d011f);
        mTitleTextView = (TextView)view.findViewById(0x7f0d0121);
        mViewPager = (CarouselViewPager)view.findViewById(0x7f0d0122);
        mLayoutSlots = new ArrayMap();
        mLayoutSlots.put("BANNER", new BannerLayoutSlot((byte)0));
        mLayoutSlots.put("TITLE", (new TextViewLayoutSlot(mContext, mTitleTextView, (byte)0)).setDefaultTextColorResId(0x106000b));
        mViewPager.mLayoutChangedListener = this;
    }
}
