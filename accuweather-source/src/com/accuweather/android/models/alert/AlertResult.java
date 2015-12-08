// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.alert;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.alert:
//            Description, AlertModel, Area

public class AlertResult
    implements Serializable
{

    private static final long serialVersionUID = 0xdc85c78a615d65f5L;
    private String AlertID;
    private List Area;
    private String CountryCode;
    private Description Description;
    private String Link;
    private String MobileLink;
    private int Priority;
    private String Source;
    private String Type;

    public AlertResult()
    {
        CountryCode = "";
        AlertID = "";
        Type = "";
        Source = "";
        Description = new Description();
        Area = new ArrayList();
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
        obj = (AlertResult)obj;
        if (AlertID == null)
        {
            if (((AlertResult) (obj)).AlertID != null)
            {
                return false;
            }
        } else
        if (!AlertID.equals(((AlertResult) (obj)).AlertID))
        {
            return false;
        }
        if (Area == null)
        {
            if (((AlertResult) (obj)).Area != null)
            {
                return false;
            }
        } else
        if (!Area.equals(((AlertResult) (obj)).Area))
        {
            return false;
        }
        if (CountryCode == null)
        {
            if (((AlertResult) (obj)).CountryCode != null)
            {
                return false;
            }
        } else
        if (!CountryCode.equals(((AlertResult) (obj)).CountryCode))
        {
            return false;
        }
        if (Description == null)
        {
            if (((AlertResult) (obj)).Description != null)
            {
                return false;
            }
        } else
        if (!Description.equals(((AlertResult) (obj)).Description))
        {
            return false;
        }
        if (Link == null)
        {
            if (((AlertResult) (obj)).Link != null)
            {
                return false;
            }
        } else
        if (!Link.equals(((AlertResult) (obj)).Link))
        {
            return false;
        }
        if (MobileLink == null)
        {
            if (((AlertResult) (obj)).MobileLink != null)
            {
                return false;
            }
        } else
        if (!MobileLink.equals(((AlertResult) (obj)).MobileLink))
        {
            return false;
        }
        if (Priority != ((AlertResult) (obj)).Priority)
        {
            return false;
        }
        if (Source == null)
        {
            if (((AlertResult) (obj)).Source != null)
            {
                return false;
            }
        } else
        if (!Source.equals(((AlertResult) (obj)).Source))
        {
            return false;
        }
        if (Type != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AlertResult) (obj)).Type == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Type.equals(((AlertResult) (obj)).Type)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getAlertID()
    {
        return AlertID;
    }

    public List getArea()
    {
        return Area;
    }

    public String getCountryCode()
    {
        return CountryCode;
    }

    public Description getDescription()
    {
        return Description;
    }

    public String getLink()
    {
        return Link;
    }

    public String getMobileLink()
    {
        return MobileLink;
    }

    public int getPriority()
    {
        return Priority;
    }

    public String getSource()
    {
        return Source;
    }

    public String getType()
    {
        return Type;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int i2;
        if (AlertID == null)
        {
            i = 0;
        } else
        {
            i = AlertID.hashCode();
        }
        if (Area == null)
        {
            j = 0;
        } else
        {
            j = Area.hashCode();
        }
        if (CountryCode == null)
        {
            k = 0;
        } else
        {
            k = CountryCode.hashCode();
        }
        if (Description == null)
        {
            l = 0;
        } else
        {
            l = Description.hashCode();
        }
        if (Link == null)
        {
            i1 = 0;
        } else
        {
            i1 = Link.hashCode();
        }
        if (MobileLink == null)
        {
            j1 = 0;
        } else
        {
            j1 = MobileLink.hashCode();
        }
        i2 = Priority;
        if (Source == null)
        {
            k1 = 0;
        } else
        {
            k1 = Source.hashCode();
        }
        if (Type != null)
        {
            l1 = Type.hashCode();
        }
        return ((((((((i + 31) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + i2) * 31 + k1) * 31 + l1;
    }

    public void setAlertID(String s)
    {
        AlertID = s;
    }

    public void setArea(List list)
    {
        Area = list;
    }

    public void setCountryCode(String s)
    {
        CountryCode = s;
    }

    public void setDescription(Description description)
    {
        Description = description;
    }

    public void setLink(String s)
    {
        Link = s;
    }

    public void setMobileLink(String s)
    {
        MobileLink = s;
    }

    public void setPriority(int i)
    {
        Priority = i;
    }

    public void setSource(String s)
    {
        Source = s;
    }

    public void setType(String s)
    {
        Type = s;
    }

    public AlertModel toAlertModel()
    {
        AlertModel alertmodel = new AlertModel();
        ArrayList arraylist = new ArrayList();
        if (getDescription() != null)
        {
            if (getDescription().getLocalized() != null && !getDescription().getLocalized().trim().equals(""))
            {
                alertmodel.setAlertDescription(getDescription().getLocalized());
            } else
            {
                alertmodel.setAlertDescription(getDescription().getEnglish());
            }
        }
        alertmodel.setPriority(getPriority());
        alertmodel.setMobileLink(getMobileLink());
        alertmodel.setTraditionalLink(getLink());
        for (int i = 0; i < getArea().size(); i++)
        {
            alertmodel.getClass();
            AlertModel.AreaModel areamodel = new AlertModel.AreaModel(alertmodel);
            areamodel.setName(((Area)getArea().get(i)).getName());
            areamodel.setEndTime(((Area)getArea().get(i)).getEndTime());
            areamodel.setAlertText(((Area)getArea().get(i)).getText());
            arraylist.add(areamodel);
        }

        alertmodel.setAlertAreas(arraylist);
        return alertmodel;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AlertResult [CountryCode=").append(CountryCode).append(", AlertID=").append(AlertID).append(", Priority=").append(Priority).append(", Type=").append(Type).append(", Source=").append(Source).append(", Description=").append(Description).append(", Area=").append(Area).append(", MobileLink=").append(MobileLink).append(", Link=").append(Link).append("]").toString();
    }
}
