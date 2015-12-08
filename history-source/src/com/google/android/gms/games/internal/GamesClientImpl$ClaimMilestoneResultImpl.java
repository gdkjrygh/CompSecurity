// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Yw extends b
    implements com.google.android.gms.games.quest.pl
{

    private final Quest Yw;
    private final Milestone Yz = null;

    public Milestone getMilestone()
    {
        return Yz;
    }

    public Quest getQuest()
    {
        return Yw;
    }

    (DataHolder dataholder, String s)
    {
        int i;
        i = 0;
        super(dataholder);
        dataholder = new QuestBuffer(dataholder);
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        List list;
        int j;
        Yw = new QuestEntity((Quest)dataholder.get(0));
        list = Yw.mQ();
        j = list.size();
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Milestone)list.get(i)).getMilestoneId().equals(s))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Yz = (Milestone)list.get(i);
        dataholder.release();
        return;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
_L6:
        dataholder.release();
        return;
_L2:
        Yz = null;
        Yw = null;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        dataholder.release();
        throw s;
    }
}
