// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.play.animation.ShuffleAddItemAnimator;
import com.google.android.play.headerlist.PlayHeaderListLayout;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragment, GamesRecyclerAdapter, RecyclerSpacerAdapter, GamesFragmentActivity, 
//            ClearableAdapter, ImageAwareAdapter, RecyclerAdapterVerifier

public abstract class GamesHeaderRecyclerViewFragment extends GamesFragment
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener, com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager.ActionTextListener, com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager.RetryListener, com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager.RevealListener
{

    private boolean mAllowPostponeRecyclerViewVisibility;
    private ContentObserver mContentObserver;
    private final Handler mHandler;
    protected LayoutInflater mInflater;
    private final android.support.v7.widget.RecyclerView.OnScrollListener mInternalScrollListener;
    private boolean mIsFlinging;
    public LoadingDataRecyclerViewManager mLoadingDataViewManager;
    public GamesFragmentActivity mParent;
    private boolean mPostponeRecyclerViewVisibility;
    public RecyclerView mRecyclerView;
    protected SwipeRefreshLayout mRefreshLayout;
    protected android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener mRefreshListener;
    private final Runnable mRequestFocus;
    private boolean mSkipInitialReveal;
    protected boolean mSwipeRefreshEnabled;
    public int mTopPaddingResId;
    private final RecyclerAdapterVerifier mVerifier;
    public View mView;

    public GamesHeaderRecyclerViewFragment()
    {
        this(0x7f0400c8);
    }

    public GamesHeaderRecyclerViewFragment(int i)
    {
        super(i);
        mHandler = new Handler();
        mRequestFocus = new Runnable() {

            final GamesHeaderRecyclerViewFragment this$0;

            public final void run()
            {
                if (mRecyclerView != null)
                {
                    mRecyclerView.focusableViewAvailable(mRecyclerView);
                }
            }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                super();
            }
        };
        mSwipeRefreshEnabled = false;
        mIsFlinging = false;
        mAllowPostponeRecyclerViewVisibility = true;
        mTopPaddingResId = 0;
        mInternalScrollListener = new android.support.v7.widget.RecyclerView.OnScrollListener() {

            final GamesHeaderRecyclerViewFragment this$0;

            public final void onScrollStateChanged(RecyclerView recyclerview, int j)
            {
                null;
                if (mRecyclerView != null)
                {
                    recyclerview = mRecyclerView.mAdapter;
                    if (recyclerview instanceof ImageAwareAdapter)
                    {
                        if (!mIsFlinging && j == 2)
                        {
                            mIsFlinging = true;
                            ((ImageAwareAdapter)recyclerview).onFlingBegin();
                        } else
                        if (mIsFlinging && j != 2)
                        {
                            mIsFlinging = false;
                            ((ImageAwareAdapter)recyclerview).onFlingEnd();
                            return;
                        }
                    }
                }
            }

            public final void onScrolled(RecyclerView recyclerview, int j, int k)
            {
                null;
            }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                super();
            }
        };
        mVerifier = null;
    }

    private void ensureRecyclerView()
    {
        if (mRecyclerView != null)
        {
            return;
        }
        View view = super.mView;
        if (view == null)
        {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof RecyclerView)
        {
            mRecyclerView = (RecyclerView)view;
        } else
        {
            view = view.findViewById(0x102000a);
            if (!(view instanceof RecyclerView))
            {
                if (view == null)
                {
                    throw new RuntimeException("Your content must have a RecyclerView whose id attribute is android.R.id.list'");
                } else
                {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a RecyclerView class");
                }
            }
            mRecyclerView = (RecyclerView)view;
        }
        mRecyclerView.mHasFixedSize = true;
        if (!hasPlayHeader())
        {
            mRecyclerView.mScrollListener = mInternalScrollListener;
        }
        if (mRecyclerView.mLayout == null)
        {
            mRecyclerView.setLayoutManager(new GridLayoutManager(mParent));
        }
        mRecyclerView.addItemDecoration(new android.support.v7.widget.RecyclerView.ItemDecoration() {

            final GamesHeaderRecyclerViewFragment this$0;

            public final void getItemOffsets$5c1923bd(Rect rect, View view1, RecyclerView recyclerview)
            {
                recyclerview = (GridLayoutManager)recyclerview.mLayout;
                android.support.v7.widget.GridLayoutManager.LayoutParams layoutparams = (android.support.v7.widget.GridLayoutManager.LayoutParams)view1.getLayoutParams();
                int i = layoutparams.mSpanIndex;
                int j = layoutparams.mSpanSize;
                boolean flag;
                if (i == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i + j == ((GridLayoutManager) (recyclerview)).mSpanCount)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                view1 = ((GamesRecyclerAdapter.GamesRecyclerViewHolder)mRecyclerView.getChildViewHolder(view1)).mAdapter;
                if (view1 != null)
                {
                    view1.getItemOffsets$3bb5fad4(rect);
                    if (flag && (float)rect.left < 0.0F || i && (float)rect.right < 0.0F)
                    {
                        mRecyclerView.setClipToPadding(false);
                        return;
                    }
                }
            }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                super();
            }
        });
        mHandler.post(mRequestFocus);
    }

    private GamesRecyclerAdapter getGamesRecyclerAdapter()
    {
        if (mRecyclerView == null)
        {
            return null;
        }
        android.support.v7.widget.RecyclerView.Adapter adapter = mRecyclerView.mAdapter;
        if (adapter == null)
        {
            return null;
        } else
        {
            Asserts.checkState(adapter instanceof GamesRecyclerAdapter);
            return (GamesRecyclerAdapter)adapter;
        }
    }

    private RecyclerSpacerAdapter getPaddingSpacerAdapter(int i, int j)
    {
        Resources resources = getResources();
        int k;
        if (i == 0)
        {
            i = 0;
        } else
        {
            i = resources.getDimensionPixelSize(i);
        }
        k = i;
        if (j != 0)
        {
            k = resources.getDimensionPixelSize(j) - i;
        }
        return new RecyclerSpacerAdapter(mParent, k, false);
    }

    private void initialReveal()
    {
        if (!mSkipInitialReveal && super.mUserVisibleHint && shouldUseAddAnimation() && mRecyclerView != null)
        {
            final GamesRecyclerAdapter gamesAdapter = getGamesRecyclerAdapter();
            if (gamesAdapter != null)
            {
                gamesAdapter.setWaitingOnRecyclerView(true);
                if (!mPostponeRecyclerViewVisibility)
                {
                    mRecyclerView.post(new Runnable() {

                        final GamesHeaderRecyclerViewFragment this$0;
                        final GamesRecyclerAdapter val$gamesAdapter;

                        public final void run()
                        {
                            gamesAdapter.setWaitingOnRecyclerView(false);
                        }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                gamesAdapter = gamesrecycleradapter;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    private void setupRefreshLayout(View view)
    {
        mRefreshLayout = (SwipeRefreshLayout)view.findViewById(0x7f0d01b1);
        mRefreshLayout.setEnabled(mSwipeRefreshEnabled);
        mRefreshLayout.setColorScheme(new int[] {
            0x7f0b00a8, 0x7f0b00aa, 0x7f0b00ab, 0x7f0b00a9
        });
        if (mSwipeRefreshEnabled)
        {
            Preconditions.checkNotNull(mRefreshListener);
            mRefreshLayout.mListener = mRefreshListener;
        }
        view = UiUtils.findPlayHeaderListWrappable(this);
        if (view != null)
        {
            android.support.v4.app.FragmentActivity fragmentactivity = super.mActivity;
            int i = view.getHeaderHeight(fragmentactivity);
            int j = fragmentactivity.getResources().getDimensionPixelSize(0x7f0c01db);
            mRefreshLayout.setProgressViewOffset$4958629f(i, i + j);
        }
    }

    public final View addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = super.addContentView(layoutinflater, viewgroup);
        setupRefreshLayout(layoutinflater);
        return layoutinflater;
    }

    public final void attachScrollListener(PlayHeaderListLayout playheaderlistlayout)
    {
        playheaderlistlayout.mAppRecyclerViewOnScrollListener = mInternalScrollListener;
    }

    public LoadingDataRecyclerViewManager createLoadingDataViewManager(View view)
    {
        view = UiUtils.findPlayHeaderListWrappable(this);
        if (view != null)
        {
            return new LoadingDataRecyclerViewManager(mView, 0x102000a, 0x7f0d01b4, 0x7f0d0166, 0x7f0d01ae, 0x7f0d01b3, this, this, this, view.getHeaderHeight(super.mActivity));
        } else
        {
            return new LoadingDataRecyclerViewManager(mView, this, this, this, (byte)0);
        }
    }

    public final void enableSwipeToRefresh()
    {
        mSwipeRefreshEnabled = true;
        if (mRefreshLayout != null)
        {
            mRefreshLayout.setEnabled(true);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mParent = (GamesFragmentActivity)super.mActivity;
        if (bundle != null)
        {
            mSkipInitialReveal = bundle.getBoolean("INITIAL_REVEAL_COMPLETED", false);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mInflater = layoutinflater;
        mView = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (!(mView instanceof PlayHeaderListLayout))
        {
            setupRefreshLayout(mView);
        }
        mLoadingDataViewManager = createLoadingDataViewManager(mView);
        mLoadingDataViewManager.setViewState(1);
        return mView;
    }

    public final void onDataRevealed()
    {
        initialReveal();
    }

    public void onDestroyView()
    {
        mHandler.removeCallbacks(mRequestFocus);
        android.support.v7.widget.RecyclerView.Adapter adapter = mRecyclerView.mAdapter;
        if (adapter != null && (adapter instanceof ClearableAdapter))
        {
            ((ClearableAdapter)adapter).clearData();
        }
        mRecyclerView = null;
        super.onDestroyView();
    }

    public void onEmptyActionTextClicked()
    {
    }

    public final void onLoadingRevealed()
    {
        mSkipInitialReveal = false;
    }

    public void onPageScrolledTo()
    {
    }

    public void onPageSelected()
    {
        int i = mLoadingDataViewManager.mViewState;
        if (i == 3 || i == 5 || i == 6)
        {
            PlayHeaderListHelper.PlayHeaderListWrappable playheaderlistwrappable = UiUtils.findPlayHeaderListWrappable(this);
            if (playheaderlistwrappable != null)
            {
                float f = playheaderlistwrappable.getVisibleHeaderHeight();
                mLoadingDataViewManager.setNullStateTopMargin((int)f);
            }
        }
    }

    public final void onPlayHeaderListLayoutCreated(PlayHeaderListLayout playheaderlistlayout)
    {
        attachScrollListener(playheaderlistlayout);
    }

    public void onPlayersChanged()
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("INITIAL_REVEAL_COMPLETED", true);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ensureRecyclerView();
    }

    public final void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
        bundle = getGamesRecyclerAdapter();
        if (bundle != null)
        {
            int i = bundle.getSpanCount();
            ((GridLayoutManager)mRecyclerView.mLayout).setSpanCount(i);
        }
    }

    public final void postponeInitialReveal()
    {
        if (mAllowPostponeRecyclerViewVisibility)
        {
            mPostponeRecyclerViewVisibility = true;
        }
    }

    public final void registerPlayerChangeObserver()
    {
        if (mContentObserver != null)
        {
            return;
        } else
        {
            mContentObserver = new ContentObserver() {

                final GamesHeaderRecyclerViewFragment this$0;

                public final void onChange(boolean flag)
                {
                    mParent.runOnUiThread(new Runnable() {

                        final _cls6 this$1;

                        public final void run()
                        {
                            onPlayersChanged();
                        }

            
            {
                this$1 = _cls6.this;
                super();
            }
                    });
                }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                super(null);
            }
            };
            mParent.getContentResolver().registerContentObserver(GamesDataChangeUris.URI_PLAYERS, true, mContentObserver);
            return;
        }
    }

    public final void setAdapter(final android.support.v7.widget.RecyclerView.Adapter finalAdapter)
    {
        boolean flag;
label0:
        {
            final GridLayoutManager layoutManager;
label1:
            {
                Asserts.checkState(finalAdapter instanceof GamesRecyclerAdapter);
                ensureRecyclerView();
                layoutManager = getGamesRecyclerAdapter();
                if (layoutManager != null && (layoutManager instanceof GamesRecyclerAdapter.DynamicSpanCountAdapter))
                {
                    ((GamesRecyclerAdapter.DynamicSpanCountAdapter)layoutManager).setSpanCountChangeListener(null);
                }
                layoutManager = (GamesRecyclerAdapter)finalAdapter;
                int i = layoutManager.getTopPaddingResId();
                Object obj = UiUtils.findPlayHeaderListWrappable(this);
                finalAdapter = layoutManager;
                if (obj != null)
                {
                    finalAdapter = new MergedRecyclerAdapter.Builder();
                    finalAdapter.addAdapter(new RecyclerSpacerAdapter(mParent, ((PlayHeaderListHelper.PlayHeaderListWrappable) (obj)).getHeaderHeight(mParent), true));
                    if (i != 0 || mTopPaddingResId != 0)
                    {
                        finalAdapter.addAdapter(getPaddingSpacerAdapter(i, mTopPaddingResId));
                    }
                    finalAdapter.addAdapter(layoutManager);
                    finalAdapter.addAdapter(getPaddingSpacerAdapter(0, 0x7f0c0130));
                    finalAdapter = finalAdapter.build();
                }
                layoutManager = (GridLayoutManager)mRecyclerView.mLayout;
                layoutManager.setSpanCount(finalAdapter.getSpanCount());
                mRecyclerView.setAdapter(finalAdapter);
                layoutManager.mSpanSizeLookup = finalAdapter.getSpanSizeLookup();
                if (finalAdapter instanceof GamesRecyclerAdapter.DynamicSpanCountAdapter)
                {
                    ((GamesRecyclerAdapter.DynamicSpanCountAdapter)finalAdapter).setSpanCountChangeListener(new GamesRecyclerAdapter.SpanCountChangeListener() {

                        final GamesHeaderRecyclerViewFragment this$0;
                        final GamesRecyclerAdapter val$finalAdapter;
                        final GridLayoutManager val$layoutManager;

                        public final void onSpanCountChanged()
                        {
                            layoutManager.setSpanCount(finalAdapter.getSpanCount());
                        }

            
            {
                this$0 = GamesHeaderRecyclerViewFragment.this;
                layoutManager = gridlayoutmanager;
                finalAdapter = gamesrecycleradapter;
                super();
            }
                    });
                }
                flag = false;
                boolean flag1 = false;
                if (!PlatformVersion.checkVersion(11))
                {
                    break label0;
                }
                obj = mRecyclerView.mItemAnimator;
                if (obj != null)
                {
                    layoutManager = ((GridLayoutManager) (obj));
                    flag = flag1;
                    if (obj instanceof ShuffleAddItemAnimator)
                    {
                        break label1;
                    }
                }
                layoutManager = new ShuffleAddItemAnimator();
                layoutManager.mChangeAnimationsDisabled = true;
                obj = mRecyclerView;
                if (((RecyclerView) (obj)).mItemAnimator != null)
                {
                    ((RecyclerView) (obj)).mItemAnimator.endAnimations();
                    ((RecyclerView) (obj)).mItemAnimator.mListener = null;
                }
                obj.mItemAnimator = layoutManager;
                if (((RecyclerView) (obj)).mItemAnimator != null)
                {
                    ((RecyclerView) (obj)).mItemAnimator.mListener = ((RecyclerView) (obj)).mItemAnimatorListener;
                }
                flag = true;
            }
            finalAdapter.mItemAnimator = layoutManager;
        }
        if (flag)
        {
            initialReveal();
        }
    }

    public final void setEmptyViewElements(int i, int j, int k)
    {
        TextView textview;
label0:
        {
            if (mView != null)
            {
                textview = (TextView)mView.findViewById(0x7f0d0167);
                textview.setText(j);
                textview.setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
                textview = (TextView)mView.findViewById(0x7f0d0168);
                if (k <= 0)
                {
                    break label0;
                }
                textview.setText(k);
                textview.setContentDescription(getString(k));
                textview.setVisibility(0);
            }
            return;
        }
        textview.setVisibility(8);
    }

    public final void setEmptyViewElementsColor(int i, int j)
    {
        View view = mView.findViewById(0x7f0d0166);
        ((TextView)view.findViewById(0x7f0d0167)).setTextColor(i);
        ((TextView)view.findViewById(0x7f0d0168)).setTextColor(j);
        view = mView.findViewById(0x7f0d01ae);
        ((TextView)view.findViewById(0x7f0d01a7)).setTextColor(i);
        ((TextView)view.findViewById(0x7f0d01a9)).setTextColor(j);
        view = mView.findViewById(0x7f0d01b3);
        ((TextView)view.findViewById(0x7f0d01a8)).setTextColor(i);
        ((TextView)view.findViewById(0x7f0d01af)).setTextColor(j);
    }

    public final void setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener onrefreshlistener)
    {
        mRefreshListener = onrefreshlistener;
        if (mRefreshLayout != null)
        {
            mRefreshLayout.mListener = mRefreshListener;
        }
    }

    public final void setRefreshing$1385ff()
    {
        if (mRefreshLayout != null)
        {
            mRefreshLayout.setRefreshing(false);
        }
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        if (super.mView != null)
        {
            ensureRecyclerView();
            android.support.v7.widget.RecyclerView.Adapter adapter = mRecyclerView.mAdapter;
            if (adapter != null && (adapter instanceof ImageAwareAdapter))
            {
                ((ImageAwareAdapter)adapter).enableImageLoading(flag, true);
            }
        }
    }

    public boolean shouldUseAddAnimation()
    {
        return true;
    }

    public final void startPostponedInitialReveal()
    {
        mAllowPostponeRecyclerViewVisibility = false;
        if (mPostponeRecyclerViewVisibility)
        {
            GamesRecyclerAdapter gamesrecycleradapter = getGamesRecyclerAdapter();
            if (gamesrecycleradapter == null)
            {
                return;
            }
            gamesrecycleradapter.setWaitingOnRecyclerView(false);
        }
        mPostponeRecyclerViewVisibility = false;
    }

    public final void unregisterPlayerChangeObserver()
    {
        if (mContentObserver != null)
        {
            mParent.getContentResolver().unregisterContentObserver(mContentObserver);
            mContentObserver = null;
        }
    }




/*
    static boolean access$102(GamesHeaderRecyclerViewFragment gamesheaderrecyclerviewfragment, boolean flag)
    {
        gamesheaderrecyclerviewfragment.mIsFlinging = flag;
        return flag;
    }

*/
}
