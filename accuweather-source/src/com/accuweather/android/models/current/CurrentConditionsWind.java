// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.current;

import com.accuweather.android.models.Direction;
import com.accuweather.android.models.MetricImperial;
import java.io.Serializable;

public class CurrentConditionsWind
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Direction Direction;
    private MetricImperial Speed;

    public CurrentConditionsWind()
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
        obj = (CurrentConditionsWind)obj;
        if (Direction == null)
        {
            if (((CurrentConditionsWind) (obj)).Direction != null)
            {
                return false;
            }
        } else
        if (!Direction.equals(((CurrentConditionsWind) (obj)).Direction))
        {
            return false;
        }
        if (Speed != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((CurrentConditionsWind) (obj)).Speed == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Speed.equals(((CurrentConditionsWind) (obj)).Speed)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Direction getDirection()
    {
        return Direction;
    }

    public MetricImperial getSpeed()
    {
        return Speed;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (Direction == null)
        {
            i = 0;
        } else
        {
            i = Direction.hashCode();
        }
        if (Speed != null)
        {
            j = Speed.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public void setDirection(Direction direction)
    {
        Direction = direction;
    }

    public void setSpeed(MetricImperial metricimperial)
    {
        Speed = metricimperial;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CurrentConditionsWind [Direction=").append(Direction).append(", Speed=").append(Speed).append("]").toString();
    }
}
