// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;

// Referenced classes of package com.thetransitapp.droid.model:
//            SimplePlacemark

public class Stop
    implements Serializable
{

    private static final long serialVersionUID = 0xf9113dab40082a2fL;
    private String id;
    private String name;
    private SimplePlacemark placemark;
    private String realTimeId;

    public Stop()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Stop))
        {
            if (id.equals(((Stop) (obj = (Stop)obj)).id) && name.equals(((Stop) (obj)).getName()))
            {
                return true;
            }
        }
        return false;
    }

    public float getDistance(SimplePlacemark simpleplacemark)
    {
        if (simpleplacemark == null)
        {
            return 3.402823E+38F;
        } else
        {
            return placemark.distanceTo(simpleplacemark);
        }
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public SimplePlacemark getPlacemark()
    {
        return placemark;
    }

    public String getRealTimeId()
    {
        return realTimeId;
    }

    public int hashCode()
    {
        return id.hashCode();
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPlacemark(SimplePlacemark simpleplacemark)
    {
        placemark = simpleplacemark;
    }

    public void setRealTimeId(String s)
    {
        realTimeId = s;
    }
}
