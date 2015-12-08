// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.facebook.internal:
//            ProfileInformationCache, ImageDownloader, Validate, FacebookRequestErrorClassification, 
//            AttributionIdentifiers

public final class Utility
{

    private static final String APPLICATION_FIELDS = "fields";
    private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
    private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
    private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
    private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
    private static final String APP_SETTING_FIELDS[] = {
        "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories"
    };
    private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
    private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
    private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
    private static final String DIALOG_CONFIG_NAME_KEY = "name";
    private static final String DIALOG_CONFIG_URL_KEY = "url";
    private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
    private static final String EXTRA_APP_EVENTS_INFO_FORMAT_VERSION = "a2";
    private static final int GINGERBREAD_MR1 = 10;
    private static final String HASH_ALGORITHM_MD5 = "MD5";
    private static final String HASH_ALGORITHM_SHA1 = "SHA-1";
    static final String LOG_TAG = "FacebookSDK";
    private static final int REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS = 0x1b7740;
    private static final String URL_SCHEME = "https";
    private static final String UTF8 = "UTF-8";
    private static long availableExternalStorageGB = 0L;
    private static String carrierName = "NoCarrier";
    private static String deviceTimezone = "";
    private static Map fetchedAppSettings = new ConcurrentHashMap();
    private static AtomicBoolean loadingSettings = new AtomicBoolean(false);
    private static final String noCarrierConstant = "NoCarrier";
    private static int numCPUCores = 0;
    private static long timestampOfLastCheck = -1L;
    private static long totalExternalStorageGB = -1L;

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
        for (int i = 0; i < j; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static transient List asListNoNulls(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    public static JSONObject awaitGetGraphMeRequestWithCache(String s)
    {
        JSONObject jsonobject = ProfileInformationCache.getProfileInformation(s);
        if (jsonobject != null)
        {
            return jsonobject;
        }
        s = getGraphMeRequestWithCache(s).executeAndWait();
        if (s.getError() != null)
        {
            return null;
        } else
        {
            return s.getJSONObject();
        }
    }

    public static Uri buildUri(String s, String s1, Bundle bundle)
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.authority(s);
        builder.path(s1);
        if (bundle != null)
        {
            s = bundle.keySet().iterator();
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                s1 = (String)s.next();
                Object obj = bundle.get(s1);
                if (obj instanceof String)
                {
                    builder.appendQueryParameter(s1, (String)obj);
                }
            } while (true);
        }
        return builder.build();
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
        for (int i = 0; i < j; i++)
        {
            String as1[] = as[i].split("=");
            if (as1.length > 0)
            {
                context.setCookie(s, (new StringBuilder()).append(as1[0].trim()).append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;").toString());
            }
        }

        context.removeExpiredCookie();
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

    private static long convertBytesToGB(double d)
    {
        return Math.round(d / 1073741824D);
    }

    static Map convertJSONObjectToHashMap(JSONObject jsonobject)
    {
        HashMap hashmap;
        JSONArray jsonarray;
        int i;
        hashmap = new HashMap();
        jsonarray = jsonobject.names();
        i = 0;
_L3:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
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
        if (true) goto _L3; else goto _L2
_L2:
        return hashmap;
    }

    public static int copyAndCloseInputStream(InputStream inputstream, OutputStream outputstream)
    {
        int i = 0;
        BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
        byte abyte0[] = new byte[8192];
_L1:
        int j = bufferedinputstream.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        outputstream.write(abyte0, 0, j);
        i += j;
          goto _L1
        if (bufferedinputstream != null)
        {
            bufferedinputstream.close();
        }
        if (inputstream != null)
        {
            inputstream.close();
        }
        return i;
        outputstream;
        bufferedinputstream = null;
_L3:
        if (bufferedinputstream != null)
        {
            bufferedinputstream.close();
        }
        if (inputstream != null)
        {
            inputstream.close();
        }
        throw outputstream;
        outputstream;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static void deleteDirectory(File file)
    {
        if (!file.exists())
        {
            return;
        }
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                deleteDirectory(afile[i]);
            }

        }
        file.delete();
    }

    public static void disconnectQuietly(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    private static boolean externalStorageExists()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static List filter(List list, Predicate predicate)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = list.next();
                if (predicate.apply(obj))
                {
                    arraylist.add(obj);
                }
            } while (true);
            if (arraylist.size() != 0)
            {
                return arraylist;
            }
        }
        return null;
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

