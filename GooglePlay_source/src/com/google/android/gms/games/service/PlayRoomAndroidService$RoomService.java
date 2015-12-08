// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.realtime.network.DataConnectionCallbacks;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.realtime.network.DcmFactory;
import com.google.android.gms.games.realtime.network.LibJingleDataConnectionManager;
import com.google.android.gms.games.service.statemachine.roomservice.RoomServiceStateMachine;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayRoomAndroidService

public static final class mContext extends com.google.android.gms.games.internal.Context
{

    private final Context mContext;
    private final DcmFactory mDcmFactory = new DcmFactory() {

        final PlayRoomAndroidService.RoomService this$0;

        public final DataConnectionManager build(Context context1, DataConnectionCallbacks dataconnectioncallbacks, int i)
        {
            return new LibJingleDataConnectionManager(context1, dataconnectioncallbacks, i);
        }

            
            {
                this$0 = PlayRoomAndroidService.RoomService.this;
                super();
            }
    };
    RoomServiceStateMachine mRoomServiceStateMachine;
    private final boolean mStateMachineIdleEnable = false;

    public static void kill(String s, Throwable throwable)
    {
        s = (new StringBuilder("RoomAndroidService: kill ")).append(s).toString();
        if (throwable == null)
        {
            Log.e("RoomAndroidService", s);
        } else
        {
            Log.e("RoomAndroidService", s, throwable);
        }
        System.exit(0);
    }

    public final void connectNetwork(String s, String s1, String s2)
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.(s, s1, s2));
    }

    public final void createNativeLibjingleSocket(String s, int i)
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.onData(s, i));
    }

    public final void createSocketConnection(String s, int i)
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.(s, i));
    }

    public final void disconnectNetwork()
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.t>());
    }

    public final void doneLeavingRoom(boolean flag)
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.(flag));
    }

    public final void enterRoom(DataHolder dataholder, boolean flag)
    {
        RoomBuffer roombuffer;
        Object obj = null;
        roombuffer = new RoomBuffer(dataholder);
        dataholder = obj;
        if (roombuffer.getCount() > 0)
        {
            dataholder = (Room)((Room)roombuffer.get(0)).freeze();
        }
        roombuffer.release();
        if (dataholder != null)
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.(dataholder, flag));
        }
        return;
        dataholder;
        roombuffer.release();
        throw dataholder;
    }

    public final void handleStatusNotification(String s)
    {
        try
        {
            s = PlayRoomAndroidService.parseJsonRoomStatus(s);
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.it>(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.e("RoomAndroidService", "Room status could not be parsed.");
        }
    }

    public final void kill(String s)
    {
        kill(s, null);
    }

    public final void leaveRoom()
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.());
    }

    public final void loadLibraries()
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.(mContext));
    }

    public final void sendReliableMessage(byte abyte0[], String s, int i)
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.nit>(i, abyte0, s));
    }

    public final void sendUnreliableMessage(byte abyte0[], String as[])
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.<init>(abyte0, as));
    }

    public final void setup(IBinder ibinder, IRoomServiceCallbacks iroomservicecallbacks)
    {
        Preconditions.checkNotNull(iroomservicecallbacks);
        Preconditions.checkNotNull(ibinder);
        try
        {
            ibinder.linkToDeath(new android.os.IBinder.DeathRecipient() {

                final PlayRoomAndroidService.RoomService this$0;

                public final void binderDied()
                {
                    PlayRoomAndroidService.RoomService.kill("Binder died", null);
                }

            
            {
                this$0 = PlayRoomAndroidService.RoomService.this;
                super();
            }
            }, 0);
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            kill("Linking to death", ibinder);
        }
        if (mRoomServiceStateMachine == null)
        {
            mRoomServiceStateMachine = new RoomServiceStateMachine(iroomservicecallbacks, mDcmFactory, false);
            mRoomServiceStateMachine.start();
        }
        try
        {
            iroomservicecallbacks.onSetupDone(new Binder());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            kill("During setup", ibinder);
        }
    }

    public final void unloadLibraries()
    {
        mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.(mContext));
    }

    public _cls2.this._cls0(Context context)
    {
        mContext = context;
    }
}
