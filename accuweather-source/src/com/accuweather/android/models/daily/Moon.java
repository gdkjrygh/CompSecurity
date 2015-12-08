// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import java.io.Serializable;

public class Moon
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private int Age;
    private Long EpochRise;
    private Long EpochSet;
    private String Phase;
    private String Rise;
    private String Set;

    public Moon()
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
        obj = (Moon)obj;
        if (Age != ((Moon) (obj)).Age)
        {
            return false;
        }
        if (EpochRise == null)
        {
            if (((Moon) (obj)).EpochRise != null)
            {
                return false;
            }
        } else
        if (!EpochRise.equals(((Moon) (obj)).EpochRise))
        {
            return false;
        }
        if (EpochSet == null)
        {
            if (((Moon) (obj)).EpochSet != null)
            {
                return false;
            }
        } else
        if (!EpochSet.equals(((Moon) (obj)).EpochSet))
        {
            return false;
        }
        if (Phase == null)
        {
            if (((Moon) (obj)).Phase != null)
            {
                return false;
            }
        } else
        if (!Phase.equals(((Moon) (obj)).Phase))
        {
            return false;
        }
        if (Rise == null)
        {
            if (((Moon) (obj)).Rise != null)
            {
                return false;
            }
        } else
        if (!Rise.equals(((Moon) (obj)).Rise))
        {
            return false;
        }
        if (Set != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((Moon) (obj)).Set == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Set.equals(((Moon) (obj)).Set)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getAge()
    {
        return Age;
    }

    public Long getEpochRise()
    {
        return EpochRise;
    }

    public Long getEpochSet()
    {
        return EpochSet;
    }

    public String getPhase()
    {
        return Phase;
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
        int i1 = 0;
        int j1 = Age;
        int i;
        int j;
        int k;
        int l;
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
        if (Phase == null)
        {
            k = 0;
        } else
        {
            k = Phase.hashCode();
        }
        if (Rise == null)
        {
            l = 0;
        } else
        {
            l = Rise.hashCode();
        }
        if (Set != null)
        {
            i1 = Set.hashCode();
        }
        return (((((j1 + 31) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
    }

    public void setAge(int i)
    {
        Age = i;
    }

    public void setEpochRise(Long long1)
    {
        EpochRise = long1;
    }

    public void setEpochSet(Long long1)
    {
        EpochSet = long1;
    }

    public void setPhase(String s)
    {
        Phase = s;
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
        return (new StringBuilder()).append("Moon [Rise=").append(Rise).append(", EpochRise=").append(EpochRise).append(", Set=").append(Set).append(", EpochSet=").append(EpochSet).append(", Phase=").append(Phase).append(", Age=").append(Age).append("]").toString();
    }
}
