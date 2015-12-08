// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.service.statemachine.FutureMessage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DataConnectionManager, DcmStateMachine, DataConnectionCallbacks

public final class LibJingleDataConnectionManager
    implements DataConnectionManager
{

    private final DcmStateMachine mDcmStateMachine;

    public LibJingleDataConnectionManager(Context context, DataConnectionCallbacks dataconnectioncallbacks, int i)
    {
        mDcmStateMachine = new DcmStateMachine(context, i, dataconnectioncallbacks);
        mDcmStateMachine.start();
    }

    public final void cleanup()
    {
        mDcmStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.CleanupLibJingleData());
    }

    public final void connectToPeer(String s, boolean flag, int i)
    {
        mDcmStateMachine.sendMessage(new DcmMessages.ConnectPeerData(s, flag, i));
    }

    public final int createNativeLibjingleSocket(String s)
    {
        s = new DcmMessages.CreateNativeSocketData(s);
        mDcmStateMachine.sendMessage(s);
        int i;
        try
        {
            i = ((Integer)((FutureMessage) (s)).mFuture.get()).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    public final String createSocketConnection(String s)
    {
        s = new DcmMessages.CreateObsoleteSocketData(s, this);
        mDcmStateMachine.sendMessage(s);
        try
        {
            s = (String)((FutureMessage) (s)).mFuture.get();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public final void disconnectPeerConnection(String s)
    {
        mDcmStateMachine.sendMessage(new DcmMessages.DisconnectPeerData(s));
    }

    public final DataConnectionManager.SessionDiagnostics getNetworkDiagnosticsForPeer(String s)
    {
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "JID must not be empty or null");
        s = new DcmMessages.GetDiagnosticsForPeer(s);
        mDcmStateMachine.sendMessage(s);
        try
        {
            s = (DataConnectionManager.SessionDiagnostics)((FutureMessage) (s)).mFuture.get();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public final void onObsoleteSocketClosed(DcmMessages.SocketProxyClosedSocketData socketproxyclosedsocketdata)
    {
        mDcmStateMachine.sendMessage(socketproxyclosedsocketdata);
    }

    public final void prepareNetworkForMatch(String s, String s1)
    {
        mDcmStateMachine.sendMessage(new DcmMessages.PrepareNetworkForMatchData(s, s1));
    }

    public final void registerWithBuzzbot(String s)
    {
        mDcmStateMachine.sendMessage(new DcmMessages.RegisterBuzzbotData(s));
    }

    public final int sendReliableMessage(byte abyte0[], String s)
    {
        abyte0 = new DcmMessages.SendReliableData(abyte0, s);
        mDcmStateMachine.sendMessage(abyte0);
        int i;
        try
        {
            i = ((Integer)((FutureMessage) (abyte0)).mFuture.get()).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return -1;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return -1;
        }
        return i;
    }

    public final void sendUnreliableMessage(byte abyte0[], String as[])
    {
        mDcmStateMachine.sendMessage(new DcmMessages.SendUnreliableData(abyte0, as));
    }

    public final void tearDown()
    {
        mDcmStateMachine.sendMessage(new DcmMessages.TearDownData());
    }

    public final void unregisterWithBuzzbot()
    {
        mDcmStateMachine.sendMessage(new DcmMessages.UnregisterBuzzbotData());
    }
}
