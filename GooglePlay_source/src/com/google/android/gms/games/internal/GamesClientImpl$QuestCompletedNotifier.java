// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mQuest
    implements com.google.android.gms.common.api.internal.t
{

    private final Quest mQuest;

    public final volatile void notifyListener(Object obj)
    {
        ((QuestUpdateListener)obj).onQuestCompleted$61796567();
    }

    public final void onNotifyListenerFailed()
    {
    }

    (Quest quest)
    {
        mQuest = quest;
    }
}
