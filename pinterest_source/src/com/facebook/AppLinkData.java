// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookException, Settings, Request, Response

public class AppLinkData
{

    private static final String APPLINK_BRIDGE_ARGS_KEY = "bridge_args";
    private static final String APPLINK_METHOD_ARGS_KEY = "method_args";
    private static final String APPLINK_VERSION_KEY = "version";
    public static final String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
    public static final String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
    public static final String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
    public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
    private static final String BRIDGE_ARGS_METHOD_KEY = "method";
    private static final String BUNDLE_AL_APPLINK_DATA_KEY = "al_applink_data";
    static final String BUNDLE_APPLINK_ARGS_KEY = "com.facebook.platform.APPLINK_ARGS";
    private static final String DEFERRED_APP_LINK_ARGS_FIELD = "applink_args";
    private static final String DEFERRED_APP_LINK_CLASS_FIELD = "applink_class";
    private static final String DEFERRED_APP_LINK_CLICK_TIME_FIELD = "click_time";
    private static final String DEFERRED_APP_LINK_EVENT = "DEFERRED_APP_LINK";
    private static final String DEFERRED_APP_LINK_PATH = "%s/activities";
    private static final String DEFERRED_APP_LINK_URL_FIELD = "applink_url";
    private static final String METHOD_ARGS_REF_KEY = "ref";
    private static final String METHOD_ARGS_TARGET_URL_KEY = "target_url";
    private static final String REFERER_DATA_REF_KEY = "fb_ref";
    private static final String TAG = com/facebook/AppLinkData.getCanonicalName();
    private Bundle argumentBundle;
    private JSONObject arguments;
    private String ref;
    private Uri targetUri;

    private AppLinkData()
    {
    }

    public static AppLinkData createFromActivity(Activity activity)
    {
        Validate.notNull(activity, "activity");
        Intent intent = activity.getIntent();
        Object obj;
        if (intent == null)
        {
            obj = null;
        } else
        {
            obj = createFromAlApplinkData(intent);
            activity = ((Activity) (obj));
            if (obj == null)
            {
                activity = createFromJson(intent.getStringExtra("com.facebook.platform.APPLINK_ARGS"));
            }
            obj = activity;
            if (activity == null)
            {
                return createFromUri(intent.getData());
            }
        }
        return ((AppLinkData) (obj));
    }

    private static AppLinkData createFromAlApplinkData(Intent intent)
    {
        Bundle bundle = intent.getBundleExtra("al_applink_data");
        if (bundle == null)
        {
            return null;
        }
        AppLinkData applinkdata = new AppLinkData();
        applinkdata.targetUri = intent.getData();
        if (applinkdata.targetUri == null)
        {
            intent = bundle.getString("target_url");
            if (intent != null)
            {
                applinkdata.targetUri = Uri.parse(intent);
            }
        }
        applinkdata.argumentBundle = bundle;
        applinkdata.arguments = null;
        intent = bundle.getBundle("referer_data");
        if (intent != null)
        {
            applinkdata.ref = intent.getString("fb_ref");
        }
        return applinkdata;
    }

    private static AppLinkData createFromJson(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        s = new JSONObject(s);
        obj = s.getString("version");
        if (!s.getJSONObject("bridge_args").getString("method").equals("applink") || !((String) (obj)).equals("2")) goto _L1; else goto _L3
_L3:
        obj = new AppLinkData();
        obj.arguments = s.getJSONObject("method_args");
        if (!((AppLinkData) (obj)).arguments.has("ref")) goto _L5; else goto _L4
_L4:
        obj.ref = ((AppLinkData) (obj)).arguments.getString("ref");
_L7:
        if (((AppLinkData) (obj)).arguments.has("target_url"))
        {
            obj.targetUri = Uri.parse(((AppLinkData) (obj)).arguments.getString("target_url"));
        }
        obj.argumentBundle = toBundle(((AppLinkData) (obj)).arguments);
        return ((AppLinkData) (obj));
_L5:
        if (!((AppLinkData) (obj)).arguments.has("referer_data")) goto _L7; else goto _L6
_L6:
        s = ((AppLinkData) (obj)).arguments.getJSONObject("referer_data");
        if (s.has("fb_ref"))
        {
            obj.ref = s.getString("fb_ref");
        }
          goto _L7
        s;
        Log.d(TAG, "Unable to parse AppLink JSON", s);
        return null;
        s;
        Log.d(TAG, "Unable to parse AppLink JSON", s);
        return null;
    }

    private static AppLinkData createFromUri(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            AppLinkData applinkdata = new AppLinkData();
            applinkdata.targetUri = uri;
            return applinkdata;
        }
    }

    public static void fetchDeferredAppLinkData(Context context, CompletionHandler completionhandler)
    {
        fetchDeferredAppLinkData(context, null, completionhandler);
    }

    public static void fetchDeferredAppLinkData(final Context applicationContext, String s, final CompletionHandler completionHandler)
    {
        Validate.notNull(applicationContext, "context");
        Validate.notNull(completionHandler, "completionHandler");
        final String applicationIdCopy = s;
        if (s == null)
        {
            applicationIdCopy = Utility.getMetadataApplicationId(applicationContext);
        }
        Validate.notNull(applicationIdCopy, "applicationId");
        applicationContext = applicationContext.getApplicationContext();
        Settings.getExecutor().execute(new _cls1());
    }

    private static void fetchDeferredAppLinkFromServer(Context context, String s, CompletionHandler completionhandler)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = com.facebook.model.GraphObject.Factory.create();
        ((GraphObject) (obj)).setProperty("event", "DEFERRED_APP_LINK");
        Utility.setAppEventAttributionParameters(((GraphObject) (obj)), AttributionIdentifiers.getAttributionIdentifiers(context), Utility.getHashedDeviceAndAppID(context, s), Settings.getLimitEventAndDataUsage(context));
        ((GraphObject) (obj)).setProperty("application_package_name", context.getPackageName());
        s = String.format("%s/activities", new Object[] {
            s
        });
        context = obj2;
        s = Request.newPostRequest(null, s, ((GraphObject) (obj)), null).executeAndWait().getGraphObject();
        if (s == null) goto _L2; else goto _L1
