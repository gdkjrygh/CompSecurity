// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import java.io.Serializable;

// Referenced classes of package com.accuweather.android.models:
//            Direction, Measurement

public class Wind
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Direction Direction;
    private Measurement Speed;

    public Wind()
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
        obj = (Wind)obj;
        if (Direction == null)
        {
            if (((Wind) (obj)).Direction != null)
            {
                return false;
            }
        } else
        if (!Direction.equals(((Wind) (obj)).Direction))
        {
            return false;
        }
        if (Speed != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Wind) (obj)).Speed == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Speed.equals(((Wind) (obj)).Speed)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Direction getDirection()
    {
        return Direction;
    }

    public Measurement getSpeed()
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

    public void setSpeed(Measurement measurement)
    {
        Speed = measurement;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Wind [Speed=").append(Speed).append(", Direction=").append(Direction).append("]").toString();
    }
}
