// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import java.io.Serializable;

public class Sun
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private Long EpochRise;
    private Long EpochSet;
    private String Rise;
    private String Set;

    public Sun()
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
        obj = (Sun)obj;
        if (EpochRise == null)
        {
            if (((Sun) (obj)).EpochRise != null)
            {
                return false;
            }
        } else
        if (!EpochRise.equals(((Sun) (obj)).EpochRise))
        {
            return false;
        }
        if (EpochSet == null)
        {
            if (((Sun) (obj)).EpochSet != null)
            {
                return false;
            }
        } else
        if (!EpochSet.equals(((Sun) (obj)).EpochSet))
        {
            return false;
        }
        if (Rise == null)
        {
            if (((Sun) (obj)).Rise != null)
            {
                return false;
            }
        } else
        if (!Rise.equals(((Sun) (obj)).Rise))
        {
            return false;
        }
        if (Set != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Sun) (obj)).Set == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Set.equals(((Sun) (obj)).Set)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Long getEpochRise()
    {
        return EpochRise;
    }

    public Long getEpochSet()
    {
        return EpochSet;
    }

    public String getRise()
    {
        return Rise;
    }

    public String getSet()
    {
        return Set;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (EpochRise == null)
        {
            i = 0;
        } else
        {
            i = EpochRise.hashCode();
        }
        if (EpochSet == null)
        {
            j = 0;
        } else
        {
            j = EpochSet.hashCode();
        }
        if (Rise == null)
        {
            k = 0;
        } else
        {
            k = Rise.hashCode();
        }
        if (Set != null)
        {
            l = Set.hashCode();
        }
        return (((i + 31) * 31 + j) * 31 + k) * 31 + l;
    }

    public void setEpochRise(Long long1)
    {
        EpochRise = long1;
    }

    public void setEpochSet(Long long1)
    {
        EpochSet = long1;
    }

    public void setRise(String s)
    {
        Rise = s;
    }

    public void setSet(String s)
    {
        Set = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Sun [Rise=").append(Rise).append(", EpochRise=").append(EpochRise).append(", Set=").append(Set).append(", EpochSet=").append(EpochSet).append("]").toString();
    }
}
