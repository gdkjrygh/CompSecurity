// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class WE extends com.google.android.gms.common.internal.E
{

    final GamesClientImpl WC;
    private final Quest WE;

    protected void b(QuestUpdateListener questupdatelistener)
    {
        questupdatelistener.onQuestCompleted(WE);
    }

    protected void g(Object obj)
    {
        b((QuestUpdateListener)obj);
    }

    protected void gT()
    {
    }

    (GamesClientImpl gamesclientimpl, QuestUpdateListener questupdatelistener, Quest quest)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, questupdatelistener);
        WE = quest;
    }
}
