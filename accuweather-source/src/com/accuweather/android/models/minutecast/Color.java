// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;

import java.io.Serializable;

public class Color
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Integer Blue;
    private Integer Green;
    private String Hex;
    private Integer Red;

    public Color()
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
        obj = (Color)obj;
        if (Blue == null)
        {
            if (((Color) (obj)).Blue != null)
            {
                return false;
            }
        } else
        if (!Blue.equals(((Color) (obj)).Blue))
        {
            return false;
        }
        if (Green == null)
        {
            if (((Color) (obj)).Green != null)
            {
                return false;
            }
        } else
        if (!Green.equals(((Color) (obj)).Green))
        {
            return false;
        }
        if (Hex == null)
        {
            if (((Color) (obj)).Hex != null)
            {
                return false;
            }
        } else
        if (!Hex.equals(((Color) (obj)).Hex))
        {
            return false;
        }
        if (Red != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Color) (obj)).Red == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Red.equals(((Color) (obj)).Red)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Integer getBlue()
    {
        return Blue;
    }

    public Integer getGreen()
    {
        return Green;
    }

    public String getHex()
    {
        return Hex;
    }

    public Integer getRed()
    {
        return Red;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (Blue == null)
        {
            i = 0;
        } else
        {
            i = Blue.hashCode();
        }
        if (Green == null)
        {
            j = 0;
        } else
        {
            j = Green.hashCode();
        }
        if (Hex == null)
        {
            k = 0;
        } else
        {
            k = Hex.hashCode();
        }
        if (Red != null)
        {
            l = Red.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    public void setBlue(Integer integer)
    {
        Blue = integer;
    }

    public void setGreen(Integer integer)
    {
        Green = integer;
    }

    public void setHex(String s)
    {
        Hex = s;
    }

    public void setRed(Integer integer)
    {
        Red = integer;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Color [Red=").append(Red).append(", Green=").append(Green).append(", Blue=").append(Blue).append(", Hex=").append(Hex).append("]").toString();
    }
}
