// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.OnQuestUpdatedListener;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            QuestUiConfiguration, QuestAdapter

public abstract class BaseQuestFragment extends GamesHeaderRecyclerViewFragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, ResultCallback, OnQuestUpdatedListener
{

    public QuestAdapter mQuestAdapter;
    protected QuestUiConfiguration mQuestUiConfig;

    public BaseQuestFragment()
    {
    }

    private void loadDataWrapper(GoogleApiClient googleapiclient, boolean flag)
    {
        if (mQuestUiConfig.useActionBarProgressBar())
        {
            mParent.showActionBarProgressBar();
        }
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        mLoadingDataViewManager.setViewState(1);
        loadData(googleapiclient, gamesuiconfiguration, flag);
    }

    protected abstract void loadData(GoogleApiClient googleapiclient, GamesUiConfiguration gamesuiconfiguration, boolean flag);

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof QuestInboxHelper.QuestInboxHelperProvider, "Parent activity is not a QuestInboxHelperProvider");
        bundle = ((QuestInboxHelper.QuestInboxHelperProvider)mParent).getQuestInboxHelper();
        Asserts.checkState(mParent instanceof QuestUiConfiguration, "Parent activity did not implement QuestUiConfiguration");
        mQuestUiConfig = (QuestUiConfiguration)mParent;
        setEmptyViewElements(0x7f020157, 0x7f10023b, 0);
        mQuestAdapter = new QuestAdapter(mParent, bundle, mQuestUiConfig.useFixedHeightQuestTiles());
        setAdapter(mQuestAdapter);
        setOnRefreshListener(this);
    }

    public void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        loadDataWrapper(googleapiclient, false);
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
            GamesLog.e("BaseQuestFragment", "No valid listener to update the inbox counts");
            return;
        }
    }

    public void onQuestsLoaded(QuestBuffer questbuffer)
    {
    }

    public final void onRefresh()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        } else
        {
            loadData(googleapiclient, mParent.mConfiguration, true);
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
        setRefreshing$1385ff();
        boolean flag = canUseResult(loadquestsresult);
        if (!flag)
        {
            result.release();
            return;
        }
        if (mQuestUiConfig.useActionBarProgressBar())
        {
            mParent.hideActionBarProgressBar();
        }
        mQuestAdapter.setDataBuffer(result);
        onQuestsLoaded(result);
        mLoadingDataViewManager.handleViewState(i, result.getCount(), showDataWhileEmpty());
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

    public final void refresh(boolean flag)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        } else
        {
            loadDataWrapper(googleapiclient, flag);
            return;
        }
    }

    public boolean showDataWhileEmpty()
    {
        return false;
    }
}
