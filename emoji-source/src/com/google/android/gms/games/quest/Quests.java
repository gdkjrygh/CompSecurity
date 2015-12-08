// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.quest:
//            QuestUpdateListener, Quest, Milestone, QuestBuffer

public interface Quests
{
    public static interface AcceptQuestResult
        extends Result
    {

        public abstract Quest getQuest();
    }

    public static interface ClaimMilestoneResult
        extends Result
    {

        public abstract Milestone getMilestone();

        public abstract Quest getQuest();
    }

    public static interface LoadQuestsResult
        extends Releasable, Result
    {

        public abstract QuestBuffer getQuests();
    }


    public static final String EXTRA_QUEST = "quest";
    public static final int SELECT_ACCEPTED = 3;
    public static final int SELECT_COMPLETED = 4;
    public static final int SELECT_COMPLETED_UNCLAIMED = 101;
    public static final int SELECT_ENDING_SOON = 102;
    public static final int SELECT_EXPIRED = 5;
    public static final int SELECT_FAILED = 6;
    public static final int SELECT_OPEN = 2;
    public static final int SELECT_UPCOMING = 1;
    public static final int SORT_ORDER_ENDING_SOON_FIRST = 1;
    public static final int SORT_ORDER_RECENTLY_UPDATED_FIRST = 0;
    public static final int TZ[] = {
        1, 2, 3, 4, 101, 5, 102, 6
    };

    public abstract PendingResult accept(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult claim(GoogleApiClient googleapiclient, String s, String s1);

    public abstract Intent getQuestIntent(GoogleApiClient googleapiclient, String s);

    public abstract Intent getQuestsIntent(GoogleApiClient googleapiclient, int ai[]);

    public abstract PendingResult load(GoogleApiClient googleapiclient, int ai[], int i, boolean flag);

    public transient abstract PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[]);

    public abstract void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener);

    public abstract void unregisterQuestUpdateListener(GoogleApiClient googleapiclient);

}
