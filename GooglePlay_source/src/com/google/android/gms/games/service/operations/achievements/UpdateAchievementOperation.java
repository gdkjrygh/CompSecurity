// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.achievements;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class UpdateAchievementOperation extends AbstractStatusReportingOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalAchievementId;
    private final GamesClientContext mGamesContext;
    private final int mOperation;
    private final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo mPopupLocationInfo;

    public UpdateAchievementOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int i, String s, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mOperation = i;
        mGamesContext = gamesclientcontext;
        mExternalAchievementId = s;
        mPopupLocationInfo = popuplocationinfo;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        switch (mOperation)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("unknown operation ")).append(mOperation).toString());

        case 1: // '\001'
            return databroker.unlockAchievement(mGamesContext, mExternalAchievementId, mPopupLocationInfo);

        case 2: // '\002'
            return databroker.revealAchievement(mGamesContext, mExternalAchievementId, mPopupLocationInfo);
        }
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        if (mCallbacks != null)
        {
            mCallbacks.onAchievementUpdated(i, mExternalAchievementId);
        }
    }
}
