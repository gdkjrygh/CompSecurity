// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location;


public class TimeZone
{

    private String Code;
    private double GmtOffset;
    private String Name;

    public TimeZone()
    {
        Code = "";
        Name = "";
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
        obj = (TimeZone)obj;
        if (Code == null)
        {
            if (((TimeZone) (obj)).Code != null)
            {
                return false;
            }
        } else
        if (!Code.equals(((TimeZone) (obj)).Code))
        {
            return false;
        }
        if (Double.doubleToLongBits(GmtOffset) != Double.doubleToLongBits(((TimeZone) (obj)).GmtOffset))
        {
            return false;
        }
        if (Name != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((TimeZone) (obj)).Name == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Name.equals(((TimeZone) (obj)).Name)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getCode()
    {
        return Code;
    }

    public double getGmtOffset()
    {
        return GmtOffset;
    }

    public String getName()
    {
        return Name;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        int k;
        long l;
        if (Code == null)
        {
            i = 0;
        } else
        {
            i = Code.hashCode();
        }
        l = Double.doubleToLongBits(GmtOffset);
        k = (int)(l >>> 32 ^ l);
        if (Name != null)
        {
            j = Name.hashCode();
        }
        return ((i + 31) * 31 + k) * 31 + j;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setGmtOffset(double d)
    {
        GmtOffset = d;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TimeZone [Code=").append(Code).append(", Name=").append(Name).append(", GmtOffset=").append(GmtOffset).append("]").toString();
    }
}
