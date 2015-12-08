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

private static final class NG extends b
    implements com.google.android.gms.games.quest.pl
{

    private final Quest NG;
    private final Milestone NI = null;

    public Milestone getMilestone()
    {
        return NI;
    }

    public Quest getQuest()
    {
        return NG;
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
        NG = new QuestEntity((Quest)dataholder.get(0));
        list = NG.iJ();
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
        NI = (Milestone)list.get(i);
        dataholder.close();
        return;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
_L6:
        dataholder.close();
        return;
_L2:
        NI = null;
        NG = null;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        dataholder.close();
        throw s;
    }
}
