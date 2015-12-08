// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;

import com.worklight.location.api.WLDeviceContext;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.api.wifi.WLWifiLocation;
import com.worklight.location.internal.nativeImpl.LocationUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.location.internal:
//            DeviceContextJSONFactory, AbstractPosition

public class DeviceContextImpl
    implements WLDeviceContext, Cloneable
{

    private static final DeviceContextJSONFactory jsonFactory = new DeviceContextJSONFactory();
    private WLGeoPosition geoPosition;
    private Long lastModified;
    private Integer timezoneOffset;
    private long version;
    private WLWifiLocation wifiPosition;

    public DeviceContextImpl()
    {
        geoPosition = null;
        wifiPosition = null;
        lastModified = null;
        timezoneOffset = null;
        version = 0L;
    }

    private void internalUpdateLastModified(AbstractPosition abstractposition)
    {
        if (abstractposition == null || abstractposition.getTimestamp() == null)
        {
            return;
        }
        if (lastModified == null)
        {
            lastModified = abstractposition.getTimestamp();
            return;
        } else
        {
            lastModified = Long.valueOf(Math.max(lastModified.longValue(), abstractposition.getTimestamp().longValue()));
            return;
        }
    }

    private void updateLastModified()
    {
        this;
        JVM INSTR monitorenter ;
        lastModified = null;
        internalUpdateLastModified(geoPosition);
        internalUpdateLastModified(wifiPosition);
        if (lastModified != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        timezoneOffset = null;
_L1:
        version = version + 1L;
        this;
        JVM INSTR monitorexit ;
        return;
        timezoneOffset = Integer.valueOf(-LocationUtils.getTimeZoneOffset());
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void addToEvent(JSONObject jsonobject)
    {
        Object obj;
        JSONObject jsonobject1;
        try
        {
            jsonobject1 = getJSON();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            throw new AssertionError(jsonobject.getMessage());
        }
        obj = jsonobject1;
        if (jsonobject1 != null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        obj = JSONObject.NULL;
        jsonobject.put("deviceContext", obj);
        return;
    }

    public void clearGeoPosition()
    {
        this;
        JVM INSTR monitorenter ;
        version = version + 1L;
        geoPosition = null;
        updateLastModified();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void clearWifiPosition()
    {
        this;
        JVM INSTR monitorenter ;
        version = version + 1L;
        wifiPosition = null;
        updateLastModified();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public DeviceContextImpl clone()
    {
        this;
        JVM INSTR monitorenter ;
        DeviceContextImpl devicecontextimpl;
        devicecontextimpl = new DeviceContextImpl();
        devicecontextimpl.geoPosition = geoPosition;
        devicecontextimpl.wifiPosition = wifiPosition;
        devicecontextimpl.lastModified = lastModified;
        devicecontextimpl.timezoneOffset = timezoneOffset;
        devicecontextimpl.version = version;
        this;
        JVM INSTR monitorexit ;
        return devicecontextimpl;
        Exception exception;
        exception;
        throw exception;
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
        obj = (DeviceContextImpl)obj;
        if (geoPosition == null)
        {
            if (((DeviceContextImpl) (obj)).geoPosition != null)
            {
                return false;
            }
        } else
        if (!geoPosition.equals(((DeviceContextImpl) (obj)).geoPosition))
        {
            return false;
        }
        if (lastModified == null)
        {
            if (((DeviceContextImpl) (obj)).lastModified != null)
            {
                return false;
            }
        } else
        if (!lastModified.equals(((DeviceContextImpl) (obj)).lastModified))
        {
            return false;
        }
        if (timezoneOffset == null)
        {
            if (((DeviceContextImpl) (obj)).timezoneOffset != null)
            {
                return false;
            }
        } else
        if (!timezoneOffset.equals(((DeviceContextImpl) (obj)).timezoneOffset))
        {
            return false;
        }
        if (version != ((DeviceContextImpl) (obj)).version)
        {
            return false;
        }
        if (wifiPosition != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((DeviceContextImpl) (obj)).wifiPosition == null) goto _L1; else goto _L3
_L3:
        return false;
        if (wifiPosition.equals(((DeviceContextImpl) (obj)).wifiPosition)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public WLGeoPosition getGeoPosition()
    {
        return geoPosition;
    }

    public JSONObject getJSON()
    {
        Object obj = clone();
        try
        {
            obj = jsonFactory.buildJson(((DeviceContextImpl) (obj)));
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            throw new AssertionError(jsonexception.getMessage());
        }
        return ((JSONObject) (obj));
    }

    public Long getLastModified()
    {
        return lastModified;
    }

    public Integer getTimezoneOffset()
    {
        return timezoneOffset;
    }

    public long getVersion()
    {
        return version;
    }

    public WLWifiLocation getWifiLocation()
    {
        return wifiPosition;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        int i1;
        if (geoPosition == null)
        {
            i = 0;
        } else
        {
            i = geoPosition.hashCode();
        }
        if (lastModified == null)
        {
            j = 0;
        } else
        {
            j = lastModified.hashCode();
        }
        if (timezoneOffset == null)
        {
            k = 0;
        } else
        {
            k = timezoneOffset.hashCode();
        }
        i1 = (int)(version ^ version >>> 32);
        if (wifiPosition != null)
        {
            l = wifiPosition.hashCode();
        }
        return ((((i + 31) * 31 + j) * 31 + k) * 31 + i1) * 31 + l;
    }

    public boolean isEmpty()
    {
        return geoPosition == null && wifiPosition == null;
    }

    public void setGeoPosition(WLGeoPosition wlgeoposition)
    {
        this;
        JVM INSTR monitorenter ;
        if (wlgeoposition != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("wLGeoPosition is null");
        wlgeoposition;
        this;
        JVM INSTR monitorexit ;
        throw wlgeoposition;
        geoPosition = wlgeoposition;
        updateLastModified();
        this;
        JVM INSTR monitorexit ;
    }

    public void setWifiPosition(WLWifiLocation wlwifilocation)
    {
        this;
        JVM INSTR monitorenter ;
        if (wlwifilocation != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("wifiPosition is null");
        wlwifilocation;
        this;
        JVM INSTR monitorexit ;
        throw wlwifilocation;
        wifiPosition = wlwifilocation;
        updateLastModified();
        this;
        JVM INSTR monitorexit ;
    }

}
