// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.model.GraphObject;

// Referenced classes of package com.facebook:
//            InsightsLogger, Settings, Request, Response, 
//            FacebookRequestError

class val.parameters
    implements Runnable
{

    final InsightsLogger this$0;
    final String val$eventName;
    final Bundle val$parameters;
    final double val$valueToSum;

    public void run()
    {
        String s = InsightsLogger.access$000(val$eventName, val$valueToSum, val$parameters);
        if (s != null)
        {
            Object obj = com.facebook.model.ry.create();
            ((GraphObject) (obj)).setProperty("event", "CUSTOM_APP_EVENTS");
            ((GraphObject) (obj)).setProperty("custom_events", s);
            if (Utility.queryAppAttributionSupportAndWait(InsightsLogger.access$100(InsightsLogger.this)))
            {
                String s1 = Settings.getAttributionId(InsightsLogger.access$200(InsightsLogger.this).getContentResolver());
                if (s1 != null)
                {
                    ((GraphObject) (obj)).setProperty("attribution", s1);
                }
            }
            String s2 = String.format("%s/activities", new Object[] {
                InsightsLogger.access$100(InsightsLogger.this)
            });
            try
            {
                obj = Request.newPostRequest(InsightsLogger.access$300(InsightsLogger.this), s2, ((GraphObject) (obj)), null).executeAndWait();
                if (((Response) (obj)).getError() != null && ((Response) (obj)).getError().getErrorCode() != -1)
                {
                    InsightsLogger.access$400(String.format("Error publishing Insights event '%s'\n  Response: %s\n  Error: %s", new Object[] {
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

    ror()
    {
        this$0 = final_insightslogger;
        val$eventName = s;
        val$valueToSum = d;
        val$parameters = Bundle.this;
        super();
    }
}
