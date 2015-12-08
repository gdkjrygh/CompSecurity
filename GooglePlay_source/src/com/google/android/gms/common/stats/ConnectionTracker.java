// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            PassiveTimedConnectionMatcher

public final class ConnectionTracker
{

    private static ConnectionTracker sInstance;
    private static Integer sLogLevel;
    private static final Object sSingletonLock = new Object();
    private final List mIgnoredCallingProcessList;
    private final List mIgnoredCallingServiceList;
    private final List mIgnoredTargetProcessList;
    private final List mIgnoredTargetServiceList;
    private PassiveTimedConnectionMatcher mSentOpenConns;
    private PassiveTimedConnectionMatcher mSentStartedServices;

    private ConnectionTracker()
    {
        if (getLogLevel() == 0)
        {
            mIgnoredCallingProcessList = Collections.EMPTY_LIST;
            mIgnoredCallingServiceList = Collections.EMPTY_LIST;
            mIgnoredTargetProcessList = Collections.EMPTY_LIST;
            mIgnoredTargetServiceList = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)G.connections.ignoredCallingProcesses.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        mIgnoredCallingProcessList = ((List) (obj));
        obj = (String)G.connections.ignoredCallingServices.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        mIgnoredCallingServiceList = ((List) (obj));
        obj = (String)G.connections.ignoredTargetProcesses.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        mIgnoredTargetProcessList = ((List) (obj));
        obj = (String)G.connections.ignoredTargetServices.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        mIgnoredTargetServiceList = ((List) (obj));
        mSentOpenConns = new PassiveTimedConnectionMatcher(((Long)G.connections.timeOutDurationMillis.get()).longValue());
        mSentStartedServices = new PassiveTimedConnectionMatcher(((Long)G.connections.timeOutDurationMillis.get()).longValue());
    }

    public static String getConnectionKey(ServiceConnection serviceconnection)
    {
        return String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(serviceconnection));
    }

    public static ConnectionTracker getInstance()
    {
        synchronized (sSingletonLock)
        {
            if (sInstance == null)
            {
                sInstance = new ConnectionTracker();
            }
        }
        return sInstance;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static int getLogLevel()
    {
        if (sLogLevel == null)
        {
            try
            {
                sLogLevel = Integer.valueOf(0);
            }
            catch (SecurityException securityexception)
            {
                sLogLevel = Integer.valueOf(0);
            }
        }
        return sLogLevel.intValue();
    }

    public final boolean bindService(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        return bindService(context, context.getClass().getName(), intent, serviceconnection, i);
    }

    public final boolean bindService(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
    {
        boolean flag1 = false;
        s = intent.getComponent();
        boolean flag;
        if (s == null)
        {
            flag = false;
        } else
        {
            flag = ClientLibraryUtils.isPackageStopped(context, s.getPackageName());
        }
        if (flag)
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            flag = flag1;
        } else
        {
            boolean flag2 = context.bindService(intent, serviceconnection, i);
            flag = flag2;
            if (flag2)
            {
                getConnectionKey(serviceconnection);
                return flag2;
            }
        }
        return flag;
    }

    public final void unbindService(Context context, ServiceConnection serviceconnection)
    {
        context.unbindService(serviceconnection);
        getConnectionKey(serviceconnection);
    }

}
