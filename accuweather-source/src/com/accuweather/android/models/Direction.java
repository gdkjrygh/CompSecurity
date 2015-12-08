// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

public class Direction
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Integer Degrees;
    private String Localized;

    public Direction()
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
        obj = (Direction)obj;
        if (Degrees == null)
        {
            if (((Direction) (obj)).Degrees != null)
            {
                return false;
            }
        } else
        if (!Degrees.equals(((Direction) (obj)).Degrees))
        {
            return false;
        }
        if (Localized != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Direction) (obj)).Localized == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Localized.equals(((Direction) (obj)).Localized)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Integer getDegrees()
    {
        return Degrees;
    }

    public String getLocalized()
    {
        return Localized;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (Degrees == null)
        {
            i = 0;
        } else
        {
            i = Degrees.hashCode();
        }
        if (Localized != null)
        {
            j = Localized.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setDegrees(Integer integer)
    {
        Degrees = integer;
    }

    public void setLocalized(String s)
    {
        Localized = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Direction [Degrees=").append(Degrees).append(", Localized=").append(Localized).append("]").toString();
    }
}
