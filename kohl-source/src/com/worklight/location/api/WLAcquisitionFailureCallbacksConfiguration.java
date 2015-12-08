// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;

import com.worklight.location.api.geo.WLGeoFailureCallback;
import com.worklight.location.api.wifi.WLWifiFailureCallback;

public class WLAcquisitionFailureCallbacksConfiguration
    implements Cloneable
{

    private WLGeoFailureCallback geoFailureCallback;
    private WLWifiFailureCallback wifiFailureCallback;

    public WLAcquisitionFailureCallbacksConfiguration()
    {
        geoFailureCallback = null;
        wifiFailureCallback = null;
    }

    public WLAcquisitionFailureCallbacksConfiguration clone()
    {
        return (new WLAcquisitionFailureCallbacksConfiguration()).setWifiFailureCallback(wifiFailureCallback).setGeoFailureCallback(geoFailureCallback);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (WLAcquisitionFailureCallbacksConfiguration)obj;
        if (geoFailureCallback == null)
        {
            if (((WLAcquisitionFailureCallbacksConfiguration) (obj)).geoFailureCallback != null)
            {
                return false;
            }
        } else
        if (!geoFailureCallback.equals(((WLAcquisitionFailureCallbacksConfiguration) (obj)).geoFailureCallback))
        {
            return false;
        }
        if (wifiFailureCallback != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((WLAcquisitionFailureCallbacksConfiguration) (obj)).wifiFailureCallback == null) goto _L1; else goto _L3
_L3:
        return false;
        if (wifiFailureCallback.equals(((WLAcquisitionFailureCallbacksConfiguration) (obj)).wifiFailureCallback)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public WLGeoFailureCallback getGeoFailureCallback()
    {
        return geoFailureCallback;
    }

    public WLWifiFailureCallback getWifiFailureCallback()
    {
        return wifiFailureCallback;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (geoFailureCallback == null)
        {
            i = 0;
        } else
        {
            i = geoFailureCallback.hashCode();
        }
        if (wifiFailureCallback != null)
        {
            j = wifiFailureCallback.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public WLAcquisitionFailureCallbacksConfiguration setGeoFailureCallback(WLGeoFailureCallback wlgeofailurecallback)
    {
        geoFailureCallback = wlgeofailurecallback;
        return this;
    }

    public WLAcquisitionFailureCallbacksConfiguration setWifiFailureCallback(WLWifiFailureCallback wlwififailurecallback)
    {
        wifiFailureCallback = wlwififailurecallback;
        return this;
    }
}
