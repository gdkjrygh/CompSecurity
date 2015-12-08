// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.quests;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.OnQuestUpdatedListener;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.quests:
//            CompletedQuestAdapter

public final class CompletedQuestFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, OnQuestUpdatedListener
{

    private static final int QUEST_SELECTORS[] = {
        4
    };
    private CompletedQuestAdapter mCompletedQuestListAdapter;

    public CompletedQuestFragment()
    {
    }

    private void loadData(GoogleApiClient googleapiclient, boolean flag)
    {
        mParent.showActionBarProgressBar();
        Games.Quests.loadFirstParty(googleapiclient, null, null, QUEST_SELECTORS, 0, flag).setResultCallback(this);
        mLoadingDataViewManager.setViewState(1);
    }

    protected final int getPlaylogElementType()
    {
        return 22;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setEmptyViewElements(0x7f020157, 0x7f1000b7, 0);
        mCompletedQuestListAdapter = new CompletedQuestAdapter(mParent);
        setAdapter(mCompletedQuestListAdapter);
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        loadData(googleapiclient, false);
    }

    public final void onQuestUpdated()
    {
        if (!isAttachedToParent())
        {
            return;
        }
        Fragment fragment = super.mParentFragment;
        if (fragment != null && (fragment instanceof com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener))
        {
            ((com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener)fragment).onInboxCountUpdated();
            return;
        }
        if (super.mActivity instanceof com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener)
        {
            ((com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener)super.mActivity).onInboxCountUpdated();
            return;
        } else
        {
            GamesLog.e("CompletedQuestFrag", "No valid listener to update the inbox counts");
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.quest.Quests.LoadQuestsResult loadquestsresult;
        int i;
        loadquestsresult = (com.google.android.gms.games.quest.Quests.LoadQuestsResult)result;
        i = loadquestsresult.getStatus().mStatusCode;
        result = loadquestsresult.getQuests();
        boolean flag = canUseResult(loadquestsresult);
        if (!flag)
        {
            result.release();
            return;
        }
        mParent.hideActionBarProgressBar();
        mCompletedQuestListAdapter.setDataBuffer(result);
        mLoadingDataViewManager.handleViewState(i, result.getCount(), false);
        mParent.registerQuestListeners();
        return;
        Exception exception;
        exception;
        result.release();
        throw exception;
    }

    public final void onRetry()
    {
        refresh(false);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("savedStateGameId", null);
        bundle.putString("savedStatePlayerId", null);
    }

    public final void refresh(boolean flag)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        } else
        {
            loadData(googleapiclient, flag);
            return;
        }
    }

}
