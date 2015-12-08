// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.quests;

import android.content.Intent;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.common.quests.QuestMetadataProvider;

// Referenced classes of package com.google.android.gms.games.ui.client.quests:
//            BaseClientQuestActivity

public final class ClientQuestListActivity extends BaseClientQuestActivity
    implements QuestMetadataProvider
{

    private int mQuestStates[];

    public ClientQuestListActivity()
    {
        super(0, 0x7f0d025f, 0x7f100239);
    }

    protected final int getLogEventType()
    {
        return 16;
    }

    public final int[] getQuestSelectors()
    {
        return mQuestStates;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400c5;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    protected final void parseIntent(Intent intent)
    {
        super.parseIntent(intent);
        mQuestStates = intent.getIntArrayExtra("com.google.android.gms.games.QUEST_STATES");
        if (mQuestStates == null)
        {
            GamesLog.e("ClientQuestListAct", "EXTRA_QUEST_STATES extra missing; bailing out...");
            finish();
        }
    }
}
