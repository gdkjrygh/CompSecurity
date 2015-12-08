// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.quests;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.QuestAgent;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class QuestStateChangedPopupOperation extends AbstractDataHolderOperation
{

    private final int mClientVersion;
    private final String mExternalQuestId;
    private final GamesClientContext mGamesContext;
    private final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo mPopupLocationInfo;

    public QuestStateChangedPopupOperation(GamesClientContext gamesclientcontext, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, int i)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mExternalQuestId = s;
        mPopupLocationInfo = popuplocationinfo;
        mClientVersion = i;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        GamesClientContext gamesclientcontext;
        String s;
        com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo;
        int i;
        gamesclientcontext = mGamesContext;
        s = mExternalQuestId;
        popuplocationinfo = mPopupLocationInfo;
        i = mClientVersion;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mQuestAgent
        });
        context = databroker.mQuestAgent;
        if (i >= 0x6acfc0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        context = QuestAgent.EXTERNAL_VALID_POPUP_STATES;
_L1:
        QuestAgent.showStateChangedPopupInternal(gamesclientcontext, s, context, popuplocationinfo);
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mQuestAgent
        });
        return DataHolder.empty(0);
        context = QuestAgent.INTERNAL_VALID_POPUP_STATES;
          goto _L1
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mQuestAgent
        });
        throw context;
    }

    public final void postExecute()
    {
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
    }
}
