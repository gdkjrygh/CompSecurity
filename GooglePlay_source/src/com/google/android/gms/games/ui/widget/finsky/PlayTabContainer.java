// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget.finsky;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.util.InboxCountAdapter;

// Referenced classes of package com.google.android.gms.games.ui.widget.finsky:
//            PlayTabStrip

public class PlayTabContainer extends HorizontalScrollView
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    private final class ViewPagerAdapterDataSetObserver extends DataSetObserver
    {

        final PlayTabContainer this$0;

        public final void onChanged()
        {
            super.onChanged();
            updateTabStrip();
        }

        private ViewPagerAdapterDataSetObserver()
        {
            this$0 = PlayTabContainer.this;
            super();
        }

        ViewPagerAdapterDataSetObserver(byte byte0)
        {
            this();
        }
    }


    private final ViewPagerAdapterDataSetObserver mDataSetObserver;
    private final LayoutInflater mInflater;
    private boolean mIsViewPagerLayoutDone;
    private int mLastScrollTo;
    public int mScrollState;
    private PlayTabStrip mTabStrip;
    private final int mTitleOffset;
    private ViewPager mViewPager;

    public PlayTabContainer(Context context)
    {
        this(context, null);
    }

    public PlayTabContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mIsViewPagerLayoutDone = false;
        setHorizontalScrollBarEnabled(false);
        mDataSetObserver = new ViewPagerAdapterDataSetObserver((byte)0);
        mInflater = LayoutInflater.from(getContext());
        mTitleOffset = context.getResources().getDimensionPixelSize(0x7f0c0341);
    }

    private void scrollToChild(int i, int j)
    {
        if (mTabStrip.getChildCount() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k = mTabStrip.getChildAt(i).getLeft() + j;
        if (i <= 0)
        {
            i = k;
            if (j <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = k - mTitleOffset;
        if (i == mLastScrollTo) goto _L1; else goto _L3
_L3:
        mLastScrollTo = i;
        scrollTo(i, 0);
        return;
    }

    private void updateTabStrip()
    {
        PagerAdapter pageradapter = mViewPager.mAdapter;
        InboxCountAdapter inboxcountadapter = null;
        if (pageradapter instanceof com.google.android.gms.games.ui.util.InboxCountAdapter.InboxCountAdapterProvider)
        {
            inboxcountadapter = ((com.google.android.gms.games.ui.util.InboxCountAdapter.InboxCountAdapterProvider)pageradapter).getInboxCountAdapter();
        }
        mTabStrip.removeAllViews();
        final int indexToSelect = 0;
        while (indexToSelect < pageradapter.getCount()) 
        {
            View view = mInflater.inflate(0x7f04012e, mTabStrip, false);
            ((TextView)view.findViewById(0x7f0d0075)).setText(pageradapter.getPageTitle(indexToSelect));
            TextView textview = (TextView)view.findViewById(0x7f0d01a4);
            int i = 0;
            if (inboxcountadapter != null)
            {
                i = inboxcountadapter.getPageInboxCount(indexToSelect);
            }
            if (i > 0)
            {
                textview.setVisibility(0);
                GradientDrawable gradientdrawable = new GradientDrawable();
                if (i >= 10)
                {
                    gradientdrawable.setShape(0);
                    gradientdrawable.setCornerRadius(getResources().getDimensionPixelSize(0x7f0c00e2));
                } else
                {
                    gradientdrawable.setShape(1);
                }
                gradientdrawable.setColor(getResources().getColor(0x7f0b0255));
                if (PlatformVersion.checkVersion(16))
                {
                    textview.setBackground(gradientdrawable);
                } else
                {
                    textview.setBackgroundDrawable(gradientdrawable);
                }
                if (i > 99)
                {
                    textview.setText(0x7f100183);
                } else
                {
                    textview.setText(String.valueOf(i));
                }
            } else
            {
                textview.setVisibility(8);
            }
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final PlayTabContainer this$0;
                final int val$indexToSelect;

                public final void onClick(View view1)
                {
                    mViewPager.setCurrentItem(indexToSelect, true);
                }

            
            {
                this$0 = PlayTabContainer.this;
                indexToSelect = i;
                super();
            }
            });
            mTabStrip.addView(view);
            indexToSelect++;
        }
        if (mIsViewPagerLayoutDone)
        {
            scrollToChild(mViewPager.mCurItem, 0);
            return;
        } else
        {
            mTabStrip.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final PlayTabContainer this$0;

                public final void onGlobalLayout()
                {
                    scrollToChild(mViewPager.mCurItem);
                    mIsViewPagerLayoutDone;
                    mTabStrip.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }

            
            {
                this$0 = PlayTabContainer.this;
                super();
            }
            });
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mTabStrip = (PlayTabStrip)findViewById(0x7f0d01f1);
    }

    public final void onPageScrollStateChanged(int i)
    {
        mScrollState = i;
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        if (mTabStrip.getChildCount() == 0)
        {
            return;
        } else
        {
            PlayTabStrip playtabstrip = mTabStrip;
            playtabstrip.mIndexForSelection = i;
            playtabstrip.mSelectionOffset = f;
            playtabstrip.invalidate();
            scrollToChild(i, (int)((float)mTabStrip.getChildAt(i).getWidth() * f));
            return;
        }
    }

    public final void onPageSelected(int i)
    {
        if (mScrollState == 0)
        {
            PlayTabStrip playtabstrip = mTabStrip;
            playtabstrip.mIndexForSelection = i;
            playtabstrip.mSelectionOffset = 0.0F;
            playtabstrip.invalidate();
            scrollToChild(i, 0);
        }
    }

    public final void setSelectedIndicatorColor(int i)
    {
        PlayTabStrip playtabstrip = mTabStrip;
        playtabstrip.mSelectedUnderlinePaint.setColor(i);
        playtabstrip.invalidate();
    }

    public final void setViewPager(ViewPager viewpager)
    {
        if (mViewPager != null)
        {
            mViewPager.mAdapter.unregisterDataSetObserver(mDataSetObserver);
        }
        mViewPager = viewpager;
        mViewPager.mAdapter.registerDataSetObserver(mDataSetObserver);
        updateTabStrip();
    }




/*
    static boolean access$302$5b7daba5(PlayTabContainer playtabcontainer)
    {
        playtabcontainer.mIsViewPagerLayoutDone = true;
        return true;
    }

*/


}
