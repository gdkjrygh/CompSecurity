// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core.d;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.qihoo360.mobilesafe.core.d:
//            g

public class b
{

    private static final String a = com/qihoo360/mobilesafe/core/d/b.getSimpleName();
    private boolean b;
    private Context c;

    public b(Context context)
    {
        b = true;
        c = context.getApplicationContext();
        b = g.a(c);
    }

    private boolean a(android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo)
    {
        return runningappprocessinfo.importance == 100;
    }

    private String b()
        throws Exception
    {
        Object obj = (ActivityManager)c.getSystemService("activity");
        try
        {
            obj = ((ActivityManager) (obj)).getRunningTasks(1);
        }
        catch (Exception exception)
        {
            exception = null;
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            return ((android.app.ActivityManager.RunningTaskInfo)((List) (obj)).get(0)).topActivity.getPackageName();
        } else
        {
            return null;
        }
    }

    private String c()
        throws Exception
    {
        Object obj = ((ActivityManager)c.getSystemService("activity")).getRunningAppProcesses();
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return null;
_L3:
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
        if (runningappprocessinfo.pkgList.length > 0)
        {
            String s = runningappprocessinfo.pkgList[0];
            if (a(runningappprocessinfo))
            {
                return s;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private String d()
        throws Exception
    {
        UsageEvents usageevents;
        UsageStatsManager usagestatsmanager = (UsageStatsManager)c.getSystemService("usagestats");
        long l = System.currentTimeMillis();
        usageevents = usagestatsmanager.queryEvents(l - 10000L, l);
        if (usageevents == null) goto _L2; else goto _L1
_L1:
        Object obj = new TreeMap();
_L10:
        boolean flag = usageevents.hasNextEvent();
        if (flag) goto _L4; else goto _L3
_L3:
        if (((SortedMap) (obj)).isEmpty())
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        try
        {
            android.app.usage.UsageEvents.Event event = new android.app.usage.UsageEvents.Event();
            usageevents.getNextEvent(event);
            ((SortedMap) (obj)).put(Long.valueOf(event.getTimeStamp()), event);
            continue; /* Loop/switch isn't completed */
        }
        catch (Exception exception) { }
        if (true) goto _L3; else goto _L5
_L5:
        obj = (android.app.usage.UsageEvents.Event)((SortedMap) (obj)).get(((SortedMap) (obj)).lastKey());
        if (((android.app.usage.UsageEvents.Event) (obj)).getEventType() != 1) goto _L2; else goto _L6
_L6:
        obj = ((android.app.usage.UsageEvents.Event) (obj)).getPackageName();
_L8:
        return ((String) (obj));
        obj;
        obj = null;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String a()
    {
        String s;
        try
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                return b();
            }
            if (b)
            {
                return c();
            }
            s = d();
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

}
