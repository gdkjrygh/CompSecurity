// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            InRoomState, RtmpSessionLog

public final class cbList
{
    final class OneCallback
    {

        public final WrappedGamesCallbacks mCallbacks;
        public final String mOwner;
        final InRoomState.RoomCallbacksHelper this$1;

        public OneCallback(WrappedGamesCallbacks wrappedgamescallbacks, String s)
        {
            this$1 = InRoomState.RoomCallbacksHelper.this;
            super();
            mCallbacks = wrappedgamescallbacks;
            mOwner = s;
        }
    }


    List cbList;
    String mCurrentRoomId;
    OneCallback mGamesCallBack;
    final OneCallback mLogPeerCounts = new InRoomState.LogCallBack() {

        final InRoomState.RoomCallbacksHelper this$1;

        public final void run(Room room)
        {
            int k = 0;
            int j = 0;
            room = room.getParticipants();
            int i = 0;
            for (int i1 = room.size(); i < i1;)
            {
                int l = k + 1;
                k = j;
                if (((Participant)room.get(i)).isConnectedToRoom())
                {
                    k = j + 1;
                }
                i++;
                j = k;
                k = l;
            }

            room = InRoomState.access$100(this$0);
            ((RtmpSessionLog) (room)).mLog.numPeers = Math.max(k, ((RtmpSessionLog) (room)).mLog.numPeers);
            ((RtmpSessionLog) (room)).mLog.numConnectedPeers = Math.max(j, ((RtmpSessionLog) (room)).mLog.numConnectedPeers);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                super();
            }
    };
    OneCallback mWaitingRoomCb;
    final InRoomState this$0;

    static void logEx(String s, RemoteException remoteexception)
    {
        Log.e("RoomServiceClientStateMachine", (new StringBuilder("RoomCallbacksHelper.")).append(s).toString(), remoteexception);
    }

    public final void clear()
    {
        cbList.clear();
    }

    final void onRoomCallback(String s, String s1, cbList cblist, cbList cblist1)
    {
        boolean flag;
        if (TextUtils.equals(s1, mCurrentRoomId))
        {
            flag = true;
        } else
        {
            mSm.logNote((new StringBuilder("Current room is ")).append(mCurrentRoomId).append(" but got a message for ").append(s1).append(" in ").append(s).toString());
            flag = false;
        }
        if (!flag)
        {
            return;
        }
        s1 = InRoomState.access$200(InRoomState.this).getRoom(s1);
        if (cblist1 != null)
        {
            RoomBuffer roombuffer = new RoomBuffer(s1);
            if (roombuffer.getCount() > 0)
            {
                cblist1.getRoom((Room)roombuffer.get(0));
            }
        }
        cblist1 = cbList.iterator();
_L1:
        OneCallback onecallback;
        if (!cblist1.hasNext())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        onecallback = (OneCallback)cblist1.next();
        cblist.OneCallback(s1, onecallback.mCallbacks);
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        logEx(s, remoteexception);
          goto _L1
        s;
        s1.close();
        throw s;
        s1.close();
        return;
    }

    final void updateCbList()
    {
        cbList.clear();
        if (mWaitingRoomCb != null)
        {
            cbList.add(mWaitingRoomCb);
        }
        if (mGamesCallBack != null)
        {
            cbList.add(mGamesCallBack);
        }
    }

    public _cls9.this._cls1()
    {
        this$0 = InRoomState.this;
        super();
        mCurrentRoomId = "";
        cbList = new ArrayList();
    }

    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$10

/* anonymous class */
    final class _cls10
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;
        final Messages.OnPeerLeftRoomData val$data;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            String as[] = data.participantIds;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onPeerLeftRoom(dataholder, as);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                data = onpeerleftroomdata;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$11

/* anonymous class */
    final class _cls11
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;
        final Messages.OnPeerDisconnectedData val$data;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            String as[] = data.participantIds;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onPeerDisconnected(dataholder, as);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                data = onpeerdisconnecteddata;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$2

/* anonymous class */
    final class _cls2
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;
        final Messages.OnPeerJoinedRoomData val$data;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            String as[] = data.participantIds;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onPeerJoinedRoom(dataholder, as);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                data = onpeerjoinedroomdata;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$3

/* anonymous class */
    final class _cls3
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;
        final Messages.OnPeerDeclinedData val$data;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            String as[] = data.participantIds;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onPeerDeclined(dataholder, as);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                data = onpeerdeclineddata;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$4

/* anonymous class */
    final class _cls4
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onRoomConnecting(dataholder);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$5

/* anonymous class */
    final class _cls5
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onConnectedToRoom(dataholder);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$6

/* anonymous class */
    final class _cls6
        implements InRoomState.LogCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;

        public final void run(Room room)
        {
            RtmpSessionLog rtmpsessionlog = InRoomState.access$100(this$0);
            if (rtmpsessionlog.mLog.peerConnectTimeMs == 0L)
            {
                rtmpsessionlog.mLog.peerConnectTimeMs = rtmpsessionlog.deltaNow();
            }
            mLogPeerCounts.run(room);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$7

/* anonymous class */
    final class _cls7
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;
        final Messages.OnPeerConnectedData val$data;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            String as[] = data.participantIds;
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onPeerConnected(dataholder, as);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                data = onpeerconnecteddata;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$8

/* anonymous class */
    final class _cls8
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onRoomConnected(dataholder);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/service/statemachine/roomclient/InRoomState$RoomCallbacksHelper$9

/* anonymous class */
    final class _cls9
        implements InRoomState.RoomCallBack
    {

        final InRoomState.RoomCallbacksHelper this$1;

        public final void run(DataHolder dataholder, WrappedGamesCallbacks wrappedgamescallbacks)
            throws RemoteException
        {
            wrappedgamescallbacks.audit(new DataHolder[] {
                dataholder
            });
            wrappedgamescallbacks.mCallbacks.onDisconnectedFromRoom(dataholder);
        }

            
            {
                this$1 = InRoomState.RoomCallbacksHelper.this;
                super();
            }
    }

}
