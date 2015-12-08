// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ibm.eo.model.ReachabilityType;
import com.ibm.eo.service.QueueService;
import java.util.Locale;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal

public class ConnectionReceiver extends BroadcastReceiver
{

    private Boolean _isOnline;
    private String connectionType;
    private ReachabilityType networkReachability;

    public ConnectionReceiver()
    {
        _isOnline = Boolean.valueOf(false);
        networkReachability = ReachabilityType.Unknown;
    }

    private void setNoConnectivity()
    {
        networkReachability = ReachabilityType.NotReachable;
        _isOnline = Boolean.valueOf(false);
        QueueService.setCurrentLogLevel(Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false));
    }

    public final String getConnectionType()
    {
        return connectionType;
    }

    public final ReachabilityType getNetworkReachability()
    {
        return networkReachability;
    }

    public final Boolean isOnline()
    {
        return _isOnline;
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        _isOnline = Boolean.valueOf(false);
        if (!s.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            setNoConnectivity();
            return;
        }
        boolean flag = intent.getBooleanExtra("noConnectivity", false);
        if (android.os.Build.VERSION.SDK_INT > 13)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context != null)
            {
                context = context.getActiveNetworkInfo();
            } else
            {
                context = null;
            }
        } else
        {
            context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        }
        if (!flag && context != null) goto _L2; else goto _L1
_L1:
        setNoConnectivity();
_L4:
        if (context != null)
        {
            connectionType = context.getSubtypeName();
        }
        LogInternal.log("Network changed");
        return;
_L2:
        if (context.getType() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        networkReachability = ReachabilityType.ReachableViaWIFI;
        QueueService.setCurrentLogLevel(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(false));
_L6:
        _isOnline = Boolean.valueOf(true);
        if (true) goto _L4; else goto _L3
_L3:
        if (!context.getTypeName().toLowerCase(Locale.getDefault()).contains("mobile")) goto _L6; else goto _L5
_L5:
        networkReachability = ReachabilityType.ReachableViaWWAN;
        QueueService.setCurrentLogLevel(Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(true));
          goto _L6
    }
}
