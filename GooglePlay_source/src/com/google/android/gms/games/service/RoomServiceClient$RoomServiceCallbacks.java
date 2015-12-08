// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.games.internal.ConnectionInfo;
import com.google.android.gms.games.service.statemachine.roomclient.RoomServiceClientStateMachine;

// Referenced classes of package com.google.android.gms.games.service:
//            RoomServiceClient

private final class <init> extends com.google.android.gms.games.internal.init>
{

    final RoomServiceClient this$0;

    public final void onConnectedToRoom(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ata(s);
        mStateMachine.sendMessage(s);
    }

    public final void onCreateNativeLibjingleSocket(ParcelFileDescriptor parcelfiledescriptor, int i)
    {
        mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.ata(parcelfiledescriptor, i));
    }

    public final void onCreateSocketConnection(String s, int i)
    {
        mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.init>(s, i));
    }

    public final void onDisconnectedFromRoom(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.it>(s);
        mStateMachine.sendMessage(s);
    }

    public final void onEnterRoomResult(String s, boolean flag)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.>(s, flag);
        mStateMachine.sendMessage(s);
    }

    public final void onLibrariesLoaded(int i)
    {
        mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.ge(i));
    }

    public final void onNetworkConnected(ConnectionInfo connectioninfo)
    {
        mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.<init>(connectioninfo));
    }

    public final void onNetworkDisconnected()
    {
        mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.t>());
    }

    public final void onP2PConnected(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.t>(s);
        mStateMachine.sendMessage(s);
    }

    public final void onP2PDisconnected(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s);
        mStateMachine.sendMessage(s);
    }

    public final void onPeerConnected(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onPeerDeclined(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onPeerDisconnected(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onPeerInvitedToRoom(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onPeerJoinedRoom(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onPeerLeftRoom(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onRealTimeMessageReceived(String s, byte abyte0[], int i)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.<init>(s, abyte0, i);
        mStateMachine.sendMessage(s);
    }

    public final void onReportP2pStatus(String s, String as[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s, as);
        mStateMachine.sendMessage(s);
    }

    public final void onRoomAutoMatching(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s);
        mStateMachine.sendMessage(s);
    }

    public final void onRoomConnected(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s);
        mStateMachine.sendMessage(s);
    }

    public final void onRoomConnecting(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s);
        mStateMachine.sendMessage(s);
    }

    public final void onRoomLeaveDiagnostics(String s, byte abyte0[])
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.it>(s, abyte0);
        mStateMachine.sendMessage(s);
    }

    public final void onRoomTornDown()
        throws RemoteException
    {
        com.google.android.gms.games.service.statemachine.roomclient.ge ge = new com.google.android.gms.games.service.statemachine.roomclient.ge();
        mStateMachine.sendMessage(ge);
    }

    public final void onRoomUpdated(String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.ge(s);
        mStateMachine.sendMessage(s);
    }

    public final void onSentReliableMessage(int i, int j, String s)
        throws RemoteException
    {
        s = new com.google.android.gms.games.service.statemachine.roomclient.t>(i, j, s);
        mStateMachine.sendMessage(s);
    }

    public final void onSetupDone(IBinder ibinder)
    {
        mStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomclient.ge(ibinder));
    }

    private oneData()
    {
        this$0 = RoomServiceClient.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
