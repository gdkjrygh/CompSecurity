// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

public class Measurement
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String Unit;
    private Integer UnitType;
    private Double Value;

    public Measurement()
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
        obj = (Measurement)obj;
        if (Unit == null)
        {
            if (((Measurement) (obj)).Unit != null)
            {
                return false;
            }
        } else
        if (!Unit.equals(((Measurement) (obj)).Unit))
        {
            return false;
        }
        if (UnitType == null)
        {
            if (((Measurement) (obj)).UnitType != null)
            {
                return false;
            }
        } else
        if (!UnitType.equals(((Measurement) (obj)).UnitType))
        {
            return false;
        }
        if (Value != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Measurement) (obj)).Value == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Value.equals(((Measurement) (obj)).Value)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public String getUnit()
    {
        return Unit;
    }

    public Integer getUnitType()
    {
        return UnitType;
    }

    public Double getValue()
    {
        return Value;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (Unit == null)
        {
            i = 0;
        } else
        {
            i = Unit.hashCode();
        }
        if (UnitType == null)
        {
            j = 0;
        } else
        {
            j = UnitType.hashCode();
        }
        if (Value != null)
        {
            k = Value.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public void setUnit(String s)
    {
        Unit = s;
    }

    public void setUnitType(Integer integer)
    {
        UnitType = integer;
    }

    public void setValue(Double double1)
    {
        Value = double1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Measurement [Value=").append(Value).append(", Unit=").append(Unit).append(", UnitType=").append(UnitType).append("]").toString();
    }
}
