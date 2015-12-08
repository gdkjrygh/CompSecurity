// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class Ou extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final QuestUpdateListener Ou;

    private Quest R(DataHolder dataholder)
    {
        QuestBuffer questbuffer;
        questbuffer = new QuestBuffer(dataholder);
        dataholder = null;
        if (questbuffer.getCount() > 0)
        {
            dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
        }
        questbuffer.close();
        return dataholder;
        dataholder;
        questbuffer.close();
        throw dataholder;
    }

    public void M(DataHolder dataholder)
    {
        dataholder = R(dataholder);
        if (dataholder != null)
        {
            NE.a(new it>(NE, Ou, dataholder));
        }
    }

    (GamesClientImpl gamesclientimpl, QuestUpdateListener questupdatelistener)
    {
        NE = gamesclientimpl;
        super();
        Ou = questupdatelistener;
    }
}
