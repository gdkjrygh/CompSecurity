// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.Map;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;

// Referenced classes of package me.lyft.android.analytics:
//            Event, RedshiftTrackerExtra

public class  extends Event
{

    public String getPage()
    {
        return (String)getParameters().get(Parameter.PAGE.toString());
    }

    String getPreviousPage()
    {
        return (String)getParameters().get(Parameter.PREVIOUS_PAGE.toString());
    }

    (String s, String s1, long l)
    {
        super(EventName.PAGE_VIEW);
        putParameter(Parameter.PAGE, s);
        putParameter(Parameter.PREVIOUS_PAGE, s1);
        putParameter(Parameter.PREVIOUS_PAGE_MS, Long.valueOf(l));
        addTracker(RedshiftTrackerExtra.create());
    }

    addTracker(String s, String s1, long l, String s2)
    {
        this(s, s1, l);
        putParameter(Parameter.PAGE_VALUE, s2);
    }
}
