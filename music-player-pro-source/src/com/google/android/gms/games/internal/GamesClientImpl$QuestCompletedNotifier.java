// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Yw
    implements com.google.android.gms.common.api.ier
{

    private final Quest Yw;

    public void a(QuestUpdateListener questupdatelistener)
    {
        questupdatelistener.onQuestCompleted(Yw);
    }

    public void c(Object obj)
    {
        a((QuestUpdateListener)obj);
    }

    public void gG()
    {
    }

    (Quest quest)
    {
        Yw = quest;
    }
}
