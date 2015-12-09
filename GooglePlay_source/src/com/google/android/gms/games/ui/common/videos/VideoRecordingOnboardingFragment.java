// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.videos;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.play.utils.Assertions;

// Referenced classes of package com.google.android.gms.games.ui.common.videos:
//            VideoRecordingOnboardingActivity, ColorPageIndicator

public final class VideoRecordingOnboardingFragment extends Fragment
{
    static final class PageInfo
    {

        public int imageResId;
        public int textResId;
        public int titleResId;

        public PageInfo(int i, int j, int k)
        {
            imageResId = i;
            titleResId = j;
            textResId = k;
        }
    }

    private static final class VideoRecordingOnboardingAdapter extends PagerAdapter
    {

        private static final PageInfo PAGE_INFO_ARRAY[] = {
            new PageInfo(0x7f020188, 0x7f1002f0, 0x7f1002ef), new PageInfo(0x7f020189, 0x7f1002f2, 0x7f1002f1), new PageInfo(0x7f02018a, 0x7f1002f4, 0x7f1002f3)
        };
        private final LayoutInflater mInflater;

        public final void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
        {
            viewgroup.removeView((View)obj);
        }

        public final int getCount()
        {
            return 3;
        }

        public final Object instantiateItem(ViewGroup viewgroup, int i)
        {
            View view = mInflater.inflate(0x7f0400ef, null);
            PageInfo pageinfo = PAGE_INFO_ARRAY[i];
            ((ImageView)view.findViewById(0x7f0d006f)).setImageResource(pageinfo.imageResId);
            ((TextView)view.findViewById(0x7f0d0075)).setText(pageinfo.titleResId);
            ((TextView)view.findViewById(0x7f0d009f)).setText(pageinfo.textResId);
            viewgroup.addView(view);
            return view;
        }

        public final boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }



        public VideoRecordingOnboardingAdapter(Context context)
        {
            mInflater = LayoutInflater.from(context);
        }
    }


    private ColorPageIndicator mPageIndicator;
    private ViewPager mPager;
    boolean mSkipped;

    public VideoRecordingOnboardingFragment()
    {
        mSkipped = false;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0400ee, viewgroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        ColorPageIndicator colorpageindicator;
        int i;
        super.onViewCreated(view, bundle);
        mPager = (ViewPager)view.findViewById(0x7f0d01b7);
        mPageIndicator = (ColorPageIndicator)view.findViewById(0x7f0d02cc);
        bundle = mPageIndicator;
        bundle.mSelectedColorResId = 0x7f0b00d4;
        bundle.invalidate();
        bundle = mPageIndicator;
        bundle.mUnselectedColorResId = 0x7f0b00d5;
        bundle.invalidate();
        view = (Button)view.findViewById(0x7f0d02cb);
        bundle = new VideoRecordingOnboardingAdapter(super.mActivity);
        colorpageindicator = mPageIndicator;
        Assertions.checkArgument(true, "numPages must be >=0");
        i = colorpageindicator.getChildCount();
        if (3 >= i) goto _L2; else goto _L1
_L1:
        colorpageindicator.removeViews(3, i - 3);
_L4:
        colorpageindicator.updateContentDescription();
        mPageIndicator.setSelectedPage(0);
        mPager.mOnPageChangeListener = new android.support.v4.view.ViewPager.SimpleOnPageChangeListener() {

            final VideoRecordingOnboardingFragment this$0;

            public final void onPageSelected(int k)
            {
                VideoRecordingOnboardingFragment.access$000(VideoRecordingOnboardingFragment.this, k);
                mPageIndicator.setSelectedPage(k);
            }

            
            {
                this$0 = VideoRecordingOnboardingFragment.this;
                super();
            }
        };
        mPager.setAdapter(bundle);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoRecordingOnboardingFragment this$0;

            public final void onClick(View view1)
            {
                view1 = VideoRecordingOnboardingFragment.this;
                Intent intent;
                Intent intent1;
                boolean flag1;
                if (mPager.mCurItem != VideoRecordingOnboardingAdapter.PAGE_INFO_ARRAY.length - 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                view1.mSkipped = flag1;
                view1 = VideoRecordingOnboardingFragment.this;
                if (((VideoRecordingOnboardingFragment) (view1)).mSkipped)
                {
                    ((VideoRecordingOnboardingActivity)((Fragment) (view1)).mActivity).logAction(4);
                } else
                {
                    ((VideoRecordingOnboardingActivity)((Fragment) (view1)).mActivity).logAction(5);
                }
                view1 = (VideoRecordingOnboardingActivity)((Fragment) (view1)).mActivity;
                UiSharedPrefs.setShownVideoOnboardingFlow$1a552341(view1);
                intent = new Intent();
                intent1 = view1.getIntent();
                intent.putExtra("com.google.android.gms.games.GAME_ID", intent1.getStringExtra("com.google.android.gms.games.GAME_ID"));
                intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", intent1.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME"));
                view1.setResult(-1, intent);
                view1.finish();
            }

            
            {
                this$0 = VideoRecordingOnboardingFragment.this;
                super();
            }
        });
        return;
_L2:
        if (3 > i)
        {
            while (i < 3) 
            {
                ImageView imageview = new ImageView(colorpageindicator.getContext());
                imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                imageview.setImageResource(0x7f020278);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                int j = colorpageindicator.getResources().getDimensionPixelSize(0x7f0c0323) / 2;
                layoutparams.gravity = 16;
                layoutparams.setMargins(j, 0, j, 0);
                colorpageindicator.addView(imageview, layoutparams);
                boolean flag;
                if (i == colorpageindicator.mSelectedPage)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                colorpageindicator.setDotState(imageview, flag);
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


/*
    static void access$000(VideoRecordingOnboardingFragment videorecordingonboardingfragment, int i)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 50
    //                   1 64
    //                   2 69;
           goto _L1 _L2 _L3 _L4
_L1:
        GamesLog.w("VideoRecordingOnboardFrag", (new StringBuilder("goToPage - trying to go to invalid page: ")).append(i).toString());
        return;
_L2:
        i = 1;
_L6:
        ((VideoRecordingOnboardingActivity)((Fragment) (videorecordingonboardingfragment)).mActivity).logAction(i);
        return;
_L3:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 3;
        if (true) goto _L6; else goto _L5
_L5:
        return;
    }

*/



/*
    static boolean access$202(VideoRecordingOnboardingFragment videorecordingonboardingfragment, boolean flag)
    {
        videorecordingonboardingfragment.mSkipped = flag;
        return flag;
    }

*/

}
