// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;


// Referenced classes of package com.nbcsports.liveextra.content.models.overlay.premierleague:
//            MajorEventsTimeline

public static class 
{

    int aid1;
    int aid2;
    int clock;
    String eid;
    String eventType;
    String ha;
    String penDesc;
    int period;
    int pid;
    int pidOut;
    String tmStp;
    String type;

    protected boolean canEqual(Object obj)
    {
        return obj instanceof ;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof ))
            {
                return false;
            }
            Object obj1 = ()obj;
            if (!(() (obj1)).canEqual(this))
            {
                return false;
            }
            obj = getTmStp();
            obj1 = ((getTmStp) (obj1)).getTmStp();
            if (obj != null ? !obj.equals(obj1) : obj1 != null)
            {
                return false;
            }
        }
        return true;
    }

    public int getAid1()
    {
        return aid1;
    }

    public int getAid2()
    {
        return aid2;
    }

    public int getClock()
    {
        return clock;
    }

    public String getEid()
    {
        return eid;
    }

    public String getEventType()
    {
        return eventType;
    }

    public String getHa()
    {
        return ha;
    }

    public String getPenDesc()
    {
        return penDesc;
    }

    public int getPeriod()
    {
        return period;
    }

    public int getPid()
    {
        return pid;
    }

    public int getPidOut()
    {
        return pidOut;
    }

    public String getTmStp()
    {
        return tmStp;
    }

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        String s = getTmStp();
        int i;
        if (s == null)
        {
            i = 0;
        } else
        {
            i = s.hashCode();
        }
        return i + 59;
    }

    public void setEventType(String s)
    {
        eventType = s;
    }

    public void setPid(int i)
    {
        pid = i;
    }

    public ()
    {
    }
}
