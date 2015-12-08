// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            BaseQuestFragment, QuestMetadataProvider, QuestUiConfiguration

public class QuestFragment extends BaseQuestFragment
{

    public boolean mForceQuestLoad;
    private QuestMetadataProvider mMetaDataProvider;

    public QuestFragment()
    {
        mForceQuestLoad = false;
    }

    protected final int getPlaylogElementType()
    {
        return 3;
    }

    protected final void loadData(GoogleApiClient googleapiclient, GamesUiConfiguration gamesuiconfiguration, boolean flag)
    {
        int ai[] = mMetaDataProvider.getQuestSelectors();
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Quests.load$522b3926(googleapiclient, ai, flag).setResultCallback(this);
        } else
        {
            if (mParent.mIsPlusEnabled || mForceQuestLoad)
            {
                setUpsellCardVisible(false);
                Games.Quests.loadFirstParty(googleapiclient, gamesuiconfiguration.getCurrentGameId(), gamesuiconfiguration.getCurrentPlayerId(), ai, 0, flag).setResultCallback(this);
                return;
            }
            setUpsellCardVisible(true);
            setRefreshing$1385ff();
            mLoadingDataViewManager.setViewState(2);
            if (mQuestUiConfig.useActionBarProgressBar())
            {
                mParent.hideActionBarProgressBar();
                return;
            }
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof QuestMetadataProvider, "Parent activity did not implement QuestMetadataProvider");
        mMetaDataProvider = (QuestMetadataProvider)mParent;
    }

    protected void setUpsellCardVisible(boolean flag)
    {
    }
}
