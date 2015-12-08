// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Settings;
import com.facebook.model.GraphObject;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            ImageDownloader, Validate, AttributionIdentifiers

public final class Utility
{
    public static class DialogFeatureConfig
    {

        private String dialogName;
        private Uri fallbackUrl;
        private String featureName;
        private int featureVersionSpec[];

        private static DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
        {
            String s = jsonobject.optString("name");
            String as[];
            if (!Utility.isNullOrEmpty(s))
            {
                if ((as = s.split("\\|")).length == 2)
                {
                    String s1 = as[0];
                    String s2 = as[1];
                    if (!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
                    {
                        String s3 = jsonobject.optString("url");
                        Uri uri = null;
                        if (!Utility.isNullOrEmpty(s3))
                        {
                            uri = Uri.parse(s3);
                        }
                        return new DialogFeatureConfig(s1, s2, uri, parseVersionSpec(jsonobject.optJSONArray("versions")));
                    }
                }
            }
            return null;
        }

        private static int[] parseVersionSpec(JSONArray jsonarray)
        {
            int ai[] = null;
            if (jsonarray == null) goto _L2; else goto _L1
_L1:
            int j;
            int l;
            l = jsonarray.length();
            ai = new int[l];
            j = 0;
_L5:
            if (j < l) goto _L3; else goto _L2
_L2:
            return ai;
_L3:
            int k = jsonarray.optInt(j, -1);
            int i = k;
            if (k == -1)
            {
                String s = jsonarray.optString(j);
                i = k;
                if (!Utility.isNullOrEmpty(s))
                {
                    try
                    {
                        i = Integer.parseInt(s);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        Utility.logd("FacebookSDK", numberformatexception);
                        i = -1;
                    }
                }
            }
            ai[j] = i;
            j++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public String getDialogName()
        {
            return dialogName;
        }

        public Uri getFallbackUrl()
        {
            return fallbackUrl;
        }

        public String getFeatureName()
        {
            return featureName;
        }

        public int[] getVersionSpec()
        {
            return featureVersionSpec;
        }


        private DialogFeatureConfig(String s, String s1, Uri uri, int ai[])
        {
            dialogName = s;
            featureName = s1;
            fallbackUrl = uri;
            featureVersionSpec = ai;
        }
    }

    public static class FetchedAppSettings
    {

        private Map dialogConfigMap;
        private String nuxContent;
        private boolean nuxEnabled;
        private boolean supportsAttribution;
        private boolean supportsImplicitLogging;

        public Map getDialogConfigurations()
        {
            return dialogConfigMap;
        }

        public String getNuxContent()
        {
            return nuxContent;
        }

        public boolean getNuxEnabled()
        {
            return nuxEnabled;
        }

        public boolean supportsAttribution()
        {
            return supportsAttribution;
        }

        public boolean supportsImplicitLogging()
        {
            return supportsImplicitLogging;
        }

        private FetchedAppSettings(boolean flag, boolean flag1, String s, boolean flag2, Map map)
        {
            supportsAttribution = flag;
            supportsImplicitLogging = flag1;
            nuxContent = s;
            nuxEnabled = flag2;
            dialogConfigMap = map;
        }

        FetchedAppSettings(boolean flag, boolean flag1, String s, boolean flag2, Map map, FetchedAppSettings fetchedappsettings)
        {
            this(flag, flag1, s, flag2, map);
        }
    }


    private static final String APPLICATION_FIELDS = "fields";
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final String APP_SETTING_FIELDS[] = {
        "supports_attribution", "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs"
    };
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final String APP_SETTING_SUPPORTS_ATTRIBUTION = "supports_attribution";
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
    private static final String DIALOG_CONFIG_NAME_KEY = "name";
    private static final String DIALOG_CONFIG_URL_KEY = "url";
    private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a1";
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
    static final String LOG_TAG = "FacebookSDK";
    private static final String URL_SCHEME = "https";
    private static final String UTF8 = "UTF-8";
    private static Map fetchedAppSettings = new ConcurrentHashMap();
    private static AsyncTask initialAppSettingsLoadTask;

    public Utility()
    {
    }

    public static boolean areObjectsEqual(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static transient ArrayList arrayList(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        int j = aobj.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(aobj[i]);
            i++;
        } while (true);
    }

    public static transient List asListNoNulls(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aobj.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            Object obj = aobj[i];
            if (obj != null)
            {
                arraylist.add(obj);
            }
            i++;
        } while (true);
    }

