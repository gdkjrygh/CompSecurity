// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends r
{
    private final class QuestKey
    {

        public final String applicationId;
        public final String playerId;
        public final String questId;
        final AppContentFragment.QuestLoader this$0;

        public final boolean equals(Object obj)
        {
            if (obj instanceof QuestKey)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (QuestKey)obj;
                if (applicationId.equals(((QuestKey) (obj)).applicationId) && playerId.equals(((QuestKey) (obj)).playerId) && questId.equals(questId))
                {
                    return true;
                }
            }
            return false;
        }

        public final String toString()
        {
            return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(questId).toString();
        }

        public QuestKey(String s, String s1, String s2)
        {
            this$0 = AppContentFragment.QuestLoader.this;
            super();
            applicationId = s;
            playerId = s1;
            questId = s2;
        }
    }


    private static final HashMap sQuestMap = new HashMap();
    private final allback mCallback;
    private final QuestKey mQuestKey;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        if (sQuestMap.containsKey(mQuestKey))
        {
            mCallback.onQuestLoaded((Quest)sQuestMap.get(mQuestKey));
            finish();
        } else
        if (googleapiclient != null)
        {
            return Games.Quests.loadByIdFirstParty$6a627986(googleapiclient, mQuestKey.applicationId, mQuestKey.playerId, new String[] {
                mQuestKey.questId
            });
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.quest.tLoader)result;
        if (mFragment.canUseResult(result) && result.ts().getCount() > 0)
        {
            Quest quest = (Quest)((Quest)result.ts().get(0)).freeze();
            sQuestMap.put(mQuestKey, quest);
            mCallback.onQuestLoaded(quest);
        } else
        {
            GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load quest: ")).append(mQuestKey.toString()).toString());
        }
        result.();
        finish();
    }


    public allback(AppContentFragment appcontentfragment, String s, String s1, String s2, allback allback)
    {
        super(appcontentfragment);
        mQuestKey = new QuestKey(s, s1, s2);
        mCallback = allback;
        onLoad(null);
    }
}
