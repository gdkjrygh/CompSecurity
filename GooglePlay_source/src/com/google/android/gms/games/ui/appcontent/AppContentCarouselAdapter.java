// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            CarouselPagerAdapter, ExtendedAppContentSection, CarouselViewPager, TextViewLayoutSlot, 
//            AppContentUtils

public final class AppContentCarouselAdapter extends SingleItemRecyclerAdapter
{
    private static final class CarouselAdapterViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
        implements CarouselViewPager.LayoutChangedListener, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider
    {

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
                    mBannerImageView.getLayoutParams().height = i;
                    mBannerImageView.post(new Runnable() {

                        final CarouselAdapterViewHolder this$0;

                        public final void run()
                        {
                            mBannerImageView.requestLayout();
                        }

            
            {
                this$0 = CarouselAdapterViewHolder.this;
                super();
            }
                    });
                }
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (AppContentCarouselAdapter)super.mAdapter;
            AppContentUtils.resetLayoutSlots(this);
            mMakeBannerVisibleOnResize = false;
            CarouselViewPager carouselviewpager = mViewPager;
            carouselviewpager.mNumColumns = ((AppContentCarouselAdapter) (gamesrecycleradapter)).mCardAdapter.getSpanCount();
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
            mViewPager.setAdapter(((AppContentCarouselAdapter) (gamesrecycleradapter)).mPagerAdapter);
            AppContentUtils.populateLayoutSlots(((AppContentCarouselAdapter) (gamesrecycleradapter)).mSection, this);
        }

        public CarouselAdapterViewHolder(View view)
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

    private final class CarouselAdapterViewHolder.BannerLayoutSlot extends LayoutSlot
    {

        final CarouselAdapterViewHolder this$0;

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
            obj = CarouselAdapterViewHolder.this;
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

        private CarouselAdapterViewHolder.BannerLayoutSlot()
        {
            this$0 = CarouselAdapterViewHolder.this;
            super();
        }

        CarouselAdapterViewHolder.BannerLayoutSlot(byte byte0)
        {
            this();
        }
    }


    DatabufferRecyclerAdapter mCardAdapter;
    CarouselPagerAdapter mPagerAdapter;
    private final ExtendedAppContentSection mSection;

    public AppContentCarouselAdapter(Context context, ExtendedAppContentSection extendedappcontentsection)
    {
        super(context);
        mSection = extendedappcontentsection;
    }

    public final void getItemOffsets$3bb5fad4(Rect rect)
    {
        int i = mContext.getResources().getDimensionPixelOffset(0x7f0c014d);
        rect.left = -i;
        rect.right = -i;
    }

    public final int getItemViewType()
    {
        return 0x7f04004c;
    }

    public final void notifyForImageLoad()
    {
        for (Iterator iterator = mPagerAdapter.mInUseContainers.iterator(); iterator.hasNext(); ((com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder)((View)iterator.next()).getTag()).repopulateViews()) { }
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new CarouselAdapterViewHolder(mInflater.inflate(0x7f04004c, viewgroup, false));
    }

    public final void onFlingBegin()
    {
        super.onFlingBegin();
        if (mCardAdapter != null)
        {
            mCardAdapter.onFlingBegin();
        }
    }

    public final void onFlingEnd()
    {
        super.onFlingEnd();
        if (mCardAdapter != null)
        {
            mCardAdapter.onFlingEnd();
        }
    }

    public final boolean usesLoadImage()
    {
        return true;
    }



}
