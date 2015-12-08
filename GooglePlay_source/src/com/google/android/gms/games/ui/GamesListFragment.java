// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.database.ContentObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity, FlingListener, GamesBaseAdapter

public abstract class GamesListFragment extends ListFragment
    implements android.widget.AbsListView.OnScrollListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.games.ui.util.LoadingDataViewManager.ActionTextListener
{

    public ContentObserver mContentObserver;
    public LayoutInflater mInflater;
    private boolean mIsFlinging;
    public LoadingDataViewManager mLoadingDataViewManager;
    public GamesFragmentActivity mParent;
    protected SwipeRefreshLayout mRefreshLayout;
    protected android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener mRefreshListener;
    protected boolean mSwipeRefreshEnabled;
    private View mView;

    public GamesListFragment()
    {
        mIsFlinging = false;
        mSwipeRefreshEnabled = false;
    }

    public final void enableSwipeToRefresh()
    {
        mSwipeRefreshEnabled = true;
        if (mRefreshLayout != null)
        {
            mRefreshLayout.setEnabled(true);
        }
    }

    public final GoogleApiClient getGoogleApiClient()
    {
        GoogleApiClient googleapiclient = mParent.getGoogleApiClient();
        Asserts.checkNotNull(googleapiclient);
        return googleapiclient;
    }

    public final View inflateView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(0x7f040097, viewgroup, false);
        mRefreshLayout = (SwipeRefreshLayout)layoutinflater.findViewById(0x7f0d01b1);
        mRefreshLayout.setEnabled(mSwipeRefreshEnabled);
        mRefreshLayout.setColorScheme(new int[] {
            0x7f0b00a8, 0x7f0b00aa, 0x7f0b00ab, 0x7f0b00a9
        });
        if (mSwipeRefreshEnabled)
        {
            Preconditions.checkNotNull(mRefreshListener);
            mRefreshLayout.mListener = mRefreshListener;
        }
        return layoutinflater;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mParent = (GamesFragmentActivity)super.mActivity;
        getListView().setOnScrollListener(this);
        getListView().setItemsCanFocus(true);
    }

    public final void onConnected(Bundle bundle)
    {
        bundle = getGoogleApiClient();
        Asserts.checkState(bundle.isConnected());
        onGoogleApiClientConnected(bundle);
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public final void onConnectionSuspended(int i)
    {
        GamesLog.w("GamesListFragment", "Unexpected call to onConnectionSuspended - subclasses should unregister as a listener in onStop() and clear data in onDestroyView()");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mInflater = layoutinflater;
        mView = inflateView(layoutinflater, viewgroup);
        mLoadingDataViewManager = (LoadingDataViewManager)Preconditions.checkNotNull(new LoadingDataViewManager(mView, this));
        mLoadingDataViewManager.setViewState(1);
        return mView;
    }

    public abstract void onGoogleApiClientConnected(GoogleApiClient googleapiclient);

    public void onPlayersChanged()
    {
    }

    public void onRetry()
    {
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        abslistview = (ListAdapter)abslistview.getAdapter();
        if (!mIsFlinging && i == 2)
        {
            mIsFlinging = true;
            if (abslistview instanceof FlingListener)
            {
                ((FlingListener)abslistview).onFlingBegin();
            }
        } else
        if (mIsFlinging && i != 2)
        {
            mIsFlinging = false;
            if (abslistview instanceof FlingListener)
            {
                ((FlingListener)abslistview).onFlingEnd();
                return;
            }
        }
    }

    public void onStart()
    {
        super.onStart();
        mParent.registerListener(this);
        mParent.registerConnectionFailedListener(this);
    }

    public void onStop()
    {
        mParent.unregisterListener(this);
        mParent.unregisterConnectionFailedListener(this);
        super.onStop();
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

    public final void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        ListAdapter listadapter = super.mAdapter;
        if (listadapter instanceof GamesBaseAdapter)
        {
            ((GamesBaseAdapter)listadapter).enableImageLoading(flag, true);
        }
    }

    // Unreferenced inner class com/google/android/gms/games/ui/GamesListFragment$1

/* anonymous class */
    public final class _cls1 extends ContentObserver
    {

        final GamesListFragment this$0;

        public final void onChange(boolean flag)
        {
            mParent.runOnUiThread(new Runnable() {

                final _cls1 this$1;

                public final void run()
                {
    public final class _cls1 extends ContentObserver
    {
                    onPlayersChanged();
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
        }

            public 
            {
                this$0 = GamesListFragment.this;
                super(null);
            }
    }

}