    public static Uri buildUri(String s, String s1, Bundle bundle)
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(s);
        builder.path(s1);
        s = bundle.keySet().iterator();
        do
        {
            Object obj;
            do
            {
                if (!s.hasNext())
                {
                    return builder.build();
                }
                s1 = (String)s.next();
                obj = bundle.get(s1);
            } while (!(obj instanceof String));
            builder.appendQueryParameter(s1, (String)obj);
        } while (true);
    }

    public static void clearCaches(Context context)
    {
        ImageDownloader.clearCache(context);
    }

    private static void clearCookiesForDomain(Context context, String s)
    {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String s1 = context.getCookie(s);
        if (s1 == null)
        {
            return;
        }
        String as[] = s1.split(";");
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                context.removeExpiredCookie();
                return;
            }
            String as1[] = as[i].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s, (new StringBuilder(String.valueOf(as1[0].trim()))).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
            i++;
        } while (true);
    }

    public static void clearFacebookCookies(Context context)
    {
        clearCookiesForDomain(context, "facebook.com");
        clearCookiesForDomain(context, ".facebook.com");
        clearCookiesForDomain(context, "https://facebook.com");
        clearCookiesForDomain(context, "https://.facebook.com");
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static String coerceValueIfNullOrEmpty(String s, String s1)
    {
        if (isNullOrEmpty(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    static Map convertJSONObjectToHashMap(JSONObject jsonobject)
    {
        HashMap hashmap;
        JSONArray jsonarray;
        int i;
        hashmap = new HashMap();
        jsonarray = jsonobject.names();
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            return hashmap;
        }
        Object obj1;
        String s;
        s = jsonarray.getString(i);
        obj1 = jsonobject.get(s);
        Object obj = obj1;
        try
        {
            if (obj1 instanceof JSONObject)
            {
                obj = convertJSONObjectToHashMap((JSONObject)obj1);
            }
            hashmap.put(s, obj);
        }
        catch (JSONException jsonexception) { }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void deleteDirectory(File file)
    {
        if (!file.exists())
        {
            return;
        }
        if (!file.isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int j;
        afile = file.listFiles();
        j = afile.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        file.delete();
        return;
_L3:
        deleteDirectory(afile[i]);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void disconnectQuietly(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    public static String getActivityName(Context context)
    {
        if (context == null)
        {
            return "null";
        }
        if (context == context.getApplicationContext())
        {
            return "unknown";
        } else
        {
            return context.getClass().getSimpleName();
        }
    }

    private static GraphObject getAppSettingsQueryResponse(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", APP_SETTING_FIELDS));
        s = Request.newGraphPathRequest(null, s, null);
        s.setSkipClientToken(true);
        s.setParameters(bundle);
        return s.executeAndWait().getGraphObject();
    }

    public static DialogFeatureConfig getDialogFeatureConfig(String s, String s1, String s2)
    {
        if (!isNullOrEmpty(s1) && !isNullOrEmpty(s2))
        {
            if ((s = (FetchedAppSettings)fetchedAppSettings.get(s)) != null && (s = (Map)s.getDialogConfigurations().get(s1)) != null)
            {
                return (DialogFeatureConfig)s.get(s2);
            }
        }
        return null;
    }

    public static String getHashedDeviceAndAppID(Context context, String s)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (context == null)
        {
            return null;
        } else
        {
            return sha1hash((new StringBuilder(String.valueOf(context))).append(s).toString());
        }
    }

    public static String getMetadataApplicationId(Context context)
    {
        Validate.notNull(context, "context");
        Settings.loadDefaultsFromMetadata(context);
        return Settings.getApplicationId();
    }

    public static transient Method getMethodQuietly(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static transient Method getMethodQuietly(String s, String s1, Class aclass[])
    {
        try
        {
            s = getMethodQuietly(Class.forName(s), s1, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static Object getStringPropertyAsJSON(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        s = ((String) (jsonobject.opt(s)));
        jsonobject = s;
        if (s != null)
        {
            jsonobject = s;
            if (s instanceof String)
            {
                jsonobject = ((JSONObject) ((new JSONTokener((String)s)).nextValue()));
            }
        }
        if (jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
        {
            if (s1 != null)
            {
                s = new JSONObject();
                s.putOpt(s1, jsonobject);
                return s;
            } else
            {
                throw new FacebookException("Got an unexpected non-JSON object.");
            }
        } else
        {
            return jsonobject;
        }
    }

    private static String hashBytes(MessageDigest messagedigest, byte abyte0[])
    {
        messagedigest.update(abyte0);
        messagedigest = messagedigest.digest();
        abyte0 = new StringBuilder();
        int j = messagedigest.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return abyte0.toString();
            }
            byte byte0 = messagedigest[i];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
            i++;
        } while (true);
    }

    private static String hashWithAlgorithm(String s, String s1)
    {
        return hashWithAlgorithm(s, s1.getBytes());
    }

    private static String hashWithAlgorithm(String s, byte abyte0[])
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return hashBytes(s, abyte0);
    }

    public static int[] intersectRanges(int ai[], int ai1[])
    {
        int ai2[];
        int l;
        int j1;
        int k1;
        if (ai == null)
        {
            return ai1;
        }
        if (ai1 == null)
        {
            return ai;
        }
        ai2 = new int[ai.length + ai1.length];
        l = 0;
        k1 = 0;
        j1 = 0;
_L5:
        int i = l;
        if (k1 >= ai.length) goto _L2; else goto _L1
_L1:
        if (j1 < ai1.length) goto _L4; else goto _L3
_L3:
        i = l;
_L2:
        return Arrays.copyOf(ai2, i);
_L4:
        int i1 = 0x80000000;
        int l1 = 0x7fffffff;
        int k = ai[k1];
        i = 0x7fffffff;
        int i2 = ai1[j1];
        int j = 0x7fffffff;
        if (k1 < ai.length - 1)
        {
            i = ai[k1 + 1];
        }
        if (j1 < ai1.length - 1)
        {
            j = ai1[j1 + 1];
        }
        if (k < i2)
        {
            if (i > i2)
            {
                i1 = i2;
                if (i > j)
                {
                    i = j;
                    k = j1 + 2;
                    j = k1;
                } else
                {
                    j = k1 + 2;
                    k = j1;
                }
            } else
            {
                j = k1 + 2;
                k = j1;
                i = l1;
            }
        } else
        if (j > k)
        {
            i1 = k;
            if (j > i)
            {
                j = k1 + 2;
                k = j1;
            } else
            {
                i = j;
                k = j1 + 2;
                j = k1;
            }
        } else
        {
            k = j1 + 2;
            j = k1;
            i = l1;
        }
        k1 = j;
        j1 = k;
        if (i1 != 0x80000000)
        {
label0:
            {
                j1 = l + 1;
                ai2[l] = i1;
                if (i == 0x7fffffff)
                {
                    break label0;
                }
                l = j1 + 1;
                ai2[j1] = i;
                k1 = j;
                j1 = k;
            }
        }
          goto _L5
        i = j1;
          goto _L2
    }

    public static transient Object invokeMethodQuietly(Object obj, Method method, Object aobj[])
    {
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isNullOrEmpty(Collection collection)
    {
        return collection == null || collection.size() == 0;
    }

    public static boolean isSubset(Collection collection, Collection collection1)
    {
        if (collection1 == null || collection1.size() == 0)
        {
            return collection == null || collection.size() == 0;
        }
        collection1 = new HashSet(collection1);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return true;
            }
        } while (collection1.contains((Object)collection.next()));
        return false;
    }

    public static void loadAppSettingsAsync(final Context context, final String applicationId)
    {
        if (!isNullOrEmpty(applicationId) && !fetchedAppSettings.containsKey(applicationId) && initialAppSettingsLoadTask == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        final String settingsKey;
        settingsKey = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
            applicationId
        });
        initialAppSettingsLoadTask = new AsyncTask() {

            private final String val$applicationId;
            private final Context val$context;
            private final String val$settingsKey;

            protected transient GraphObject doInBackground(Void avoid[])
            {
                return Utility.getAppSettingsQueryResponse(applicationId);
            }

            protected volatile transient Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected void onPostExecute(GraphObject graphobject)
            {
                if (graphobject != null)
                {
                    graphobject = graphobject.getInnerJSONObject();
                    Utility.parseAppSettingsFromJSON(applicationId, graphobject);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(settingsKey, graphobject.toString()).apply();
                }
                Utility.initialAppSettingsLoadTask = null;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((GraphObject)obj);
            }

            
            {
                applicationId = s;
                context = context1;
                settingsKey = s1;
                super();
            }
        };
        initialAppSettingsLoadTask.execute(null);
        settingsKey = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(settingsKey, null);
        if (isNullOrEmpty(settingsKey))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = null;
        settingsKey = new JSONObject(settingsKey);
        context = settingsKey;
_L4:
        if (context != null)
        {
            parseAppSettingsFromJSON(applicationId, context);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        JSONException jsonexception;
        jsonexception;
        logd("FacebookSDK", jsonexception);
          goto _L4
    }

    public static void logd(String s, Exception exception)
    {
        if (Settings.isDebugEnabled() && s != null && exception != null)
        {
            Log.d(s, (new StringBuilder(String.valueOf(exception.getClass().getSimpleName()))).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static void logd(String s, String s1)
    {
        if (Settings.isDebugEnabled() && s != null && s1 != null)
        {
            Log.d(s, s1);
        }
    }

    public static void logd(String s, String s1, Throwable throwable)
    {
        if (Settings.isDebugEnabled() && !isNullOrEmpty(s))
        {
            Log.d(s, s1, throwable);
        }
    }

    static String md5hash(String s)
    {
        return hashWithAlgorithm("MD5", s);
    }

    private static FetchedAppSettings parseAppSettingsFromJSON(String s, JSONObject jsonobject)
    {
        jsonobject = new FetchedAppSettings(jsonobject.optBoolean("supports_attribution", false), jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), parseDialogConfigurations(jsonobject.optJSONObject("android_dialog_configs")), null);
        fetchedAppSettings.put(s, jsonobject);
        return jsonobject;
    }

    private static Map parseDialogConfigurations(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = jsonobject.optJSONArray("data");
        if (jsonarray == null) goto _L2; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i < jsonarray.length()) goto _L4; else goto _L2
_L2:
        return hashmap;
_L4:
        DialogFeatureConfig dialogfeatureconfig;
        dialogfeatureconfig = DialogFeatureConfig.parseDialogConfig(jsonarray.optJSONObject(i));
        if (dialogfeatureconfig != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        String s = dialogfeatureconfig.getDialogName();
        Map map = (Map)hashmap.get(s);
        jsonobject = map;
        if (map == null)
        {
            jsonobject = new HashMap();
            hashmap.put(s, jsonobject);
        }
        jsonobject.put(dialogfeatureconfig.getFeatureName(), dialogfeatureconfig);
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    public static Bundle parseUrlQueryString(String s)
    {
        Bundle bundle;
        int i;
        i = 0;
        bundle = new Bundle();
        if (isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        int j;
        s = s.split("&");
        j = s.length;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return bundle;
_L3:
        String as[] = s[i].split("=");
label0:
        {
            if (as.length == 2)
            {
                bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
                break label0;
            }
            try
            {
                if (as.length == 1)
                {
                    bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
                }
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                logd("FacebookSDK", unsupportedencodingexception);
            }
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void putObjectInBundle(Bundle bundle, String s, Object obj)
    {
        if (obj instanceof String)
        {
            bundle.putString(s, (String)obj);
            return;
        }
        if (obj instanceof Parcelable)
        {
            bundle.putParcelable(s, (Parcelable)obj);
            return;
        }
        if (obj instanceof byte[])
        {
            bundle.putByteArray(s, (byte[])obj);
            return;
        } else
        {
            throw new FacebookException("attempted to add unsupported type to Bundle");
        }
    }

    public static FetchedAppSettings queryAppSettings(String s, boolean flag)
    {
        if (!flag && fetchedAppSettings.containsKey(s))
        {
            return (FetchedAppSettings)fetchedAppSettings.get(s);
        }
        GraphObject graphobject = getAppSettingsQueryResponse(s);
        if (graphobject == null)
        {
            return null;
        } else
        {
            return parseAppSettingsFromJSON(s, graphobject.getInnerJSONObject());
        }
    }

    public static String readStreamToString(InputStream inputstream)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        inputstream = new BufferedInputStream(inputstream);
        obj = new InputStreamReader(inputstream);
        char ac[];
        obj1 = new StringBuilder();
        ac = new char[2048];
_L1:
        int i = ((InputStreamReader) (obj)).read(ac);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj1 = ((StringBuilder) (obj1)).toString();
        closeQuietly(inputstream);
        closeQuietly(((Closeable) (obj)));
        return ((String) (obj1));
        ((StringBuilder) (obj1)).append(ac, 0, i);
          goto _L1
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L3:
        closeQuietly(inputstream);
        closeQuietly(((Closeable) (obj1)));
        throw obj;
        exception;
        inputstream = ((InputStream) (obj));
        obj = exception;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static boolean safeGetBooleanFromResponse(GraphObject graphobject, String s)
    {
        Object obj = Boolean.valueOf(false);
        if (graphobject != null)
        {
            obj = graphobject.getProperty(s);
        }
        if (!(obj instanceof Boolean))
        {
            graphobject = Boolean.valueOf(false);
        } else
        {
            graphobject = ((GraphObject) (obj));
        }
        return ((Boolean)graphobject).booleanValue();
    }

    public static String safeGetStringFromResponse(GraphObject graphobject, String s)
    {
        Object obj = "";
        if (graphobject != null)
        {
            obj = graphobject.getProperty(s);
        }
        if (!(obj instanceof String))
        {
            graphobject = "";
        } else
        {
            graphobject = ((GraphObject) (obj));
        }
        return (String)graphobject;
    }

    public static void setAppEventAttributionParameters(GraphObject graphobject, AttributionIdentifiers attributionidentifiers, String s, boolean flag)
    {
        boolean flag2 = false;
        if (attributionidentifiers != null && attributionidentifiers.getAttributionId() != null)
        {
            graphobject.setProperty("attribution", attributionidentifiers.getAttributionId());
        }
        if (attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            graphobject.setProperty("advertiser_id", attributionidentifiers.getAndroidAdvertiserId());
            boolean flag1;
            if (attributionidentifiers.isTrackingLimited())
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            graphobject.setProperty("advertiser_tracking_enabled", Boolean.valueOf(flag1));
        } else
        if (s != null)
        {
            graphobject.setProperty("advertiser_id", s);
        }
        if (flag)
        {
            flag = flag2;
        } else
        {
            flag = true;
        }
        graphobject.setProperty("application_tracking_enabled", Boolean.valueOf(flag));
    }

    public static void setAppEventExtendedDeviceInfoParameters(GraphObject graphobject, Context context)
    {
        String s;
        JSONArray jsonarray;
        String s1;
        int i;
        int j;
        jsonarray = new JSONArray();
        jsonarray.put("a1");
        s1 = context.getPackageName();
        j = -1;
        s = "";
        i = j;
        context = context.getPackageManager().getPackageInfo(s1, 0);
        i = j;
        j = ((PackageInfo) (context)).versionCode;
        i = j;
        context = ((PackageInfo) (context)).versionName;
        i = j;
_L2:
        jsonarray.put(s1);
        jsonarray.put(i);
        jsonarray.put(context);
        graphobject.setProperty("extinfo", jsonarray.toString());
        return;
        context;
        context = s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static String sha1hash(String s)
    {
        return hashWithAlgorithm("SHA-1", s);
    }

    static String sha1hash(byte abyte0[])
    {
        return hashWithAlgorithm("SHA-1", abyte0);
    }

    public static boolean stringsEqualOrEmpty(String s, String s1)
    {
        boolean flag = TextUtils.isEmpty(s);
        boolean flag1 = TextUtils.isEmpty(s1);
        if (flag && flag1)
        {
            return true;
        }
        if (!flag && !flag1)
        {
            return s.equals(s1);
        } else
        {
            return false;
        }
    }

    public static JSONArray tryGetJSONArrayFromResponse(GraphObject graphobject, String s)
    {
        if (graphobject == null)
        {
            return null;
        }
        graphobject = ((GraphObject) (graphobject.getProperty(s)));
        if (!(graphobject instanceof JSONArray))
        {
            return null;
        } else
        {
            return (JSONArray)graphobject;
        }
    }

    public static JSONObject tryGetJSONObjectFromResponse(GraphObject graphobject, String s)
    {
        if (graphobject == null)
        {
            return null;
        }
        graphobject = ((GraphObject) (graphobject.getProperty(s)));
        if (!(graphobject instanceof JSONObject))
        {
            return null;
        } else
        {
            return (JSONObject)graphobject;
        }
    }

    public static transient Collection unmodifiableCollection(Object aobj[])
    {
        return Collections.unmodifiableCollection(Arrays.asList(aobj));
    }




}
