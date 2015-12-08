// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ListFragment;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.enums.CardCategory;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.adapters.AppboyListAdapter;
import java.util.ArrayList;
import java.util.EnumSet;

public class AppboyFeedFragment extends ListFragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{

    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500L;
    private static final int MAX_FEED_TTL_SECONDS = 60;
    private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String TAG;
    private int currentCardIndexAtBottomOfScreen;
    private AppboyListAdapter mAdapter;
    private Appboy mAppboy;
    private EnumSet mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    private SwipeRefreshLayout mFeedSwipeLayout;
    private IEventSubscriber mFeedUpdatedSubscriber;
    private GestureDetectorCompat mGestureDetector;
    private ProgressBar mLoadingSpinner;
    private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    private LinearLayout mNetworkErrorLayout;
    private final Runnable mShowNetworkError = new Runnable() {

        final AppboyFeedFragment this$0;

        public void run()
        {
            if (mLoadingSpinner != null)
            {
                mLoadingSpinner.setVisibility(8);
            }
            if (mNetworkErrorLayout != null)
            {
                mNetworkErrorLayout.setVisibility(0);
            }
        }

            
            {
                this$0 = AppboyFeedFragment.this;
                super();
            }
    };
    private boolean mSkipCardImpressionsReset;
    private View mTransparentFullBoundsContainerView;
    private int previousVisibleHeadCardIndex;

    public AppboyFeedFragment()
    {
    }

    private void setOnScreenCardsToRead()
    {
        mAdapter.batchSetCardsToRead(previousVisibleHeadCardIndex, currentCardIndexAtBottomOfScreen);
    }

