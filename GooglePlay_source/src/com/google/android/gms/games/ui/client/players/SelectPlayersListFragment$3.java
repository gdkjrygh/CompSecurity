// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.TextFilteredDataBuffer;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersListFragment, SelectPlayersAdapter

final class this._cls0
    implements ResultCallback
{

    final SelectPlayersListFragment this$0;

    public final volatile void onResult(Result result)
    {
        Object obj;
        int i;
        obj = (com.google.android.gms.games.ersListFragment._cls3)result;
        result = SelectPlayersListFragment.this;
        i = ((com.google.android.gms.games.ersListFragment) (obj)).tStatus().mStatusCode;
        obj = ((com.google.android.gms.games.tStatus) (obj)).tPlayers();
        if (((Fragment) (result)).mDetached) goto _L2; else goto _L1
_L1:
        boolean flag = ((Fragment) (result)).mRemoving;
        if (!flag) goto _L3; else goto _L2
_L2:
        ((PlayerBuffer) (obj)).release();
_L5:
        return;
_L3:
        flag = ((SelectPlayersListFragment) (result)).mParent.canContinueWithStatus(i);
        if (!flag)
        {
            ((PlayerBuffer) (obj)).release();
            return;
        }
        if (UiUtils.isNetworkError(i))
        {
            ((SelectPlayersListFragment) (result)).mMyCirclesPlayersAdapter.showFooterErrorState();
        }
        result.mMyCirclesTFDataBuffer = new TextFilteredDataBuffer(((com.google.android.gms.common.data.AbstractDataBuffer) (obj)), "profile_name");
        if (((SelectPlayersListFragment) (result)).mMyCirclesTFDataBuffer.getCount() <= 0) goto _L5; else goto _L4
_L4:
        ((SelectPlayersListFragment) (result)).mMyCirclesPlayersAdapter.setDataBuffer(((SelectPlayersListFragment) (result)).mMyCirclesTFDataBuffer);
        ((SelectPlayersListFragment) (result)).mLoadingDataViewManager.setViewState(2);
        result.updateHeaderVisibility();
        return;
        result;
        ((PlayerBuffer) (obj)).release();
        throw result;
    }

    ()
    {
        this$0 = SelectPlayersListFragment.this;
        super();
    }
}
