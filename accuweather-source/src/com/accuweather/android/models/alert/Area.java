// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.alert;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models.alert:
//            LastAction

public class Area
    implements Serializable
{

    private static final long serialVersionUID = 0xb4c530914b43d37cL;
    private String EndTime;
    private long EpochEndTime;
    private long EpochStartTime;
    private LastAction LastAction;
    private String Link;
    private String MobileLink;
    private String Name;
    private String StartTime;
    private String Text;

    public Area()
    {
        Name = "";
        StartTime = "";
        EndTime = "";
        Text = "";
        MobileLink = "";
        Link = "";
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
        obj = (Area)obj;
        if (EndTime == null)
        {
            if (((Area) (obj)).EndTime != null)
            {
                return false;
            }
        } else
        if (!EndTime.equals(((Area) (obj)).EndTime))
        {
            return false;
        }
        if (EpochEndTime != ((Area) (obj)).EpochEndTime)
        {
            return false;
        }
        if (EpochStartTime != ((Area) (obj)).EpochStartTime)
        {
            return false;
        }
        if (LastAction == null)
        {
            if (((Area) (obj)).LastAction != null)
            {
                return false;
            }
        } else
        if (!LastAction.equals(((Area) (obj)).LastAction))
        {
            return false;
        }
        if (Link == null)
        {
            if (((Area) (obj)).Link != null)
            {
                return false;
            }
        } else
        if (!Link.equals(((Area) (obj)).Link))
        {
            return false;
        }
        if (MobileLink == null)
        {
            if (((Area) (obj)).MobileLink != null)
            {
                return false;
            }
        } else
        if (!MobileLink.equals(((Area) (obj)).MobileLink))
        {
            return false;
        }
        if (Name == null)
        {
            if (((Area) (obj)).Name != null)
            {
                return false;
            }
        } else
        if (!Name.equals(((Area) (obj)).Name))
        {
            return false;
        }
        if (StartTime == null)
        {
            if (((Area) (obj)).StartTime != null)
            {
                return false;
            }
        } else
        if (!StartTime.equals(((Area) (obj)).StartTime))
        {
            return false;
        }
        if (Text != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Area) (obj)).Text == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Text.equals(((Area) (obj)).Text)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getEndTime()
    {
        return EndTime;
    }

    public long getEpochEndTime()
    {
        return EpochEndTime;
    }

    public long getEpochStartTime()
    {
        return EpochStartTime;
    }

    public LastAction getLastAction()
    {
        return LastAction;
    }

    public String getLink()
    {
        return Link;
    }

    public String getMobileLink()
    {
        return MobileLink;
    }

    public String getName()
    {
        return Name;
    }

    public String getStartTime()
    {
        return StartTime;
    }

    public String getText()
    {
        return Text;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        int i2;
        if (EndTime == null)
        {
            i = 0;
        } else
        {
            i = EndTime.hashCode();
        }
        l1 = (int)(EpochEndTime ^ EpochEndTime >>> 32);
        i2 = (int)(EpochStartTime ^ EpochStartTime >>> 32);
        if (LastAction == null)
        {
            j = 0;
        } else
        {
            j = LastAction.hashCode();
        }
        if (Link == null)
        {
            k = 0;
        } else
        {
            k = Link.hashCode();
        }
        if (MobileLink == null)
        {
            l = 0;
        } else
        {
            l = MobileLink.hashCode();
        }
        if (Name == null)
        {
            i1 = 0;
        } else
        {
            i1 = Name.hashCode();
        }
        if (StartTime == null)
        {
            j1 = 0;
        } else
        {
            j1 = StartTime.hashCode();
        }
        if (Text != null)
        {
            k1 = Text.hashCode();
        }
        return ((((((((i + 31) * 31 + l1) * 31 + i2) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1;
    }

    public void setEndTime(String s)
    {
        EndTime = s;
    }

    public void setEpochEndTime(long l)
    {
        EpochEndTime = l;
    }

    public void setEpochStartTime(long l)
    {
        EpochStartTime = l;
    }

    public void setLastAction(LastAction lastaction)
    {
        LastAction = lastaction;
    }

    public void setLink(String s)
    {
        Link = s;
    }

    public void setMobileLink(String s)
    {
        MobileLink = s;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setStartTime(String s)
    {
        StartTime = s;
    }

    public void setText(String s)
    {
        Text = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Area [Name=").append(Name).append(", StartTime=").append(StartTime).append(", EpochStartTime=").append(EpochStartTime).append(", EndTime=").append(EndTime).append(", EpochEndTime=").append(EpochEndTime).append(", Text=").append(Text).append(", MobileLink=").append(MobileLink).append(", Link=").append(Link).append(", LastAction=").append(LastAction).append("]").toString();
    }
}
