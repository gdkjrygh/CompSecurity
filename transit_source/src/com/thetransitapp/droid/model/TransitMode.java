// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TransitMode
    implements Serializable
{

    private static final long serialVersionUID = 0x237fea0e86943bfcL;
    private List feedIds;
    private String id;
    private String name;
    private List routeIds;
    private List routeTypes;
    private boolean selected;

    public TransitMode()
    {
        selected = true;
        feedIds = new ArrayList();
        routeTypes = new ArrayList();
        routeIds = new ArrayList();
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof TransitMode;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof TransitMode))
        {
            return false;
        }
        obj = (TransitMode)obj;
        if (!((TransitMode) (obj)).canEqual(this))
        {
            return false;
        }
        Object obj1 = getId();
        Object obj2 = ((TransitMode) (obj)).getId();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getName();
        obj2 = ((TransitMode) (obj)).getName();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getFeedIds();
        obj2 = ((TransitMode) (obj)).getFeedIds();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getRouteTypes();
        obj2 = ((TransitMode) (obj)).getRouteTypes();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        obj1 = getRouteIds();
        obj2 = ((TransitMode) (obj)).getRouteIds();
        if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
        {
            return false;
        }
        return isSelected() == ((TransitMode) (obj)).isSelected();
    }

    public List getFeedIds()
    {
        return feedIds;
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

    public List getRouteTypes()
    {
        return routeTypes;
    }

    public int hashCode()
    {
        int i1 = 0;
        Object obj = getId();
        int i;
        int j;
        int k;
        int l;
        char c;
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
        obj = getFeedIds();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getRouteTypes();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getRouteIds();
        if (obj != null)
        {
            i1 = obj.hashCode();
        }
        if (isSelected())
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + c;
    }

    public boolean isSelected()
    {
        return selected;
    }

    public void setFeedIds(List list)
    {
        feedIds = list;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setRouteIds(List list)
    {
        routeIds = list;
    }

    public void setRouteTypes(List list)
    {
        routeTypes = list;
    }

    public void setSelected(boolean flag)
    {
        selected = flag;
    }

    public String toString()
    {
        return (new StringBuilder("TransitMode(id=")).append(getId()).append(", name=").append(getName()).append(", feedIds=").append(getFeedIds()).append(", routeTypes=").append(getRouteTypes()).append(", routeIds=").append(getRouteIds()).append(", selected=").append(isSelected()).append(")").toString();
    }
}
