// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClientSupervisor, Preconditions, Objects

final class GmsClientSupervisorImpl extends GmsClientSupervisor
    implements android.os.Handler.Callback
{
    private static final class ConnectionStatusConfig
    {

        private final String mAction;
        private final ComponentName mComponentName;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof ConnectionStatusConfig))
                {
                    return false;
                }
                obj = (ConnectionStatusConfig)obj;
                if (!Objects.equal(mAction, ((ConnectionStatusConfig) (obj)).mAction) || !Objects.equal(mComponentName, ((ConnectionStatusConfig) (obj)).mComponentName))
                {
                    return false;
                }
            }
            return true;
        }

        public final Intent getStartServiceIntent()
        {
            if (mAction != null)
            {
                return (new Intent(mAction)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(mComponentName);
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                mAction, mComponentName
            });
        }

        public final String toString()
        {
            if (mAction == null)
            {
                return mComponentName.flattenToString();
            } else
            {
                return mAction;
            }
        }

        public ConnectionStatusConfig(ComponentName componentname)
        {
            mAction = null;
            mComponentName = (ComponentName)Preconditions.checkNotNull(componentname);
        }

        public ConnectionStatusConfig(String s)
        {
            mAction = Preconditions.checkNotEmpty(s);
            mComponentName = null;
        }
    }

    private final class GmsClientConnectionStatus
    {

        IBinder mBinder;
        final Set mClientConnections = new HashSet();
        ComponentName mComponentName;
        final ConnectionStatusConfig mConfig;
        boolean mIsBound;
        int mState;
        final SupervisorServiceConnection mSupervisorConnection = new SupervisorServiceConnection();
        final GmsClientSupervisorImpl this$0;

        public final void addServiceConnection(ServiceConnection serviceconnection, String s)
        {
            ConnectionTracker _tmp = mConnectionTracker;
            Context _tmp1 = mApplicationContext;
            mConfig.getStartServiceIntent();
            ConnectionTracker.getConnectionKey(serviceconnection);
            mClientConnections.add(serviceconnection);
        }

        public final void bindService(String s)
        {
            mState = 3;
            mIsBound = mConnectionTracker.bindService(mApplicationContext, s, mConfig.getStartServiceIntent(), mSupervisorConnection, 129);
            if (mIsBound)
            {
                break MISSING_BLOCK_LABEL_74;
            }
            mState = 2;
            mConnectionTracker.unbindService(mApplicationContext, mSupervisorConnection);
            return;
            s;
        }

        public final boolean containsGmsServiceConnection(ServiceConnection serviceconnection)
        {
            return mClientConnections.contains(serviceconnection);
        }

        public final boolean hasNoGmsServiceConnections()
        {
            return mClientConnections.isEmpty();
        }

        public GmsClientConnectionStatus(ConnectionStatusConfig connectionstatusconfig)
        {
            this$0 = GmsClientSupervisorImpl.this;
            super();
            mConfig = connectionstatusconfig;
            mState = 2;
        }
    }

    public final class GmsClientConnectionStatus.SupervisorServiceConnection
        implements ServiceConnection
    {

        final GmsClientConnectionStatus this$1;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = mConnectionStatus;
            hashmap;
            JVM INSTR monitorenter ;
            mBinder = ibinder;
            mComponentName = componentname;
            for (Iterator iterator = mClientConnections.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_78;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            mState = 1;
            hashmap;
            JVM INSTR monitorexit ;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = mConnectionStatus;
            hashmap;
            JVM INSTR monitorenter ;
            mBinder = null;
            mComponentName = componentname;
            for (Iterator iterator = mClientConnections.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_74;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            mState = 2;
            hashmap;
            JVM INSTR monitorexit ;
        }

        public GmsClientConnectionStatus.SupervisorServiceConnection()
        {
            this$1 = GmsClientConnectionStatus.this;
            super();
        }
    }


    private final Context mApplicationContext;
    private final HashMap mConnectionStatus = new HashMap();
    private final ConnectionTracker mConnectionTracker = ConnectionTracker.getInstance();
    private final Handler mHandler;
    private final long mUnbindDelayMillis = 5000L;

    GmsClientSupervisorImpl(Context context)
    {
        mApplicationContext = context.getApplicationContext();
        mHandler = new Handler(context.getMainLooper(), this);
    }

    private boolean bindService(ConnectionStatusConfig connectionstatusconfig, ServiceConnection serviceconnection, String s)
    {
        Preconditions.checkNotNull(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = mConnectionStatus;
        hashmap;
        JVM INSTR monitorenter ;
        GmsClientConnectionStatus gmsclientconnectionstatus = (GmsClientConnectionStatus)mConnectionStatus.get(connectionstatusconfig);
        if (gmsclientconnectionstatus != null) goto _L2; else goto _L1
_L1:
        gmsclientconnectionstatus = new GmsClientConnectionStatus(connectionstatusconfig);
        gmsclientconnectionstatus.addServiceConnection(serviceconnection, s);
        gmsclientconnectionstatus.bindService(s);
        mConnectionStatus.put(connectionstatusconfig, gmsclientconnectionstatus);
        connectionstatusconfig = gmsclientconnectionstatus;
_L7:
        boolean flag = ((GmsClientConnectionStatus) (connectionstatusconfig)).mIsBound;
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        mHandler.removeMessages(0, gmsclientconnectionstatus);
        if (gmsclientconnectionstatus.containsGmsServiceConnection(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(connectionstatusconfig).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        connectionstatusconfig;
        hashmap;
        JVM INSTR monitorexit ;
        throw connectionstatusconfig;
        gmsclientconnectionstatus.addServiceConnection(serviceconnection, s);
        gmsclientconnectionstatus.mState;
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(gmsclientconnectionstatus.mComponentName, gmsclientconnectionstatus.mBinder);
        connectionstatusconfig = gmsclientconnectionstatus;
        continue; /* Loop/switch isn't completed */
_L5:
        gmsclientconnectionstatus.bindService(s);
        connectionstatusconfig = gmsclientconnectionstatus;
        continue; /* Loop/switch isn't completed */
_L3:
        connectionstatusconfig = gmsclientconnectionstatus;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void unbindService$2e8c2a50(ConnectionStatusConfig connectionstatusconfig, ServiceConnection serviceconnection)
    {
        Preconditions.checkNotNull(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = mConnectionStatus;
        hashmap;
        JVM INSTR monitorenter ;
        GmsClientConnectionStatus gmsclientconnectionstatus = (GmsClientConnectionStatus)mConnectionStatus.get(connectionstatusconfig);
        if (gmsclientconnectionstatus != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(connectionstatusconfig).toString());
        connectionstatusconfig;
        hashmap;
        JVM INSTR monitorexit ;
        throw connectionstatusconfig;
        if (!gmsclientconnectionstatus.containsGmsServiceConnection(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=")).append(connectionstatusconfig).toString());
        }
        connectionstatusconfig = gmsclientconnectionstatus._fld0.mConnectionTracker;
        connectionstatusconfig = gmsclientconnectionstatus._fld0.mApplicationContext;
        ConnectionTracker.getConnectionKey(serviceconnection);
        gmsclientconnectionstatus.mClientConnections.remove(serviceconnection);
        if (gmsclientconnectionstatus.hasNoGmsServiceConnections())
        {
            connectionstatusconfig = mHandler.obtainMessage(0, gmsclientconnectionstatus);
            mHandler.sendMessageDelayed(connectionstatusconfig, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final boolean bindService(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return bindService(new ConnectionStatusConfig(componentname), serviceconnection, s);
    }

    public final boolean bindService(String s, ServiceConnection serviceconnection, String s1)
    {
        return bindService(new ConnectionStatusConfig(s), serviceconnection, s1);
    }

    public final boolean handleMessage(Message message)
    {
        GmsClientConnectionStatus gmsclientconnectionstatus;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            gmsclientconnectionstatus = (GmsClientConnectionStatus)message.obj;
            break;
        }
        synchronized (mConnectionStatus)
        {
            if (gmsclientconnectionstatus.hasNoGmsServiceConnections())
            {
                if (gmsclientconnectionstatus.mIsBound)
                {
                    gmsclientconnectionstatus._fld0.mConnectionTracker.unbindService(gmsclientconnectionstatus._fld0.mApplicationContext, gmsclientconnectionstatus.mSupervisorConnection);
                    gmsclientconnectionstatus.mIsBound = false;
                    gmsclientconnectionstatus.mState = 2;
                }
                mConnectionStatus.remove(gmsclientconnectionstatus.mConfig);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void unbindService(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        unbindService$2e8c2a50(new ConnectionStatusConfig(componentname), serviceconnection);
    }

    public final void unbindService(String s, ServiceConnection serviceconnection, String s1)
    {
        unbindService$2e8c2a50(new ConnectionStatusConfig(s), serviceconnection);
    }



}
