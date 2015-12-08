// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            ApmLoggingImpl

private class <init>
{

    private boolean mMobileConnected;
    private boolean mWiFiConnected;
    private boolean mWiredConnected;
    final ApmLoggingImpl this$0;

    private void lostConnectivity()
    {
        reset();
        ApmLoggingImpl.access$1500(ApmLoggingImpl.this);
        ApmLoggingImpl.access$1600(ApmLoggingImpl.this);
        ApmLoggingImpl.access$1700(ApmLoggingImpl.this);
    }

    private void reset()
    {
        mWiFiConnected = false;
        mMobileConnected = false;
        mWiredConnected = false;
    }

    public void handleConnectivityChange(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            Log.w("nf_log_apm", "Connectivity manager is gone! Connectivity is lost!");
            lostConnectivity();
            return;
        }
        context = context.getActiveNetworkInfo();
        if (context == null)
        {
            Log.w("nf_log_apm", "Connectivity manager exist, but no active connection! Connectivity is lost!");
            lostConnectivity();
            return;
        }
        boolean flag = context.isConnectedOrConnecting();
        int i = context.getType();
        switch (i)
        {
        default:
            Log.d("nf_log_apm", (new StringBuilder()).append("Not supported network type ").append(i).toString());
            return;

        case 9: // '\t'
            mWiFiConnected = false;
            mMobileConnected = false;
            mWiredConnected = flag;
            if (flag)
            {
                ApmLoggingImpl.access$1400(ApmLoggingImpl.this);
            } else
            {
                ApmLoggingImpl.access$1500(ApmLoggingImpl.this);
            }
            ApmLoggingImpl.access$1600(ApmLoggingImpl.this);
            ApmLoggingImpl.access$1700(ApmLoggingImpl.this);
            return;

        case 1: // '\001'
            mWiFiConnected = flag;
            mMobileConnected = false;
            mWiredConnected = false;
            if (flag)
            {
                ApmLoggingImpl.access$1800(ApmLoggingImpl.this);
            } else
            {
                ApmLoggingImpl.access$1600(ApmLoggingImpl.this);
            }
            ApmLoggingImpl.access$1500(ApmLoggingImpl.this);
            ApmLoggingImpl.access$1700(ApmLoggingImpl.this);
            return;

        case 0: // '\0'
        case 6: // '\006'
            mWiFiConnected = false;
            mMobileConnected = flag;
            mWiredConnected = false;
            break;
        }
        if (flag)
        {
            ApmLoggingImpl.access$1900(ApmLoggingImpl.this);
        } else
        {
            ApmLoggingImpl.access$1700(ApmLoggingImpl.this);
        }
        ApmLoggingImpl.access$1500(ApmLoggingImpl.this);
        ApmLoggingImpl.access$1600(ApmLoggingImpl.this);
    }

    public boolean isMobileConnected()
    {
        return mMobileConnected;
    }

    public boolean isWiFiConnected()
    {
        return mWiFiConnected;
    }

    public boolean isWiredConnected()
    {
        return mWiredConnected;
    }

    private Q()
    {
        this$0 = ApmLoggingImpl.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
