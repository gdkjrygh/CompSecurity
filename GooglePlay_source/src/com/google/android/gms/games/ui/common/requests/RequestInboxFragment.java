// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.InboxDataEventListener;
import com.google.android.gms.games.ui.LoadingAdapter;
import com.google.android.gms.games.ui.OnRequestUpdatedListener;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestInboxRecyclerAdapter, RequestAdapter, RequestClusterAdapter

public final class RequestInboxFragment extends GamesHeaderRecyclerViewFragment
    implements InboxDataEventListener, OnRequestUpdatedListener
{

    public RequestInboxRecyclerAdapter mInboxAdapter;
    private UpsellCardAdapter mUpsellCardAdapter;

    public RequestInboxFragment()
    {
    }

    private void loadData()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!UiUtils.checkClientDisconnected(googleapiclient, mParent)) goto _L2; else goto _L1
_L1:
        GamesLog.w("RequestInboxFrag", "reloadData: not connected; ignoring...");
_L4:
        return;
_L2:
        Object obj;
        obj = mParent.mConfiguration;
        if (!((GamesUiConfiguration) (obj)).is3PContext())
        {
            break; /* Loop/switch isn't completed */
        }
        RequestInboxRecyclerAdapter requestinboxrecycleradapter = mInboxAdapter;
        if (!UiUtils.checkClientDisconnected(googleapiclient, requestinboxrecycleradapter.mParentActivity))
        {
            Games.Requests.loadRequests$7e4fe440(googleapiclient, 65535).setResultCallback(requestinboxrecycleradapter);
            String s = Games.getCurrentAccountName(googleapiclient);
            requestinboxrecycleradapter.mGiftAdapter.mCurrentAccountName = s;
            requestinboxrecycleradapter.mGiftClusterAdapter.mCurrentAccountName = s;
            requestinboxrecycleradapter.mWishAdapter.mCurrentAccountName = s;
            requestinboxrecycleradapter.mWishClusterAdapter.mCurrentAccountName = s;
            Games.Notifications.clear(googleapiclient, 4);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mParent.mIsPlusEnabled)
        {
            mUpsellCardAdapter.setVisible(false);
            RequestInboxRecyclerAdapter requestinboxrecycleradapter1 = mInboxAdapter;
            String s1 = ((GamesUiConfiguration) (obj)).getCurrentGameId();
            String s2 = ((GamesUiConfiguration) (obj)).getCurrentPlayerId();
            obj = ((GamesUiConfiguration) (obj)).getCurrentAccountName();
            if (!UiUtils.checkClientDisconnected(googleapiclient, requestinboxrecycleradapter1.mParentActivity))
            {
                Games.Requests.loadRequestsFirstParty$2c3ee1ac(googleapiclient, s1, s2, 65535, 1).setResultCallback(requestinboxrecycleradapter1);
                requestinboxrecycleradapter1.mGiftAdapter.mCurrentAccountName = ((String) (obj));
                requestinboxrecycleradapter1.mGiftClusterAdapter.mCurrentAccountName = ((String) (obj));
                requestinboxrecycleradapter1.mWishAdapter.mCurrentAccountName = ((String) (obj));
                requestinboxrecycleradapter1.mWishClusterAdapter.mCurrentAccountName = ((String) (obj));
                Games.Notifications.clearFirstParty(googleapiclient, s1, 4);
                return;
            }
        } else
        {
            mUpsellCardAdapter.setVisible(true);
            onDataLoaded();
            mInboxAdapter.mLoadingAdapter.setVisible(false);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected final int getPlaylogElementType()
    {
        return 6;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof RequestInboxHelper.RequestInboxHelperProvider);
        Asserts.checkState(mParent instanceof com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener);
        bundle = ((RequestInboxHelper.RequestInboxHelperProvider)mParent).getRequestInboxHelper();
        Asserts.checkNotNull(bundle);
        setEmptyViewElements(0x7f02014e, 0x7f10024e, 0);
        Resources resources = mParent.getResources();
        mInboxAdapter = new RequestInboxRecyclerAdapter(mParent, bundle, (com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener)mParent, this);
        mUpsellCardAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(resources.getColor(0x7f0b0093), 0x7f100197), 11, null);
        setAdapter((new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder()).addAdapter(mInboxAdapter).addAdapter(mUpsellCardAdapter).build());
    }

    public final void onDataLoaded()
    {
        if (isAttachedToParent())
        {
            mParent.hideActionBarProgressBar();
            mLoadingDataViewManager.setViewState(2);
            mParent.registerRequestListeners();
        }
    }

    public final void onDetach()
    {
        super.onDetach();
        if (!isGoogleApiClientCreated())
        {
            GamesLog.w("RequestInboxFrag", "Tearing down without finishing creation");
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        loadData();
    }

    public final void onNoDataLoaded(int i)
    {
        if (isAttachedToParent())
        {
            mParent.hideActionBarProgressBar();
            mLoadingDataViewManager.handleViewState(i, 0, false);
            mParent.registerRequestListeners();
        }
    }

    public final void onRequestUpdated()
    {
        if (!isAttachedToParent())
        {
            return;
        } else
        {
            reloadData();
            return;
        }
    }

    public final void onRetry()
    {
        reloadData();
    }

    public final void reloadData()
    {
        mParent.showActionBarProgressBar();
        loadData();
    }
}
