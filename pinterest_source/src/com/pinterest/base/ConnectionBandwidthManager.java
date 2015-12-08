// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import com.facebook.network.connectionclass.ConnectionClassManager;
import com.facebook.network.connectionclass.ConnectionQuality;
import com.facebook.network.connectionclass.DeviceBandwidthSampler;
import com.pinterest.kit.data.DiskCache;

public class ConnectionBandwidthManager
{

    private static ConnectionBandwidthManager _instance;
    private ConnectionQuality _connectionQuality;

    private ConnectionBandwidthManager()
    {
        Object obj = DiskCache.getSerializable("CONNECTION_QUALITY");
        if (obj != null && (obj instanceof ConnectionQuality))
        {
            obj = (ConnectionQuality)obj;
        } else
        {
            obj = ConnectionQuality.UNKNOWN;
        }
        _connectionQuality = ((ConnectionQuality) (obj));
    }

    public static ConnectionBandwidthManager getInstance()
    {
        if (_instance == null)
        {
            _instance = new ConnectionBandwidthManager();
        }
        return _instance;
    }

    public boolean isFast()
    {
        return ConnectionClassManager.getInstance().getCurrentBandwidthQuality() == ConnectionQuality.EXCELLENT;
    }

    public void startSampling()
    {
        DeviceBandwidthSampler.getInstance().startSampling();
    }

    public void stopSampling()
    {
        DeviceBandwidthSampler.getInstance().stopSampling();
        ConnectionQuality connectionquality = ConnectionClassManager.getInstance().getCurrentBandwidthQuality();
        if (connectionquality != _connectionQuality)
        {
            _connectionQuality = connectionquality;
            DiskCache.setSerializable("CONNECTION_QUALITY", connectionquality);
        }
    }
}
