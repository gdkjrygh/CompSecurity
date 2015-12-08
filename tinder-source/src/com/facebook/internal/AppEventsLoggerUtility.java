// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            m, h, a

public final class AppEventsLoggerUtility
{
    public static final class GraphAPIActivityType extends Enum
    {

        public static final GraphAPIActivityType a;
        public static final GraphAPIActivityType b;
        private static final GraphAPIActivityType c[];

        public static GraphAPIActivityType valueOf(String s)
        {
            return (GraphAPIActivityType)Enum.valueOf(com/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType, s);
        }

        public static GraphAPIActivityType[] values()
        {
            return (GraphAPIActivityType[])c.clone();
        }

        static 
        {
            a = new GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
            b = new GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
            c = (new GraphAPIActivityType[] {
                a, b
            });
        }

        private GraphAPIActivityType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Map a = new HashMap() {

            
            {
                put(GraphAPIActivityType.a, "MOBILE_APP_INSTALL");
                put(GraphAPIActivityType.b, "CUSTOM_APP_EVENTS");
            }
    };

    public static JSONObject a(GraphAPIActivityType graphapiactivitytype, a a1, String s, boolean flag, Context context)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("event", a.get(graphapiactivitytype));
        m.a(jsonobject, a1, s, flag);
        try
        {
            m.a(jsonobject, context);
        }
        // Misplaced declaration of an exception variable
        catch (GraphAPIActivityType graphapiactivitytype)
        {
            h.a(LoggingBehavior.e, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] {
                graphapiactivitytype.toString()
            });
        }
        jsonobject.put("application_package_name", context.getPackageName());
        return jsonobject;
    }

}
