// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location.gps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BingGeocodeResults
{

    private Map additionalProperties;
    private String authenticationResultCode;
    private String brandLogoUri;
    private String copyright;
    private List resourceSets;
    private Integer statusCode;
    private String statusDescription;
    private String traceId;

    public BingGeocodeResults()
    {
        resourceSets = new ArrayList();
        additionalProperties = new HashMap();
    }

    public Map getAdditionalProperties()
    {
        return additionalProperties;
    }

    public String getAuthenticationResultCode()
    {
        return authenticationResultCode;
    }

    public String getBrandLogoUri()
    {
        return brandLogoUri;
    }

    public String getCopyright()
    {
        return copyright;
    }

    public List getResourceSets()
    {
        return resourceSets;
    }

    public Integer getStatusCode()
    {
        return statusCode;
    }

    public String getStatusDescription()
    {
        return statusDescription;
    }

    public String getTraceId()
    {
        return traceId;
    }

    public void setAdditionalProperty(String s, Object obj)
    {
        additionalProperties.put(s, obj);
    }

    public void setAuthenticationResultCode(String s)
    {
        authenticationResultCode = s;
    }

    public void setBrandLogoUri(String s)
    {
        brandLogoUri = s;
    }

    public void setCopyright(String s)
    {
        copyright = s;
    }

    public void setResourceSets(List list)
    {
        resourceSets = list;
    }

    public void setStatusCode(Integer integer)
    {
        statusCode = integer;
    }

    public void setStatusDescription(String s)
    {
        statusDescription = s;
    }

    public void setTraceId(String s)
    {
        traceId = s;
    }
}
