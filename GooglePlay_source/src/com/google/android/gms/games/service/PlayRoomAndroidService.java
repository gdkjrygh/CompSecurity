// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.response.FastParser;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IRoomServiceCallbacks;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.realtime.network.DataConnectionCallbacks;
import com.google.android.gms.games.realtime.network.DataConnectionManager;
import com.google.android.gms.games.realtime.network.DcmFactory;
import com.google.android.gms.games.realtime.network.LibJingleDataConnectionManager;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.statemachine.roomservice.RoomServiceStateMachine;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class PlayRoomAndroidService extends Service
{
    public static final class RoomService extends com.google.android.gms.games.internal.IRoomService.Stub
    {

        private final Context mContext;
        private final DcmFactory mDcmFactory = new _cls1();
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
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.ConnectNetworkData(s, s1, s2));
        }

        public final void createNativeLibjingleSocket(String s, int i)
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.CreateNativeSocketConnectionData(s, i));
        }

        public final void createSocketConnection(String s, int i)
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.CreateSocketConnectionData(s, i));
        }

        public final void disconnectNetwork()
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.DisconnectNetworkData());
        }

        public final void doneLeavingRoom(boolean flag)
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.DoneLeavingRoomData(flag));
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
                mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.EnterRoomData(dataholder, flag));
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
                mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.StatusNotificationData(s));
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
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.LeaveRoomData());
        }

        public final void loadLibraries()
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.LoadLibrariesData(mContext));
        }

        public final void sendReliableMessage(byte abyte0[], String s, int i)
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.SendReliableMessageData(i, abyte0, s));
        }

        public final void sendUnreliableMessage(byte abyte0[], String as[])
        {
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.SendUnreliableMessageData(abyte0, as));
        }

        public final void setup(IBinder ibinder, IRoomServiceCallbacks iroomservicecallbacks)
        {
            Preconditions.checkNotNull(iroomservicecallbacks);
            Preconditions.checkNotNull(ibinder);
            try
            {
                ibinder.linkToDeath(new android.os.IBinder.DeathRecipient() {

                    final RoomService this$0;

                    public final void binderDied()
                    {
                        RoomService.kill("Binder died", null);
                    }

            
            {
                this$0 = RoomService.this;
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
            mRoomServiceStateMachine.sendMessage(new com.google.android.gms.games.service.statemachine.roomservice.Messages.UnloadLibrariesData(mContext));
        }

        public RoomService(Context context)
        {
            mContext = context;
        }
    }


    private static int sRoomAndroidServicePid = -1;
    private RoomService mRoomServiceInstance;

    public PlayRoomAndroidService()
    {
    }

    public static RoomStatus parseJsonRoomStatus(String s)
        throws com.google.android.gms.common.server.response.FastParser.ParseException
    {
        RoomStatus roomstatus = new RoomStatus();
        (new FastParser()).parse(s, roomstatus);
        return roomstatus;
    }

    protected final void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.println((new StringBuilder("[RTMP DUMP] ")).append(getClass().getSimpleName()).toString());
        filedescriptor = mRoomServiceInstance;
        printwriter.println((new StringBuilder()).append("  ").append(filedescriptor.getClass().getSimpleName()).toString());
        if (((RoomService) (filedescriptor)).mRoomServiceStateMachine != null)
        {
            filedescriptor = ((RoomService) (filedescriptor)).mRoomServiceStateMachine;
            as = (new StringBuilder()).append("  ").append("  ").toString();
            printwriter.println((new StringBuilder()).append(as).append(filedescriptor.getClass().getSimpleName()).toString());
            printwriter.println("State machine: ");
            filedescriptor.dump$dcd0ff(printwriter);
        }
    }

    public final IBinder onBind(Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (mRoomServiceInstance == null)
        {
            mRoomServiceInstance = new RoomService(this);
        }
        if (!Build.TYPE.equals("user") && sRoomAndroidServicePid == -1)
        {
            sRoomAndroidServicePid = Process.myPid();
            GamesLog.v("RoomAndroidService", (new StringBuilder("Room Android Service has pid ")).append(sRoomAndroidServicePid).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return mRoomServiceInstance;
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public final void onDestroy()
    {
        mRoomServiceInstance = null;
        super.onDestroy();
    }


    // Unreferenced inner class com/google/android/gms/games/service/PlayRoomAndroidService$RoomService$1

/* anonymous class */
    final class RoomService._cls1
        implements DcmFactory
    {

        final RoomService this$0;

        public final DataConnectionManager build(Context context, DataConnectionCallbacks dataconnectioncallbacks, int i)
        {
            return new LibJingleDataConnectionManager(context, dataconnectioncallbacks, i);
        }

            
            {
                this$0 = RoomService.this;
                super();
            }
    }

}
