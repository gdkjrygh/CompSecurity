// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bolts:
//            AppLinks

public class MeasurementEvent
{

    public static final String APP_LINK_NAVIGATE_IN_EVENT_NAME = "al_nav_in";
    public static final String APP_LINK_NAVIGATE_OUT_EVENT_NAME = "al_nav_out";
    public static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";
    public static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";
    public static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";
    private Context appContext;
    private Bundle args;
    private String name;

    private MeasurementEvent(Context context, String s, Bundle bundle)
    {
        appContext = context.getApplicationContext();
        name = s;
        args = bundle;
    }

    private static Bundle getApplinkLogData(Context context, String s, Bundle bundle, Intent intent)
    {
        Bundle bundle1;
        bundle1 = new Bundle();
        context = intent.resolveActivity(context.getPackageManager());
        if (context != null)
        {
            bundle1.putString("class", context.getShortClassName());
        }
        if (!"al_nav_out".equals(s)) goto _L2; else goto _L1
_L1:
        if (context != null)
        {
            bundle1.putString("package", context.getPackageName());
        }
        if (intent.getData() != null)
        {
            bundle1.putString("outputURL", intent.getData().toString());
        }
        if (intent.getScheme() != null)
        {
            bundle1.putString("outputURLScheme", intent.getScheme());
        }
_L7:
        context = bundle.keySet().iterator();
_L5:
        Iterator iterator;
label0:
        {
            if (!context.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)context.next();
            intent = ((Intent) (bundle.get(s)));
            if (intent instanceof Bundle)
            {
                iterator = ((Bundle)intent).keySet().iterator();
                break label0;
            }
        }
          goto _L3
_L2:
        if ("al_nav_in".equals(s))
        {
            if (intent.getData() != null)
            {
                bundle1.putString("inputURL", intent.getData().toString());
            }
            if (intent.getScheme() != null)
            {
                bundle1.putString("inputURLScheme", intent.getScheme());
            }
        }
        continue; /* Loop/switch isn't completed */
        while (true) 
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s1 = (String)iterator.next();
            String s2 = objectToJSONString(((Bundle)intent).get(s1));
            if (s.equals("referer_app_link"))
            {
                if (s1.equalsIgnoreCase("url"))
                {
                    bundle1.putString("refererURL", s2);
                    continue;
                }
                if (s1.equalsIgnoreCase("app_name"))
                {
                    bundle1.putString("refererAppName", s2);
                    continue;
                }
                if (s1.equalsIgnoreCase("package"))
                {
                    bundle1.putString("sourceApplication", s2);
                    continue;
                }
            }
            bundle1.putString((new StringBuilder()).append(s).append("/").append(s1).toString(), s2);
        }
_L3:
        intent = objectToJSONString(intent);
        if (s.equals("target_url"))
        {
            s = Uri.parse(intent);
            bundle1.putString("targetURL", s.toString());
            bundle1.putString("targetURLHost", s.getHost());
        } else
        {
            bundle1.putString(s, intent);
        }
        if (true) goto _L5; else goto _L4
_L4:
        return bundle1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String objectToJSONString(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject))
        {
            return obj.toString();
        }
        try
        {
            if (obj instanceof Collection)
            {
                return (new JSONArray((Collection)obj)).toString();
            }
            if (obj instanceof Map)
            {
                return (new JSONObject((Map)obj)).toString();
            }
            obj = obj.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return ((String) (obj));
    }

    private void sendBroadcast()
    {
        if (name == null)
        {
            Log.d(getClass().getName(), "Event name is required");
        }
        try
        {
            Object obj = Class.forName("android.support.v4.content.LocalBroadcastManager");
            Object obj1 = ((Class) (obj)).getMethod("getInstance", new Class[] {
                android/content/Context
            });
            obj = ((Class) (obj)).getMethod("sendBroadcast", new Class[] {
                android/content/Intent
            });
            obj1 = ((Method) (obj1)).invoke(null, new Object[] {
                appContext
            });
            Intent intent = new Intent("com.parse.bolts.measurement_event");
            intent.putExtra("event_name", name);
            intent.putExtra("event_args", args);
            ((Method) (obj)).invoke(obj1, new Object[] {
                intent
            });
            return;
        }
        catch (Exception exception)
        {
            Log.d(getClass().getName(), "LocalBroadcastManager in android support library is required to raise bolts event.");
        }
    }

    static void sendBroadcastEvent(Context context, String s, Intent intent, Map map)
    {
        Object obj;
        Object obj1;
        obj1 = new Bundle();
        obj = obj1;
        if (intent == null) goto _L2; else goto _L1
_L1:
        obj = AppLinks.getAppLinkData(intent);
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = getApplinkLogData(context, s, ((Bundle) (obj)), intent);
_L2:
        if (map != null)
        {
            for (intent = map.keySet().iterator(); intent.hasNext(); ((Bundle) (obj)).putString(((String) (obj1)), (String)map.get(obj1)))
            {
                obj1 = (String)intent.next();
            }

        }
        break MISSING_BLOCK_LABEL_187;
_L4:
        obj = intent.getData();
        if (obj != null)
        {
            ((Bundle) (obj1)).putString("intentData", ((Uri) (obj)).toString());
        }
        intent = intent.getExtras();
        obj = obj1;
        if (intent != null)
        {
            Iterator iterator = intent.keySet().iterator();
            do
            {
                obj = obj1;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (String)iterator.next();
                ((Bundle) (obj1)).putString(((String) (obj)), objectToJSONString(intent.get(((String) (obj)))));
            } while (true);
        }
        if (true) goto _L2; else goto _L5
_L5:
        (new MeasurementEvent(context, s, ((Bundle) (obj)))).sendBroadcast();
        return;
    }
}
