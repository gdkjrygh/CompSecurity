// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.leanplum;

import android.os.SystemClock;
import com.leanplum.callbacks.StartCallback;
import java.util.HashMap;
import java.util.Map;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.Event;
import me.lyft.android.analytics.LeanplumTrackerExtra;

// Referenced classes of package me.lyft.android.infrastructure.leanplum:
//            LeanplumService

class val.startTime extends StartCallback
{

    final LeanplumService this$0;
    final long val$startTime;

    public void onResponse(boolean flag)
    {
        long l = SystemClock.elapsedRealtime();
        Double double1 = new Double(l - val$startTime);
        String s;
        HashMap hashmap;
        if (flag)
        {
            s = "success";
        } else
        {
            s = "failure";
        }
        hashmap = new HashMap();
        if (LeanplumService.access$000(LeanplumService.this) != null)
        {
            hashmap.put("delay", new Double(Math.max(LeanplumService.access$000(LeanplumService.this).longValue() - l, 0L)));
        } else
        {
            hashmap.put("delay", Double.valueOf(0.0D));
        }
        Analytics.track((new Event("leanplumStartup")).addTracker(new LeanplumTrackerExtra(double1.doubleValue(), s, hashmap)));
    }

    ()
    {
        this$0 = final_leanplumservice;
        val$startTime = J.this;
        super();
    }
}
