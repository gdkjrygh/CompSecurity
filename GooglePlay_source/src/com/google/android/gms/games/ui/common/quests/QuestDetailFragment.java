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
import com.google.android.gms.games.ui.GamesUiConfiguration;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            BaseQuestFragment, QuestDetailMetadataProvider

public class QuestDetailFragment extends BaseQuestFragment
{

    private QuestDetailMetadataProvider mMetaDataProvider;

    public QuestDetailFragment()
    {
    }

    protected final int getPlaylogElementType()
    {
        return 4;
    }

    protected final void loadData(GoogleApiClient googleapiclient, GamesUiConfiguration gamesuiconfiguration, boolean flag)
    {
        String s = mMetaDataProvider.getQuestId();
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Quests.loadByIds$18ed36e6(googleapiclient, new String[] {
                s
            }).setResultCallback(this);
            return;
        } else
        {
            Games.Quests.loadByIdFirstParty$6a627986(googleapiclient, gamesuiconfiguration.getCurrentGameId(), gamesuiconfiguration.getCurrentPlayerId(), new String[] {
                s
            }).setResultCallback(this);
            return;
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof QuestDetailMetadataProvider, "Parent activity did not implement QuestDetailMetadataProvider");
        mMetaDataProvider = (QuestDetailMetadataProvider)mParent;
    }
}
