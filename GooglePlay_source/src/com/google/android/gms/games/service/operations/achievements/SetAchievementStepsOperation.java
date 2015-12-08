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

public final class SetAchievementStepsOperation extends AbstractStatusReportingOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalAchievementId;
    private final GamesClientContext mGamesContext;
    private final int mNumSteps;
    private final com.google.android.gms.games.internal.PopupManager.PopupLocationInfo mPopupLocationInfo;
    private final boolean mWriteImmediate;

    public SetAchievementStepsOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, int i, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mExternalAchievementId = s;
        mNumSteps = i;
        mPopupLocationInfo = popuplocationinfo;
        boolean flag;
        if (wrappedgamescallbacks != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mWriteImmediate = flag;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.setAchievementSteps(mGamesContext, mExternalAchievementId, mNumSteps, mPopupLocationInfo, mWriteImmediate);
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
