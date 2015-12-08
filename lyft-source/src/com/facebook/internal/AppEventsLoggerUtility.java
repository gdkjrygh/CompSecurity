// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility, Logger, AttributionIdentifiers

public class AppEventsLoggerUtility
{

    private static final Map API_ACTIVITY_TYPE_TO_STRING = new HashMap() {
            private class GraphAPIActivityType extends Enum
            {

                private static final GraphAPIActivityType $VALUES[];
                public static final GraphAPIActivityType CUSTOM_APP_EVENTS;
                public static final GraphAPIActivityType MOBILE_INSTALL_EVENT;

                public static GraphAPIActivityType valueOf(String s)
                {
                    return (GraphAPIActivityType)Enum.valueOf(com/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType, s);
                }

                public static GraphAPIActivityType[] values()
                {
                    return (GraphAPIActivityType[])$VALUES.clone();
                }

                static 
                {
                    MOBILE_INSTALL_EVENT = new GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
                    CUSTOM_APP_EVENTS = new GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
                    $VALUES = (new GraphAPIActivityType[] {
                        MOBILE_INSTALL_EVENT, CUSTOM_APP_EVENTS
                    });
                }

                private GraphAPIActivityType(String s, int i)
                {
                    super(s, i);
                }
            }


            
            {
                put(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
                put(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
            }
    };

    public AppEventsLoggerUtility()
    {
    }

    public static JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType graphapiactivitytype, AttributionIdentifiers attributionidentifiers, String s, boolean flag, Context context)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(graphapiactivitytype));
        Utility.setAppEventAttributionParameters(jsonobject, attributionidentifiers, s, flag);
        try
        {
            Utility.setAppEventExtendedDeviceInfoParameters(jsonobject, context);
        }
        // Misplaced declaration of an exception variable
        catch (GraphAPIActivityType graphapiactivitytype)
        {
            Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] {
                graphapiactivitytype.toString()
            });
        }
        jsonobject.put("application_package_name", context.getPackageName());
        return jsonobject;
    }

}
