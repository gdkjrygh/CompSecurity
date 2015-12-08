// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;


public class Region
{

    private String EnglishName;
    private String ID;
    private String LocalizedName;

    public Region()
    {
        ID = "";
        LocalizedName = "";
        EnglishName = "";
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
        obj = (Region)obj;
        if (EnglishName == null)
        {
            if (((Region) (obj)).EnglishName != null)
            {
                return false;
            }
        } else
        if (!EnglishName.equals(((Region) (obj)).EnglishName))
        {
            return false;
        }
        if (ID == null)
        {
            if (((Region) (obj)).ID != null)
            {
                return false;
            }
        } else
        if (!ID.equals(((Region) (obj)).ID))
        {
            return false;
        }
        if (LocalizedName != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Region) (obj)).LocalizedName == null) goto _L1; else goto _L3
_L3:
        return false;
        if (LocalizedName.equals(((Region) (obj)).LocalizedName)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getEnglishName()
    {
        return EnglishName;
    }

    public String getID()
    {
        return ID;
    }

    public String getLocalizedName()
    {
        return LocalizedName;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (EnglishName == null)
        {
            i = 0;
        } else
        {
            i = EnglishName.hashCode();
        }
        if (ID == null)
        {
            j = 0;
        } else
        {
            j = ID.hashCode();
        }
        if (LocalizedName != null)
        {
            k = LocalizedName.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public void setEnglishName(String s)
    {
        EnglishName = s;
    }

    public void setID(String s)
    {
        ID = s;
    }

    public void setLocalizedName(String s)
    {
        LocalizedName = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Region [ID=").append(ID).append(", LocalizedName=").append(LocalizedName).append(", EnglishName=").append(EnglishName).append("]").toString();
    }
}
