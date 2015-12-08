// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import IO;
import android.app.Activity;
import com.flurry.android.FlurryAgent;
import com.snapchat.android.Timber;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            AnalyticsPlatform

public class FlurryAnalyticsPlatform
    implements AnalyticsPlatform
{

    public FlurryAnalyticsPlatform()
    {
    }

    public final void a(Activity activity)
    {
        IO.SERIAL_BACKGROUND_EXECUTOR.submit(new Runnable(activity) {

            private Activity a;

            public void run()
            {
                FlurryAgent.setUseHttps(true);
                FlurryAgent.setReportLocation(false);
                FlurryAgent.onStartSession(a, "FRW84M2GG56RMM8VWT5G");
            }

            
            {
                a = activity;
                super();
            }
        });
    }

    public final void a(String s, Map map, Map map1, Map map2, Map map3)
    {
        if (map == null)
        {
            FlurryAgent.logEvent(s);
            return;
        }
        if (map.size() > 10)
        {
            Timber.d("FlurryAnalyticsPlatform", (new StringBuilder("Flurry only supports up to 10 parameters. Found: ")).append(map.size()).append(". Truncating!").toString(), new Object[0]);
            map1 = new HashMap(10);
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                map2 = (java.util.Map.Entry)map.next();
                if (map1.size() >= 10)
                {
                    break;
                }
                map1.put(map2.getKey(), map2.getValue().toString());
            } while (true);
            map = map1;
        } else
        {
            map1 = new HashMap(map.size());
            for (map = map.entrySet().iterator(); map.hasNext(); map1.put(map2.getKey(), map2.getValue().toString()))
            {
                map2 = (java.util.Map.Entry)map.next();
            }

            map = map1;
        }
        FlurryAgent.logEvent(s, map);
    }

    public final void b(Activity activity)
    {
        IO.SERIAL_BACKGROUND_EXECUTOR.submit(new Runnable(activity) {

            private Activity a;

            public void run()
            {
                FlurryAgent.onEndSession(a);
            }

            
            {
                a = activity;
                super();
            }
        });
    }
}
