// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            Settings, LoggingBehavior, Session, AccessTokenSource, 
//            AccessToken, NonCachingTokenCachingStrategy, Request, Response, 
//            FacebookRequestError

public class InsightsLogger
{

    private static final String EVENT_NAME_LOG_CONVERSION_PIXEL = "fb_log_offsite_pixel";
    private static final String EVENT_NAME_LOG_MOBILE_PURCHASE = "fb_mobile_purchase";
    private static final String EVENT_PARAMETER_CURRENCY = "fb_currency";
    private static final String EVENT_PARAMETER_PIXEL_ID = "fb_offsite_pixel_id";
    private static final String EVENT_PARAMETER_PIXEL_VALUE = "fb_offsite_pixel_value";
    private static Session appAuthSession = null;
    private final String applicationId;
    private final String clientToken;
    private final Context context;
    private final Session specifiedSession;

    private InsightsLogger(Context context1, String s, String s1, Session session)
    {
        Validate.notNull(context1, "context");
        Validate.notNullOrEmpty(s, "clientToken");
        String s2 = s1;
        if (s1 == null)
        {
            s2 = Utility.getMetadataApplicationId(context1);
        }
        context = context1;
        clientToken = s;
        applicationId = s2;
        specifiedSession = session;
    }

    private static String buildJSONForEvent(String s, double d, Bundle bundle)
    {
        JSONObject jsonobject;
        String s1;
        Object obj;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("_eventName", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            notifyDeveloperError(s.toString());
            return null;
        }
        if (d == 1.0D)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        jsonobject.put("_valueToSum", d);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        for (s = bundle.keySet().iterator(); s.hasNext(); jsonobject.put(s1, obj))
        {
            s1 = (String)s.next();
            obj = bundle.get(s1);
            if (!(obj instanceof String) && !(obj instanceof Number))
            {
                notifyDeveloperError(String.format("Parameter '%s' must be a string or a numeric type.", new Object[] {
                    s1
                }));
            }
        }

        s = new JSONArray();
        s.put(jsonobject);
        s = s.toString();
        return s;
    }

    private void logEventNow(final String eventName, final double valueToSum, final Bundle parameters)
    {
        Settings.getExecutor().execute(new Runnable() {

            final InsightsLogger this$0;
            final String val$eventName;
            final Bundle val$parameters;
            final double val$valueToSum;

            public void run()
            {
                String s = InsightsLogger.buildJSONForEvent(eventName, valueToSum, parameters);
                if (s != null)
                {
                    Object obj = com.facebook.model.GraphObject.Factory.create();
                    ((GraphObject) (obj)).setProperty("event", "CUSTOM_APP_EVENTS");
                    ((GraphObject) (obj)).setProperty("custom_events", s);
                    if (Utility.queryAppAttributionSupportAndWait(applicationId))
                    {
                        String s1 = Settings.getAttributionId(context.getContentResolver());
                        if (s1 != null)
                        {
                            ((GraphObject) (obj)).setProperty("attribution", s1);
                        }
                    }
                    String s2 = String.format("%s/activities", new Object[] {
                        applicationId
                    });
                    try
                    {
                        obj = Request.newPostRequest(sessionToLogTo(), s2, ((GraphObject) (obj)), null).executeAndWait();
                        if (((Response) (obj)).getError() != null && ((Response) (obj)).getError().getErrorCode() != -1)
                        {
                            InsightsLogger.notifyDeveloperError(String.format("Error publishing Insights event '%s'\n  Response: %s\n  Error: %s", new Object[] {
                                s, ((Response) (obj)).toString(), ((Response) (obj)).getError().toString()
                            }));
                            return;
                        }
                    }
                    catch (Exception exception)
                    {
                        Utility.logd("Insights-exception: ", exception);
                        return;
                    }
                }
            }

            
            {
                this$0 = InsightsLogger.this;
                eventName = s;
                valueToSum = d;
                parameters = bundle;
                super();
            }
        });
    }

    public static InsightsLogger newLogger(Context context1, String s)
    {
        return new InsightsLogger(context1, s, null, null);
    }

    public static InsightsLogger newLogger(Context context1, String s, String s1)
    {
        return new InsightsLogger(context1, s, s1, null);
    }

    public static InsightsLogger newLogger(Context context1, String s, String s1, Session session)
    {
        return new InsightsLogger(context1, s, s1, session);
    }

    private static void notifyDeveloperError(String s)
    {
        Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "Insights", s);
    }

    private Session sessionToLogTo()
    {
        this;
        JVM INSTR monitorenter ;
        Session session1 = specifiedSession;
        Session session;
        if (session1 == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        session = session1;
        if (session1.isOpened())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        session = Session.getActiveSession();
        if (session == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (!session.isOpened())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        session1 = session;
        if (session.getAccessToken() != null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (appAuthSession == null)
        {
            AccessToken accesstoken = AccessToken.createFromString(String.format("%s|%s", new Object[] {
                applicationId, clientToken
            }), null, AccessTokenSource.CLIENT_TOKEN);
            appAuthSession = new Session(null, applicationId, new NonCachingTokenCachingStrategy(), false);
            appAuthSession.open(accesstoken, null);
        }
        session1 = appAuthSession;
        this;
        JVM INSTR monitorexit ;
        return session1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void logConversionPixel(String s, double d)
    {
        if (s == null)
        {
            notifyDeveloperError("pixelID cannot be null");
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("fb_offsite_pixel_id", s);
            bundle.putDouble("fb_offsite_pixel_value", d);
            logEventNow("fb_log_offsite_pixel", d, bundle);
            return;
        }
    }

    public void logPurchase(BigDecimal bigdecimal, Currency currency)
    {
        logPurchase(bigdecimal, currency, null);
    }

    public void logPurchase(BigDecimal bigdecimal, Currency currency, Bundle bundle)
    {
        if (bigdecimal == null)
        {
            notifyDeveloperError("purchaseAmount cannot be null");
            return;
        }
        if (currency == null)
        {
            notifyDeveloperError("currency cannot be null");
            return;
        }
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        bundle1.putString("fb_currency", currency.getCurrencyCode());
        logEventNow("fb_mobile_purchase", bigdecimal.doubleValue(), bundle1);
    }






}
