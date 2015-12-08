// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.quest:
//            QuestUpdateListener, Quest, QuestBuffer

public interface Quests
{
    public static interface AcceptQuestResult
        extends Result
    {

        public abstract Quest getQuest();
    }

    public static interface LoadQuestsResult
        extends Releasable, Result
    {

        public abstract QuestBuffer getQuests();
    }


    public static final int SELECT_ALL_QUESTS[] = {
        1, 2, 3, 4, 101, 5, 102, 6, 103
    };

    public abstract PendingResult accept(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult load$522b3926(GoogleApiClient googleapiclient, int ai[], boolean flag);

    public transient abstract PendingResult loadByIdFirstParty$6a627986(GoogleApiClient googleapiclient, String s, String s1, String as[]);

    public transient abstract PendingResult loadByIds$18ed36e6(GoogleApiClient googleapiclient, String as[]);

    public abstract PendingResult loadFirstParty(GoogleApiClient googleapiclient, String s, String s1, int ai[], int i, boolean flag);

    public abstract void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener);

    public abstract void registerQuestUpdateListenerFirstParty(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener, String s);

    public abstract void unregisterQuestUpdateListener(GoogleApiClient googleapiclient);

    public abstract void unregisterQuestUpdateListenerFirstParty(GoogleApiClient googleapiclient, String s);

}
