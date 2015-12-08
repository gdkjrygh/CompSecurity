// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMSDK, MMLog, MMJSResponse, 
//            MMWebView, HandShake, MMRequest

class BridgeMMDevice extends MMJSObject
{

    private static final String CALL = "call";
    private static final String COMPOSE_EMAIL = "composeEmail";
    private static final String COMPOSE_SMS = "composeSms";
    private static final String ENABLE_HARDWARE_ACCEL = "enableHardwareAcceleration";
    private static final String GET_AVAIL_SCHEMES = "getAvailableSchemes";
    private static final String GET_INFO = "getInfo";
    private static final String GET_LOCATION = "getLocation";
    private static final String GET_ORIENTATION = "getOrientation";
    private static final String IS_SCHEME_AVAIL = "isSchemeAvailable";
    private static final String OPEN_APP_STORE = "openAppStore";
    private static final String OPEN_URL = "openUrl";
    private static final String SET_MMDID = "setMMDID";
    private static final String SHOW_MAP = "showMap";
    private static final String TAG = "BridgeMMDevice";
    private static final String TWEET = "tweet";

    BridgeMMDevice()
    {
    }

    static JSONObject getDeviceInfo(Context context)
    {
        JSONArray jsonarray = null;
        Object obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("sdkVersion", "5.4.0-c325424f.a");
            ((JSONObject) (obj)).put("connection", MMSDK.getConnectionType(context));
            ((JSONObject) (obj)).put("platform", "Android");
            if (android.os.Build.VERSION.RELEASE != null)
            {
                ((JSONObject) (obj)).put("version", android.os.Build.VERSION.RELEASE);
            }
            if (Build.MODEL != null)
            {
                ((JSONObject) (obj)).put("device", Build.MODEL);
            }
            ((JSONObject) (obj)).put("mmdid", MMSDK.getMMdid(context));
            context = context.getResources().getDisplayMetrics();
            ((JSONObject) (obj)).put("density", new Float(((DisplayMetrics) (context)).density));
            ((JSONObject) (obj)).put("height", new Integer(((DisplayMetrics) (context)).heightPixels));
            ((JSONObject) (obj)).put("width", new Integer(((DisplayMetrics) (context)).widthPixels));
            context = Locale.getDefault();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        ((JSONObject) (obj)).put("language", context.getLanguage());
        ((JSONObject) (obj)).put("country", context.getCountry());
        context = new JSONObject();
        try
        {
            context.put("name", "MAC-ID");
            context.put("path", "/");
            context.put("value", MMSDK.macId);
            jsonarray = new JSONArray();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonarray.put(context);
        ((JSONObject) (obj)).put("cookies", jsonarray);
        return ((JSONObject) (obj));
        context;
        obj = jsonarray;
_L2:
        MMLog.e("BridgeMMDevice", "Bridge getting deviceInfo json exception: ", context);
        return ((JSONObject) (obj));
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public MMJSResponse call(Map map)
    {
        Context context = (Context)contextRef.get();
        Object obj = (String)map.get("number");
        if (context != null && obj != null)
        {
            MMLog.d("BridgeMMDevice", String.format("Dialing Phone: %s", new Object[] {
                obj
            }));
            if (Boolean.parseBoolean((String)map.get("dial")) && context.checkCallingOrSelfPermission("android.permission.CALL_PHONE") == 0)
            {
                obj = new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder()).append("tel:").append(((String) (obj))).toString()));
            } else
            {
                obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("tel:").append(((String) (obj))).toString()));
            }
            Utils.IntentUtils.startActivity(context, ((Intent) (obj)));
            MMSDK.Event.intentStarted(context, "tel", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    public MMJSResponse composeEmail(Map map)
    {
        Context context = (Context)contextRef.get();
        String s = (String)map.get("recipient");
        String s1 = (String)map.get("subject");
        String s2 = (String)map.get("message");
        if (context != null)
        {
            MMLog.d("BridgeMMDevice", "Creating email");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("plain/text");
            if (s != null)
            {
                intent.putExtra("android.intent.extra.EMAIL", s.split(","));
            }
            if (s1 != null)
            {
                intent.putExtra("android.intent.extra.SUBJECT", s1);
            }
            if (s2 != null)
            {
                intent.putExtra("android.intent.extra.TEXT", s2);
            }
            Utils.IntentUtils.startActivity(context, intent);
            MMSDK.Event.intentStarted(context, "email", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    public MMJSResponse composeSms(Map map)
    {
        Context context = (Context)contextRef.get();
        Object obj = (String)map.get("number");
        String s = (String)map.get("message");
        if (context != null && obj != null)
        {
            MMLog.d("BridgeMMDevice", String.format("Creating sms: %s", new Object[] {
                obj
            }));
            obj = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("sms:").append(((String) (obj))).toString()));
            if (s != null)
            {
                ((Intent) (obj)).putExtra("sms_body", s);
            }
            Utils.IntentUtils.startActivity(context, ((Intent) (obj)));
            MMSDK.Event.intentStarted(context, "sms", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            return MMJSResponse.responseWithSuccess("SMS Sent");
        } else
        {
            return null;
        }
    }

    public MMJSResponse enableHardwareAcceleration(Map map)
    {
        MMLog.d("BridgeMMDevice", (new StringBuilder()).append("hardware accel call").append(map).toString());
        map = (String)map.get("enabled");
        MMWebView mmwebview = (MMWebView)mmWebViewRef.get();
        if (mmwebview != null && mmwebview != null)
        {
            if (Boolean.parseBoolean(map))
            {
                mmwebview.enableHardwareAcceleration();
            } else
            {
                mmwebview.disableAllAcceleration();
            }
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if ("call".equals(s))
        {
            mmjsresponse = call(map);
        } else
        {
            if ("composeEmail".equals(s))
            {
                return composeEmail(map);
            }
            if ("composeSms".equals(s))
            {
                return composeSms(map);
            }
            if ("enableHardwareAcceleration".equals(s))
            {
                return enableHardwareAcceleration(map);
            }
            if ("getAvailableSchemes".equals(s))
            {
                return getAvailableSchemes(map);
            }
            if ("getInfo".equals(s))
            {
                return getInfo(map);
            }
            if ("getLocation".equals(s))
            {
                return getLocation(map);
            }
            if ("getOrientation".equals(s))
            {
                return getOrientation(map);
            }
            if ("isSchemeAvailable".equals(s))
            {
                return isSchemeAvailable(map);
            }
            if ("openAppStore".equals(s))
            {
                return openAppStore(map);
            }
            if ("openUrl".equals(s))
            {
                return openUrl(map);
            }
            if ("setMMDID".equals(s))
            {
                return setMMDID(map);
            }
            if ("showMap".equals(s))
            {
                return showMap(map);
            }
            if ("tweet".equals(s))
            {
                return tweet(map);
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse getAvailableSchemes(Map map)
    {
        map = (Context)contextRef.get();
        if (map != null)
        {
            HandShake handshake = HandShake.sharedHandShake(map);
            MMJSResponse mmjsresponse = new MMJSResponse();
            mmjsresponse.result = 1;
            mmjsresponse.response = handshake.getSchemesJSONArray(map);
            return mmjsresponse;
        } else
        {
            return null;
        }
    }

    public MMJSResponse getInfo(Map map)
    {
        map = (Context)contextRef.get();
        if (map != null)
        {
            MMJSResponse mmjsresponse = new MMJSResponse();
            mmjsresponse.result = 1;
            mmjsresponse.response = getDeviceInfo(map);
            return mmjsresponse;
        } else
        {
            return null;
        }
    }

    public MMJSResponse getLocation(Map map)
    {
        if (MMRequest.location == null) goto _L2; else goto _L1
_L1:
        Object obj = null;
        map = new JSONObject();
        map.put("lat", Double.toString(MMRequest.location.getLatitude()));
        map.put("long", Double.toString(MMRequest.location.getLongitude()));
        if (MMRequest.location.hasAccuracy())
        {
            map.put("ha", Float.toString(MMRequest.location.getAccuracy()));
            map.put("va", Float.toString(MMRequest.location.getAccuracy()));
        }
        if (MMRequest.location.hasSpeed())
        {
            map.put("spd", Float.toString(MMRequest.location.getSpeed()));
        }
        if (MMRequest.location.hasBearing())
        {
            map.put("brg", Float.toString(MMRequest.location.getBearing()));
        }
        if (MMRequest.location.hasAltitude())
        {
            map.put("alt", Double.toString(MMRequest.location.getAltitude()));
        }
        map.put("tslr", Long.toString(MMRequest.location.getTime()));
_L3:
        obj = new MMJSResponse();
        obj.result = 1;
        obj.response = map;
        return ((MMJSResponse) (obj));
        JSONException jsonexception;
        jsonexception;
        map = ((Map) (obj));
        obj = jsonexception;
_L4:
        MMLog.e("BridgeMMDevice", "Bridge getLocation json exception: ", ((Throwable) (obj)));
        if (true) goto _L3; else goto _L2
_L2:
        return MMJSResponse.responseWithError("location object has not been set");
        obj;
          goto _L4
    }

    public MMJSResponse getOrientation(Map map)
    {
        map = (Context)contextRef.get();
        if (map != null)
        {
            int j = map.getResources().getConfiguration().orientation;
            int i = j;
            if (j == 0)
            {
                i = ((WindowManager)map.getSystemService("window")).getDefaultDisplay().getOrientation();
            }
            map = new MMJSResponse();
            map.result = 1;
            switch (i)
            {
            default:
                map.response = "portrait";
                return map;

            case 2: // '\002'
                map.response = "landscape";
                break;
            }
            return map;
        } else
        {
            return null;
        }
    }

    public MMJSResponse isSchemeAvailable(Map map)
    {
        Object obj = (String)map.get("scheme");
        map = ((Map) (obj));
        if (!((String) (obj)).contains(":"))
        {
            map = (new StringBuilder()).append(((String) (obj))).append(":").toString();
        }
        obj = (Context)contextRef.get();
        if (map != null && obj != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(map));
            if (((Context) (obj)).getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0)
            {
                return MMJSResponse.responseWithSuccess(map);
            }
        }
        return MMJSResponse.responseWithError(map);
    }

    public MMJSResponse openAppStore(Map map)
    {
        Context context = (Context)contextRef.get();
        String s = (String)map.get("appId");
        String s1 = (String)map.get("referrer");
        if (context != null && s != null)
        {
            MMLog.d("BridgeMMDevice", String.format("Opening marketplace: %s", new Object[] {
                s
            }));
            Intent intent = new Intent("android.intent.action.VIEW");
            if (Build.MANUFACTURER.equals("Amazon"))
            {
                intent.setData(Uri.parse(String.format("amzn://apps/android?p=%s", new Object[] {
                    s
                })));
            } else
            if (s1 != null)
            {
                intent.setData(Uri.parse(String.format("market://details?id=%s&referrer=%s", new Object[] {
                    s, URLEncoder.encode(s1)
                })));
            } else
            {
                intent.setData(Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString()));
            }
            MMSDK.Event.intentStarted(context, "market", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            Utils.IntentUtils.startActivity(context, intent);
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return null;
        }
    }

    public MMJSResponse openUrl(Map map)
    {
        Context context = (Context)contextRef.get();
        Object obj = (String)map.get("url");
        if (context != null && obj != null)
        {
            MMLog.d("BridgeMMDevice", String.format("Opening: %s", new Object[] {
                obj
            }));
            obj = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
            if (((Intent) (obj)).getScheme().startsWith("http") || ((Intent) (obj)).getScheme().startsWith("https"))
            {
                MMSDK.Event.intentStarted(context, "browser", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            }
            Utils.IntentUtils.startActivity(context, ((Intent) (obj)));
            return MMJSResponse.responseWithSuccess("Overlay opened");
        } else
        {
            return MMJSResponse.responseWithError("URL could not be opened");
        }
    }

    public MMJSResponse setMMDID(Map map)
    {
        map = (String)map.get("mmdid");
        Context context = (Context)contextRef.get();
        if (context != null)
        {
            HandShake.sharedHandShake(context).setMMdid(context, map);
            return MMJSResponse.responseWithSuccess("MMDID is set");
        } else
        {
            return null;
        }
    }

    public MMJSResponse showMap(Map map)
    {
        Context context = (Context)contextRef.get();
        String s = (String)map.get("location");
        if (context != null && s != null)
        {
            MMLog.d("BridgeMMDevice", String.format("Launching Google Maps: %s", new Object[] {
                s
            }));
            Utils.IntentUtils.startActivity(context, new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:").append(s).toString())));
            MMSDK.Event.intentStarted(context, "geo", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            return MMJSResponse.responseWithSuccess("Map successfully opened");
        } else
        {
            return null;
        }
    }

    public MMJSResponse tweet(Map map)
    {
        return null;
    }
}
