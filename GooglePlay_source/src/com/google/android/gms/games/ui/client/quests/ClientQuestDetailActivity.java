// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.quests;

import android.content.Intent;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.common.quests.QuestDetailMetadataProvider;

// Referenced classes of package com.google.android.gms.games.ui.client.quests:
//            BaseClientQuestActivity

public final class ClientQuestDetailActivity extends BaseClientQuestActivity
    implements QuestDetailMetadataProvider
{

    private String mQuestId;

    public ClientQuestDetailActivity()
    {
        super(0, 0x7f0d025d, 0x7f100236);
    }

    protected final int getLogEventType()
    {
        return 17;
    }

    public final String getQuestId()
    {
        return mQuestId;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400c4;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    protected final void parseIntent(Intent intent)
    {
        super.parseIntent(intent);
        mQuestId = intent.getStringExtra("com.google.android.gms.games.QUEST_ID");
        if (mQuestId == null)
        {
            GamesLog.e("ClientQuestDetailActivity", "EXTRA_QUEST_ID extra missing; bailing out...");
            finish();
        }
    }
}
