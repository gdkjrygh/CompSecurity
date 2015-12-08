// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class NG extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NE;
    private final Quest NG;

    protected void b(QuestUpdateListener questupdatelistener)
    {
        questupdatelistener.onQuestCompleted(NG);
    }

    protected void d(Object obj)
    {
        b((QuestUpdateListener)obj);
    }

    protected void fu()
    {
    }

    (GamesClientImpl gamesclientimpl, QuestUpdateListener questupdatelistener, Quest quest)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, questupdatelistener);
        NG = quest;
    }
}
