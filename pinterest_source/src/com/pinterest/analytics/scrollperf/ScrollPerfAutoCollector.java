// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics.scrollperf;

import android.view.View;
import com.pinterest.experiment.Experiments;

// Referenced classes of package com.pinterest.analytics.scrollperf:
//            ScrollPerfCollector, ScrollPerfAutoTracker, ScrollPerfTrackerConfig

public class ScrollPerfAutoCollector extends ScrollPerfCollector
{

    private ScrollPerfAutoCollector(View view, ScrollPerfTrackerConfig scrollperftrackerconfig)
    {
        a = new ScrollPerfAutoTracker(view, scrollperftrackerconfig, this);
    }

    public static ScrollPerfAutoCollector a(View view, ScrollPerfTrackerConfig scrollperftrackerconfig)
    {
        boolean flag;
        if (view != null && scrollperftrackerconfig != null && Experiments.A())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new ScrollPerfAutoCollector(view, scrollperftrackerconfig);
        } else
        {
            return null;
        }
    }
}
