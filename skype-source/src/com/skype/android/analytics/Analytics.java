// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.telemetry.TelemetryProviderFactory;
import com.skype.telemetry.TelemetryService;
import com.skype.telemetry.sdk.FlurryAccessInterface;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsEvent, ExperimentTelemetryEvent, SkypeTelemetryEvent, ExperimentEvent, 
//            ExperimentTag, LogEvent, AnalyticsParameterContainer

public class Analytics extends TelemetryService
{

    private static String a = "Analytics";
    private static Logger b = Logger.getLogger("Analytics");
    private final AsyncService c;
    private final FlurryAccessInterface d;
    private final EcsConfiguration e;

    public Analytics(Application application, AsyncService asyncservice, EcsConfiguration ecsconfiguration, FlurryAccessInterface flurryaccessinterface, TelemetryProviderFactory telemetryproviderfactory)
    {
        super(application, telemetryproviderfactory);
        c = asyncservice;
        e = ecsconfiguration;
        d = flurryaccessinterface;
    }

    static FlurryAccessInterface a(Analytics analytics)
    {
        return analytics.d;
    }

    public static String a(float f1)
    {
        if (f1 <= 1.0F)
        {
            return "0-1s";
        }
        if (f1 <= 2.0F)
        {
            return "1-2s";
        }
        if (f1 <= 3F)
        {
            return "2-3s";
        }
        if (f1 <= 5F)
        {
            return "3-5s";
        }
        if (f1 <= 10F)
        {
            return "5-10s";
        }
        if (f1 <= 30F)
        {
            return "10-30s";
        }
        if (f1 < 61F)
        {
            return "30-61s";
        } else
        {
            return "61s+";
        }
    }

    public static String a(int i)
    {
        if (i == 0)
        {
            return "0";
        }
        if (i <= 3)
        {
            return "1-3";
        }
        if (i <= 7)
        {
            return "4-7";
        }
        if (i <= 11)
        {
            return "8-11";
        }
        if (i <= 18)
        {
            return "12-18";
        }
        if (i <= 25)
        {
            return "19-25";
        }
        if (i <= 39)
        {
            return "26-39";
        }
        if (i <= 99)
        {
            return "40-99";
        } else
        {
            return "100+";
        }
    }

    public static String a(long l)
    {
        if (l <= 0L)
        {
            return "0";
        }
        if (l <= 3L)
        {
            return "1-3s";
        }
        if (l <= 6L)
        {
            return "3-6s";
        }
        if (l <= 10L)
        {
            return "6-10s";
        }
        if (l < 30L)
        {
            return "10-30s";
        }
        if (l <= 60L)
        {
            return "30s-1m";
        } else
        {
            return "1m+";
        }
    }

