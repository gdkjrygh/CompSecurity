// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.DataHolderResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.internal.GamesLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.client:
//            IPlayGamesService, AbstractPlayGamesCallbacks

public final class PlayGamesClientImpl extends GmsClient
{
    private static final class ExperimentsLoadedBinderCallback extends AbstractPlayGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onExperimentsLoaded(int i, long al[])
        {
            mResultHolder.setResult(new LoadExperimentsResultImpl(i, al));
        }

        ExperimentsLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static abstract class GamesDataHolderResult extends DataHolderResult
    {

        protected GamesDataHolderResult(DataHolder dataholder)
        {
            super(dataholder, GamesStatusCodes.create(dataholder.mStatusCode));
        }
    }

    private static final class GamesLoadedBinderCallback extends AbstractPlayGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onGamesLoaded(DataHolder dataholder)
        {
            mResultHolder.setResult(new LoadGamesResultImpl(dataholder));
        }

        public GamesLoadedBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }

    private static final class LoadExperimentsResultImpl
        implements PlayGames.LoadExperimentsResult
    {

        private final Set mExperimentIds = new HashSet();
        private final Status mStatus;

        public final Set getExperimentIds()
        {
            return mExperimentIds;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        LoadExperimentsResultImpl(int i, long al[])
        {
            mStatus = new Status(i);
            for (i = 0; i < al.length; i++)
            {
                mExperimentIds.add(Long.valueOf(al[i]));
            }

        }
    }

    private static final class LoadGamesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult
    {

        private final GameFirstPartyBuffer mBuffer;

        public final GameFirstPartyBuffer getGames()
        {
            return mBuffer;
        }

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            mBuffer = new GameFirstPartyBuffer(dataholder);
        }
    }

    private static final class StartRecordingBinderCallback extends AbstractPlayGamesCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onLaunchGameForRecording(int i)
        {
            mResultHolder.setResult(new Status(i));
        }

        public StartRecordingBinderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder)Preconditions.checkNotNull(resultholder, "Holder must not be null");
        }
    }


    private final PlayGames.PlayGamesOptions mOptions;

    public PlayGamesClientImpl(Context context, Looper looper, ClientSettings clientsettings, PlayGames.PlayGamesOptions playgamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 1, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mOptions = playgamesoptions;
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IPlayGamesService.Stub.asInterface(ibinder);
    }

    public final List getExperiments()
    {
        List list;
        try
        {
            list = ((IPlayGamesService)getService()).getExperiments();
        }
        catch (RemoteException remoteexception)
        {
            GamesLog.w("PlayGamesClientImpl", "service died", remoteexception);
            return null;
        }
        return list;
    }

    protected final Bundle getGetServiceRequestExtraArgs()
    {
        PlayGames.PlayGamesOptions playgamesoptions = mOptions;
        Bundle bundle = playgamesoptions.gamesOptions.getAsBundle();
        bundle.putBoolean("unauthenticated", playgamesoptions.unauthenticated);
        return bundle;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.games.client.IPlayGamesService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.play.games.service.START_1P";
    }

    public final void loadCommonGames(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IPlayGamesService)getService()).loadCommonGames(new GamesLoadedBinderCallback(resultholder), s, i, flag, flag1);
    }

    public final void loadGameCollection(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, int i, int j, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IPlayGamesService)getService()).loadGameCollection(new GamesLoadedBinderCallback(resultholder), i, j, flag, flag1);
    }

    public final void loadRecentlyPlayedGamesForPlayer(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IPlayGamesService)getService()).loadRecentlyPlayedGames(new GamesLoadedBinderCallback(resultholder), s, i, flag, flag1);
    }

    public final boolean requiresSignIn()
    {
        return !mOptions.unauthenticated;
    }

    public final void searchForGames(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IPlayGamesService)getService()).searchForGames(new GamesLoadedBinderCallback(resultholder), s, i, flag, flag1);
    }

    protected final Set validateScopes(Set set)
    {
        Scope scope = new Scope("https://www.googleapis.com/auth/games.firstparty");
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            if (((Scope)iterator.next()).equals(scope))
            {
                return set;
            }
        }

        throw new IllegalArgumentException("Must provide the 1P scope to use Play Games API!");
    }
}
