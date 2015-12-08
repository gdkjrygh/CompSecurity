// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.InboxDataEventListener;
import com.google.android.gms.games.ui.LoadingAdapter;
import com.google.android.gms.games.ui.MergedRecyclerAdapter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestInboxHelper, RequestAdapter, RequestClusterAdapter, GameRequestUtils, 
//            GameRequestBufferHelper

public final class RequestInboxRecyclerAdapter extends MergedRecyclerAdapter
    implements ResultCallback, com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, RequestAdapter.RequestEventListener, RequestClusterAdapter.RequestClusterEventListener
{

    private static final String TAG = com/google/android/gms/games/ui/common/requests/RequestInboxRecyclerAdapter.getSimpleName();
    final RequestAdapter mGiftAdapter;
    public final RequestClusterAdapter mGiftClusterAdapter;
    private final HeaderItemRecyclerAdapter mGiftHeaderAdapter;
    private final com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener mHeaderEventListener;
    private final InboxDataEventListener mInboxDataEventListener;
    private boolean mIsAllDataLoaded;
    final LoadingAdapter mLoadingAdapter;
    final GamesFragmentActivity mParentActivity;
    private final RequestInboxHelper mRequestInboxHelper;
    private int mStatusCode;
    final RequestAdapter mWishAdapter;
    public final RequestClusterAdapter mWishClusterAdapter;
    private final HeaderItemRecyclerAdapter mWishHeaderAdapter;

    public RequestInboxRecyclerAdapter(GamesFragmentActivity gamesfragmentactivity, RequestInboxHelper requestinboxhelper, com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener headereventlistener, InboxDataEventListener inboxdataeventlistener)
    {
        mIsAllDataLoaded = false;
        mParentActivity = gamesfragmentactivity;
        mRequestInboxHelper = (RequestInboxHelper)Preconditions.checkNotNull(requestinboxhelper);
        mHeaderEventListener = (com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener)Preconditions.checkNotNull(headereventlistener);
        mInboxDataEventListener = (InboxDataEventListener)Preconditions.checkNotNull(inboxdataeventlistener);
        mLoadingAdapter = new LoadingAdapter(gamesfragmentactivity);
        mGiftHeaderAdapter = new HeaderItemRecyclerAdapter(gamesfragmentactivity);
        mGiftHeaderAdapter.setTitle(0x7f10024a);
        mGiftAdapter = new RequestAdapter(gamesfragmentactivity, this, 0x7f0e0042);
        mGiftAdapter.disablePagination();
        mGiftClusterAdapter = new RequestClusterAdapter(gamesfragmentactivity, this, 0x7f0e0042);
        mGiftClusterAdapter.disablePagination();
        mWishHeaderAdapter = new HeaderItemRecyclerAdapter(gamesfragmentactivity);
        mWishHeaderAdapter.setTitle(0x7f10024d);
        mWishAdapter = new RequestAdapter(gamesfragmentactivity, this, 0x7f0e0043);
        mWishAdapter.disablePagination();
        mWishClusterAdapter = new RequestClusterAdapter(gamesfragmentactivity, this, 0x7f0e0043);
        mWishClusterAdapter.disablePagination();
        gamesfragmentactivity = new ArrayList();
        gamesfragmentactivity.add(mLoadingAdapter);
        gamesfragmentactivity.add(mGiftHeaderAdapter);
        gamesfragmentactivity.add(mGiftAdapter);
        gamesfragmentactivity.add(mGiftClusterAdapter);
        gamesfragmentactivity.add(mWishHeaderAdapter);
        gamesfragmentactivity.add(mWishAdapter);
        gamesfragmentactivity.add(mWishClusterAdapter);
        setAdapterList(gamesfragmentactivity);
        clearData();
    }

    private boolean updateHeaderAdapter(HeaderItemRecyclerAdapter headeritemrecycleradapter, int i, int j)
    {
        boolean flag;
        flag = false;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        headeritemrecycleradapter.setVisible(true);
        if (headeritemrecycleradapter != mGiftHeaderAdapter) goto _L2; else goto _L1
_L1:
        if (i <= j) goto _L4; else goto _L3
_L3:
        headeritemrecycleradapter.setButtonWithMoreCount(mHeaderEventListener, "giftsButton");
        headeritemrecycleradapter.setMoreCount(i - j);
_L6:
        return true;
_L4:
        headeritemrecycleradapter.setButton(this, 0x7f10024b, 0x7f10024c, "openAllButton");
        return true;
_L2:
        if (headeritemrecycleradapter != mWishHeaderAdapter) goto _L6; else goto _L5
_L5:
        headeritemrecycleradapter.setButtonWithMoreCount(mHeaderEventListener, "wishesButton");
        if (i > j)
        {
            flag = true;
        }
        headeritemrecycleradapter.showButton(flag);
        headeritemrecycleradapter.setMoreCount(i - j);
        return true;
        headeritemrecycleradapter.setVisible(false);
        return false;
    }

    public final void clearData()
    {
        super.clearData();
        mLoadingAdapter.setVisible(true);
        mWishHeaderAdapter.setVisible(false);
        mGiftHeaderAdapter.setVisible(false);
    }

    public final void onHeaderClicked(String s)
    {
        if ("openAllButton".equals(s))
        {
            s = GameRequestUtils.extractFromBuffers(new DataBuffer[] {
                ((DatabufferRecyclerAdapter) (mGiftAdapter)).mDataBuffer, ((DatabufferRecyclerAdapter) (mGiftClusterAdapter)).mDataBuffer
            });
            mRequestInboxHelper.onRequestsClicked(s);
            return;
        } else
        {
            mHeaderEventListener.onHeaderClicked(s);
            return;
        }
    }

    public final void onRequestClusterDismissed(GameRequestCluster gamerequestcluster)
    {
        mRequestInboxHelper.onRequestClusterDismissed(gamerequestcluster);
        updateHeaders();
    }

    public final void onRequestClusterSeeMoreClicked(GameRequestCluster gamerequestcluster, String s)
    {
        mRequestInboxHelper.onRequestClusterSeeMoreClicked(gamerequestcluster, s);
    }

    public final void onRequestDismissed(GameRequest gamerequest)
    {
        mRequestInboxHelper.onRequestDismissed(gamerequest);
        updateHeaders();
    }

    public final void onRequestMuteAppClicked(Game game)
    {
        mRequestInboxHelper.onRequestMuteAppClicked(game);
    }

    public final transient void onRequestsClicked(GameRequest agamerequest[])
    {
        mRequestInboxHelper.onRequestsClicked(agamerequest);
    }

    public final volatile void onResult(Result result)
    {
        Object obj;
        obj = (com.google.android.gms.games.request.Requests.LoadRequestsResult)result;
        mStatusCode = ((com.google.android.gms.games.request.Requests.LoadRequestsResult) (obj)).getStatus().mStatusCode;
        result = ((com.google.android.gms.games.request.Requests.LoadRequestsResult) (obj)).getRequests(1);
        obj = ((com.google.android.gms.games.request.Requests.LoadRequestsResult) (obj)).getRequests(2);
        boolean flag = mParentActivity.canContinueWithStatus(mStatusCode);
        if (!flag)
        {
            result.release();
            ((GameRequestBuffer) (obj)).release();
            return;
        }
        if (result.getCount() + ((GameRequestBuffer) (obj)).getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (mInboxDataEventListener != null)
        {
            mInboxDataEventListener.onNoDataLoaded(mStatusCode);
        }
        result.release();
        ((GameRequestBuffer) (obj)).release();
        return;
        mLoadingAdapter.setVisible(false);
        GameRequestBufferHelper gamerequestbufferhelper = new GameRequestBufferHelper(result);
        mGiftAdapter.setDataBuffer(gamerequestbufferhelper.mInCirclesRequestBuffer);
        mGiftClusterAdapter.setDataBuffer(gamerequestbufferhelper.mAggregatedRequestBuffer);
        gamerequestbufferhelper = new GameRequestBufferHelper(((DataBuffer) (obj)));
        mWishAdapter.setDataBuffer(gamerequestbufferhelper.mInCirclesRequestBuffer);
        mWishClusterAdapter.setDataBuffer(gamerequestbufferhelper.mAggregatedRequestBuffer);
        if (mInboxDataEventListener != null)
        {
            mInboxDataEventListener.onDataLoaded();
        }
        result.release();
        ((GameRequestBuffer) (obj)).release();
        mIsAllDataLoaded = true;
        updateHeaders();
        return;
        Exception exception;
        exception;
        result.release();
        ((GameRequestBuffer) (obj)).release();
        throw exception;
    }

    public final void updateHeaders()
    {
        boolean flag1 = true;
        int j = mGiftAdapter.getDataBufferCount() + mGiftClusterAdapter.getDataBufferCount();
        boolean flag2 = updateHeaderAdapter(mGiftHeaderAdapter, j, mGiftAdapter.getItemCount());
        int i = mWishAdapter.getDataBufferCount();
        int k = mWishClusterAdapter.getDataBufferCount();
        HeaderItemRecyclerAdapter headeritemrecycleradapter;
        boolean flag;
        if (updateHeaderAdapter(mWishHeaderAdapter, i + k, mWishAdapter.getItemCount()) || flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        headeritemrecycleradapter = mGiftHeaderAdapter;
        if (j <= 1)
        {
            flag1 = false;
        }
        headeritemrecycleradapter.showButton(flag1);
        if (mInboxDataEventListener != null && !flag && mIsAllDataLoaded)
        {
            mInboxDataEventListener.onNoDataLoaded(mStatusCode);
        }
    }

}
