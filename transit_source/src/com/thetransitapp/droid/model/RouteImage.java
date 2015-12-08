// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import android.util.DisplayMetrics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RouteImage
    implements Serializable
{

    private static final String baseURL = "http://api.thetransitapp.com/route_image?height=";
    private static final long serialVersionUID = 0xfa00ff9d0b88fb88L;
    private String id;
    private String name;
    private boolean replaceName;
    private List routeIds;
    private Date updatedAt;
    private String url;

    public RouteImage()
    {
        routeIds = new ArrayList();
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof RouteImage;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RouteImage))
        {
            return false;
        }
        obj = (RouteImage)obj;
        if (!((RouteImage) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getId();
        Object obj2 = ((RouteImage) (obj)).getId();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getName();
        obj2 = ((RouteImage) (obj)).getName();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getRouteIds();
        obj2 = ((RouteImage) (obj)).getRouteIds();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        if (isReplaceName() != ((RouteImage) (obj)).isReplaceName())
        {
            return false;
        }
        obj1 = getUpdatedAt();
        obj2 = ((RouteImage) (obj)).getUpdatedAt();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getUrl();
        obj = ((RouteImage) (obj)).getUrl();
        return obj1 != null ? !obj1.equals(obj) : obj != null;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List getRouteIds()
    {
        return routeIds;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public String getUrl()
    {
        return url;
    }

    public String getUrlWithScreenMetrics(DisplayMetrics displaymetrics, boolean flag)
    {
        if (name == null)
        {
            return url;
        }
        displaymetrics.densityDpi;
        JVM INSTR lookupswitch 4: default 60
    //                   160: 111
    //                   213: 127
    //                   240: 127
    //                   480: 143;
           goto _L1 _L2 _L3 _L3 _L4
_L1:
        if (flag)
        {
            displaymetrics = "28";
        } else
        {
            displaymetrics = "84";
        }
_L6:
        return (new StringBuilder("http://api.thetransitapp.com/route_image?height=")).append(displaymetrics).append("&name=").append(name).append("&date=").append(updatedAt.getTime()).toString();
_L2:
        if (flag)
        {
            displaymetrics = "14";
        } else
        {
            displaymetrics = "42";
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (flag)
        {
            displaymetrics = "21";
        } else
        {
            displaymetrics = "63";
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            displaymetrics = "42";
        } else
        {
            displaymetrics = "126";
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int hashCode()
    {
        int i1 = 0;
        Object obj = getId();
        int i;
        int j;
        int k;
        char c;
        int l;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getName();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getRouteIds();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        if (isReplaceName())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        obj = getUpdatedAt();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getUrl();
        if (obj != null)
        {
            i1 = obj.hashCode();
        }
        return (((((i + 31) * 31 + j) * 31 + k) * 31 + c) * 31 + l) * 31 + i1;
    }

    public boolean isReplaceName()
    {
        return replaceName;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setReplaceName(boolean flag)
    {
        replaceName = flag;
    }

    public void setRouteIds(List list)
    {
        routeIds = list;
    }

    public void setUpdatedAt(Date date)
    {
        updatedAt = date;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public String toString()
    {
        return (new StringBuilder("RouteImage(id=")).append(getId()).append(", name=").append(getName()).append(", routeIds=").append(getRouteIds()).append(", replaceName=").append(isReplaceName()).append(", updatedAt=").append(getUpdatedAt()).append(", url=").append(getUrl()).append(")").toString();
    }
}
