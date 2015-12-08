// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClientSupervisorImpl

private final class mState
{
    public final class SupervisorServiceConnection
        implements ServiceConnection
    {

        final GmsClientSupervisorImpl.GmsClientConnectionStatus this$1;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = GmsClientSupervisorImpl.access$200(this$0);
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
            java.util.HashMap hashmap = GmsClientSupervisorImpl.access$200(this$0);
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

        public SupervisorServiceConnection()
        {
            this$1 = GmsClientSupervisorImpl.GmsClientConnectionStatus.this;
            super();
        }
    }


    IBinder mBinder;
    final Set mClientConnections = new HashSet();
    ComponentName mComponentName;
    final mClientConnections mConfig;
    boolean mIsBound;
    int mState;
    final SupervisorServiceConnection mSupervisorConnection = new SupervisorServiceConnection();
    final GmsClientSupervisorImpl this$0;

    public final void addServiceConnection(ServiceConnection serviceconnection, String s)
    {
        ConnectionTracker _tmp = GmsClientSupervisorImpl.access$700(GmsClientSupervisorImpl.this);
        android.content.Context _tmp1 = GmsClientSupervisorImpl.access$600(GmsClientSupervisorImpl.this);
        mConfig.StartServiceIntent();
        ConnectionTracker.getConnectionKey(serviceconnection);
        mClientConnections.add(serviceconnection);
    }

    public final void bindService(String s)
    {
        mState = 3;
        mIsBound = GmsClientSupervisorImpl.access$700(GmsClientSupervisorImpl.this).bindService(GmsClientSupervisorImpl.access$600(GmsClientSupervisorImpl.this), s, mConfig.StartServiceIntent(), mSupervisorConnection, 129);
        if (mIsBound)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        mState = 2;
        GmsClientSupervisorImpl.access$700(GmsClientSupervisorImpl.this).unbindService(GmsClientSupervisorImpl.access$600(GmsClientSupervisorImpl.this), mSupervisorConnection);
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

    public SupervisorServiceConnection.this._cls1(SupervisorServiceConnection.this._cls1 _pcls1)
    {
        this$0 = GmsClientSupervisorImpl.this;
        super();
        mConfig = _pcls1;
        mState = 2;
    }
}
