// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.daily;

import com.accuweather.android.models.ExpirableModel;
import com.accuweather.android.utilities.IClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.daily:
//            Headline

public class ForecastResult
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private List DailyForecasts;
    private Headline Headline;
    private ExpirableModel expirableModel;

    public ForecastResult()
    {
        DailyForecasts = new ArrayList();
        expirableModel = new ExpirableModel() {

            final ForecastResult this$0;

            protected int getExpirationTimeInMinutes()
            {
                return 30;
            }

            
            {
                this$0 = ForecastResult.this;
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
        obj = (ForecastResult)obj;
        if (DailyForecasts == null)
        {
            if (((ForecastResult) (obj)).DailyForecasts != null)
            {
                return false;
            }
        } else
        if (!DailyForecasts.equals(((ForecastResult) (obj)).DailyForecasts))
        {
            return false;
        }
        if (Headline != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ForecastResult) (obj)).Headline == null) goto _L1; else goto _L3
_L3:
        return false;
        if (Headline.equals(((ForecastResult) (obj)).Headline)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public List getDailyForecasts()
    {
        return DailyForecasts;
    }

    public Headline getHeadline()
    {
        return Headline;
    }

    public long getUpdateTime()
    {
        return expirableModel.getUpdateTime();
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (DailyForecasts == null)
        {
            i = 0;
        } else
        {
            i = DailyForecasts.hashCode();
        }
        if (Headline != null)
        {
            j = Headline.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public final boolean isExpired(IClock iclock)
    {
        return expirableModel.isExpired(iclock);
    }

    public void setDailyForecasts(List list)
    {
        DailyForecasts = list;
    }

    public void setHeadline(Headline headline)
    {
        Headline = headline;
    }

    public void setUpdateTime(long l)
    {
        expirableModel.setUpdateTime(l);
    }

    public String toString()
    {
        return (new StringBuilder()).append("ForecastResult [Headline=").append(Headline).append(", DailyForecasts=").append(DailyForecasts).append("]").toString();
    }
}
