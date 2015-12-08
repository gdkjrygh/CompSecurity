// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.minutecast;

import com.accuweather.android.models.ExpirableModel;
import com.accuweather.android.utilities.IClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.minutecast:
//            Summary

public class MinuteCastResult
    implements Serializable
{

    private static final long serialVersionUID = 0x80d1fd3ff450034cL;
    private ExpirableModel expirableModel;
    private List intervals;
    private List summaries;
    private Summary summary;

    public MinuteCastResult()
    {
        intervals = new ArrayList();
        summaries = new ArrayList();
        expirableModel = new ExpirableModel() {

            private static final long serialVersionUID = 0x9a899089e588cf1eL;
            final MinuteCastResult this$0;

            protected int getExpirationTimeInMinutes()
            {
                return 1;
            }

            
            {
                this$0 = MinuteCastResult.this;
                super();
            }
        };
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
        obj = (MinuteCastResult)obj;
        if (intervals == null)
        {
            if (((MinuteCastResult) (obj)).intervals != null)
            {
                return false;
            }
        } else
        if (!intervals.equals(((MinuteCastResult) (obj)).intervals))
        {
            return false;
        }
        if (summaries == null)
        {
            if (((MinuteCastResult) (obj)).summaries != null)
            {
                return false;
            }
        } else
        if (!summaries.equals(((MinuteCastResult) (obj)).summaries))
        {
            return false;
        }
        if (summary != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((MinuteCastResult) (obj)).summary == null) goto _L1; else goto _L3
_L3:
        return false;
        if (summary.equals(((MinuteCastResult) (obj)).summary)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getIntervals()
    {
        return intervals;
    }

    public List getSummaries()
    {
        return summaries;
    }

    public Summary getSummary()
    {
        return summary;
    }

    public long getUpdateTime()
    {
        return expirableModel.getUpdateTime();
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (intervals == null)
        {
            i = 0;
        } else
        {
            i = intervals.hashCode();
        }
        if (summaries == null)
        {
            j = 0;
        } else
        {
            j = summaries.hashCode();
        }
        if (summary != null)
        {
            k = summary.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + k;
    }

    public final boolean isExpired(IClock iclock)
    {
        return expirableModel.isExpired(iclock);
    }

    public void setIntervals(List list)
    {
        intervals = list;
    }

    public void setSummaries(List list)
    {
        summaries = list;
    }

    public void setSummary(Summary summary1)
    {
        summary = summary1;
    }

    public void setUpdateTime(long l)
    {
        expirableModel.setUpdateTime(l);
    }

    public String toString()
    {
        return (new StringBuilder()).append("MinuteCastResult [intervals=").append(intervals).append(", summaries=").append(summaries).append(", summary=").append(summary).append("]").toString();
    }
}
