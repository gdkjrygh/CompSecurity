// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.alert;

import java.io.Serializable;
import java.util.ArrayList;

public class AlertModel
    implements Serializable
{
    public class AreaModel
        implements Serializable
    {

        private static final long serialVersionUID = 0xb385e02a4cb00c76L;
        private String alertText;
        private String endTime;
        private String name;
        final AlertModel this$0;

        public String getAlertText()
        {
            return alertText;
        }

        public String getEndTime()
        {
            return endTime;
        }

        public String getName()
        {
            return name;
        }

        public void setAlertText(String s)
        {
            alertText = s;
        }

        public void setEndTime(String s)
        {
            endTime = s;
        }

        public void setName(String s)
        {
            name = s;
        }

        public AreaModel()
        {
            this$0 = AlertModel.this;
            super();
            name = "";
            endTime = "";
            alertText = "";
        }
    }


    private static final long serialVersionUID = 0x8c6ffb44e72d66bbL;
    private ArrayList alertAreas;
    private String alertDescription;
    private String mobileLink;
    private int priority;
    private String traditionalLink;

    public AlertModel()
    {
        alertDescription = "";
        mobileLink = "";
        traditionalLink = "";
        alertAreas = new ArrayList();
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
        obj = (AlertModel)obj;
        if (alertAreas == null)
        {
            if (((AlertModel) (obj)).alertAreas != null)
            {
                return false;
            }
        } else
        if (!alertAreas.equals(((AlertModel) (obj)).alertAreas))
        {
            return false;
        }
        if (alertDescription == null)
        {
            if (((AlertModel) (obj)).alertDescription != null)
            {
                return false;
            }
        } else
        if (!alertDescription.equals(((AlertModel) (obj)).alertDescription))
        {
            return false;
        }
        if (mobileLink == null)
        {
            if (((AlertModel) (obj)).mobileLink != null)
            {
                return false;
            }
        } else
        if (!mobileLink.equals(((AlertModel) (obj)).mobileLink))
        {
            return false;
        }
        if (priority != ((AlertModel) (obj)).priority)
        {
            return false;
        }
        if (traditionalLink != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AlertModel) (obj)).traditionalLink == null) goto _L1; else goto _L3
_L3:
        return false;
        if (traditionalLink.equals(((AlertModel) (obj)).traditionalLink)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public ArrayList getAlertAreas()
    {
        return alertAreas;
    }

    public String getAlertDescription()
    {
        return alertDescription;
    }

    public String getMobileLink()
    {
        return mobileLink;
    }

    public int getPriority()
    {
        return priority;
    }

    public String getTraditionalLink()
    {
        return traditionalLink;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        int i1;
        if (alertAreas == null)
        {
            i = 0;
        } else
        {
            i = alertAreas.hashCode();
        }
        if (alertDescription == null)
        {
            j = 0;
        } else
        {
            j = alertDescription.hashCode();
        }
        if (mobileLink == null)
        {
            k = 0;
        } else
        {
            k = mobileLink.hashCode();
        }
        i1 = priority;
        if (traditionalLink != null)
        {
            l = traditionalLink.hashCode();
        }
        return ((((i + 31) * 31 + j) * 31 + k) * 31 + i1) * 31 + l;
    }

    public void setAlertAreas(ArrayList arraylist)
    {
        alertAreas = arraylist;
    }

    public void setAlertDescription(String s)
    {
        alertDescription = s;
    }

    public void setMobileLink(String s)
    {
        mobileLink = s;
    }

    public void setPriority(int i)
    {
        priority = i;
    }

    public void setTraditionalLink(String s)
    {
        traditionalLink = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AlertModel [alertDescription=").append(alertDescription).append(", priority=").append(priority).append(", mobileLink=").append(mobileLink).append(", traditionalLink=").append(traditionalLink).append(", alertAreas=").append(alertAreas).append("]").toString();
    }
}
