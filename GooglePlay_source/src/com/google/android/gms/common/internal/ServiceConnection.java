// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.config.G;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.ArraySet;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.DefaultClock;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            ServiceConnectionLoggingPreferences

public final class ServiceConnection
{

    private static final Set IGNORED_PACKAGES;
    private static final Object LOCK;
    private final int mClientVersion;
    private final BitSet mLoggedStatusCodes = new BitSet();
    private final String mPackageName;
    private final int mServiceId;

    public ServiceConnection(int i, String s, int j)
    {
        mClientVersion = i;
        mPackageName = s;
        mServiceId = j;
    }

    private boolean logIntoFileLocked(Context context, int i)
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            context = new PrintWriter(context.openFileOutput("service.connections", 32768));
            context.println((new StringBuilder()).append(mClientVersion).append("\t").append(mPackageName).append("\t").append(mServiceId).append("\t").append(i).toString());
            context.close();
            flag1 = context.checkError();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("ServiceConnection", context);
            return false;
        }
        if (!flag1)
        {
            flag = true;
        }
        return flag;
    }

    public final void logOnce(final Context context, final int statusCode)
    {
        if (ServiceConnectionLoggingPreferences.isTimeToLog(DefaultClock.getInstance()) && !IGNORED_PACKAGES.contains(mPackageName))
        {
            (new Thread(new Runnable() {

                final ServiceConnection this$0;
                final Context val$context;
                final int val$statusCode;

                public final void run()
                {
                    ServiceConnection.access$000(ServiceConnection.this, context, statusCode);
                }

            
            {
                this$0 = ServiceConnection.this;
                context = context1;
                statusCode = i;
                super();
            }
            })).start();
        }
    }

    static 
    {
        Object obj = ((String)G.ignoredPackagesForLogging.getBinderSafe()).split(",");
        obj.length;
        JVM INSTR tableswitch 0 4: default 52
    //                   0 91
    //                   1 98
    //                   2 108
    //                   3 144
    //                   4 160;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (obj.length <= 32)
        {
            obj = new ArraySet(Arrays.asList(((Object []) (obj))));
        } else
        {
            obj = new HashSet(Arrays.asList(((Object []) (obj))));
        }
_L9:
        obj = Collections.unmodifiableSet(((Set) (obj)));
_L7:
        IGNORED_PACKAGES = ((Set) (obj));
        LOCK = new Object();
        return;
_L2:
        obj = Collections.emptySet();
        continue; /* Loop/switch isn't completed */
_L3:
        obj = Collections.singleton(obj[0]);
        continue; /* Loop/switch isn't completed */
_L4:
        Object obj1 = obj[0];
        Object obj3 = obj[1];
        obj = new ArraySet(2);
        ((Set) (obj)).add(obj1);
        ((Set) (obj)).add(obj3);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = CollectionUtils.setOf(obj[0], obj[1], obj[2]);
        if (true) goto _L7; else goto _L6
_L6:
        Object obj2 = obj[0];
        Object obj4 = obj[1];
        Object obj5 = obj[2];
        Object obj6 = obj[3];
        obj = new ArraySet(4);
        ((Set) (obj)).add(obj2);
        ((Set) (obj)).add(obj4);
        ((Set) (obj)).add(obj5);
        ((Set) (obj)).add(obj6);
        if (true) goto _L9; else goto _L8
_L8:
    }


/*
    static void access$000(ServiceConnection serviceconnection, Context context, int i)
    {
        synchronized (LOCK)
        {
            if (!serviceconnection.mLoggedStatusCodes.get(i) && serviceconnection.logIntoFileLocked(context, i))
            {
                serviceconnection.mLoggedStatusCodes.set(i);
            }
        }
        return;
        serviceconnection;
        obj;
        JVM INSTR monitorexit ;
        throw serviceconnection;
    }

*/
}
