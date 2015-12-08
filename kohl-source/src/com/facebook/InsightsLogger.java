// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Logger;
import java.math.BigDecimal;
import java.util.Currency;

// Referenced classes of package com.facebook:
//            AppEventsLogger, LoggingBehavior, Session

public class InsightsLogger
{

    private static final String EVENT_NAME_LOG_CONVERSION_PIXEL = "fb_log_offsite_pixel";
    private static final String EVENT_PARAMETER_PIXEL_ID = "fb_offsite_pixel_id";
    private static final String EVENT_PARAMETER_PIXEL_VALUE = "fb_offsite_pixel_value";
    private AppEventsLogger appEventsLogger;

    private InsightsLogger(Context context, String s, Session session)
    {
        appEventsLogger = AppEventsLogger.newLogger(context, s, session);
    }

    public static InsightsLogger newLogger(Context context, String s)
    {
        return new InsightsLogger(context, null, null);
    }

    public static InsightsLogger newLogger(Context context, String s, String s1)
    {
        return new InsightsLogger(context, s1, null);
    }

    public static InsightsLogger newLogger(Context context, String s, String s1, Session session)
    {
        return new InsightsLogger(context, s1, session);
    }

    public void logConversionPixel(String s, double d)
    {
        if (s == null)
        {
            Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "Insights", "pixelID cannot be null");
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("fb_offsite_pixel_id", s);
            bundle.putDouble("fb_offsite_pixel_value", d);
            appEventsLogger.logEvent("fb_log_offsite_pixel", d, bundle);
            AppEventsLogger.eagerFlush();
            return;
        }
    }

    public void logPurchase(BigDecimal bigdecimal, Currency currency)
    {
        logPurchase(bigdecimal, currency, null);
    }

    public void logPurchase(BigDecimal bigdecimal, Currency currency, Bundle bundle)
    {
        appEventsLogger.logPurchase(bigdecimal, currency, bundle);
    }
}
