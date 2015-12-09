// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.response.FastParser;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            LibjingleDependentState, RtmpSessionLog, OneupRtmpCalls, WaitForHttpLeaveState, 
//            CleanupBindingState, RoomServiceClientStateMachine

final class WaitLeaveDiagnosticsState extends LibjingleDependentState
{

    private Messages.LeaveRoomData mClientLeaveRoom;
    private String mLeaveReason;
    private RtmpSessionLog mSessionLog;

    public WaitLeaveDiagnosticsState(RoomServiceClientStateMachine roomserviceclientstatemachine)
    {
        super(roomserviceclientstatemachine, 10);
    }

    public final boolean processNonTimerMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 39: // '\''
        case 41: // ')'
            mSm.deferMessage(message);
            return HANDLED;

        case 10: // '\n'
            final Object leaveCb = (Messages.OnRoomLeaveDiagnosticsData)message.obj;
            message = null;
            if (((Messages.OnRoomLeaveDiagnosticsData) (leaveCb)).dcmPlaylog.length != 0)
            {
                RtmpSessionLog rtmpsessionlog = mSessionLog;
                byte abyte0[] = ((Messages.OnRoomLeaveDiagnosticsData) (leaveCb)).dcmPlaylog;
                rtmpsessionlog.mLog.dcmSession = RtmpSessionLog.RtmpDcmLog.parse(abyte0);
            }
            if (((Messages.OnRoomLeaveDiagnosticsData) (leaveCb)).roomLeaveDiagnosticsJson != null)
            {
                message = new RoomLeaveDiagnostics();
                final Messages.LeaveRoomData clientLeaveRoom;
                try
                {
                    (new FastParser()).parse(((Messages.OnRoomLeaveDiagnosticsData) (leaveCb)).roomLeaveDiagnosticsJson, message);
                }
                catch (com.google.android.gms.common.server.response.FastParser.ParseException parseexception)
                {
                    message = null;
                    Log.e("RoomServiceClientStateMachine", (new StringBuilder("Exception when parsing leave diagnostics: ")).append(((Messages.OnRoomLeaveDiagnosticsData) (leaveCb)).roomLeaveDiagnosticsJson).toString(), parseexception);
                }
            }
            leaveCb = mClientLeaveRoom.clientLeaveRoomData.callbacks;
            clientLeaveRoom = mClientLeaveRoom;
            mData.mOneup.leaveRoom(mClientLeaveRoom.clientLeaveRoomData.context, mClientLeaveRoom.clientLeaveRoomData.clientContext, new com.google.android.gms.games.service.PlayGamesAsyncService.RoomLeftCallback() {

                final WaitLeaveDiagnosticsState this$0;
                final Messages.LeaveRoomData val$clientLeaveRoom;
                final WrappedGamesCallbacks val$leaveCb;

                public final void onLeftRoom(int i, String s)
                {
                    mSm.sendMessage(new Messages.OnRoomLeftData(i, s, leaveCb, clientLeaveRoom));
                }

            
            {
                this$0 = WaitLeaveDiagnosticsState.this;
                leaveCb = wrappedgamescallbacks;
                clientLeaveRoom = leaveroomdata;
                super();
            }
            }, mClientLeaveRoom.clientLeaveRoomData.externalRoomId, mLeaveReason, message);
            mSessionLog.oneupLeaveCallStart();
            message = mStates.waitForHttpLeaveState;
            message.mSessionLog = mSessionLog;
            message.transitionToState();
            return HANDLED;

        case 13: // '\r'
            if (((Messages.RoomServiceGoneData)message.obj).validToken.isValid())
            {
                mData.mOneup.leaveRoom(mClientLeaveRoom.clientLeaveRoomData.context, mClientLeaveRoom.clientLeaveRoomData.clientContext, new com.google.android.gms.games.service.PlayGamesAsyncService.RoomLeftCallback() {

                    final WaitLeaveDiagnosticsState this$0;

                    public final void onLeftRoom(int i, String s)
                    {
                        WrappedGamesCallbacks wrappedgamescallbacks;
                        try
                        {
                            wrappedgamescallbacks = mClientLeaveRoom.clientLeaveRoomData.callbacks;
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            RoomServiceClientStateMachine.handleGameRemoteFailure(s);
                            return;
                        }
                        if (wrappedgamescallbacks == null)
                        {
                            break MISSING_BLOCK_LABEL_24;
                        }
                        wrappedgamescallbacks.onLeftRoom(i, s);
                    }

            
            {
                this$0 = WaitLeaveDiagnosticsState.this;
                super();
            }
                }, mClientLeaveRoom.clientLeaveRoomData.externalRoomId, "REALTIME_ROOM_SERVICE_CRASHED", null);
                mStates.cleanupBindingState.transitionToState();
            }
            return HANDLED;

        case 16: // '\020'
        case 26: // '\032'
        case 29: // '\035'
            mSm.deferMessage(message);
            return HANDLED;
        }
    }

    public final void transitionTo(String s, Messages.LeaveRoomData leaveroomdata, RtmpSessionLog rtmpsessionlog)
    {
        mClientLeaveRoom = (Messages.LeaveRoomData)Preconditions.checkNotNull(leaveroomdata);
        mSessionLog = rtmpsessionlog;
        mLeaveReason = s;
        transitionToState();
    }

}
