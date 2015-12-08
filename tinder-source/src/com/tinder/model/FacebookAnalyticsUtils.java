// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.a.a.a.a.f;
import com.facebook.appevents.AppEventsLogger;
import com.tinder.utils.v;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.tinder.model:
//            SparksEvent

public class FacebookAnalyticsUtils
{

    private static final Pattern CHARACTERS = Pattern.compile("[^0-9a-z \\-_]", 2);
    private static Set sDebugCounter = null;
    private static AppEventsLogger sEventLogger;
    private static String sEventsToFilter[] = {
        "Device"
    };
    private static String sParamsToFilter[];

    public FacebookAnalyticsUtils()
    {
    }

    public static void activate(Activity activity)
    {
        AppEventsLogger.a(activity);
    }

    private static Bundle convertParameters(Map map)
    {
        Bundle bundle = new Bundle();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)map.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            obj1 = (String)((java.util.Map.Entry) (obj1)).getKey();
            if (!isParamIgnored(((String) (obj1))) && obj != null)
            {
                String s = getStringName(((String) (obj1)));
                if (obj instanceof String)
                {
                    bundle.putString(s, (String)obj);
                } else
                if (obj instanceof Integer)
                {
                    bundle.putString(s, Integer.toString(((Integer)obj).intValue()));
                } else
                if (obj instanceof Double)
                {
                    bundle.putString(s, Double.toString(((Double)obj).doubleValue()));
                } else
                if (obj instanceof Long)
                {
                    bundle.putString(s, Long.toString(((Long)obj).longValue()));
                } else
                if (obj instanceof Short)
                {
                    bundle.putString(s, Short.toString(((Short)obj).shortValue()));
                } else
                if (obj instanceof Byte)
                {
                    bundle.putString(s, Byte.toString(((Byte)obj).byteValue()));
                } else
                if (obj instanceof Float)
                {
                    bundle.putString(s, Float.toString(((Float)obj).floatValue()));
                } else
                if (obj instanceof Boolean)
                {
                    bundle.putString(s, Boolean.toString(((Boolean)obj).booleanValue()));
                } else
                {
                    v.a((new StringBuilder("Not including parameter because it's not a simple type: '")).append(((String) (obj1))).append("' ('").append(s).append("') , with value: '").append(obj.toString()).append('\'').toString());
                }
            }
        } while (true);
        return bundle;
    }

    public static void deactivate(Activity activity)
    {
        AppEventsLogger.b(activity);
        flush();
    }

    public static void flush()
    {
        if (sEventLogger != null)
        {
            AppEventsLogger.b();
        }
    }

    private static String getStringName(String s)
    {
        String s1 = CHARACTERS.matcher(s).replaceAll("");
        s = s1;
        if (s1.length() > 40)
        {
            s = s1.substring(0, 39);
        }
        return s;
    }

    private static boolean isEventIgnored(String s)
    {
        return Arrays.binarySearch(sEventsToFilter, s) >= 0;
    }

    private static boolean isParamIgnored(String s)
    {
        return Arrays.binarySearch(sParamsToFilter, s) >= 0;
    }

    public static void logPurchase(f f1, Bundle bundle)
    {
        if (sEventLogger != null)
        {
            AppEventsLogger appeventslogger = sEventLogger;
            BigDecimal bigdecimal = BigDecimal.valueOf(f1.f.doubleValue());
            Currency currency = Currency.getInstance(f1.e);
            if (bigdecimal == null)
            {
                AppEventsLogger.a("purchaseAmount cannot be null");
            } else
            {
                if (currency == null)
                {
                    AppEventsLogger.a("currency cannot be null");
                    return;
                }
                f1 = bundle;
                if (bundle == null)
                {
                    f1 = new Bundle();
                }
                f1.putString("fb_currency", currency.getCurrencyCode());
                appeventslogger.a("fb_mobile_purchase", bigdecimal.doubleValue(), f1);
                if (AppEventsLogger.a() != com.facebook.appevents.AppEventsLogger.FlushBehavior.b)
                {
                    AppEventsLogger.a(com.facebook.appevents.AppEventsLogger.FlushReason.f);
                    return;
                }
            }
        }
    }

    public static void setup(Context context)
    {
        sEventLogger = AppEventsLogger.c(context);
    }

    public static void trackEvent(String s)
    {
        while (isEventIgnored(s) || sEventLogger == null) 
        {
            return;
        }
        sEventLogger.a(getStringName(s), null);
    }

    public static void trackFromSparksEvent(SparksEvent sparksevent)
    {
        if (!isEventIgnored(sparksevent.name))
        {
            Bundle bundle = convertParameters(sparksevent.params);
            if (sEventLogger != null)
            {
                sparksevent = getStringName(sparksevent.name);
                sEventLogger.a(sparksevent, bundle);
                return;
            }
        }
    }

    static 
    {
        String as[] = new String[12];
        as[0] = "uid";
        as[1] = "lat";
        as[2] = "lon";
        as[3] = "ts";
        as[4] = "deviceId";
        as[5] = "matchId";
        as[6] = "otherId";
        as[7] = "location";
        as[8] = "name";
        as[9] = "bio";
        as[10] = "createTs";
        as[11] = "message";
        sParamsToFilter = as;
        Arrays.sort(as);
        Arrays.sort(sEventsToFilter);
    }
}
