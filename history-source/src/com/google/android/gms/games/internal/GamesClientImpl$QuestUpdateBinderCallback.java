// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class Qe extends AbstractGamesCallbacks
{

    private final d Qe;

    private Quest T(DataHolder dataholder)
    {
        QuestBuffer questbuffer;
        questbuffer = new QuestBuffer(dataholder);
        dataholder = null;
        if (questbuffer.getCount() > 0)
        {
            dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
        }
        questbuffer.release();
        return dataholder;
        dataholder;
        questbuffer.release();
        throw dataholder;
    }

    public void M(DataHolder dataholder)
    {
        dataholder = T(dataholder);
        if (dataholder != null)
        {
            Qe.a(new it>(dataholder));
        }
    }

    (d d1)
    {
        Qe = d1;
    }
}
