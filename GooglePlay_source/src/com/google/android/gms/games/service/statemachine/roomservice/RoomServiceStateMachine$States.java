// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;


// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceStateMachine, DefaultHandlerState, InRoomState, LeavingRoomState, 
//            LibrariesLoadedState, LibrariesUnloadedState, NetworkConnectedState, NetworkConnectingState, 
//            WaitNetworkDisconnectState

protected static final class 
{

    protected DefaultHandlerState defaultHandlerState;
    protected InRoomState inRoomState;
    protected LeavingRoomState leavingRoomState;
    protected LibrariesLoadedState librariesLoadedState;
    protected LibrariesUnloadedState librariesUnloadedState;
    protected NetworkConnectedState networkConnectedState;
    protected NetworkConnectingState networkConnectingState;
    protected WaitNetworkDisconnectState waitNetworkDisconnectState;

    public final void populate(RoomServiceStateMachine roomservicestatemachine)
    {
        defaultHandlerState = new DefaultHandlerState(roomservicestatemachine);
        inRoomState = new InRoomState(roomservicestatemachine);
        leavingRoomState = new LeavingRoomState(roomservicestatemachine);
        librariesLoadedState = new LibrariesLoadedState(roomservicestatemachine);
        librariesUnloadedState = new LibrariesUnloadedState(roomservicestatemachine);
        networkConnectedState = new NetworkConnectedState(roomservicestatemachine);
        networkConnectingState = new NetworkConnectingState(roomservicestatemachine);
        waitNetworkDisconnectState = new WaitNetworkDisconnectState(roomservicestatemachine);
    }

    protected ()
    {
    }
}
