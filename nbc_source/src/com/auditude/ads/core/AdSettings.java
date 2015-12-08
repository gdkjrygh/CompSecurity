// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.core;

import com.auditude.ads.util.ObjectUtil;
import com.auditude.ads.util.StringUtil;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;

public class AdSettings
{

    public static final String PUBLISHER_VERSION = "publisherVersion";
    public static final String USE_SSL = "useSSL";
    private String aamSegments[];
    private String aamUuid;
    private HashMap adProperties;
    private HashMap customParams;
    private String domain;
    PropertyChangeSupport pcs;
    private int zoneId;

    public AdSettings()
    {
        adProperties = new HashMap();
        pcs = new PropertyChangeSupport(this);
        setProperty("bitrate", Integer.valueOf(0), false);
        setProperty("leftVolume", Float.valueOf(0.75F), false);
        setProperty("rightVolume", Float.valueOf(0.75F), false);
        setProperty("width", Integer.valueOf(0), false);
        setProperty("height", Integer.valueOf(0), false);
        setProperty("auditudeHandlesChapterBreaks", Boolean.valueOf(true), false);
        setProperty("auditudeHandlesLinearVideoAds", Boolean.valueOf(true), false);
        setProperty("userAgent", "", false);
        setProperty("useSSL", Boolean.valueOf(false), false);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertychangelistener)
    {
        pcs.addPropertyChangeListener(propertychangelistener);
    }

    public final int getBitRate()
    {
        return ((Integer)getProperty("bitrate")).intValue();
    }

    public Object getCustomParamValue(String s)
    {
        if (StringUtil.isNotNullOrEmpty(s) && customParams != null)
        {
            return customParams.get(s);
        } else
        {
            return null;
        }
    }

    public final HashMap getCustomParams()
    {
        return customParams;
    }

    public final String getDomain()
    {
        return domain;
    }

    public final double getHeight()
    {
        return ((Double)getProperty("height")).doubleValue();
    }

    public final float getLeftVolume()
    {
        return ObjectUtil.convertToFloat(getProperty("leftVolume"), 0.0F);
    }

    public final HashMap getPassThroughParams()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int i;
        obj2 = null;
        int j;
        if (customParams != null && customParams.containsKey("auditudePassThroughParams"))
        {
            obj1 = customParams.get("auditudePassThroughParams");
        } else
        {
            obj1 = null;
        }
        if (obj1 == null || obj1.getClass() != java/lang/String) goto _L2; else goto _L1
_L1:
        obj2 = new HashMap();
        obj1 = ((String)obj1).split(";");
        obj = obj2;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = obj2;
        if (obj1.length <= 0) goto _L4; else goto _L5
_L5:
        j = obj1.length;
        i = 0;
_L14:
        if (i < j) goto _L7; else goto _L6
_L6:
        obj = obj2;
_L4:
        if (aamSegments != null && aamSegments.length > 0) goto _L9; else goto _L8
_L8:
        obj2 = obj;
        if (aamUuid == null) goto _L11; else goto _L10
_L10:
        obj2 = obj;
        if (aamUuid.length() <= 0) goto _L11; else goto _L9
_L9:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new HashMap();
        }
        obj = new StringBuilder();
        if (aamSegments == null || aamSegments.length <= 0) goto _L13; else goto _L12
_L12:
        i = 0;
_L15:
        if (i < aamSegments.length)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        ((HashMap) (obj1)).put("aud_aam_segs", ((StringBuilder) (obj)).toString());
_L13:
        obj2 = obj1;
        if (aamUuid != null)
        {
            obj2 = obj1;
            if (aamUuid.length() > 0)
            {
                ((HashMap) (obj1)).put("aud_aam_uuid", aamUuid);
                obj2 = obj1;
            }
        }
_L11:
        return ((HashMap) (obj2));
_L7:
        obj = obj1[i];
        int k = ((String) (obj)).indexOf("=");
        if (k > 0)
        {
            ((HashMap) (obj2)).put(((String) (obj)).substring(0, k), ((String) (obj)).substring(k + 1));
        }
        i++;
          goto _L14
_L2:
        obj = obj2;
        if (obj1 instanceof HashMap)
        {
            try
            {
                obj = (HashMap)obj1;
            }
            catch (RuntimeException runtimeexception)
            {
                runtimeexception = ((RuntimeException) (obj2));
            }
        }
          goto _L4
        ((StringBuilder) (obj)).append((new StringBuilder("aud_aam_segs=")).append(aamSegments[i]).append(";").toString());
        i++;
          goto _L15
    }

    public final Object getProperty(String s)
    {
        if (s != null && adProperties.containsKey(s))
        {
            return adProperties.get(s);
        } else
        {
            return null;
        }
    }

    public final boolean getPropertyAsBoolean(String s)
    {
        if (s != null && adProperties.containsKey(s))
        {
            s = ((String) (adProperties.get(s)));
            if (s != null)
            {
                return Boolean.getBoolean(s.toString());
            }
        }
        return false;
    }

    public final String getPublisherVersion()
    {
        Object obj = getProperty("publisherVersion");
        if (!(obj instanceof String))
        {
            obj = null;
        }
        return (String)obj;
    }

    public final float getRightVolume()
    {
        return ObjectUtil.convertToFloat(getProperty("rightVolume"), 0.0F);
    }

    public final String getUserAgent()
    {
        return ObjectUtil.convertToString(getProperty("userAgent"), "");
    }

    public final Object getUserData()
    {
        if (customParams != null && customParams.containsKey("userData"))
        {
            return customParams.get("userData");
        } else
        {
            return null;
        }
    }

    public final double getWidth()
    {
        return ((Double)getProperty("width")).doubleValue();
    }

    public final int getZoneId()
    {
        return zoneId;
    }

    public final boolean hasProperty(String s)
    {
        return s != null && adProperties.containsKey(s);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertychangelistener)
    {
        pcs.removePropertyChangeListener(propertychangelistener);
    }

    public final void setAamSegments(String as[])
    {
        aamSegments = as;
    }

    public final void setAamUuid(String s)
    {
        aamUuid = s;
    }

    public final void setBitRate(int i)
    {
        setProperty("bitrate", Integer.valueOf(i));
    }

    public final void setCustomParams(HashMap hashmap)
    {
        customParams = hashmap;
    }

    public final void setDomain(String s)
    {
        domain = s;
    }

    public final void setHeight(double d)
    {
        setProperty("height", Double.valueOf(d));
    }

    public final void setProperty(String s, Object obj)
    {
        setProperty(s, obj, true);
    }

    public final void setProperty(String s, Object obj, boolean flag)
    {
        if (s != null)
        {
            Object obj1 = getProperty(s);
            adProperties.put(s, obj);
            if (obj != obj1 && flag)
            {
                pcs.firePropertyChange(s, obj1, obj);
                return;
            }
        }
    }

    public final void setPublisherVersion(String s)
    {
        setProperty(getPublisherVersion(), s);
    }

    public final void setUserAgent(String s)
    {
        setProperty("userAgent", s);
    }

    public final void setVolume(float f, float f1)
    {
        setProperty("leftVolume", Float.valueOf(f));
        setProperty("rightVolume", Float.valueOf(f1));
    }

    public final void setWidth(double d)
    {
        setProperty("width", Double.valueOf(d));
    }

    public final void setZoneId(int i)
    {
        zoneId = i;
    }
}
