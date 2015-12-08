// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.OnRequestUpdatedListener;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestAdapter, RequestClusterAdapter, GameRequestUtils, RequestInboxHelper, 
//            GameRequestBufferHelper

public final class RequestFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, OnRequestUpdatedListener, RequestAdapter.RequestEventListener, RequestClusterAdapter.RequestClusterEventListener
{

    private RequestAdapter mRequestAdapter;
    public RequestClusterAdapter mRequestClusterAdapter;
    private HeaderItemRecyclerAdapter mRequestHeaderAdapter;
    private RequestInboxHelper mRequestInboxHelper;
    private int mRequestType;

    public RequestFragment()
    {
    }

    public static RequestFragment newInstance(int i)
    {
        if (i != 1 && i != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("Request type ")).append(i).append(" is invalid").toString());
        } else
        {
            RequestFragment requestfragment = new RequestFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("request_type", i);
            requestfragment.setArguments(bundle);
            return requestfragment;
        }
    }

    private void updateHeader()
    {
        boolean flag1 = true;
        int i = ((DatabufferRecyclerAdapter) (mRequestAdapter)).mDataBuffer.getCount() + ((DatabufferRecyclerAdapter) (mRequestClusterAdapter)).mDataBuffer.getCount();
        boolean flag;
        if (mRequestType == 1)
        {
            HeaderItemRecyclerAdapter headeritemrecycleradapter = mRequestHeaderAdapter;
            if (i > 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            headeritemrecycleradapter.showButton(flag);
        }
        headeritemrecycleradapter = mRequestHeaderAdapter;
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        headeritemrecycleradapter.setVisible(flag);
    }

    protected final int getPlaylogElementType()
    {
        return 7;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = super.mArguments;
        Asserts.checkState(bundle.containsKey("request_type"), "Must specify a request type!");
        mRequestType = bundle.getInt("request_type");
        mRequestHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mRequestType;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 99
    //                   2 248;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(mRequestType).toString());
_L2:
        mRequestHeaderAdapter.setTitle(0x7f10024a);
        mRequestHeaderAdapter.setButton(this, 0x7f10024b, 0x7f10024c, "openAllButton");
        mRequestHeaderAdapter.showButton(true);
_L5:
        mRequestAdapter = new RequestAdapter(mParent, this);
        mRequestClusterAdapter = new RequestClusterAdapter(mParent, this);
        Asserts.checkState(mParent instanceof RequestInboxHelper.RequestInboxHelperProvider);
        mRequestInboxHelper = ((RequestInboxHelper.RequestInboxHelperProvider)mParent).getRequestInboxHelper();
        Asserts.checkNotNull(mRequestInboxHelper);
        setEmptyViewElements(0x7f02014e, 0x7f10024e, 0);
        bundle = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        bundle.addAdapter(mRequestHeaderAdapter);
        bundle.addAdapter(mRequestAdapter);
        bundle.addAdapter(mRequestClusterAdapter);
        setAdapter(bundle.build());
        return;
_L3:
        mRequestHeaderAdapter.setTitle(0x7f10024d);
        mRequestHeaderAdapter.showButton(false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onDetach()
    {
        super.onDetach();
        if (!isGoogleApiClientCreated())
        {
            GamesLog.w("ReqFrag", "Tearing down without finishing creation");
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        mRequestAdapter.mCurrentAccountName = gamesuiconfiguration.getCurrentAccountName();
        mRequestClusterAdapter.mCurrentAccountName = gamesuiconfiguration.getCurrentAccountName();
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Requests.loadRequests$7e4fe440(googleapiclient, mRequestType).setResultCallback(this);
            return;
        } else
        {
            Games.Requests.loadRequestsFirstParty$2c3ee1ac(googleapiclient, gamesuiconfiguration.getCurrentGameId(), gamesuiconfiguration.getCurrentPlayerId(), mRequestType, 1).setResultCallback(this);
            return;
        }
    }

    public final void onHeaderClicked(String s)
    {
        if ("openAllButton".equals(s))
        {
            s = GameRequestUtils.extractFromBuffers(new DataBuffer[] {
                ((DatabufferRecyclerAdapter) (mRequestAdapter)).mDataBuffer, ((DatabufferRecyclerAdapter) (mRequestClusterAdapter)).mDataBuffer
            });
            mRequestInboxHelper.onRequestsClicked(s);
        }
    }

    public final void onRequestClusterDismissed(GameRequestCluster gamerequestcluster)
    {
        mRequestInboxHelper.onRequestClusterDismissed(gamerequestcluster);
        updateAdapter();
    }

    public final void onRequestClusterSeeMoreClicked(GameRequestCluster gamerequestcluster, String s)
    {
        mRequestInboxHelper.onRequestClusterSeeMoreClicked(gamerequestcluster, s);
    }

    public final void onRequestDismissed(GameRequest gamerequest)
    {
        mRequestInboxHelper.onRequestDismissed(gamerequest);
        updateAdapter();
    }

    public final void onRequestMuteAppClicked(Game game)
    {
        mRequestInboxHelper.onRequestMuteAppClicked(game);
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

    public final transient void onRequestsClicked(GameRequest agamerequest[])
    {
        mRequestInboxHelper.onRequestsClicked(agamerequest);
    }

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.request.Requests.LoadRequestsResult loadrequestsresult;
        int i;
        loadrequestsresult = (com.google.android.gms.games.request.Requests.LoadRequestsResult)result;
        i = loadrequestsresult.getStatus().mStatusCode;
        result = loadrequestsresult.getRequests(mRequestType);
        boolean flag = canUseResult(loadrequestsresult);
        if (!flag)
        {
            result.release();
            return;
        }
        mParent.hideActionBarProgressBar();
        GameRequestBufferHelper gamerequestbufferhelper = new GameRequestBufferHelper(result);
        mRequestAdapter.setDataBuffer(gamerequestbufferhelper.mInCirclesRequestBuffer);
        mRequestClusterAdapter.setDataBuffer(gamerequestbufferhelper.mAggregatedRequestBuffer);
        mLoadingDataViewManager.handleViewState(i, result.getCount(), false);
        updateHeader();
        result.release();
        mParent.registerRequestListeners();
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

    public final void reloadData()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("ReqFrag", "reloadData: not connected; ignoring...");
            return;
        }
        mParent.showActionBarProgressBar();
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Requests.loadRequests$7e4fe440(googleapiclient, mRequestType).setResultCallback(this);
            return;
        } else
        {
            Games.Requests.loadRequestsFirstParty$2c3ee1ac(googleapiclient, gamesuiconfiguration.getCurrentGameId(), gamesuiconfiguration.getCurrentPlayerId(), mRequestType, 1).setResultCallback(this);
            return;
        }
    }

    public final void updateAdapter()
    {
        if (((DatabufferRecyclerAdapter) (mRequestAdapter)).mDataBuffer.getCount() + ((DatabufferRecyclerAdapter) (mRequestClusterAdapter)).mDataBuffer.getCount() == 0)
        {
            mLoadingDataViewManager.setViewState(3);
        }
        updateHeader();
    }
}
