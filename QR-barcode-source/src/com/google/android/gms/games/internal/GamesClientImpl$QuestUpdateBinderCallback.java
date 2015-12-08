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

private final class Xv extends AbstractGamesCallbacks
{

    final GamesClientImpl WC;
    private final QuestUpdateListener Xv;

    private Quest S(DataHolder dataholder)
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
        dataholder = S(dataholder);
        if (dataholder != null)
        {
            WC.a(new it>(WC, Xv, dataholder));
        }
    }

    (GamesClientImpl gamesclientimpl, QuestUpdateListener questupdatelistener)
    {
        WC = gamesclientimpl;
        super();
        Xv = questupdatelistener;
    }
}
