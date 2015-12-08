// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location.gps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.accuweather.android.models.location.gps:
//            Address, Point

public class Resource
{

    private String __type;
    private Map additionalProperties;
    private Address address;
    private List bbox;
    private String confidence;
    private String entityType;
    private List geocodePoints;
    private List matchCodes;
    private String name;
    private Point point;

    public Resource()
    {
        bbox = new ArrayList();
        geocodePoints = new ArrayList();
        matchCodes = new ArrayList();
        additionalProperties = new HashMap();
    }

    public Map getAdditionalProperties()
    {
        return additionalProperties;
    }

    public Address getAddress()
    {
        return address;
    }

    public List getBbox()
    {
        return bbox;
    }

    public String getConfidence()
    {
        return confidence;
    }

    public String getEntityType()
    {
        return entityType;
    }

    public List getGeocodePoints()
    {
        return geocodePoints;
    }

    public List getMatchCodes()
    {
        return matchCodes;
    }

    public String getName()
    {
        return name;
    }

    public Point getPoint()
    {
        return point;
    }

    public String get__type()
    {
        return __type;
    }

    public void setAdditionalProperty(String s, Object obj)
    {
        additionalProperties.put(s, obj);
    }

    public void setAddress(Address address1)
    {
        address = address1;
    }

    public void setBbox(List list)
    {
        bbox = list;
    }

    public void setConfidence(String s)
    {
        confidence = s;
    }

    public void setEntityType(String s)
    {
        entityType = s;
    }

    public void setGeocodePoints(List list)
    {
        geocodePoints = list;
    }

    public void setMatchCodes(List list)
    {
        matchCodes = list;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPoint(Point point1)
    {
        point = point1;
    }

    public void set__type(String s)
    {
        __type = s;
    }
}
