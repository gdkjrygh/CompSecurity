// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;


public class DMA
{

    private String EnglishName;
    private String ID;

    public DMA()
    {
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
        obj = (DMA)obj;
        if (EnglishName == null)
        {
            if (((DMA) (obj)).EnglishName != null)
            {
                return false;
            }
        } else
        if (!EnglishName.equals(((DMA) (obj)).EnglishName))
        {
            return false;
        }
        if (ID != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((DMA) (obj)).ID == null) goto _L1; else goto _L3
_L3:
        return false;
        if (ID.equals(((DMA) (obj)).ID)) goto _L1; else goto _L4
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

    public int hashCode()
    {
        int j = 0;
        int i;
        if (EnglishName == null)
        {
            i = 0;
        } else
        {
            i = EnglishName.hashCode();
        }
        if (ID != null)
        {
            j = ID.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setEnglishName(String s)
    {
        EnglishName = s;
    }

    public void setID(String s)
    {
        ID = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DMA [ID=").append(ID).append(", EnglishName=").append(EnglishName).append("]").toString();
    }
}
