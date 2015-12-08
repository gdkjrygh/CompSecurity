// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;

public class TransitServer
    implements Serializable
{

    private static final long serialVersionUID = 0x9db671df85b81575L;
    private String appRegion;
    private String plannerRegion;
    private String routerId;

    public TransitServer()
    {
    }

    public boolean canEqual(Object obj)
    {
        return obj instanceof TransitServer;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof TransitServer))
            {
                return false;
            }
            obj = (TransitServer)obj;
            if (!((TransitServer) (obj)).canEqual(this))
            {
                return false;
            }
            String s = getRouterId();
            String s1 = ((TransitServer) (obj)).getRouterId();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = getAppRegion();
            s1 = ((TransitServer) (obj)).getAppRegion();
            if (s != null ? !s.equals(s1) : s1 != null)
            {
                return false;
            }
            s = getPlannerRegion();
            obj = ((TransitServer) (obj)).getPlannerRegion();
            if (s != null ? !s.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public String getAppRegion()
    {
        return appRegion;
    }

    public String getPlannerRegion()
    {
        return plannerRegion;
    }

    public String getRouterId()
    {
        return routerId;
    }

    public int hashCode()
    {
        int k = 0;
        String s = getRouterId();
        int i;
        int j;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        s = getAppRegion();
        if (s == null)
        {
            j = 0;
        } else
        {
            j = s.hashCode();
        }
        s = getPlannerRegion();
        if (s != null)
        {
            k = s.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public void setAppRegion(String s)
    {
        appRegion = s;
    }

    public void setPlannerRegion(String s)
    {
        plannerRegion = s;
    }

    public void setRouterId(String s)
    {
        routerId = s;
    }

    public String toString()
    {
        return (new StringBuilder("TransitServer(routerId=")).append(getRouterId()).append(", appRegion=").append(getAppRegion()).append(", plannerRegion=").append(getPlannerRegion()).append(")").toString();
    }
}
