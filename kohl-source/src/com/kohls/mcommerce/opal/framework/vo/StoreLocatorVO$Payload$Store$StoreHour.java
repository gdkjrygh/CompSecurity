// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.vo;

import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.vo:
//            StoreLocatorVO

public class this._cls2
    implements Serializable
{

    private static final long serialVersionUID = 11L;
    private List days;
    private HashMap operationHours;
    final Day.Hour.getCloseTimes this$2;

    public List getDays()
    {
        return days;
    }

    public HashMap getHoursOfOperation()
    {
        return operationHours;
    }

    public void setDays(List list)
    {
        days = list;
    }

    public void setHoursofOperation()
    {
        operationHours = new HashMap();
        for (int i = 0; i < getDays().size(); i++)
        {
    /* block-local class not found */
    class Day {}

            Day day = (Day)getDays().get(i);
            if (day != null && UtilityMethods.getShortDayName(day.getDayName()) != null)
            {
                StringBuilder stringbuilder = new StringBuilder();
    /* block-local class not found */
    class Day.Hour {}

                operationHours.put(day.getDayName().toLowerCase(), stringbuilder.append(" ").append(day.getHoursofOperation().getOpenTimes()).append(" - ").append(day.getHoursofOperation().getCloseTimes()).toString());
            }
        }

    }

    public Day.Hour()
    {
        this$2 = this._cls2.this;
        super();
    }
}