_L1:
        context = obj2;
        obj = s.getInnerJSONObject();
_L8:
        s = obj1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        context = obj2;
        String s3 = ((JSONObject) (obj)).optString("applink_args");
        context = obj2;
        long l = ((JSONObject) (obj)).optLong("click_time", -1L);
        context = obj2;
        String s1 = ((JSONObject) (obj)).optString("applink_class");
        context = obj2;
        String s2 = ((JSONObject) (obj)).optString("applink_url");
        s = obj1;
        context = obj2;
        if (TextUtils.isEmpty(s3)) goto _L4; else goto _L5
_L5:
        context = obj2;
        obj = createFromJson(s3);
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        context = ((Context) (obj));
        if (((AppLinkData) (obj)).arguments == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        context = ((Context) (obj));
        ((AppLinkData) (obj)).arguments.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", l);
        context = ((Context) (obj));
        if (((AppLinkData) (obj)).argumentBundle == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        context = ((Context) (obj));
        ((AppLinkData) (obj)).argumentBundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(l));
_L9:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        context = ((Context) (obj));
        if (((AppLinkData) (obj)).arguments == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        context = ((Context) (obj));
        ((AppLinkData) (obj)).arguments.put("com.facebook.platform.APPLINK_NATIVE_CLASS", s1);
        context = ((Context) (obj));
        if (((AppLinkData) (obj)).argumentBundle == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        context = ((Context) (obj));
        ((AppLinkData) (obj)).argumentBundle.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", s1);
_L10:
        s = ((String) (obj));
        if (s2 == null) goto _L4; else goto _L6
_L6:
        context = ((Context) (obj));
        if (((AppLinkData) (obj)).arguments == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        context = ((Context) (obj));
        ((AppLinkData) (obj)).arguments.put("com.facebook.platform.APPLINK_NATIVE_URL", s2);
        s = ((String) (obj));
        context = ((Context) (obj));
        if (((AppLinkData) (obj)).argumentBundle == null) goto _L4; else goto _L7
_L7:
        context = ((Context) (obj));
        ((AppLinkData) (obj)).argumentBundle.putString("com.facebook.platform.APPLINK_NATIVE_URL", s2);
        s = ((String) (obj));
_L4:
        completionhandler.onDeferredAppLinkDataFetched(s);
        return;
_L2:
        obj = null;
          goto _L8
        context;
        context = ((Context) (obj));
        Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
          goto _L9
        s;
        Utility.logd(TAG, "Unable to fetch deferred applink from server");
        s = context;
          goto _L4
        context;
        context = ((Context) (obj));
        Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
          goto _L10
        context;
        context = ((Context) (obj));
        Log.d(TAG, "Unable to put tap time in AppLinkData.arguments");
        s = ((String) (obj));
          goto _L4
    }

    private static Bundle toBundle(JSONObject jsonobject)
    {
        Bundle bundle = new Bundle();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = jsonobject.get(s);
            if (obj instanceof JSONObject)
            {
                bundle.putBundle(s, toBundle((JSONObject)obj));
            } else
            if (obj instanceof JSONArray)
            {
                obj = (JSONArray)obj;
                if (((JSONArray) (obj)).length() == 0)
                {
                    bundle.putStringArray(s, new String[0]);
                } else
                {
                    Object aobj[] = ((Object []) (((JSONArray) (obj)).get(0)));
                    if (aobj instanceof JSONObject)
                    {
                        aobj = new Bundle[((JSONArray) (obj)).length()];
                        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
                        {
                            aobj[i] = toBundle(((JSONArray) (obj)).getJSONObject(i));
                        }

                        bundle.putParcelableArray(s, ((android.os.Parcelable []) (aobj)));
                    } else
                    {
                        if (aobj instanceof JSONArray)
                        {
                            throw new FacebookException("Nested arrays are not supported.");
                        }
                        aobj = new String[((JSONArray) (obj)).length()];
                        for (int j = 0; j < ((JSONArray) (obj)).length(); j++)
                        {
                            aobj[j] = ((JSONArray) (obj)).get(j).toString();
                        }

                        bundle.putStringArray(s, ((String []) (aobj)));
                    }
                }
            } else
            {
                bundle.putString(s, obj.toString());
            }
        }

        return bundle;
    }

    public Bundle getArgumentBundle()
    {
        return argumentBundle;
    }

    public JSONObject getArguments()
    {
        return arguments;
    }

    public String getRef()
    {
        return ref;
    }

    public Bundle getRefererData()
    {
        if (argumentBundle != null)
        {
            return argumentBundle.getBundle("referer_data");
        } else
        {
            return null;
        }
    }

    public Uri getTargetUri()
    {
        return targetUri;
    }



    private class _cls1
        implements Runnable
    {

        final Context val$applicationContext;
        final String val$applicationIdCopy;
        final CompletionHandler val$completionHandler;

        public final void run()
        {
            AppLinkData.fetchDeferredAppLinkFromServer(applicationContext, applicationIdCopy, completionHandler);
        }

        _cls1()
        {
            applicationContext = context;
            applicationIdCopy = s;
            completionHandler = completionhandler;
            super();
        }
    }


    private class CompletionHandler
    {

        public abstract void onDeferredAppLinkDataFetched(AppLinkData applinkdata);
    }

}
