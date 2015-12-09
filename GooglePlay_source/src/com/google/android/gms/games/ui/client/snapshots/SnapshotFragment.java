// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.snapshots;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ExclusionFilterable;
import com.google.android.gms.common.data.ExclusionFilteredDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.ErrorStateItemAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.common.snapshots.SnapshotEventListener;
import com.google.android.gms.games.ui.common.snapshots.SnapshotListMetadataProvider;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.snapshots:
//            SnapshotNullStateItemAdapter, SnapshotAdapter, NewSnapshotAdapter

public class SnapshotFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.ErrorStateItemAdapter.ErrorStateItemEventListener
{

    private ErrorStateItemAdapter mErrorStateItemAdapter;
    ExclusionFilterable mExclusionFilterable;
    private SnapshotListMetadataProvider mMetaDataProvider;
    private NewSnapshotAdapter mNewSnapshotAdapter;
    private SnapshotNullStateItemAdapter mNullStateItemAdapter;
    SnapshotAdapter mSnapshotAdapter;

    public SnapshotFragment()
    {
    }

    private void reloadData()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        } else
        {
            mParent.showActionBarProgressBar();
            Games.Snapshots.load(googleapiclient, true).setResultCallback(this);
            mLoadingDataViewManager.setViewState(1);
            return;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 35;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof SnapshotEventListener);
        Asserts.checkState(mParent instanceof SnapshotListMetadataProvider, "Parent activity did not implement SnapshotListMetaDataProvider");
        mMetaDataProvider = (SnapshotListMetadataProvider)mParent;
        mNullStateItemAdapter = new SnapshotNullStateItemAdapter(mParent);
        mNullStateItemAdapter.setVisible(false);
        mErrorStateItemAdapter = new ErrorStateItemAdapter(mParent);
        mErrorStateItemAdapter.setVisible(false);
        mErrorStateItemAdapter.setErrorStateItemEventListener(this);
        mSnapshotAdapter = new SnapshotAdapter(mParent, (SnapshotEventListener)mParent);
        bundle = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        bundle.addAdapter(mErrorStateItemAdapter);
        bundle.addAdapter(mSnapshotAdapter);
        bundle.addAdapter(mNullStateItemAdapter);
        if (mMetaDataProvider.isCreateAllowed())
        {
            mNewSnapshotAdapter = new NewSnapshotAdapter(mParent, (SnapshotEventListener)mParent);
            bundle.addAdapter(mNewSnapshotAdapter);
        }
        setAdapter(bundle.build());
    }

    public final void onErrorStateItemClicked()
    {
        reloadData();
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        Games.Snapshots.load(googleapiclient, false).setResultCallback(this);
    }

    public final volatile void onResult(Result result)
    {
        int i;
        result = (com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult)result;
        i = result.getStatus().mStatusCode;
        result = result.getSnapshots();
        boolean flag = isAttachedToParent();
        if (!flag)
        {
            result.release();
            return;
        }
        flag = mParent.canContinueWithStatus(i);
        if (!flag)
        {
            result.release();
            return;
        }
        mParent.hideActionBarProgressBar();
        ExclusionFilteredDataBuffer exclusionfiltereddatabuffer = new ExclusionFilteredDataBuffer(result, "external_snapshot_id");
        mSnapshotAdapter.setDataBuffer(exclusionfiltereddatabuffer);
        mExclusionFilterable = exclusionfiltereddatabuffer;
        setNewSnapshotVisibility();
        ((android.support.v7.widget.RecyclerView.Adapter) (mSnapshotAdapter)).mObservable.notifyChanged();
        updateViewState(i);
        return;
        Exception exception;
        exception;
        result.release();
        throw exception;
    }

    public final void onRetry()
    {
        reloadData();
    }

    final void setNewSnapshotVisibility()
    {
label0:
        {
            if (mMetaDataProvider.isCreateAllowed())
            {
                Asserts.checkNotNull(mNewSnapshotAdapter);
                if (((DatabufferRecyclerAdapter) (mSnapshotAdapter)).mDataBuffer.getCount() > mMetaDataProvider.getMaxSnapshotsAllowed())
                {
                    break label0;
                }
                mNewSnapshotAdapter.setVisible(true);
            }
            return;
        }
        mNewSnapshotAdapter.setVisible(false);
    }

    final void updateViewState(int i)
    {
        int l = ((DatabufferRecyclerAdapter) (mSnapshotAdapter)).mDataBuffer.getCount();
        int j = l;
        int k = j;
        if (mMetaDataProvider.isCreateAllowed())
        {
            k = j + 1;
        }
        mLoadingDataViewManager.handleViewState(i, k, true);
        SnapshotNullStateItemAdapter snapshotnullstateitemadapter = mNullStateItemAdapter;
        boolean flag;
        if (l == 0 && i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        snapshotnullstateitemadapter.setVisible(flag);
        if (UiUtils.isNetworkError(i) && k > 0)
        {
            mErrorStateItemAdapter.mViewState = 5;
            mErrorStateItemAdapter.setVisible(true);
            return;
        }
        if (i != 0 && k > 0)
        {
            mErrorStateItemAdapter.mViewState = 6;
            mErrorStateItemAdapter.setVisible(true);
            return;
        } else
        {
            mErrorStateItemAdapter.setVisible(false);
            return;
        }
    }
}