    private static JSONObject getAppSettingsQueryResponse(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", APP_SETTING_FIELDS));
        s = GraphRequest.newGraphPathRequest(null, s, null);
        s.setSkipClientToken(true);
        s.setParameters(bundle);
        return s.executeAndWait().getJSONObject();
    }

    public static FetchedAppSettings getAppSettingsWithoutQuery(String s)
    {
        if (s != null)
        {
            return (FetchedAppSettings)fetchedAppSettings.get(s);
        } else
        {
            return null;
        }
    }

    public static Date getBundleLongAsDate(Bundle bundle, String s, Date date)
    {
        if (bundle == null)
        {
            return null;
        }
        bundle = ((Bundle) (bundle.get(s)));
        long l;
        if (bundle instanceof Long)
        {
            l = ((Long)bundle).longValue();
        } else
        if (bundle instanceof String)
        {
            try
            {
                l = Long.parseLong((String)bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                return null;
            }
        } else
        {
            return null;
        }
        if (l == 0L)
        {
            return new Date(0x7fffffffffffffffL);
        } else
        {
            return new Date(l * 1000L + date.getTime());
        }
    }

    public static long getContentSize(Uri uri)
    {
        uri = FacebookSdk.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
        long l;
        int i = uri.getColumnIndex("_size");
        uri.moveToFirst();
        l = uri.getLong(i);
        if (uri != null)
        {
            uri.close();
        }
        return l;
        Exception exception;
        exception;
        uri = null;
_L2:
        if (uri != null)
        {
            uri.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static DialogFeatureConfig getDialogFeatureConfig(String s, String s1, String s2)
    {
        if (isNullOrEmpty(s1) || isNullOrEmpty(s2))
        {
            return null;
        }
        s = (FetchedAppSettings)fetchedAppSettings.get(s);
        if (s != null)
        {
            s = (Map)s.getDialogConfigurations().get(s1);
            if (s != null)
            {
                return (DialogFeatureConfig)s.get(s2);
            }
        }
        return null;
    }

    private static GraphRequest getGraphMeRequestWithCache(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", s);
        return new GraphRequest(null, "me", bundle, HttpMethod.GET, null);
    }

    public static void getGraphMeRequestWithCacheAsync(final String accessToken, final GraphMeRequestWithCacheCallback callback)
    {
        JSONObject jsonobject = ProfileInformationCache.getProfileInformation(accessToken);
        if (jsonobject != null)
        {
            callback.onSuccess(jsonobject);
            return;
        } else
        {
            callback = new com.facebook.GraphRequest.Callback() {

                final String val$accessToken;
                final GraphMeRequestWithCacheCallback val$callback;

                public void onCompleted(GraphResponse graphresponse)
                {
                    if (graphresponse.getError() != null)
                    {
                        callback.onFailure(graphresponse.getError().getException());
                        return;
                    } else
                    {
                        ProfileInformationCache.putProfileInformation(accessToken, graphresponse.getJSONObject());
                        callback.onSuccess(graphresponse.getJSONObject());
                        return;
                    }
                }

            
            {
                callback = graphmerequestwithcachecallback;
                accessToken = s;
                super();
            }
            };
            accessToken = getGraphMeRequestWithCache(accessToken);
            accessToken.setCallback(callback);
            accessToken.executeAsync();
            return;
        }
    }

    public static String getMetadataApplicationId(Context context)
    {
        Validate.notNull(context, "context");
        FacebookSdk.sdkInitialize(context);
        return FacebookSdk.getApplicationId();
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
    {
        jsonobject = ((JSONObject) (jsonobject.opt(s)));
        if (jsonobject != null && (jsonobject instanceof String))
        {
            jsonobject = ((JSONObject) ((new JSONTokener((String)jsonobject)).nextValue()));
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

    public static String getUriString(Uri uri)
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.toString();
        }
    }

    public static boolean hasSameId(JSONObject jsonobject, JSONObject jsonobject1)
    {
        if (jsonobject != null && jsonobject1 != null && jsonobject.has("id") && jsonobject1.has("id"))
        {
            if (jsonobject.equals(jsonobject1))
            {
                return true;
            }
            jsonobject = jsonobject.optString("id");
            jsonobject1 = jsonobject1.optString("id");
            if (jsonobject != null && jsonobject1 != null)
            {
                return jsonobject.equals(jsonobject1);
            }
        }
        return false;
    }

    private static String hashBytes(MessageDigest messagedigest, byte abyte0[])
    {
        messagedigest.update(abyte0);
        messagedigest = messagedigest.digest();
        abyte0 = new StringBuilder();
        int j = messagedigest.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = messagedigest[i];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
        }

        return abyte0.toString();
    }

    public static transient HashSet hashSet(Object aobj[])
    {
        HashSet hashset = new HashSet(aobj.length);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            hashset.add(aobj[i]);
        }

        return hashset;
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
        int k1 = 0;
        if (ai == null)
        {
            return ai1;
        }
        if (ai1 == null)
        {
            return ai;
        }
        int ai2[] = new int[ai.length + ai1.length];
        int l1 = 0;
        int i1 = 0;
        do
        {
            int i = i1;
            if (l1 < ai.length)
            {
                i = i1;
                if (k1 < ai1.length)
                {
                    int j = ai[l1];
                    int i2 = ai1[k1];
                    int k;
                    int l;
                    int j1;
                    if (l1 < ai.length - 1)
                    {
                        i = ai[l1 + 1];
                    } else
                    {
                        i = 0x7fffffff;
                    }
                    if (k1 < ai1.length - 1)
                    {
                        j1 = ai1[k1 + 1];
                    } else
                    {
                        j1 = 0x7fffffff;
                    }
                    if (j < i2)
                    {
                        if (i > i2)
                        {
                            if (i > j1)
                            {
                                k = k1 + 2;
                                j = i2;
                                i = j1;
                                l = l1;
                            } else
                            {
                                l = l1 + 2;
                                k = k1;
                                j = i2;
                            }
                        } else
                        {
                            l = l1 + 2;
                            i = 0x7fffffff;
                            j = 0x80000000;
                            k = k1;
                        }
                    } else
                    if (j1 > j)
                    {
                        if (j1 > i)
                        {
                            l = l1 + 2;
                            k = k1;
                        } else
                        {
                            k = k1 + 2;
                            l = l1;
                            i = j1;
                        }
                    } else
                    {
                        k = k1 + 2;
                        i = 0x7fffffff;
                        j = 0x80000000;
                        l = l1;
                    }
                    k1 = k;
                    l1 = l;
                    if (j == 0x80000000)
                    {
                        continue;
                    }
                    j1 = i1 + 1;
                    ai2[i1] = j;
                    if (i != 0x7fffffff)
                    {
                        i1 = j1 + 1;
                        ai2[j1] = i;
                        k1 = k;
                        l1 = l;
                        continue;
                    }
                    i = j1;
                }
            }
            return Arrays.copyOf(ai2, i);
        } while (true);
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

    public static boolean isContentUri(Uri uri)
    {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean isCurrentAccessToken(AccessToken accesstoken)
    {
        if (accesstoken != null)
        {
            return accesstoken.equals(AccessToken.getCurrentAccessToken());
        } else
        {
            return false;
        }
    }

    public static boolean isFileUri(Uri uri)
    {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
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
        boolean flag = false;
        if (collection1 == null || collection1.size() == 0)
        {
            if (collection == null || collection.size() == 0)
            {
                flag = true;
            }
            return flag;
        }
        collection1 = new HashSet(collection1);
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!collection1.contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isWebUri(Uri uri)
    {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()));
    }

    public static Set jsonArrayToSet(JSONArray jsonarray)
    {
        HashSet hashset = new HashSet();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            hashset.add(jsonarray.getString(i));
        }

        return hashset;
    }

    public static List jsonArrayToStringList(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            arraylist.add(jsonarray.getString(i));
        }

        return arraylist;
    }

    public static void loadAppSettingsAsync(final Context context, final String applicationId)
    {
        boolean flag = loadingSettings.compareAndSet(false, true);
        if (!isNullOrEmpty(applicationId) && !fetchedAppSettings.containsKey(applicationId) && flag)
        {
            final String settingsKey = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] {
                applicationId
            });
            FacebookSdk.getExecutor().execute(new Runnable() {

                final String val$applicationId;
                final Context val$context;
                final String val$settingsKey;

                public void run()
                {
                    JSONObject jsonobject = Utility.getAppSettingsQueryResponse(applicationId);
                    if (jsonobject != null)
                    {
                        Utility.parseAppSettingsFromJSON(applicationId, jsonobject);
                        context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(settingsKey, jsonobject.toString()).apply();
                    }
                    Utility.loadingSettings.set(false);
                }

            
            {
                applicationId = s;
                context = context1;
                settingsKey = s1;
                super();
            }
            });
            context = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(settingsKey, null);
            if (!isNullOrEmpty(context))
            {
                try
                {
                    context = new JSONObject(context);
                }
                // Misplaced declaration of an exception variable
                catch (final Context context)
                {
                    logd("FacebookSDK", context);
                    context = null;
                }
                if (context != null)
                {
                    parseAppSettingsFromJSON(applicationId, context);
                    return;
                }
            }
        }
    }

    public static void logd(String s, Exception exception)
    {
        if (FacebookSdk.isDebugEnabled() && s != null && exception != null)
        {
            Log.d(s, (new StringBuilder()).append(exception.getClass().getSimpleName()).append(": ").append(exception.getMessage()).toString());
        }
    }

    public static void logd(String s, String s1)
    {
        if (FacebookSdk.isDebugEnabled() && s != null && s1 != null)
        {
            Log.d(s, s1);
        }
    }

    public static void logd(String s, String s1, Throwable throwable)
    {
        if (FacebookSdk.isDebugEnabled() && !isNullOrEmpty(s))
        {
            Log.d(s, s1, throwable);
        }
    }

    public static List map(List list, Mapper mapper)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = mapper.apply(list.next());
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            } while (true);
            if (arraylist.size() != 0)
            {
                return arraylist;
            }
        }
        return null;
    }

    public static String md5hash(String s)
    {
        return hashWithAlgorithm("MD5", s);
    }

    private static FetchedAppSettings parseAppSettingsFromJSON(String s, JSONObject jsonobject)
    {
        Object obj = jsonobject.optJSONArray("android_sdk_error_categories");
        if (obj == null)
        {
            obj = FacebookRequestErrorClassification.getDefaultErrorClassification();
        } else
        {
            obj = FacebookRequestErrorClassification.createFromJSON(((JSONArray) (obj)));
        }
        jsonobject = new FetchedAppSettings(jsonobject.optBoolean("supports_implicit_sdk_logging", false), jsonobject.optString("gdpv4_nux_content", ""), jsonobject.optBoolean("gdpv4_nux_enabled", false), parseDialogConfigurations(jsonobject.optJSONObject("android_dialog_configs")), ((FacebookRequestErrorClassification) (obj)));
        fetchedAppSettings.put(s, jsonobject);
        return jsonobject;
    }

    private static Map parseDialogConfigurations(JSONObject jsonobject)
    {
        HashMap hashmap = new HashMap();
        if (jsonobject != null)
        {
            JSONArray jsonarray = jsonobject.optJSONArray("data");
            if (jsonarray != null)
            {
                int i = 0;
                while (i < jsonarray.length()) 
                {
                    DialogFeatureConfig dialogfeatureconfig = DialogFeatureConfig.parseDialogConfig(jsonarray.optJSONObject(i));
                    if (dialogfeatureconfig != null)
                    {
                        String s = dialogfeatureconfig.getDialogName();
                        Map map1 = (Map)hashmap.get(s);
                        jsonobject = map1;
                        if (map1 == null)
                        {
                            jsonobject = new HashMap();
                            hashmap.put(s, jsonobject);
                        }
                        jsonobject.put(dialogfeatureconfig.getFeatureName(), dialogfeatureconfig);
                    }
                    i++;
                }
            }
        }
        return hashmap;
    }

    public static Bundle parseUrlQueryString(String s)
    {
        Bundle bundle = new Bundle();
        if (isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = s.split("&");
        j = s.length;
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as[] = s[i].split("=");
        if (as.length != 2) goto _L5; else goto _L4
_L4:
        bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
          goto _L6
_L5:
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
          goto _L6
_L2:
        return bundle;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void putCommaSeparatedStringList(Bundle bundle, String s, ArrayList arraylist)
    {
        if (arraylist != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); stringbuilder.append(","))
            {
                stringbuilder.append((String)arraylist.next());
            }

            arraylist = "";
            if (stringbuilder.length() > 0)
            {
                arraylist = stringbuilder.substring(0, stringbuilder.length() - 1);
            }
            bundle.putString(s, arraylist);
        }
    }

    public static boolean putJSONValueInBundle(Bundle bundle, String s, Object obj)
    {
        if (obj == null)
        {
            bundle.remove(s);
        } else
        if (obj instanceof Boolean)
        {
            bundle.putBoolean(s, ((Boolean)obj).booleanValue());
        } else
        if (obj instanceof boolean[])
        {
            bundle.putBooleanArray(s, (boolean[])(boolean[])obj);
        } else
        if (obj instanceof Double)
        {
            bundle.putDouble(s, ((Double)obj).doubleValue());
        } else
        if (obj instanceof double[])
        {
            bundle.putDoubleArray(s, (double[])(double[])obj);
        } else
        if (obj instanceof Integer)
        {
            bundle.putInt(s, ((Integer)obj).intValue());
        } else
        if (obj instanceof int[])
        {
            bundle.putIntArray(s, (int[])(int[])obj);
        } else
        if (obj instanceof Long)
        {
            bundle.putLong(s, ((Long)obj).longValue());
        } else
        if (obj instanceof long[])
        {
            bundle.putLongArray(s, (long[])(long[])obj);
        } else
        if (obj instanceof String)
        {
            bundle.putString(s, (String)obj);
        } else
        if (obj instanceof JSONArray)
        {
            bundle.putString(s, ((JSONArray)obj).toString());
        } else
        if (obj instanceof JSONObject)
        {
            bundle.putString(s, ((JSONObject)obj).toString());
        } else
        {
            return false;
        }
        return true;
    }

    public static void putNonEmptyString(Bundle bundle, String s, String s1)
    {
        if (!isNullOrEmpty(s1))
        {
            bundle.putString(s, s1);
        }
    }

    public static void putUri(Bundle bundle, String s, Uri uri)
    {
        if (uri != null)
        {
            putNonEmptyString(bundle, s, uri.toString());
        }
    }

    public static FetchedAppSettings queryAppSettings(String s, boolean flag)
    {
        if (!flag && fetchedAppSettings.containsKey(s))
        {
            return (FetchedAppSettings)fetchedAppSettings.get(s);
        }
        JSONObject jsonobject = getAppSettingsQueryResponse(s);
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return parseAppSettingsFromJSON(s, jsonobject);
        }
    }

    public static String readStreamToString(InputStream inputstream)
    {
        Object obj = null;
        inputstream = new BufferedInputStream(inputstream);
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        char ac[];
        obj = new StringBuilder();
        ac = new char[2048];
_L3:
        int i = inputstreamreader.read(ac);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(ac, 0, i);
          goto _L3
        Exception exception;
        exception;
        obj = inputstream;
        inputstream = exception;
_L5:
        closeQuietly(((Closeable) (obj)));
        closeQuietly(inputstreamreader);
        throw inputstream;
_L2:
        obj = ((StringBuilder) (obj)).toString();
        closeQuietly(inputstream);
        closeQuietly(inputstreamreader);
        return ((String) (obj));
        inputstream;
        inputstreamreader = null;
        continue; /* Loop/switch isn't completed */
        exception;
        inputstreamreader = null;
        obj = inputstream;
        inputstream = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Map readStringMapFromParcel(Parcel parcel)
    {
        int j = parcel.readInt();
        if (j >= 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Map) (obj));
_L2:
        HashMap hashmap = new HashMap();
        int i = 0;
        do
        {
            obj = hashmap;
            if (i >= j)
            {
                continue;
            }
            hashmap.put(parcel.readString(), parcel.readString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void refreshAvailableExternalStorage()
    {
        try
        {
            if (externalStorageExists())
            {
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                long l = statfs.getAvailableBlocks();
                availableExternalStorageGB = (long)statfs.getBlockSize() * l;
            }
            availableExternalStorageGB = convertBytesToGB(availableExternalStorageGB);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static int refreshBestGuessNumberOfCPUCores()
    {
        if (numCPUCores > 0)
        {
            return numCPUCores;
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            numCPUCores = 1;
            return numCPUCores;
        }
        try
        {
            numCPUCores = (new File("/sys/devices/system/cpu/")).listFiles(new FilenameFilter() {

                public boolean accept(File file, String s)
                {
                    return Pattern.matches("cpu[0-9]+", s);
                }

            }).length;
        }
        catch (Exception exception) { }
        if (numCPUCores <= 0)
        {
            numCPUCores = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return numCPUCores;
    }

    private static void refreshCarrierName(Context context)
    {
        if (!carrierName.equals("NoCarrier"))
        {
            break MISSING_BLOCK_LABEL_27;
        }
        carrierName = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
        return;
        context;
    }

    private static void refreshPeriodicExtendedDeviceInfo(Context context)
    {
        if (timestampOfLastCheck == -1L || System.currentTimeMillis() - timestampOfLastCheck >= 0x1b7740L)
        {
            timestampOfLastCheck = System.currentTimeMillis();
            refreshTimezone();
            refreshCarrierName(context);
            refreshTotalExternalStorage();
            refreshAvailableExternalStorage();
        }
    }

    private static void refreshTimezone()
    {
        try
        {
            TimeZone timezone = TimeZone.getDefault();
            deviceTimezone = timezone.getDisplayName(timezone.inDaylightTime(new Date()), 0);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private static void refreshTotalExternalStorage()
    {
        try
        {
            if (externalStorageExists())
            {
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                long l = statfs.getBlockCount();
                totalExternalStorageGB = (long)statfs.getBlockSize() * l;
            }
            totalExternalStorageGB = convertBytesToGB(totalExternalStorageGB);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public static String safeGetStringFromResponse(JSONObject jsonobject, String s)
    {
        if (jsonobject != null)
        {
            return jsonobject.optString(s, "");
        } else
        {
            return "";
        }
    }

    public static void setAppEventAttributionParameters(JSONObject jsonobject, AttributionIdentifiers attributionidentifiers, String s, boolean flag)
    {
        boolean flag2 = true;
        if (attributionidentifiers != null && attributionidentifiers.getAttributionId() != null)
        {
            jsonobject.put("attribution", attributionidentifiers.getAttributionId());
        }
        if (attributionidentifiers != null && attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            jsonobject.put("advertiser_id", attributionidentifiers.getAndroidAdvertiserId());
            boolean flag1;
            if (!attributionidentifiers.isTrackingLimited())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            jsonobject.put("advertiser_tracking_enabled", flag1);
        }
        if (attributionidentifiers != null && attributionidentifiers.getAndroidInstallerPackage() != null)
        {
            jsonobject.put("installer_package", attributionidentifiers.getAndroidInstallerPackage());
        }
        jsonobject.put("anon_id", s);
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        jsonobject.put("application_tracking_enabled", flag);
    }

    public static void setAppEventExtendedDeviceInfoParameters(JSONObject jsonobject, Context context)
    {
        Object obj;
        JSONArray jsonarray;
        String s;
        int i;
        int j;
        jsonarray = new JSONArray();
        jsonarray.put("a2");
        refreshPeriodicExtendedDeviceInfo(context);
        s = context.getPackageName();
        j = -1;
        obj = "";
        i = j;
        Object obj1 = context.getPackageManager().getPackageInfo(s, 0);
        i = j;
        j = ((PackageInfo) (obj1)).versionCode;
        i = j;
        obj1 = ((PackageInfo) (obj1)).versionName;
        i = j;
        obj = obj1;
_L3:
        double d;
        jsonarray.put(s);
        jsonarray.put(i);
        jsonarray.put(obj);
        jsonarray.put(android.os.Build.VERSION.RELEASE);
        jsonarray.put(Build.MODEL);
        float f;
        int k;
        try
        {
            obj = context.getResources().getConfiguration().locale;
        }
        catch (Exception exception)
        {
            exception = Locale.getDefault();
        }
        jsonarray.put((new StringBuilder()).append(((Locale) (obj)).getLanguage()).append("_").append(((Locale) (obj)).getCountry()).toString());
        jsonarray.put(deviceTimezone);
        jsonarray.put(carrierName);
        context = (WindowManager)context.getSystemService("window");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        context = context.getDefaultDisplay();
        obj = new DisplayMetrics();
        context.getMetrics(((DisplayMetrics) (obj)));
        i = ((DisplayMetrics) (obj)).widthPixels;
        j = ((DisplayMetrics) (obj)).heightPixels;
        f = ((DisplayMetrics) (obj)).density;
        d = f;
        k = j;
        j = i;
        i = k;
_L1:
        jsonarray.put(j);
        jsonarray.put(i);
        jsonarray.put(String.format("%.2f", new Object[] {
            Double.valueOf(d)
        }));
        jsonarray.put(refreshBestGuessNumberOfCPUCores());
        jsonarray.put(totalExternalStorageGB);
        jsonarray.put(availableExternalStorageGB);
        jsonobject.put("extinfo", jsonarray.toString());
        return;
        context;
        i = 0;
        j = 0;
_L2:
        d = 0.0D;
          goto _L1
        context;
        boolean flag = false;
        j = i;
        i = ((flag) ? 1 : 0);
          goto _L2
        context;
        int l = i;
        i = j;
        j = l;
          goto _L2
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
          goto _L3
        d = 0.0D;
        i = 0;
        j = 0;
          goto _L1
    }

    public static String sha1hash(String s)
    {
        return hashWithAlgorithm("SHA-1", s);
    }

    public static String sha1hash(byte abyte0[])
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

    public static JSONArray tryGetJSONArrayFromResponse(JSONObject jsonobject, String s)
    {
        if (jsonobject != null)
        {
            return jsonobject.optJSONArray(s);
        } else
        {
            return null;
        }
    }

    public static JSONObject tryGetJSONObjectFromResponse(JSONObject jsonobject, String s)
    {
        if (jsonobject != null)
        {
            return jsonobject.optJSONObject(s);
        } else
        {
            return null;
        }
    }

    public static transient Collection unmodifiableCollection(Object aobj[])
    {
        return Collections.unmodifiableCollection(Arrays.asList(aobj));
    }

    public static void writeStringMapToParcel(Parcel parcel, Map map1)
    {
        if (map1 == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(map1.size());
            map1 = map1.entrySet().iterator();
            while (map1.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map1.next();
                parcel.writeString((String)entry.getKey());
                parcel.writeString((String)entry.getValue());
            }
        }
    }

    static 
    {
        availableExternalStorageGB = -1L;
    }




    private class Predicate
    {

        public abstract boolean apply(Object obj);
    }


    private class FetchedAppSettings
    {

        private Map dialogConfigMap;
        private FacebookRequestErrorClassification errorClassification;
        private String nuxContent;
        private boolean nuxEnabled;
        private boolean supportsImplicitLogging;

        public Map getDialogConfigurations()
        {
            return dialogConfigMap;
        }

        public FacebookRequestErrorClassification getErrorClassification()
        {
            return errorClassification;
        }

        public String getNuxContent()
        {
            return nuxContent;
        }

        public boolean getNuxEnabled()
        {
            return nuxEnabled;
        }

        public boolean supportsImplicitLogging()
        {
            return supportsImplicitLogging;
        }

        private FetchedAppSettings(boolean flag, String s, boolean flag1, Map map1, FacebookRequestErrorClassification facebookrequesterrorclassification)
        {
            supportsImplicitLogging = flag;
            nuxContent = s;
            nuxEnabled = flag1;
            dialogConfigMap = map1;
            errorClassification = facebookrequesterrorclassification;
        }

    }


    private class DialogFeatureConfig
    {

        private String dialogName;
        private Uri fallbackUrl;
        private String featureName;
        private int featureVersionSpec[];

        private static DialogFeatureConfig parseDialogConfig(JSONObject jsonobject)
        {
            Uri uri = null;
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
            if (jsonarray != null)
            {
                int l = jsonarray.length();
                ai = new int[l];
                int j = 0;
                do
                {
                    if (j >= l)
                    {
                        break;
                    }
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
                } while (true);
            }
            return ai;
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


    private class GraphMeRequestWithCacheCallback
    {

        public abstract void onFailure(FacebookException facebookexception);

        public abstract void onSuccess(JSONObject jsonobject);
    }


    private class Mapper
    {

        public abstract Object apply(Object obj);
    }

}
