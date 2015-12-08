// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.quests;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.ui.ClearableAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.quests.InternalQuestViewHolder;
import com.google.android.gms.games.ui.common.quests.QuestEventListener;
import com.google.android.gms.games.ui.common.quests.QuestTileEventListener;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.quests:
//            QuestCarouselViewHolder

public final class QuestCarouselAdapter extends SingleItemRecyclerAdapter
    implements ClearableAdapter
{
    private final class QuestCarouselAdapterViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        private final QuestCarouselPagerAdapter mPagerAdapter;
        private View mRootView;
        final QuestCarouselAdapter this$0;

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            super.populateViews(gamesrecycleradapter, i);
            gamesrecycleradapter = (QuestCarouselAdapter)mAdapter;
            if (((Context) (this)).getResources != null || 
// JavaClassFileOutputException: get_constant: invalid tag

        public QuestCarouselAdapterViewHolder(View view, QuestCarouselPagerAdapter questcarouselpageradapter)
        {
            this$0 = QuestCarouselAdapter.this;
            super(view);
            mRootView = view;
            mViewPager = (ViewPager)view.findViewById(0x7f0d01a0);
            mPagerAdapter = questcarouselpageradapter;
            UiUtils.hideViewFromAccessibilityServices(mRootView);
            UiUtils.hideViewFromAccessibilityServices(mViewPager);
            view = mContext.getResources();
            if (view.getBoolean(0x7f0a000e))
            {
                ((android.widget.RelativeLayout.LayoutParams)mViewPager.getLayoutParams()).height = view.getDimensionPixelSize(0x7f0c01d3);
            }
            mPagerAdapter.mImageLoader = this;
            mViewPager.setAdapter(mPagerAdapter);
        }
    }

    private final class QuestCarouselPagerAdapter extends PagerAdapter
    {

        public QuestBuffer mDataBuffer;
        ImageLoader mImageLoader;
        final QuestCarouselAdapter this$0;

        public final void destroyItem$30510aeb(ViewGroup viewgroup, Object obj)
        {
            viewgroup.removeView((View)obj);
        }

        public final int getCount()
        {
            if (mDataBuffer != null)
            {
                return mDataBuffer.getCount();
            } else
            {
                return 0;
            }
        }

        public final Object instantiateItem(ViewGroup viewgroup, int i)
        {
            Object obj = mParentActivity.getResources();
            View view = 
// JavaClassFileOutputException: get_constant: invalid tag

        public final boolean isViewFromObject(View view, Object obj)
        {
            return view == obj;
        }

        public final void setDataBuffer(QuestBuffer questbuffer)
        {
            if (mDataBuffer != null && mDataBuffer.equals(questbuffer))
            {
                return;
            }
            if (mDataBuffer != null)
            {
                mDataBuffer.release();
            }
            mDataBuffer = questbuffer;
            notifyDataSetChanged();
        }

        private QuestCarouselPagerAdapter()
        {
            this$0 = QuestCarouselAdapter.this;
            super();
        }

        QuestCarouselPagerAdapter(byte byte0)
        {
            this();
        }
    }


    private final QuestEventListener mListener;
    public final QuestCarouselPagerAdapter mPagerAdapter = new QuestCarouselPagerAdapter((byte)0);
    private final GamesFragmentActivity mParentActivity;
    private String mPrimaryQuestId;
    private String mSecondaryQuestId;
    private final QuestTileEventListener mTileListener;
    public ViewPager mViewPager;

    public QuestCarouselAdapter(GamesFragmentActivity gamesfragmentactivity, QuestEventListener questeventlistener, QuestTileEventListener questtileeventlistener)
    {
        SingleItemRecyclerAdapter(gamesfragmentactivity);
        setVisible(false);
        mParentActivity = gamesfragmentactivity;
        mListener = questeventlistener;
        mTileListener = questtileeventlistener;
    }

    public final void clearData()
    {
        mPagerAdapter.setDataBuffer(null);
    }

    public final void getItemOffsets$3bb5fad4(Rect rect)
    {
        int i = mContext.getResources().getDimensionPixelOffset(0x7f0c014d);
        rect.left = -i;
        rect.right = -i;
    }

    public final int getItemViewType()
    {
        return 0x7f040074;
    }

    protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new QuestCarouselAdapterViewHolder(mInflater.inflate(0x7f040074, viewgroup, false), mPagerAdapter);
    }

    public final void scrollToQuestById(String s, String s1)
    {
        QuestBuffer questbuffer = mPagerAdapter.mDataBuffer;
        if (mViewPager == null || questbuffer == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        k = 0;
        j = 0;
        if (s == null && s1 == null) goto _L4; else goto _L3
_L3:
        int i;
        int l;
        i = 0;
        l = questbuffer.getCount();
_L8:
        k = j;
        if (i >= l) goto _L4; else goto _L5
_L5:
        if (!((Quest)questbuffer.get(i)).getQuestId().equals(s)) goto _L7; else goto _L6
_L6:
        k = i;
_L4:
        mViewPager.setCurrentItem(k, false);
        mPrimaryQuestId = null;
        mSecondaryQuestId = null;
        return;
_L7:
        if (((Quest)questbuffer.get(i)).getQuestId().equals(s1))
        {
            j = i;
        }
        i++;
        if (true) goto _L8; else goto _L2
_L2:
        mPrimaryQuestId = s;
        mSecondaryQuestId = s1;
        return;
    }



/*
    static ViewPager access$102(QuestCarouselAdapter questcarouseladapter, ViewPager viewpager)
    {
        questcarouseladapter.mViewPager = viewpager;
        return viewpager;
    }

*/








}