    private void a(AnalyticsEvent analyticsevent, Object obj, boolean flag)
    {
        if (!d(analyticsevent))
        {
            return;
        } else
        {
            analyticsevent = new Callable(analyticsevent, obj, flag) {

                final AnalyticsEvent a;
                final Object b;
                final boolean c;
                final Analytics d;

                public final Object call()
                    throws Exception
                {
                    HashMap hashmap;
                    hashmap = new HashMap();
                    hashmap.put("ID", Integer.toString(a.a()));
                    if (!(b instanceof String) || ((String)b).length() <= 0) goto _L2; else goto _L1
_L1:
                    hashmap.put("VALUE", (String)b);
_L4:
                    Analytics.a(d).a(a.name(), hashmap, c);
                    return Boolean.valueOf(true);
_L2:
                    if (b instanceof Integer)
                    {
                        hashmap.put("VALUE", Integer.toString(((Integer)b).intValue()));
                    } else
                    if (b instanceof Long)
                    {
                        hashmap.put("VALUE", Long.toString(((Long)b).longValue()));
                    } else
                    if (b instanceof AnalyticsParameterContainer)
                    {
                        ((AnalyticsParameterContainer)b).a(hashmap);
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                d = Analytics.this;
                a = analyticsevent;
                b = obj;
                c = flag;
                super();
            }
            };
            c.a(analyticsevent, null);
            return;
        }
    }

    public static String b(int i)
    {
        long l = TimeUnit.MILLISECONDS.toDays(i);
        if (l < 2L)
        {
            return "1 day";
        }
        if (l < 4L)
        {
            return "2-3 days";
        }
        if (l < 5L)
        {
            return "3-4 days";
        }
        if (l < 6L)
        {
            return "4-5 days";
        }
        if (l < 7L)
        {
            return "5-6 days";
        }
        if (l < 8L)
        {
            return "6-7 days";
        }
        if (l < 15L)
        {
            return "7-14 days";
        }
        if (l < 22L)
        {
            return "15-21 days";
        } else
        {
            return "21-29 days";
        }
    }

    public static String b(long l)
    {
        if (l <= 0L)
        {
            return "0";
        }
        if (l < 30L)
        {
            return "1-30s";
        }
        if (l < 60L)
        {
            return "30-60s";
        }
        if (l < 120L)
        {
            return "1-2m";
        }
        if (l < 300L)
        {
            return "2-5m";
        }
        if (l < 600L)
        {
            return "5-10m";
        }
        if (l < 900L)
        {
            return "10-15m";
        }
        if (l < 1800L)
        {
            return "15-30m";
        }
        if (l < 2700L)
        {
            return "30-45m";
        }
        if (l < 3600L)
        {
            return "45-60m";
        }
        if (l < 7200L)
        {
            return "1-2h";
        }
        if (l < 10800L)
        {
            return "2-3h";
        } else
        {
            return "3h+";
        }
    }

    private void b(AnalyticsEvent analyticsevent, int i)
    {
        a(analyticsevent, Integer.valueOf(i), false);
    }

    public static String c(long l)
    {
        if (l < 100L)
        {
            return "[0,100) ms";
        }
        if (l < 200L)
        {
            return "[100,200) ms";
        }
        if (l < 500L)
        {
            return "[200,500) ms";
        }
        if (l < 1000L)
        {
            return "[500,1000) ms";
        }
        if (l < 5000L)
        {
            return "[1,5) s";
        }
        if (l < 10000L)
        {
            return "[5,10) s";
        }
        if (l < 60000L)
        {
            return "[10,60) s";
        } else
        {
            return ">1 min";
        }
    }

    public static String d(long l)
    {
        if (l <= 300L)
        {
            return "0-5m";
        }
        if (l <= 900L)
        {
            return "6-15m";
        }
        if (l <= 3540L)
        {
            return "16-59m";
        }
        if (l <= 21600L)
        {
            return "1-6h";
        }
        if (l <= 43200L)
        {
            return "6-12h";
        }
        if (l <= 0x15180L)
        {
            return "12-24h";
        } else
        {
            return "24h+";
        }
    }

    private static boolean d(AnalyticsEvent analyticsevent)
    {
        if (analyticsevent == null)
        {
            throw new IllegalArgumentException("Event is null");
        }
        return analyticsevent != AnalyticsEvent.aE;
    }

    public static String e(long l)
    {
        if (l <= 10L)
        {
            return "0-10s";
        }
        if (l <= 30L)
        {
            return "11-30s";
        }
        if (l <= 60L)
        {
            return "31-60s";
        }
        if (l <= 180L)
        {
            return "1-3m";
        }
        if (l <= 600L)
        {
            return "3-10m";
        }
        if (l <= 900L)
        {
            return "10-30m";
        } else
        {
            return "30m+";
        }
    }

    public static String f(long l)
    {
        if (l <= 1000L)
        {
            return "0-1s";
        }
        if (l <= 2000L)
        {
            return "1-2s";
        }
        if (l <= 3000L)
        {
            return "2-3s";
        }
        if (l <= 5000L)
        {
            return "3-5s";
        }
        if (l <= 10000L)
        {
            return "5-10s";
        }
        if (l <= 30000L)
        {
            return "10-30s";
        }
        if (l < 61000L)
        {
            return "30-61s";
        } else
        {
            return "61s+";
        }
    }

    public static String g(long l)
    {
        if (l < 10L)
        {
            return "0-10ms";
        }
        if (l < 50L)
        {
            return "10-50ms";
        }
        if (l < 100L)
        {
            return "50-100ms";
        }
        if (l < 250L)
        {
            return "100-250ms";
        }
        if (l < 500L)
        {
            return "250-500ms";
        }
        if (l < 1000L)
        {
            return "500ms-1s";
        }
        if (l < 2000L)
        {
            return "1-2s";
        }
        if (l < 5000L)
        {
            return "2-5s";
        }
        if (l < 10000L)
        {
            return "5-10s";
        }
        if (l < 25000L)
        {
            return "10-25s";
        }
        if (l < 50000L)
        {
            return "25-50s";
        }
        if (l < 0x124f8L)
        {
            return "50-75";
        } else
        {
            return "75s+";
        }
    }

    public final void a(AnalyticsEvent analyticsevent)
    {
        a(analyticsevent, "", true);
    }

    public final void a(AnalyticsEvent analyticsevent, int i)
    {
        b(analyticsevent, i);
    }

    public final void a(AnalyticsEvent analyticsevent, Object obj)
    {
        a(analyticsevent, obj, false);
    }

    public final void a(AnalyticsEvent analyticsevent, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        b(analyticsevent, i);
    }

    public final void a(ExperimentEvent experimentevent, ExperimentTag experimenttag)
    {
        super.a(new ExperimentTelemetryEvent(experimentevent, experimenttag));
    }

    public final void a(ExperimentTelemetryEvent experimenttelemetryevent)
    {
        super.a(experimenttelemetryevent);
    }

    public final void a(LogEvent logevent)
    {
        a(new SkypeTelemetryEvent(logevent));
    }

    public final void a(SkypeTelemetryEvent skypetelemetryevent)
    {
        if (e.getInt(skypetelemetryevent.getEcsKey()).intValue() == 1)
        {
            super.a(skypetelemetryevent);
        }
    }

    public final void b(AnalyticsEvent analyticsevent)
    {
        if (d(analyticsevent))
        {
            analyticsevent = new Callable(analyticsevent) {

                final AnalyticsEvent a;
                final Analytics b;

                public final Object call()
                    throws Exception
                {
                    Analytics.a(b).c(a.name());
                    return Boolean.valueOf(true);
                }

            
            {
                b = Analytics.this;
                a = analyticsevent;
                super();
            }
            };
            c.a(analyticsevent, null);
        }
    }

    public final void c(AnalyticsEvent analyticsevent)
    {
        a(analyticsevent, "", false);
    }

}