    public EnumSet getCategories()
    {
        return mCategories;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        final ListView listView;
        if (mSkipCardImpressionsReset)
        {
            mSkipCardImpressionsReset = false;
        } else
        {
            mAdapter.resetCardImpressionTracker();
            AppboyLogger.d(TAG, "Resetting card impressions.");
        }
        bundle = LayoutInflater.from(getActivity());
        listView = getListView();
        listView.addHeaderView(bundle.inflate(R.layout.com_appboy_feed_header, null));
        listView.addFooterView(bundle.inflate(R.layout.com_appboy_feed_footer, null));
        mFeedRootLayout.setOnTouchListener(new android.view.View.OnTouchListener() {

            final AppboyFeedFragment this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return mGestureDetector.a(motionevent);
            }

            
            {
                this$0 = AppboyFeedFragment.this;
                super();
            }
        });
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final AppboyFeedFragment this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                abslistview = mFeedSwipeLayout;
                boolean flag;
                if (i == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                abslistview.setEnabled(flag);
                if (j == 0)
                {
                    return;
                }
                k = i - 1;
                if (k > previousVisibleHeadCardIndex)
                {
                    mAdapter.batchSetCardsToRead(previousVisibleHeadCardIndex, k);
                }
                previousVisibleHeadCardIndex = k;
                currentCardIndexAtBottomOfScreen = i + j;
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = AppboyFeedFragment.this;
                super();
            }
        });
        mTransparentFullBoundsContainerView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final AppboyFeedFragment this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return view.getVisibility() == 0;
            }

            
            {
                this$0 = AppboyFeedFragment.this;
                super();
            }
        });
        mAppboy.removeSingleSubscription(mFeedUpdatedSubscriber, com/appboy/events/FeedUpdatedEvent);
        mFeedUpdatedSubscriber = new IEventSubscriber() {

            final AppboyFeedFragment this$0;
            final ListView val$listView;

            public void trigger(FeedUpdatedEvent feedupdatedevent)
            {
                android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
                if (fragmentactivity == null)
                {
                    return;
                } else
                {
                    fragmentactivity.runOnUiThread(feedupdatedevent. new Runnable() {

                        final _cls5 this$1;
                        final FeedUpdatedEvent val$event;

                        public void run()
                        {
                            AppboyLogger.d(AppboyFeedFragment.TAG, (new StringBuilder()).append("Updating feed views in response to FeedUpdatedEvent: ").append(event).toString());
                            mMainThreadLooper.removeCallbacks(mShowNetworkError);
                            mNetworkErrorLayout.setVisibility(8);
                            if (event.getCardCount(mCategories) == 0)
                            {
                                listView.setVisibility(8);
                                mAdapter.clear();
                            } else
                            {
                                mEmptyFeedLayout.setVisibility(8);
                                mLoadingSpinner.setVisibility(8);
                                mTransparentFullBoundsContainerView.setVisibility(8);
                            }
                            if (event.isFromOfflineStorage() && (event.lastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
                            {
                                AppboyLogger.i(AppboyFeedFragment.TAG, String.format("Feed received was older than the max time to live of %d seconds, displaying it for now, but requesting an updated view from the server.", new Object[] {
                                    Integer.valueOf(60)
                                }));
                                mAppboy.requestFeedRefresh();
                                if (event.getCardCount(mCategories) == 0)
                                {
                                    AppboyLogger.d(AppboyFeedFragment.TAG, String.format("Old feed was empty, putting up a network spinner and registering the network error message on a delay of %dms.", new Object[] {
                                        Integer.valueOf(5000)
                                    }));
                                    mEmptyFeedLayout.setVisibility(8);
                                    mLoadingSpinner.setVisibility(0);
                                    mTransparentFullBoundsContainerView.setVisibility(0);
                                    mMainThreadLooper.postDelayed(mShowNetworkError, 5000L);
                                    return;
                                }
                            }
                            if (event.getCardCount(mCategories) == 0)
                            {
                                mLoadingSpinner.setVisibility(8);
                                mEmptyFeedLayout.setVisibility(0);
                                mTransparentFullBoundsContainerView.setVisibility(0);
                            } else
                            {
                                mAdapter.replaceFeed(event.getFeedCards(mCategories));
                                listView.setVisibility(0);
                            }
                            mFeedSwipeLayout.setRefreshing(false);
                        }

            
            {
                this$1 = final__pcls5;
                event = FeedUpdatedEvent.this;
                super();
            }
                    });
                    return;
                }
            }

            public volatile void trigger(Object obj)
            {
                trigger((FeedUpdatedEvent)obj);
            }

            
            {
                this$0 = AppboyFeedFragment.this;
                listView = listview;
                super();
            }
        };
        mAppboy.subscribeToFeedUpdates(mFeedUpdatedSubscriber);
        listView.setAdapter(mAdapter);
        mAppboy.requestFeedRefreshFromCache();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mAppboy = Appboy.getInstance(activity);
        if (mAdapter == null)
        {
            mAdapter = new AppboyListAdapter(activity, R.id.tag, new ArrayList());
            mCategories = CardCategory.ALL_CATEGORIES;
        }
        setRetainInstance(true);
        mGestureDetector = new GestureDetectorCompat(activity, new FeedGestureListener());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(R.layout.com_appboy_feed, viewgroup, false);
        mNetworkErrorLayout = (LinearLayout)layoutinflater.findViewById(R.id.com_appboy_feed_network_error);
        mLoadingSpinner = (ProgressBar)layoutinflater.findViewById(R.id.com_appboy_feed_loading_spinner);
        mEmptyFeedLayout = (LinearLayout)layoutinflater.findViewById(R.id.com_appboy_feed_empty_feed);
        mFeedRootLayout = (RelativeLayout)layoutinflater.findViewById(R.id.com_appboy_feed_root);
        mFeedSwipeLayout = (SwipeRefreshLayout)layoutinflater.findViewById(R.id.appboy_feed_swipe_container);
        mFeedSwipeLayout.setOnRefreshListener(this);
        mFeedSwipeLayout.setEnabled(false);
        mFeedSwipeLayout.setColorSchemeResources(new int[] {
            R.color.com_appboy_newsfeed_swipe_refresh_color_1, R.color.com_appboy_newsfeed_swipe_refresh_color_2, R.color.com_appboy_newsfeed_swipe_refresh_color_3, R.color.com_appboy_newsfeed_swipe_refresh_color_4
        });
        mTransparentFullBoundsContainerView = layoutinflater.findViewById(R.id.com_appboy_feed_transparent_full_bounds_container_view);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        mAppboy.removeSingleSubscription(mFeedUpdatedSubscriber, com/appboy/events/FeedUpdatedEvent);
        setOnScreenCardsToRead();
    }

    public void onDetach()
    {
        super.onDetach();
        setListAdapter(null);
    }

    public void onPause()
    {
        super.onPause();
        setOnScreenCardsToRead();
    }

    public void onRefresh()
    {
        mAppboy.requestFeedRefresh();
        mMainThreadLooper.postDelayed(new Runnable() {

            final AppboyFeedFragment this$0;

            public void run()
            {
                mFeedSwipeLayout.setRefreshing(false);
            }

            
            {
                this$0 = AppboyFeedFragment.this;
                super();
            }
        }, 2500L);
    }

    public void onResume()
    {
        super.onResume();
        Appboy.getInstance(getActivity()).logFeedDisplayed();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (isVisible())
        {
            mSkipCardImpressionsReset = true;
        }
    }

    public void setCategories(EnumSet enumset)
    {
        if (enumset != null) goto _L2; else goto _L1
_L1:
        AppboyLogger.i(TAG, "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.");
        mCategories = CardCategory.ALL_CATEGORIES;
_L6:
        if (mAppboy != null)
        {
            mAppboy.requestFeedRefreshFromCache();
        }
_L4:
        return;
_L2:
        if (enumset.isEmpty())
        {
            AppboyLogger.w(TAG, "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.");
            return;
        }
        if (enumset.equals(mCategories)) goto _L4; else goto _L3
_L3:
        mCategories = enumset;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void setCategory(CardCategory cardcategory)
    {
        setCategories(EnumSet.of(cardcategory));
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/AppboyFeedFragment.getName()
        });
    }











/*
    static int access$402(AppboyFeedFragment appboyfeedfragment, int i)
    {
        appboyfeedfragment.previousVisibleHeadCardIndex = i;
        return i;
    }

*/



/*
    static int access$602(AppboyFeedFragment appboyfeedfragment, int i)
    {
        appboyfeedfragment.currentCardIndexAtBottomOfScreen = i;
        return i;
    }

*/




    private class FeedGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final AppboyFeedFragment this$0;

        public boolean onDown(MotionEvent motionevent)
        {
            return true;
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            long l = (motionevent1.getEventTime() - motionevent.getEventTime()) * 2L;
            int i = (int)(((float)l * f1) / 1000F);
            getListView().smoothScrollBy(-i, (int)(l * 2L));
            return true;
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            getListView().smoothScrollBy((int)f1, 0);
            return true;
        }

        public FeedGestureListener()
        {
            this$0 = AppboyFeedFragment.this;
            super();
        }
    }

}
