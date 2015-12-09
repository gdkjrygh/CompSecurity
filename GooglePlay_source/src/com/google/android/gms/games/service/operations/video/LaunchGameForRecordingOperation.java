// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.video;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.client.IPlayGamesCallbacks;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;
import com.google.android.gms.games.video.VideoConfiguration;

public final class LaunchGameForRecordingOperation extends AbstractStatusReportingOperation
{

    private final IPlayGamesCallbacks mCallbacksFirstParty;
    private final WrappedGamesCallbacks mCallbacksThirdParty;
    private final VideoConfiguration mConfiguration;
    private final GamesClientContext mGamesContext;
    private final String mPackageName;

    public LaunchGameForRecordingOperation(GamesClientContext gamesclientcontext, IPlayGamesCallbacks iplaygamescallbacks, String s, VideoConfiguration videoconfiguration)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacksFirstParty = iplaygamescallbacks;
        mPackageName = s;
        mConfiguration = videoconfiguration;
        mCallbacksThirdParty = null;
    }

    public LaunchGameForRecordingOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, VideoConfiguration videoconfiguration)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacksThirdParty = wrappedgamescallbacks;
        mPackageName = s;
        mConfiguration = videoconfiguration;
        mCallbacksFirstParty = null;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        context = mGamesContext;
        String s = mPackageName;
        VideoConfiguration videoconfiguration = mConfiguration;
        boolean flag;
        if (mCallbacksFirstParty == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return databroker.launchGameForRecording(context, s, videoconfiguration, flag);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        if (mCallbacksFirstParty == null)
        {
            mCallbacksThirdParty.mCallbacks.onLaunchGameForRecording(i);
            return;
        } else
        {
            mCallbacksFirstParty.onLaunchGameForRecording(i);
            return;
        }
    }
}
