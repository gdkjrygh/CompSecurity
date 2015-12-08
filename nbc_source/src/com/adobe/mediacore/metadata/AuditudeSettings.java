// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.metadata;

import java.util.ArrayList;

// Referenced classes of package com.adobe.mediacore.metadata:
//            AdvertisingMetadata, Metadata

public class AuditudeSettings extends AdvertisingMetadata
{

    private static final long serialVersionUID = 1L;
    private final String CREATIVE_REPACKAGING_ENABLED = "creative_repackaging_enabled";
    private final String CUSTOM_PARAMETERS_KEY = "custom_parameters";
    private final String CUSTOM_USER_AGENT = "custom_user_agent";
    private final String DEFAULT_MEDIA_ID_KEY = "default_mediaid";
    private final String DOMAIN_KEY = "domain";
    private final String FALLBACK_ON_INVALID_CREATIVE = "fallbackOnInvalidCreative";
    private final String MEDIA_ID_KEY = "mediaid";
    private final String TARGETING_KEY = "targeting";
    private final String VALID_MIME_TYPES = "validMimeTypes";
    private final String ZONE_ID_KEY = "zoneid";
    private Object data;

    public AuditudeSettings()
    {
    }

    public Metadata getCustomParameters()
    {
        return getNode("custom_parameters");
    }

    public Object getData()
    {
        return data;
    }

    public String getDefaultMediaId()
    {
        return getValue("default_mediaid");
    }

    public String getDomain()
    {
        return getValue("domain");
    }

    public String getMediaId()
    {
        return getValue("mediaid");
    }

    public Metadata getTargetingParameters()
    {
        return getNode("targeting");
    }

    public String getUserAgent()
    {
        return getValue("custom_user_agent");
    }

    public ArrayList getValidMimeTypes()
    {
        return (ArrayList)getObject("validMimeTypes");
    }

    public String getZoneId()
    {
        return getValue("zoneid");
    }

    public boolean isCreativeRepackagingEnabled()
    {
        return Boolean.parseBoolean(getValue("creative_repackaging_enabled"));
    }

    public boolean isFallbackOnInvalidCreativeEnabled()
    {
        return Boolean.parseBoolean(getValue("fallbackOnInvalidCreative"));
    }

    public void setCreativeRepackagingEnabled(boolean flag)
    {
        setValue("creative_repackaging_enabled", String.valueOf(flag));
    }

    public void setCustomParameters(Metadata metadata)
    {
        setNode("custom_parameters", metadata);
    }

    public void setData(Object obj)
    {
        data = obj;
    }

    public void setDefaultMediaId(String s)
    {
        setValue("default_mediaid", String.valueOf(s));
    }

    public void setDomain(String s)
    {
        setValue("domain", s);
    }

    public void setFallbackOnInvalidCreativeEnabled(boolean flag)
    {
        setValue("fallbackOnInvalidCreative", String.valueOf(flag));
    }

    public void setMediaId(String s)
    {
        setValue("mediaid", s);
    }

    public void setTargetingParameters(Metadata metadata)
    {
        setNode("targeting", metadata);
    }

    public void setUserAgent(String s)
    {
        setValue("custom_user_agent", String.valueOf(s));
    }

    public void setValidMimeTypes(ArrayList arraylist)
    {
        setObject("validMimeTypes", arraylist);
    }

    public void setZoneId(String s)
    {
        setValue("zoneid", s);
    }
}
